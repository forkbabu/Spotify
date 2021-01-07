package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class y implements k {
    private final k a;
    private long b;
    private Uri c = Uri.EMPTY;
    private Map<String, List<String>> d = Collections.emptyMap();

    public y(k kVar) {
        kVar.getClass();
        this.a = kVar;
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public long a(m mVar) {
        this.c = mVar.a;
        this.d = Collections.emptyMap();
        long a2 = this.a.a(mVar);
        Uri uri = getUri();
        uri.getClass();
        this.c = uri;
        this.d = c();
        return a2;
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
        this.a.close();
    }

    public long d() {
        return this.b;
    }

    public Uri e() {
        return this.c;
    }

    public Map<String, List<String>> f() {
        return this.d;
    }

    public void g() {
        this.b = 0;
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public Uri getUri() {
        return this.a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            this.b += (long) read;
        }
        return read;
    }
}
