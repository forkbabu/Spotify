package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

public final class u implements k {
    public static final /* synthetic */ int a = 0;

    private u() {
    }

    public static /* synthetic */ u d() {
        return new u();
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public long a(m mVar) {
        throw new IOException("Dummy source");
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public void b(a0 a0Var) {
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public /* synthetic */ Map c() {
        return j.a(this);
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public void close() {
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public Uri getUri() {
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
