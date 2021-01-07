package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.util.List;
import java.util.Map;

public final class z implements k {
    private final k a;
    private final i b;
    private boolean c;
    private long d;

    public z(k kVar, i iVar) {
        kVar.getClass();
        this.a = kVar;
        this.b = iVar;
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public long a(m mVar) {
        long a2 = this.a.a(mVar);
        this.d = a2;
        if (a2 == 0) {
            return 0;
        }
        if (mVar.g == -1 && a2 != -1) {
            mVar = mVar.e(0, a2);
        }
        this.c = true;
        this.b.a(mVar);
        return this.d;
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public void b(a0 a0Var) {
        this.a.b(a0Var);
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public Map<String, List<String>> c() {
        return this.a.c();
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public void close() {
        try {
            this.a.close();
        } finally {
            if (this.c) {
                this.c = false;
                this.b.close();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public Uri getUri() {
        return this.a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i, int i2) {
        if (this.d == 0) {
            return -1;
        }
        int read = this.a.read(bArr, i, i2);
        if (read > 0) {
            this.b.write(bArr, i, read);
            long j = this.d;
            if (j != -1) {
                this.d = j - ((long) read);
            }
        }
        return read;
    }
}
