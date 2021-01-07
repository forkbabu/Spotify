package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.util.f0;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class FileDataSource extends g {
    private RandomAccessFile e;
    private Uri f;
    private long g;
    private boolean h;

    public static class FileDataSourceException extends IOException {
        public FileDataSourceException(IOException iOException) {
            super(iOException);
        }

        public FileDataSourceException(String str, IOException iOException) {
            super(str, iOException);
        }
    }

    public static final class a implements k.a {
        @Override // com.google.android.exoplayer2.upstream.k.a
        public k a() {
            return new FileDataSource();
        }
    }

    public FileDataSource() {
        super(false);
    }

    private static RandomAccessFile h(Uri uri) {
        try {
            String path = uri.getPath();
            path.getClass();
            return new RandomAccessFile(path, "r");
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2);
            }
            throw new FileDataSourceException(e2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public long a(m mVar) {
        try {
            Uri uri = mVar.a;
            this.f = uri;
            f(mVar);
            RandomAccessFile h2 = h(uri);
            this.e = h2;
            h2.seek(mVar.f);
            long j = mVar.g;
            if (j == -1) {
                j = this.e.length() - mVar.f;
            }
            this.g = j;
            if (j >= 0) {
                this.h = true;
                g(mVar);
                return this.g;
            }
            throw new EOFException();
        } catch (IOException e2) {
            throw new FileDataSourceException(e2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public void close() {
        this.f = null;
        try {
            RandomAccessFile randomAccessFile = this.e;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.e = null;
            if (this.h) {
                this.h = false;
                e();
            }
        } catch (IOException e2) {
            throw new FileDataSourceException(e2);
        } catch (Throwable th) {
            this.e = null;
            if (this.h) {
                this.h = false;
                e();
            }
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public Uri getUri() {
        return this.f;
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.e;
            int i3 = f0.a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.g -= (long) read;
                d(read);
            }
            return read;
        } catch (IOException e2) {
            throw new FileDataSourceException(e2);
        }
    }
}
