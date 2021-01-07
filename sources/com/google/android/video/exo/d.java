package com.google.android.video.exo;

import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.a0;
import okhttp3.e;

public final class d extends HttpDataSource.a {
    private final e.a b;
    private final String c;
    private final a0 d;

    public d(e.a aVar, String str) {
        this.b = aVar;
        this.c = null;
        this.d = null;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.upstream.HttpDataSource.a
    public HttpDataSource c(HttpDataSource.b bVar) {
        c cVar = new c(this.b, this.c, null, null, bVar);
        a0 a0Var = this.d;
        if (a0Var != null) {
            cVar.b(a0Var);
        }
        return cVar;
    }

    public d(e.a aVar, String str, a0 a0Var) {
        this.b = aVar;
        this.c = null;
        this.d = a0Var;
    }
}
