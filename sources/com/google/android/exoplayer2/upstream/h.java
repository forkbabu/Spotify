package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.f0;
import java.net.URLDecoder;

public final class h extends g {
    private m e;
    private byte[] f;
    private int g;
    private int h;

    public h() {
        super(false);
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public long a(m mVar) {
        f(mVar);
        this.e = mVar;
        this.h = (int) mVar.f;
        Uri uri = mVar.a;
        String scheme = uri.getScheme();
        if ("data".equals(scheme)) {
            String[] M = f0.M(uri.getSchemeSpecificPart(), ",");
            if (M.length == 2) {
                String str = M[1];
                if (M[0].contains(";base64")) {
                    try {
                        this.f = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e2) {
                        throw new ParserException(je.x0("Error while parsing Base64 encoded string: ", str), e2);
                    }
                } else {
                    this.f = f0.z(URLDecoder.decode(str, "US-ASCII"));
                }
                long j = mVar.g;
                int length = j != -1 ? ((int) j) + this.h : this.f.length;
                this.g = length;
                if (length > this.f.length || this.h > length) {
                    this.f = null;
                    throw new DataSourceException(0);
                }
                g(mVar);
                return ((long) this.g) - ((long) this.h);
            }
            throw new ParserException("Unexpected URI format: " + uri);
        }
        throw new ParserException(je.x0("Unsupported scheme: ", scheme));
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public void close() {
        if (this.f != null) {
            this.f = null;
            e();
        }
        this.e = null;
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public Uri getUri() {
        m mVar = this.e;
        if (mVar != null) {
            return mVar.a;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.g - this.h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.f;
        int i4 = f0.a;
        System.arraycopy(bArr2, this.h, bArr, i, min);
        this.h += min;
        d(min);
        return min;
    }
}
