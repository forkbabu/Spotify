package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.google.android.exoplayer2.util.f0;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class ContentDataSource extends g {
    private final ContentResolver e;
    private Uri f;
    private AssetFileDescriptor g;
    private FileInputStream h;
    private long i;
    private boolean j;

    public static class ContentDataSourceException extends IOException {
        public ContentDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public long a(m mVar) {
        try {
            Uri uri = mVar.a;
            this.f = uri;
            f(mVar);
            AssetFileDescriptor openAssetFileDescriptor = this.e.openAssetFileDescriptor(uri, "r");
            this.g = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.h = fileInputStream;
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(mVar.f + startOffset) - startOffset;
                if (skip == mVar.f) {
                    long j2 = mVar.g;
                    long j3 = -1;
                    if (j2 != -1) {
                        this.i = j2;
                    } else {
                        long length = openAssetFileDescriptor.getLength();
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size != 0) {
                                j3 = size - channel.position();
                            }
                            this.i = j3;
                        } else {
                            this.i = length - skip;
                        }
                    }
                    this.j = true;
                    g(mVar);
                    return this.i;
                }
                throw new EOFException();
            }
            throw new FileNotFoundException("Could not open file descriptor for: " + uri);
        } catch (IOException e2) {
            throw new ContentDataSourceException(e2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public void close() {
        this.f = null;
        try {
            FileInputStream fileInputStream = this.h;
            if (fileInputStream != null) {
                fileInputStream.close();
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
                throw new ContentDataSourceException(e2);
            } catch (Throwable th) {
                this.g = null;
                if (this.j) {
                    this.j = false;
                    e();
                }
                throw th;
            }
        } catch (IOException e3) {
            throw new ContentDataSourceException(e3);
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
                throw new ContentDataSourceException(e4);
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
                throw new ContentDataSourceException(e2);
            }
        }
        FileInputStream fileInputStream = this.h;
        int i4 = f0.a;
        int read = fileInputStream.read(bArr, i2, i3);
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
            throw new ContentDataSourceException(new EOFException());
        }
    }
}
