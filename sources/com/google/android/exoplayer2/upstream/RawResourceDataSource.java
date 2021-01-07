package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.f0;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class RawResourceDataSource extends g {
    private final Resources e;
    private Uri f;
    private AssetFileDescriptor g;
    private InputStream h;
    private long i;
    private boolean j;

    public static class RawResourceDataSourceException extends IOException {
        public RawResourceDataSourceException(String str) {
            super(str);
        }

        public RawResourceDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.e = context.getResources();
    }

    public static Uri buildRawResourceUri(int i2) {
        return Uri.parse("rawresource:///" + i2);
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public long a(m mVar) {
        try {
            Uri uri = mVar.a;
            this.f = uri;
            if (TextUtils.equals("rawresource", uri.getScheme())) {
                try {
                    String lastPathSegment = uri.getLastPathSegment();
                    lastPathSegment.getClass();
                    int parseInt = Integer.parseInt(lastPathSegment);
                    f(mVar);
                    AssetFileDescriptor openRawResourceFd = this.e.openRawResourceFd(parseInt);
                    this.g = openRawResourceFd;
                    if (openRawResourceFd != null) {
                        FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                        this.h = fileInputStream;
                        fileInputStream.skip(openRawResourceFd.getStartOffset());
                        if (fileInputStream.skip(mVar.f) >= mVar.f) {
                            long j2 = mVar.g;
                            long j3 = -1;
                            if (j2 != -1) {
                                this.i = j2;
                            } else {
                                long length = openRawResourceFd.getLength();
                                if (length != -1) {
                                    j3 = length - mVar.f;
                                }
                                this.i = j3;
                            }
                            this.j = true;
                            g(mVar);
                            return this.i;
                        }
                        throw new EOFException();
                    }
                    throw new RawResourceDataSourceException("Resource is compressed: " + uri);
                } catch (NumberFormatException unused) {
                    throw new RawResourceDataSourceException("Resource identifier must be an integer.");
                }
            } else {
                throw new RawResourceDataSourceException("URI must use scheme rawresource");
            }
        } catch (IOException e2) {
            throw new RawResourceDataSourceException(e2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public void close() {
        this.f = null;
        try {
            InputStream inputStream = this.h;
            if (inputStream != null) {
                inputStream.close();
            }
            this.h = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.g;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.g = null;
                if (this.j) {
                    this.j = false;
                    e();
                }
            } catch (IOException e2) {
                throw new RawResourceDataSourceException(e2);
            } catch (Throwable th) {
                this.g = null;
                if (this.j) {
                    this.j = false;
                    e();
                }
                throw th;
            }
        } catch (IOException e3) {
            throw new RawResourceDataSourceException(e3);
        } catch (Throwable th2) {
            this.h = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.g;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.g = null;
                if (this.j) {
                    this.j = false;
                    e();
                }
                throw th2;
            } catch (IOException e4) {
                throw new RawResourceDataSourceException(e4);
            } catch (Throwable th3) {
                this.g = null;
                if (this.j) {
                    this.j = false;
                    e();
                }
                throw th3;
            }
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
        long j2 = this.i;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, (long) i3);
            } catch (IOException e2) {
                throw new RawResourceDataSourceException(e2);
            }
        }
        InputStream inputStream = this.h;
        int i4 = f0.a;
        int read = inputStream.read(bArr, i2, i3);
        if (read != -1) {
            long j3 = this.i;
            if (j3 != -1) {
                this.i = j3 - ((long) read);
            }
            d(read);
            return read;
        } else if (this.i == -1) {
            return -1;
        } else {
            throw new RawResourceDataSourceException(new EOFException());
        }
    }
}
