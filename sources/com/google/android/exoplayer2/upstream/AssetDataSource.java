package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.google.android.exoplayer2.util.f0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class AssetDataSource extends g {
    private final AssetManager e;
    private Uri f;
    private InputStream g;
    private long h;
    private boolean i;

    public static final class AssetDataSourceException extends IOException {
        public AssetDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public long a(m mVar) {
        try {
            Uri uri = mVar.a;
            this.f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            f(mVar);
            InputStream open = this.e.open(path, 1);
            this.g = open;
            if (open.skip(mVar.f) >= mVar.f) {
                long j = mVar.g;
                if (j != -1) {
                    this.h = j;
                } else {
                    long available = (long) this.g.available();
                    this.h = available;
                    if (available == 2147483647L) {
                        this.h = -1;
                    }
                }
                this.i = true;
                g(mVar);
                return this.h;
            }
            throw new EOFException();
        } catch (IOException e2) {
            throw new AssetDataSourceException(e2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public void close() {
        this.f = null;
        try {
            InputStream inputStream = this.g;
            if (inputStream != null) {
                inputStream.close();
            }
            this.g = null;
            if (this.i) {
                this.i = false;
                e();
            }
        } catch (IOException e2) {
            throw new AssetDataSourceException(e2);
        } catch (Throwable th) {
            this.g = null;
            if (this.i) {
                this.i = false;
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
    public int read(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        long j = this.h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i3 = (int) Math.min(j, (long) i3);
            } catch (IOException e2) {
                throw new AssetDataSourceException(e2);
            }
        }
        InputStream inputStream = this.g;
        int i4 = f0.a;
        int read = inputStream.read(bArr, i2, i3);
        if (read != -1) {
            long j2 = this.h;
            if (j2 != -1) {
                this.h = j2 - ((long) read);
            }
            d(read);
            return read;
        } else if (this.h == -1) {
            return -1;
        } else {
            throw new AssetDataSourceException(new EOFException());
        }
    }
}
