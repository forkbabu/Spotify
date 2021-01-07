package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.offline.x;
import com.google.android.exoplayer2.source.b0;
import com.google.android.exoplayer2.source.c0;
import com.google.android.exoplayer2.source.e0;
import com.google.android.exoplayer2.source.f0;
import com.google.android.exoplayer2.source.hls.n;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.c;
import com.google.android.exoplayer2.source.hls.playlist.e;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.source.s;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.a0;
import com.google.android.exoplayer2.upstream.v;
import com.google.android.exoplayer2.util.g;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

public final class l implements s, n.a, HlsPlaylistTracker.b {
    private n[] A = new n[0];
    private n[] B = new n[0];
    private int[][] C = new int[0][];
    private c0 D = new com.google.android.exoplayer2.source.n(new c0[0]);
    private boolean E;
    private final i a;
    private final HlsPlaylistTracker b;
    private final h c;
    private final a0 f;
    private final com.google.android.exoplayer2.drm.n<?> n;
    private final v o;
    private final v.a p;
    private final com.google.android.exoplayer2.upstream.n q;
    private final IdentityHashMap<b0, Integer> r = new IdentityHashMap<>();
    private final p s = new p();
    private final o t;
    private final boolean u;
    private final int v;
    private final boolean w;
    private s.a x;
    private int y;
    private f0 z;

    public l(i iVar, HlsPlaylistTracker hlsPlaylistTracker, h hVar, a0 a0Var, com.google.android.exoplayer2.drm.n<?> nVar, com.google.android.exoplayer2.upstream.v vVar, v.a aVar, com.google.android.exoplayer2.upstream.n nVar2, o oVar, boolean z2, int i, boolean z3) {
        this.a = iVar;
        this.b = hlsPlaylistTracker;
        this.c = hVar;
        this.f = a0Var;
        this.n = nVar;
        this.o = vVar;
        this.p = aVar;
        this.q = nVar2;
        this.t = oVar;
        this.u = z2;
        this.v = i;
        this.w = z3;
        oVar.getClass();
        aVar.l();
    }

    private n o(int i, Uri[] uriArr, d0[] d0VarArr, d0 d0Var, List<d0> list, Map<String, com.google.android.exoplayer2.drm.l> map, long j) {
        return new n(i, this, new g(this.a, this.b, uriArr, d0VarArr, this.c, this.f, this.s, list), map, this.q, j, d0Var, this.n, this.o, this.p, this.v);
    }

    private static d0 p(d0 d0Var, d0 d0Var2, boolean z2) {
        String str;
        int i;
        int i2;
        int i3;
        um umVar;
        String str2;
        String str3;
        if (d0Var2 != null) {
            String str4 = d0Var2.o;
            um umVar2 = d0Var2.p;
            int i4 = d0Var2.E;
            int i5 = d0Var2.c;
            int i6 = d0Var2.f;
            String str5 = d0Var2.J;
            str3 = d0Var2.b;
            str2 = str4;
            umVar = umVar2;
            i3 = i4;
            i2 = i5;
            i = i6;
            str = str5;
        } else {
            String o2 = com.google.android.exoplayer2.util.f0.o(d0Var.o, 1);
            um umVar3 = d0Var.p;
            if (z2) {
                int i7 = d0Var.E;
                str2 = o2;
                i3 = i7;
                i2 = d0Var.c;
                umVar = umVar3;
                i = d0Var.f;
                str = d0Var.J;
                str3 = d0Var.b;
            } else {
                str2 = o2;
                str3 = null;
                str = null;
                umVar = umVar3;
                i3 = -1;
                i2 = 0;
                i = 0;
            }
        }
        return d0.l(d0Var.a, str3, d0Var.q, com.google.android.exoplayer2.util.s.c(str2), str2, umVar, z2 ? d0Var.n : -1, i3, -1, null, i2, i, str);
    }

    @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.source.c0
    public long a() {
        return this.D.a();
    }

