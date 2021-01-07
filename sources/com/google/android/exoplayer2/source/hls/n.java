package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.source.a0;
import com.google.android.exoplayer2.source.c0;
import com.google.android.exoplayer2.source.e0;
import com.google.android.exoplayer2.source.f0;
import com.google.android.exoplayer2.source.hls.g;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.t;
import com.google.android.exoplayer2.upstream.v;
import com.google.android.exoplayer2.util.s;
import defpackage.um;
import defpackage.zj;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* access modifiers changed from: package-private */
public final class n implements Loader.b<ho>, Loader.f, c0, rj, a0.b {
    private static final Set<Integer> d0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 4)));
    private final Map<String, l> A;
    private a0[] B;
    private int[] C = new int[0];
    private Set<Integer> D;
    private SparseIntArray E;
    private zj F;
    private int G;
    private int H;
    private boolean I;
    private boolean J;
    private int K;
    private d0 L;
    private d0 M;
    private boolean N;
    private f0 O;
    private Set<e0> P;
    private int[] Q;
    private int R;
    private boolean S;
    private boolean[] T;
    private boolean[] U;
    private long V;
    private long W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private final int a;
    private boolean a0;
    private final a b;
    private long b0;
    private final g c;
    private int c0;
    private final com.google.android.exoplayer2.upstream.n f;
    private final d0 n;
    private final com.google.android.exoplayer2.drm.n<?> o;
    private final v p;
    private final Loader q = new Loader("Loader:HlsSampleStreamWrapper");
    private final v.a r;
    private final int s;
    private final g.b t = new g.b();
    private final ArrayList<k> u;
    private final List<k> v;
    private final Runnable w;
    private final Runnable x;
    private final Handler y;
    private final ArrayList<m> z;

    public interface a extends c0.a<n> {
    }

    private static class b implements zj {
        private static final d0 g = d0.r(null, "application/id3", Long.MAX_VALUE);
        private static final d0 h = d0.r(null, "application/x-emsg", Long.MAX_VALUE);
        private final cn a = new cn();
        private final zj b;
        private final d0 c;
        private d0 d;
        private byte[] e;
        private int f;

        public b(zj zjVar, int i) {
            this.b = zjVar;
            if (i == 1) {
                this.c = g;
            } else if (i == 3) {
                this.c = h;
            } else {
                throw new IllegalArgumentException(je.p0("Unknown metadataType: ", i));
            }
            this.e = new byte[0];
            this.f = 0;
        }

        @Override // defpackage.zj
        public int a(nj njVar, int i, boolean z) {
            int i2 = this.f + i;
            byte[] bArr = this.e;
            if (bArr.length < i2) {
                this.e = Arrays.copyOf(bArr, (i2 / 2) + i2);
            }
            int g2 = njVar.g(this.e, this.f, i);
            if (g2 != -1) {
                this.f += g2;
                return g2;
            } else if (z) {
                return -1;
            } else {
                throw new EOFException();
            }
        }

        @Override // defpackage.zj
        public void b(com.google.android.exoplayer2.util.v vVar, int i) {
            int i2 = this.f + i;
            byte[] bArr = this.e;
            if (bArr.length < i2) {
                this.e = Arrays.copyOf(bArr, (i2 / 2) + i2);
            }
            vVar.g(this.e, this.f, i);
            this.f += i;
        }

        @Override // defpackage.zj
        public void c(d0 d0Var) {
            this.d = d0Var;
            this.b.c(this.c);
        }

        @Override // defpackage.zj
        public void d(long j, int i, int i2, int i3, zj.a aVar) {
            this.d.getClass();
            int i4 = this.f - i3;
            com.google.android.exoplayer2.util.v vVar = new com.google.android.exoplayer2.util.v(Arrays.copyOfRange(this.e, i4 - i2, i4));
            byte[] bArr = this.e;
            System.arraycopy(bArr, i4, bArr, 0, i3);
            this.f = i3;
            if (!com.google.android.exoplayer2.util.f0.a(this.d.r, this.c.r)) {
                if ("application/x-emsg".equals(this.d.r)) {
                    bn b2 = this.a.b(vVar);
                    d0 O = b2.O();
                    if (!(O != null && com.google.android.exoplayer2.util.f0.a(this.c.r, O.r))) {
                        String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.c.r, b2.O());
                        return;
                    }
                    byte[] bArr2 = b2.O() != null ? b2.n : null;
                    bArr2.getClass();
                    vVar = new com.google.android.exoplayer2.util.v(bArr2);
                } else {
                    String str = this.d.r;
                    return;
                }
            }
            int a2 = vVar.a();
            this.b.b(vVar, a2);
            this.b.d(j, i, a2, i3, aVar);
        }
    }

    private static final class c extends a0 {
        private final Map<String, l> o;

        public c(com.google.android.exoplayer2.upstream.n nVar, com.google.android.exoplayer2.drm.n<?> nVar2, Map<String, l> map) {
            super(nVar, nVar2);
            this.o = map;
        }

        @Override // com.google.android.exoplayer2.source.a0, defpackage.zj
        public void c(d0 d0Var) {
            l lVar;
            l lVar2 = d0Var.u;
            if (!(lVar2 == null || (lVar = this.o.get(lVar2.c)) == null)) {
                lVar2 = lVar;
            }
            um umVar = d0Var.p;
            if (umVar != null) {
                int e = umVar.e();
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= e) {
                        i2 = -1;
                        break;
                    }
                    um.b c = umVar.c(i2);
                    if ((c instanceof rn) && "com.apple.streaming.transportStreamTimestamp".equals(((rn) c).b)) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1) {
                    if (e != 1) {
                        um.b[] bVarArr = new um.b[(e - 1)];
                        while (i < e) {
                            if (i != i2) {
                                bVarArr[i < i2 ? i : i - 1] = umVar.c(i);
                            }
                            i++;
                        }
                        umVar = new um(bVarArr);
                    }
                }
                super.c(d0Var.a(lVar2, umVar));
            }
            umVar = null;
            super.c(d0Var.a(lVar2, umVar));
        }
    }

    public n(int i, a aVar, g gVar, Map<String, l> map, com.google.android.exoplayer2.upstream.n nVar, long j, d0 d0Var, com.google.android.exoplayer2.drm.n<?> nVar2, com.google.android.exoplayer2.upstream.v vVar, v.a aVar2, int i2) {
        this.a = i;
        this.b = aVar;
        this.c = gVar;
        this.A = map;
        this.f = nVar;
        this.n = d0Var;
        this.o = nVar2;
        this.p = vVar;
        this.r = aVar2;
        this.s = i2;
        Set<Integer> set = d0;
        this.D = new HashSet(set.size());
        this.E = new SparseIntArray(set.size());
        this.B = new a0[0];
        this.U = new boolean[0];
        this.T = new boolean[0];
        ArrayList<k> arrayList = new ArrayList<>();
        this.u = arrayList;
        this.v = Collections.unmodifiableList(arrayList);
        this.z = new ArrayList<>();
        this.w = new b(this);
        this.x = new a(this);
        this.y = new Handler();
        this.V = j;
        this.W = j;
    }

    private k A() {
        ArrayList<k> arrayList = this.u;
        return arrayList.get(arrayList.size() - 1);
    }

    private static int C(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    private boolean E() {
        return this.W != -9223372036854775807L;
    }

    public static void G(n nVar) {
        nVar.I = true;
        nVar.I();
    }

    /* access modifiers changed from: private */
    public void I() {
        if (!this.N && this.Q == null && this.I) {
            boolean z2 = false;
            for (a0 a0Var : this.B) {
                if (a0Var.p() == null) {
                    return;
                }
            }
            f0 f0Var = this.O;
            if (f0Var != null) {
                int i = f0Var.a;
                int[] iArr = new int[i];
                this.Q = iArr;
                Arrays.fill(iArr, -1);
                for (int i2 = 0; i2 < i; i2++) {
                    int i3 = 0;
                    while (true) {
                        a0[] a0VarArr = this.B;
                        if (i3 >= a0VarArr.length) {
                            break;
                        }
                        d0 p2 = a0VarArr[i3].p();
                        d0 a2 = this.O.a(i2).a(0);
                        String str = p2.r;
                        String str2 = a2.r;
                        int f2 = s.f(str);
                        if (f2 == 3 ? com.google.android.exoplayer2.util.f0.a(str, str2) && ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || p2.K == a2.K) : f2 == s.f(str2)) {
                            this.Q[i2] = i3;
                            break;
                        }
                        i3++;
                    }
                }
                Iterator<m> it = this.z.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                return;
            }
            int length = this.B.length;
            int i4 = 0;
            int i5 = 6;
            int i6 = -1;
            while (true) {
                int i7 = 2;
                if (i4 >= length) {
                    break;
                }
                String str3 = this.B[i4].p().r;
                if (!s.j(str3)) {
                    if (s.h(str3)) {
                        i7 = 1;
                    } else {
                        i7 = s.i(str3) ? 3 : 6;
                    }
                }
                if (C(i7) > C(i5)) {
                    i6 = i4;
                    i5 = i7;
                } else if (i7 == i5 && i6 != -1) {
                    i6 = -1;
                }
                i4++;
            }
            e0 d = this.c.d();
            int i8 = d.a;
            this.R = -1;
            this.Q = new int[length];
            for (int i9 = 0; i9 < length; i9++) {
                this.Q[i9] = i9;
            }
            e0[] e0VarArr = new e0[length];
            for (int i10 = 0; i10 < length; i10++) {
                d0 p3 = this.B[i10].p();
                if (i10 == i6) {
                    d0[] d0VarArr = new d0[i8];
                    if (i8 == 1) {
                        d0VarArr[0] = p3.h(d.a(0));
                    } else {
                        for (int i11 = 0; i11 < i8; i11++) {
                            d0VarArr[i11] = z(d.a(i11), p3, true);
                        }
                    }
                    e0VarArr[i10] = new e0(d0VarArr);
                    this.R = i10;
                } else {
                    e0VarArr[i10] = new e0(z((i5 != 2 || !s.h(p3.r)) ? null : this.n, p3, false));
                }
            }
            this.O = y(e0VarArr);
            if (this.P == null) {
                z2 = true;
            }
            com.google.android.exoplayer2.util.g.m(z2);
            this.P = Collections.emptySet();
            this.J = true;
            ((l) this.b).s();
        }
    }

    private void P() {
        for (a0 a0Var : this.B) {
            a0Var.C(this.X);
        }
        this.X = false;
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    private void v() {
        com.google.android.exoplayer2.util.g.m(this.J);
        this.O.getClass();
        this.P.getClass();
    }

    private f0 y(e0[] e0VarArr) {
        for (int i = 0; i < e0VarArr.length; i++) {
            e0 e0Var = e0VarArr[i];
            d0[] d0VarArr = new d0[e0Var.a];
            for (int i2 = 0; i2 < e0Var.a; i2++) {
                d0 a2 = e0Var.a(i2);
                l lVar = a2.u;
                if (lVar != null) {
                    a2 = a2.e(this.o.b(lVar));
                }
                d0VarArr[i2] = a2;
            }
            e0VarArr[i] = new e0(d0VarArr);
        }
        return new f0(e0VarArr);
    }

    private static d0 z(d0 d0Var, d0 d0Var2, boolean z2) {
        if (d0Var == null) {
            return d0Var2;
        }
        int i = z2 ? d0Var.n : -1;
        int i2 = d0Var.E;
        if (i2 == -1) {
            i2 = d0Var2.E;
        }
        String o2 = com.google.android.exoplayer2.util.f0.o(d0Var.o, s.f(d0Var2.r));
        String c2 = s.c(o2);
        if (c2 == null) {
            c2 = d0Var2.r;
        }
        return d0Var2.c(d0Var.a, d0Var.b, c2, o2, d0Var.p, i, d0Var.w, d0Var.x, i2, d0Var.c, d0Var.J);
    }

    public int B() {
        return this.R;
    }

    public void D(int i, boolean z2, boolean z3) {
        if (!z3) {
            this.D.clear();
        }
        this.c0 = i;
        for (a0 a0Var : this.B) {
            a0Var.H(i);
        }
        if (z2) {
            for (a0 a0Var2 : this.B) {
                a0Var2.I();
            }
        }
    }

    public boolean F(int i) {
        return !E() && this.B[i].s(this.Z);
    }

    public void J() {
        this.q.j();
        this.c.h();
    }

    public void K(int i) {
        J();
        this.B[i].t();
    }

    public boolean L(Uri uri, long j) {
        return this.c.j(uri, j);
    }

    public void M(e0[] e0VarArr, int i, int... iArr) {
        this.O = y(e0VarArr);
        this.P = new HashSet();
        for (int i2 : iArr) {
            this.P.add(this.O.a(i2));
        }
        this.R = i;
        Handler handler = this.y;
        a aVar = this.b;
        aVar.getClass();
        handler.post(new c(aVar));
        this.J = true;
    }

    public int N(int i, com.google.android.exoplayer2.e0 e0Var, fj fjVar, boolean z2) {
        d0 d0Var;
        if (E()) {
            return -3;
        }
        int i2 = 0;
        if (!this.u.isEmpty()) {
            int i3 = 0;
            while (true) {
                boolean z3 = true;
                if (i3 >= this.u.size() - 1) {
                    break;
                }
                int i4 = this.u.get(i3).j;
                int length = this.B.length;
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        if (this.T[i5] && this.B[i5].u() == i4) {
                            z3 = false;
                            break;
                        }
                        i5++;
                    } else {
                        break;
                    }
                }
                if (!z3) {
                    break;
                }
                i3++;
            }
            com.google.android.exoplayer2.util.f0.I(this.u, 0, i3);
            k kVar = this.u.get(0);
            d0 d0Var2 = kVar.c;
            if (!d0Var2.equals(this.M)) {
                this.r.c(this.a, d0Var2, kVar.d, kVar.e, kVar.f);
            }
            this.M = d0Var2;
        }
        int y2 = this.B[i].y(e0Var, fjVar, z2, this.Z, this.V);
        if (y2 == -5) {
            d0 d0Var3 = e0Var.c;
            d0Var3.getClass();
            if (i == this.H) {
                int u2 = this.B[i].u();
                while (i2 < this.u.size() && this.u.get(i2).j != u2) {
                    i2++;
                }
                if (i2 < this.u.size()) {
                    d0Var = this.u.get(i2).c;
                } else {
                    d0Var = this.L;
                    d0Var.getClass();
                }
                d0Var3 = d0Var3.h(d0Var);
            }
            e0Var.c = d0Var3;
        }
        return y2;
    }

    public void O() {
        if (this.J) {
            for (a0 a0Var : this.B) {
                a0Var.x();
            }
        }
        this.q.l(this);
        this.y.removeCallbacksAndMessages(null);
        this.N = true;
        this.z.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        r8 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Q(long r6, boolean r8) {
        /*
            r5 = this;
            r5.V = r6
            boolean r0 = r5.E()
            r1 = 1
            if (r0 == 0) goto L_0x000c
            r5.W = r6
            return r1
        L_0x000c:
            boolean r0 = r5.I
            r2 = 0
            if (r0 == 0) goto L_0x003f
            if (r8 != 0) goto L_0x003f
            com.google.android.exoplayer2.source.a0[] r8 = r5.B
            int r8 = r8.length
            r0 = 0
        L_0x0017:
            if (r0 >= r8) goto L_0x003b
            com.google.android.exoplayer2.source.a0[] r3 = r5.B
            r3 = r3[r0]
            r3.D()
            int r3 = r3.e(r6, r1, r2)
            r4 = -1
            if (r3 == r4) goto L_0x0029
            r3 = 1
            goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            if (r3 != 0) goto L_0x0038
            boolean[] r3 = r5.U
            boolean r3 = r3[r0]
            if (r3 != 0) goto L_0x0036
            boolean r3 = r5.S
            if (r3 != 0) goto L_0x0038
        L_0x0036:
            r8 = 0
            goto L_0x003c
        L_0x0038:
            int r0 = r0 + 1
            goto L_0x0017
        L_0x003b:
            r8 = 1
        L_0x003c:
            if (r8 == 0) goto L_0x003f
            return r2
        L_0x003f:
            r5.W = r6
            r5.Z = r2
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.k> r6 = r5.u
            r6.clear()
            com.google.android.exoplayer2.upstream.Loader r6 = r5.q
            boolean r6 = r6.i()
            if (r6 == 0) goto L_0x0056
            com.google.android.exoplayer2.upstream.Loader r6 = r5.q
            r6.e()
            goto L_0x005e
        L_0x0056:
            com.google.android.exoplayer2.upstream.Loader r6 = r5.q
            r6.f()
            r5.P()
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.n.Q(long, boolean):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean R(defpackage.gq[] r20, boolean[] r21, com.google.android.exoplayer2.source.b0[] r22, boolean[] r23, long r24, boolean r26) {
        /*
        // Method dump skipped, instructions count: 351
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.n.R(gq[], boolean[], com.google.android.exoplayer2.source.b0[], boolean[], long, boolean):boolean");
    }

    public void S(boolean z2) {
        this.c.l(z2);
    }

    public void T(long j) {
        this.b0 = j;
        for (a0 a0Var : this.B) {
            a0Var.F(j);
        }
    }

    public int U(int i, long j) {
        if (E()) {
            return 0;
        }
        a0 a0Var = this.B[i];
        if (this.Z && j > a0Var.n()) {
            return a0Var.f();
        }
        int e = a0Var.e(j, true, true);
        if (e == -1) {
            return 0;
        }
        return e;
    }

    public void V(int i) {
        v();
        this.Q.getClass();
        int i2 = this.Q[i];
        com.google.android.exoplayer2.util.g.m(this.T[i2]);
        this.T[i2] = false;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long a() {
        if (E()) {
            return this.W;
        }
        if (this.Z) {
            return Long.MIN_VALUE;
        }
        return A().g;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public boolean b(long j) {
        List<k> list;
        long max;
        if (this.Z || this.q.i() || this.q.h()) {
            return false;
        }
        if (E()) {
            list = Collections.emptyList();
            max = this.W;
        } else {
            list = this.v;
            k A2 = A();
            if (A2.g()) {
                max = A2.g;
            } else {
                max = Math.max(this.V, A2.f);
            }
        }
        this.c.c(j, max, list, this.J || !list.isEmpty(), this.t);
        g.b bVar = this.t;
        boolean z2 = bVar.b;
        ho hoVar = bVar.a;
        Uri uri = bVar.c;
        bVar.a = null;
        bVar.b = false;
        bVar.c = null;
        if (z2) {
            this.W = -9223372036854775807L;
            this.Z = true;
            return true;
        } else if (hoVar == null) {
            if (uri != null) {
                ((l) this.b).q(uri);
            }
            return false;
        } else {
            if (hoVar instanceof k) {
                this.W = -9223372036854775807L;
                k kVar = (k) hoVar;
                kVar.k(this);
                this.u.add(kVar);
                this.L = kVar.c;
            }
            this.r.j(hoVar.a, hoVar.b, this.a, hoVar.c, hoVar.d, hoVar.e, hoVar.f, hoVar.g, this.q.m(hoVar, this, ((t) this.p).b(hoVar.b)));
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long c() {
        if (this.Z) {
            return Long.MIN_VALUE;
        }
        if (E()) {
            return this.W;
        }
        long j = this.V;
        k A2 = A();
        if (!A2.g()) {
            if (this.u.size() > 1) {
                ArrayList<k> arrayList = this.u;
                A2 = arrayList.get(arrayList.size() - 2);
            } else {
                A2 = null;
            }
        }
        if (A2 != null) {
            j = Math.max(j, A2.g);
        }
        if (this.I) {
            for (a0 a0Var : this.B) {
                j = Math.max(j, a0Var.n());
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.a0.b
    public void d(d0 d0Var) {
        this.y.post(this.w);
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void e(long j) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.exoplayer2.upstream.Loader$e, long, long, boolean] */
    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public void g(ho hoVar, long j, long j2, boolean z2) {
        ho hoVar2 = hoVar;
        this.r.d(hoVar2.a, hoVar2.e(), hoVar2.d(), hoVar2.b, this.a, hoVar2.c, hoVar2.d, hoVar2.e, hoVar2.f, hoVar2.g, j, j2, hoVar2.c());
        if (!z2) {
            P();
            if (this.K > 0) {
                ((l) this.b).i(this);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.exoplayer2.upstream.Loader$e, long, long] */
    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public void i(ho hoVar, long j, long j2) {
        ho hoVar2 = hoVar;
        this.c.i(hoVar2);
        this.r.f(hoVar2.a, hoVar2.e(), hoVar2.d(), hoVar2.b, this.a, hoVar2.c, hoVar2.d, hoVar2.e, hoVar2.f, hoVar2.g, j, j2, hoVar2.c());
        if (!this.J) {
            b(this.V);
        } else {
            ((l) this.b).i(this);
        }
    }

    @Override // com.google.android.exoplayer2.source.c0
    public boolean isLoading() {
        return this.q.i();
    }

    @Override // defpackage.rj
    public void j(xj xjVar) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.exoplayer2.upstream.Loader$e, long, long, java.io.IOException, int] */
    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public Loader.c o(ho hoVar, long j, long j2, IOException iOException, int i) {
        Loader.c cVar;
        ho hoVar2 = hoVar;
        long c2 = hoVar2.c();
        boolean z2 = hoVar2 instanceof k;
        long a2 = ((t) this.p).a(hoVar2.b, j2, iOException, i);
        boolean z3 = false;
        boolean f2 = a2 != -9223372036854775807L ? this.c.f(hoVar2, a2) : false;
        if (f2) {
            if (z2 && c2 == 0) {
                ArrayList<k> arrayList = this.u;
                if (arrayList.remove(arrayList.size() - 1) == hoVar2) {
                    z3 = true;
                }
                com.google.android.exoplayer2.util.g.m(z3);
                if (this.u.isEmpty()) {
                    this.W = this.V;
                }
            }
            cVar = Loader.d;
        } else {
            long c3 = ((t) this.p).c(hoVar2.b, j2, iOException, i);
            cVar = c3 != -9223372036854775807L ? Loader.g(false, c3) : Loader.e;
        }
        this.r.h(hoVar2.a, hoVar2.e(), hoVar2.d(), hoVar2.b, this.a, hoVar2.c, hoVar2.d, hoVar2.e, hoVar2.f, hoVar2.g, j, j2, c2, iOException, !cVar.c());
        if (f2) {
            if (!this.J) {
                b(this.V);
            } else {
                ((l) this.b).i(this);
            }
        }
        return cVar;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.f
    public void p() {
        for (a0 a0Var : this.B) {
            a0Var.B();
        }
    }

    @Override // defpackage.rj
    public void q() {
        this.a0 = true;
        this.y.post(this.x);
    }

    public void r() {
        J();
        if (this.Z && !this.J) {
            throw new ParserException("Loading finished before preparation is complete.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ec A[RETURN] */
    @Override // defpackage.rj
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.zj s(int r7, int r8) {
        /*
        // Method dump skipped, instructions count: 237
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.n.s(int, int):zj");
    }

    public f0 t() {
        v();
        return this.O;
    }

    public void u(long j, boolean z2) {
        if (this.I && !E()) {
            int length = this.B.length;
            for (int i = 0; i < length; i++) {
                this.B[i].i(j, z2, this.T[i]);
            }
        }
    }

    public int w(int i) {
        v();
        this.Q.getClass();
        int i2 = this.Q[i];
        if (i2 != -1) {
            boolean[] zArr = this.T;
            if (zArr[i2]) {
                return -2;
            }
            zArr[i2] = true;
            return i2;
        } else if (this.P.contains(this.O.a(i))) {
            return -3;
        } else {
            return -2;
        }
    }

    public void x() {
        if (!this.J) {
            b(this.V);
        }
    }
}
