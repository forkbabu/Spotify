package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.drm.n;
import com.google.android.exoplayer2.offline.x;
import com.google.android.exoplayer2.source.d0;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.b;
import com.google.android.exoplayer2.source.hls.playlist.c;
import com.google.android.exoplayer2.source.hls.playlist.d;
import com.google.android.exoplayer2.source.hls.playlist.e;
import com.google.android.exoplayer2.source.hls.playlist.f;
import com.google.android.exoplayer2.source.hls.playlist.i;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.source.s;
import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.source.w;
import com.google.android.exoplayer2.u;
import com.google.android.exoplayer2.upstream.a0;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.t;
import com.google.android.exoplayer2.upstream.v;
import com.google.android.exoplayer2.util.g;
import java.util.List;

public final class HlsMediaSource extends l implements HlsPlaylistTracker.c {
    private final i o;
    private final Uri p;
    private final h q;
    private final o r;
    private final n<?> s;
    private final v t;
    private final boolean u;
    private final int v;
    private final boolean w;
    private final HlsPlaylistTracker x;
    private final Object y = null;
    private a0 z;

    public static final class Factory implements w {
        private final h a;
        private i b;
        private i c = new b();
        private List<x> d;
        private HlsPlaylistTracker.a e;
        private o f;
        private n<?> g;
        private v h;
        private int i;
        private boolean j;

        public Factory(k.a aVar) {
            this.a = new e(aVar);
            int i2 = c.z;
            this.e = com.google.android.exoplayer2.source.hls.playlist.a.a;
            this.b = i.a;
            this.g = n.a;
            this.h = new t();
            this.f = new o();
            this.i = 1;
        }

        /* renamed from: b */
        public HlsMediaSource a(Uri uri) {
            this.j = true;
            List<x> list = this.d;
            if (list != null) {
                this.c = new d(this.c, list);
            }
            h hVar = this.a;
            i iVar = this.b;
            o oVar = this.f;
            n<?> nVar = this.g;
            v vVar = this.h;
            HlsPlaylistTracker.a aVar = this.e;
            i iVar2 = this.c;
            ((com.google.android.exoplayer2.source.hls.playlist.a) aVar).getClass();
            return new HlsMediaSource(uri, hVar, iVar, oVar, nVar, vVar, new c(hVar, vVar, iVar2), false, this.i, false, null, null);
        }

        public Factory c(n<?> nVar) {
            g.m(!this.j);
            this.g = nVar;
            return this;
        }

        public Factory d(List<x> list) {
            g.m(!this.j);
            this.d = list;
            return this;
        }
    }

    static {
        c0.a("goog.exo.hls");
    }

    HlsMediaSource(Uri uri, h hVar, i iVar, o oVar, n nVar, v vVar, HlsPlaylistTracker hlsPlaylistTracker, boolean z2, int i, boolean z3, Object obj, a aVar) {
        this.p = uri;
        this.q = hVar;
        this.o = iVar;
        this.r = oVar;
        this.s = nVar;
        this.t = vVar;
        this.x = hlsPlaylistTracker;
        this.u = z2;
        this.v = i;
        this.w = z3;
    }

    @Override // com.google.android.exoplayer2.source.t
    public void d(s sVar) {
        ((l) sVar).v();
    }

    @Override // com.google.android.exoplayer2.source.t
    public s f(t.a aVar, com.google.android.exoplayer2.upstream.n nVar, long j) {
        return new l(this.o, this.x, this.q, this.z, this.s, this.t, h(aVar), nVar, this.r, this.u, this.v, this.w);
    }

    @Override // com.google.android.exoplayer2.source.t
    public void g() {
        ((c) this.x).w();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.l
    public void i(a0 a0Var) {
        this.z = a0Var;
        this.s.k();
        v.a h = h(null);
        ((c) this.x).z(this.p, h, this);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.l
    public void k() {
        ((c) this.x).A();
        this.s.d();
    }

    public void l(f fVar) {
        d0 d0Var;
        long j;
        long b = fVar.m ? u.b(fVar.f) : -9223372036854775807L;
        int i = fVar.d;
        long j2 = (i == 2 || i == 1) ? b : -9223372036854775807L;
        long j3 = fVar.e;
        e r2 = ((c) this.x).r();
        r2.getClass();
        j jVar = new j(r2, fVar);
        if (((c) this.x).t()) {
            long q2 = fVar.f - ((c) this.x).q();
            long j4 = fVar.l ? q2 + fVar.p : -9223372036854775807L;
            List<f.a> list = fVar.o;
            if (j3 != -9223372036854775807L) {
                j = j3;
            } else if (!list.isEmpty()) {
                int max = Math.max(0, list.size() - 3);
                long j5 = fVar.p - (fVar.k * 2);
                while (max > 0 && list.get(max).n > j5) {
                    max--;
                }
                j = list.get(max).n;
            } else {
                j = 0;
            }
            d0Var = new d0(j2, b, j4, fVar.p, q2, j, true, !fVar.l, true, jVar, this.y);
        } else {
            long j6 = j3 == -9223372036854775807L ? 0 : j3;
            long j7 = fVar.p;
            d0Var = new d0(j2, b, j7, j7, 0, j6, true, false, false, jVar, this.y);
        }
        j(d0Var);
    }
}