    @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.source.c0
    public boolean b(long j) {
        if (this.z != null) {
            return this.D.b(j);
        }
        for (n nVar : this.A) {
            nVar.x();
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.source.c0
    public long c() {
        return this.D.c();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b
    public void d() {
        this.x.i(this);
    }

    @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.source.c0
    public void e(long j) {
        this.D.e(j);
    }

    @Override // com.google.android.exoplayer2.source.s
    public long f(gq[] gqVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j) {
        int i;
        b0[] b0VarArr2 = b0VarArr;
        int[] iArr = new int[gqVarArr.length];
        int[] iArr2 = new int[gqVarArr.length];
        for (int i2 = 0; i2 < gqVarArr.length; i2++) {
            if (b0VarArr2[i2] == null) {
                i = -1;
            } else {
                i = this.r.get(b0VarArr2[i2]).intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            if (gqVarArr[i2] != null) {
                e0 j2 = gqVarArr[i2].j();
                int i3 = 0;
                while (true) {
                    n[] nVarArr = this.A;
                    if (i3 >= nVarArr.length) {
                        break;
                    } else if (nVarArr[i3].t().b(j2) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        this.r.clear();
        int length = gqVarArr.length;
        b0[] b0VarArr3 = new b0[length];
        b0[] b0VarArr4 = new b0[gqVarArr.length];
        gq[] gqVarArr2 = new gq[gqVarArr.length];
        n[] nVarArr2 = new n[this.A.length];
        int i4 = 0;
        int i5 = 0;
        boolean z2 = false;
        while (i5 < this.A.length) {
            for (int i6 = 0; i6 < gqVarArr.length; i6++) {
                gq gqVar = null;
                b0VarArr4[i6] = iArr[i6] == i5 ? b0VarArr2[i6] : null;
                if (iArr2[i6] == i5) {
                    gqVar = gqVarArr[i6];
                }
                gqVarArr2[i6] = gqVar;
            }
            n nVar = this.A[i5];
            boolean R = nVar.R(gqVarArr2, zArr, b0VarArr4, zArr2, j, z2);
            int i7 = 0;
            boolean z3 = false;
            while (true) {
                boolean z4 = true;
                if (i7 >= gqVarArr.length) {
                    break;
                }
                b0 b0Var = b0VarArr4[i7];
                if (iArr2[i7] == i5) {
                    b0Var.getClass();
                    b0VarArr3[i7] = b0Var;
                    this.r.put(b0Var, Integer.valueOf(i5));
                    z3 = true;
                } else if (iArr[i7] == i5) {
                    if (b0Var != null) {
                        z4 = false;
                    }
                    g.m(z4);
                }
                i7++;
            }
            if (z3) {
                nVarArr2[i4] = nVar;
                i4++;
                if (i4 == 0) {
                    nVar.S(true);
                    if (!R) {
                        n[] nVarArr3 = this.B;
                        if (nVarArr3.length != 0) {
                            if (nVar == nVarArr3[0]) {
                            }
                            this.s.b();
                            z2 = true;
                        }
                    }
                    this.s.b();
                    z2 = true;
                } else {
                    nVar.S(false);
                }
            } else {
                i4 = i4;
            }
            i5++;
            nVarArr2 = nVarArr2;
            length = length;
            gqVarArr2 = gqVarArr2;
            b0VarArr2 = b0VarArr;
        }
        System.arraycopy(b0VarArr3, 0, b0VarArr2, 0, length);
        n[] nVarArr4 = (n[]) com.google.android.exoplayer2.util.f0.F(nVarArr2, i4);
        this.B = nVarArr4;
        this.t.getClass();
        this.D = new com.google.android.exoplayer2.source.n(nVarArr4);
        return j;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b
    public boolean g(Uri uri, long j) {
        boolean z2 = true;
        for (n nVar : this.A) {
            z2 &= nVar.L(uri, j);
        }
        this.x.i(this);
        return z2;
    }

    @Override // com.google.android.exoplayer2.source.s
    public List<x> h(List<gq> list) {
        f0 f0Var;
        int[] iArr;
        int i;
        l lVar = this;
        e r2 = ((c) lVar.b).r();
        r2.getClass();
        int i2 = !r2.e.isEmpty();
        int length = lVar.A.length - r2.h.size();
        int i3 = 0;
        if (i2 != 0) {
            n nVar = lVar.A[0];
            iArr = lVar.C[0];
            f0Var = nVar.t();
            i = nVar.B();
        } else {
            iArr = new int[0];
            f0Var = f0.f;
            i = 0;
        }
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        boolean z3 = false;
        for (gq gqVar : list) {
            e0 j = gqVar.j();
            int b2 = f0Var.b(j);
            if (b2 == -1) {
                int i4 = i2;
                while (true) {
                    n[] nVarArr = lVar.A;
                    if (i4 >= nVarArr.length) {
                        break;
                    } else if (nVarArr[i4].t().b(j) != -1) {
                        int i5 = i4 < length ? 1 : 2;
                        int[] iArr2 = lVar.C[i4];
                        for (int i6 = 0; i6 < gqVar.length(); i6++) {
                            arrayList.add(new x(i5, iArr2[gqVar.e(i6)]));
                        }
                    } else {
                        i4++;
                        lVar = this;
                    }
                }
            } else if (b2 == i) {
                for (int i7 = 0; i7 < gqVar.length(); i7++) {
                    arrayList.add(new x(i3, iArr[gqVar.e(i7)]));
                }
                z3 = true;
            } else {
                z2 = true;
            }
            lVar = this;
            i3 = 0;
        }
        if (z2 && !z3) {
            int i8 = iArr[0];
            int i9 = r2.e.get(iArr[0]).b.n;
            for (int i10 = 1; i10 < iArr.length; i10++) {
                int i11 = r2.e.get(iArr[i10]).b.n;
                if (i11 < i9) {
                    i8 = iArr[i10];
                    i9 = i11;
                }
            }
            arrayList.add(new x(0, i8));
        }
        return arrayList;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.exoplayer2.source.c0] */
    @Override // com.google.android.exoplayer2.source.c0.a
    public void i(n nVar) {
        this.x.i(this);
    }

    @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.source.c0
    public boolean isLoading() {
        return this.D.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.s
    public long k(long j) {
        n[] nVarArr = this.B;
        if (nVarArr.length > 0) {
            boolean Q = nVarArr[0].Q(j, false);
            int i = 1;
            while (true) {
                n[] nVarArr2 = this.B;
                if (i >= nVarArr2.length) {
                    break;
                }
                nVarArr2[i].Q(j, Q);
                i++;
            }
            if (Q) {
                this.s.b();
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.s
    public long l(long j, t0 t0Var) {
        return j;
    }

    @Override // com.google.android.exoplayer2.source.s
    public long m() {
        if (this.E) {
            return -9223372036854775807L;
        }
        this.p.o();
        this.E = true;
        return -9223372036854775807L;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:120:0x0062 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.util.HashMap] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0366 A[LOOP:9: B:112:0x0360->B:114:0x0366, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03df A[LOOP:10: B:116:0x03dd->B:117:0x03df, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x029f  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.exoplayer2.source.s
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(com.google.android.exoplayer2.source.s.a r36, long r37) {
        /*
        // Method dump skipped, instructions count: 1004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.l.n(com.google.android.exoplayer2.source.s$a, long):void");
    }

    public void q(Uri uri) {
        ((c) this.b).x(uri);
    }

    @Override // com.google.android.exoplayer2.source.s
    public void r() {
        for (n nVar : this.A) {
            nVar.r();
        }
    }

    public void s() {
        int i = this.y - 1;
        this.y = i;
        if (i <= 0) {
            int i2 = 0;
            for (n nVar : this.A) {
                i2 += nVar.t().a;
            }
            e0[] e0VarArr = new e0[i2];
            n[] nVarArr = this.A;
            int i3 = 0;
            for (n nVar2 : nVarArr) {
                int i4 = nVar2.t().a;
                int i5 = 0;
                while (i5 < i4) {
                    e0VarArr[i3] = nVar2.t().a(i5);
                    i5++;
                    i3++;
                }
            }
            this.z = new f0(e0VarArr);
            this.x.j(this);
        }
    }

    @Override // com.google.android.exoplayer2.source.s
    public f0 t() {
        f0 f0Var = this.z;
        f0Var.getClass();
        return f0Var;
    }

    @Override // com.google.android.exoplayer2.source.s
    public void u(long j, boolean z2) {
        for (n nVar : this.B) {
            nVar.u(j, z2);
        }
    }

    public void v() {
        ((c) this.b).y(this);
        for (n nVar : this.A) {
            nVar.O();
        }
        this.x = null;
        this.p.m();
    }
}
