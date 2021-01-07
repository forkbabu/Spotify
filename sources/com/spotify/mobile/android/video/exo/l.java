package com.spotify.mobile.android.video.exo;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.offline.x;
import com.google.android.exoplayer2.source.b0;
import com.google.android.exoplayer2.source.c0;
import com.google.android.exoplayer2.source.e0;
import com.google.android.exoplayer2.source.f0;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.source.s;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.a0;
import com.google.android.exoplayer2.upstream.n;
import com.google.android.exoplayer2.upstream.t;
import com.google.android.exoplayer2.upstream.w;
import com.google.common.base.Optional;
import com.spotify.mobile.android.video.exo.d;
import com.spotify.mobile.android.video.exo.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class l implements s, c0.a<ko<q>> {
    private final q.a a;
    private final int b;
    private final v.a c;
    private final long f;
    private final w n;
    private final n o;
    private final Optional<com.google.android.exoplayer2.drm.n<com.google.android.exoplayer2.drm.q>> p;
    private final f0 q;
    private final r r;
    private final int s;
    private final List<k> t;
    private final a0 u;
    private s.a v;
    ko<q>[] w;
    private com.google.android.exoplayer2.source.n x;

    public l(r rVar, int i, a0 a0Var, q.a aVar, int i2, v.a aVar2, long j, w wVar, n nVar, Optional<com.google.android.exoplayer2.drm.n<com.google.android.exoplayer2.drm.q>> optional) {
        this.r = rVar;
        this.s = i;
        this.u = a0Var;
        this.a = aVar;
        this.b = i2;
        this.c = aVar2;
        this.f = j;
        this.n = wVar;
        this.o = nVar;
        this.p = optional;
        ko<q>[] koVarArr = new ko[0];
        this.w = koVarArr;
        this.x = new com.google.android.exoplayer2.source.n(koVarArr);
        List<k> d = rVar.c(0).d();
        this.t = d;
        ArrayList arrayList = new ArrayList();
        for (k kVar : d) {
            List<j> list = kVar.b;
            int size = list.size();
            d0[] d0VarArr = new d0[size];
            for (int i3 = 0; i3 < size; i3++) {
                d0 c2 = list.get(i3).c();
                com.google.android.exoplayer2.drm.l lVar = c2.u;
                if (lVar != null && optional.isPresent()) {
                    c2 = c2.e(optional.get().b(lVar));
                }
                d0VarArr[i3] = c2;
            }
            arrayList.add(new e0(d0VarArr));
        }
        arrayList.add(new e0(d0.r("track-debug-renderer", null, 0)));
        arrayList.add(new e0(d0.r("track-progress-renderer", null, 0)));
        arrayList.add(new e0(d0.r("track-sync-renderer", null, 0)));
        e0[] e0VarArr = new e0[arrayList.size()];
        arrayList.toArray(e0VarArr);
        this.q = new f0(e0VarArr);
    }

    @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.source.c0
    public long a() {
        return this.x.a();
    }

    @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.source.c0
    public boolean b(long j) {
        return this.x.b(j);
    }

    @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.source.c0
    public long c() {
        long j = Long.MAX_VALUE;
        for (ko<q> koVar : this.w) {
            long c2 = koVar.c();
            if (c2 != Long.MIN_VALUE) {
                j = Math.min(j, c2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.source.c0
    public void e(long j) {
    }

    @Override // com.google.android.exoplayer2.source.s
    public long f(gq[] gqVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j) {
        int i;
        int b2;
        HashMap hashMap = new HashMap();
        int i2 = 0;
        while (i2 < gqVarArr.length) {
            gq gqVar = gqVarArr[i2];
            if (gqVar != null && ("track-debug-renderer".equals(gqVar.o().a) || "track-progress-renderer".equals(gqVar.o().a) || "track-sync-renderer".equals(gqVar.o().a))) {
                b0VarArr[i2] = new p();
            } else {
                if (b0VarArr[i2] instanceof ko) {
                    ko koVar = (ko) b0VarArr[i2];
                    if (gqVarArr[i2] == null || !zArr[i2]) {
                        koVar.B();
                        b0VarArr[i2] = null;
                    } else {
                        hashMap.put(Integer.valueOf(this.q.b(gqVarArr[i2].j())), koVar);
                    }
                }
                if (!(b0VarArr[i2] != null || gqVarArr[i2] == null || (b2 = this.q.b(gqVarArr[i2].j())) == -1)) {
                    i = i2;
                    ko koVar2 = new ko(this.t.get(b2).a, null, null, ((d.a) this.a).a(this.n, this.r, this.s, b2, gqVarArr[i2], this.f, this.u), this, this.o, j, this.p.orNull(), new t(this.b), this.c);
                    hashMap.put(Integer.valueOf(b2), koVar2);
                    b0VarArr[i] = koVar2;
                    zArr2[i] = true;
                    i2 = i + 1;
                }
            }
            i = i2;
            i2 = i + 1;
        }
        this.w = new ko[hashMap.size()];
        hashMap.values().toArray(this.w);
        this.x = new com.google.android.exoplayer2.source.n(this.w);
        return j;
    }

    @Override // com.google.android.exoplayer2.source.s
    public List<x> h(List<gq> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (gq gqVar : list) {
            int f2 = com.google.android.exoplayer2.util.s.f(gqVar.j().a(0).r);
            int i = 0;
            while (true) {
                if (i >= this.t.size()) {
                    i = -1;
                    break;
                } else if (this.t.get(i).a == f2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                List<j> list2 = this.t.get(i).b;
                for (int i2 = 0; i2 < gqVar.length(); i2++) {
                    d0 d = gqVar.d(i2);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= list2.size()) {
                            i3 = -1;
                            break;
                        }
                        if (list2.get(i3).c().equals(d.e(null))) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 >= 0) {
                        arrayList.add(new x(i, i3));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.exoplayer2.source.c0] */
    @Override // com.google.android.exoplayer2.source.c0.a
    public void i(ko<q> koVar) {
        this.v.i(this);
    }

    @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.source.c0
    public boolean isLoading() {
        return this.x.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.s
    public long k(long j) {
        for (ko<q> koVar : this.w) {
            koVar.C(j);
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.s
    public long l(long j, t0 t0Var) {
        ko<q>[] koVarArr = this.w;
        for (ko<q> koVar : koVarArr) {
            if (koVar.a == 2) {
                return koVar.l(j, t0Var);
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.s
    public long m() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.s
    public void n(s.a aVar, long j) {
        this.v = aVar;
        aVar.j(this);
    }

    @Override // com.google.android.exoplayer2.source.s
    public void r() {
        ((Loader) this.n).j();
    }

    @Override // com.google.android.exoplayer2.source.s
    public f0 t() {
        return this.q;
    }

    @Override // com.google.android.exoplayer2.source.s
    public void u(long j, boolean z) {
        for (ko<q> koVar : this.w) {
            koVar.u(j, z);
        }
    }
}
