package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.drm.n;
import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.source.x;
import com.google.android.exoplayer2.upstream.a0;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.t;
import com.google.android.exoplayer2.upstream.v;

public final class y extends l implements x.c {
    private final Uri o;
    private final k.a p;
    private final sj q;
    private final n<?> r;
    private final v s;
    private final String t = null;
    private final int u;
    private final Object v;
    private long w;
    private boolean x;
    private boolean y;
    private a0 z;

    public static final class a implements w {
        private final k.a a;
        private sj b;
        private n<?> c;
        private v d;

        public a(k.a aVar) {
            this(aVar, new oj());
        }

        /* renamed from: b */
        public y a(Uri uri) {
            return new y(uri, this.a, this.b, n.a, this.d, null, 1048576, null);
        }

        public a(k.a aVar, sj sjVar) {
            this.a = aVar;
            this.b = sjVar;
            this.c = n.a;
            this.d = new t();
        }
    }

    y(Uri uri, k.a aVar, sj sjVar, n<?> nVar, v vVar, String str, int i, Object obj) {
        this.o = uri;
        this.p = aVar;
        this.q = sjVar;
        this.r = nVar;
        this.s = vVar;
        this.u = i;
        this.w = -9223372036854775807L;
        this.v = null;
    }

    private void l(long j, boolean z2, boolean z3) {
        this.w = j;
        this.x = z2;
        this.y = z3;
        j(new d0(this.w, this.x, false, this.y, null, this.v));
    }

    @Override // com.google.android.exoplayer2.source.t
    public void d(s sVar) {
        ((x) sVar).R();
    }

    @Override // com.google.android.exoplayer2.source.t
    public s f(t.a aVar, com.google.android.exoplayer2.upstream.n nVar, long j) {
        k a2 = this.p.a();
        a0 a0Var = this.z;
        if (a0Var != null) {
            a2.b(a0Var);
        }
        return new x(this.o, a2, this.q.a(), this.r, this.s, h(aVar), this, nVar, this.t, this.u);
    }

    @Override // com.google.android.exoplayer2.source.t
    public void g() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.l
    public void i(a0 a0Var) {
        this.z = a0Var;
        this.r.k();
        l(this.w, this.x, this.y);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.l
    public void k() {
        this.r.d();
    }

    public void m(long j, boolean z2, boolean z3) {
        if (j == -9223372036854775807L) {
            j = this.w;
        }
        if (this.w != j || this.x != z2 || this.y != z3) {
            l(j, z2, z3);
        }
    }
}
