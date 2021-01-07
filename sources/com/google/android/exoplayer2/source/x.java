package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.drm.n;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.source.a0;
import com.google.android.exoplayer2.source.q;
import com.google.android.exoplayer2.source.s;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.upstream.t;
import com.google.android.exoplayer2.upstream.v;
import com.google.android.exoplayer2.upstream.y;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.l;
import defpackage.xj;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class x implements s, rj, Loader.b<a>, Loader.f, a0.b {
    private static final Map<String, String> V;
    private static final d0 W = d0.r("icy", "application/x-icy", Long.MAX_VALUE);
    private fn A;
    private a0[] B;
    private f[] C;
    private boolean D;
    private boolean E;
    private d F;
    private boolean G;
    private int H;
    private boolean I;
    private boolean J;
    private boolean K;
    private int L;
    private long M;
    private long N;
    private boolean O;
    private long P;
    private long Q;
    private boolean R;
    private int S;
    private boolean T;
    private boolean U;
    private final Uri a;
    private final k b;
    private final n<?> c;
    private final v f;
    private final v.a n;
    private final c o;
    private final com.google.android.exoplayer2.upstream.n p;
    private final String q;
    private final long r;
    private final Loader s = new Loader("Loader:ProgressiveMediaPeriod");
    private final b t;
    private final l u;
    private final Runnable v;
    private final Runnable w;
    private final Handler x;
    private s.a y;
    private xj z;

    /* access modifiers changed from: package-private */
    public final class a implements Loader.e, q.a {
        private final Uri a;
        private final y b;
        private final b c;
        private final rj d;
        private final l e;
        private final wj f = new wj();
        private volatile boolean g;
        private boolean h = true;
        private long i;
        private m j = h(0);
        private long k = -1;
        private zj l;
        private boolean m;

        public a(Uri uri, k kVar, b bVar, rj rjVar, l lVar) {
            this.a = uri;
            this.b = new y(kVar);
            this.c = bVar;
            this.d = rjVar;
            this.e = lVar;
        }

        static void g(a aVar, long j2, long j3) {
            aVar.f.a = j2;
            aVar.i = j3;
            aVar.h = true;
            aVar.m = false;
        }

        private m h(long j2) {
            return new m(this.a, 1, null, j2, j2, -1, x.this.q, 6, x.V);
        }

        /* JADX WARNING: Removed duplicated region for block: B:46:0x0107 A[SYNTHETIC, Splitter:B:46:0x0107] */
        @Override // com.google.android.exoplayer2.upstream.Loader.e
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a() {
            /*
            // Method dump skipped, instructions count: 268
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.x.a.a():void");
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void b() {
            this.g = true;
        }

        public void i(com.google.android.exoplayer2.util.v vVar) {
            long j2;
            if (!this.m) {
                j2 = this.i;
            } else {
                j2 = Math.max(x.this.G(), this.i);
            }
            int a2 = vVar.a();
            zj zjVar = this.l;
            zjVar.getClass();
            zjVar.b(vVar, a2);
            zjVar.d(j2, 1, a2, 0, null);
            this.m = true;
        }
    }

    /* access modifiers changed from: private */
    public static final class b {
        private final qj[] a;
        private qj b;

        public b(qj[] qjVarArr) {
            this.a = qjVarArr;
        }

        public void a() {
            qj qjVar = this.b;
            if (qjVar != null) {
                qjVar.d();
                this.b = null;
            }
        }

        public qj b(nj njVar, rj rjVar, Uri uri) {
            qj qjVar = this.b;
            if (qjVar != null) {
                return qjVar;
            }
            qj[] qjVarArr = this.a;
            if (qjVarArr.length == 1) {
                this.b = qjVarArr[0];
            } else {
                int length = qjVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    qj qjVar2 = qjVarArr[i];
                    try {
                        if (qjVar2.f(njVar)) {
                            this.b = qjVar2;
                            njVar.j();
                            break;
                        }
                        njVar.j();
                        i++;
                    } catch (EOFException unused) {
                    } catch (Throwable th) {
                        njVar.j();
                        throw th;
                    }
                }
                if (this.b == null) {
                    StringBuilder V0 = je.V0("None of the available extractors (");
                    qj[] qjVarArr2 = this.a;
                    int i2 = f0.a;
                    StringBuilder sb = new StringBuilder();
                    for (int i3 = 0; i3 < qjVarArr2.length; i3++) {
                        sb.append(qjVarArr2[i3].getClass().getSimpleName());
                        if (i3 < qjVarArr2.length - 1) {
                            sb.append(", ");
                        }
                    }
                    V0.append(sb.toString());
                    V0.append(") could read the stream.");
                    throw new UnrecognizedInputFormatException(V0.toString(), uri);
                }
            }
            this.b.b(rjVar);
            return this.b;
        }
    }

    interface c {
    }

    /* access modifiers changed from: private */
    public static final class d {
        public final xj a;
        public final f0 b;
        public final boolean[] c;
        public final boolean[] d;
        public final boolean[] e;

        public d(xj xjVar, f0 f0Var, boolean[] zArr) {
            this.a = xjVar;
            this.b = f0Var;
            this.c = zArr;
            int i = f0Var.a;
            this.d = new boolean[i];
            this.e = new boolean[i];
        }
    }

    private final class e implements b0 {
        private final int a;

        public e(int i) {
            this.a = i;
        }

        @Override // com.google.android.exoplayer2.source.b0
        public boolean d() {
            return x.this.J(this.a);
        }

        @Override // com.google.android.exoplayer2.source.b0
        public void j() {
            x.this.O(this.a);
        }

        @Override // com.google.android.exoplayer2.source.b0
        public int q(e0 e0Var, fj fjVar, boolean z) {
            return x.this.Q(this.a, e0Var, fjVar, z);
        }

        @Override // com.google.android.exoplayer2.source.b0
        public int s(long j) {
            return x.this.S(this.a, j);
        }
    }

    /* access modifiers changed from: private */
    public static final class f {
        public final int a;
        public final boolean b;

        public f(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            if (this.a == fVar.a && this.b == fVar.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a * 31) + (this.b ? 1 : 0);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        V = Collections.unmodifiableMap(hashMap);
    }

    public x(Uri uri, k kVar, qj[] qjVarArr, n<?> nVar, com.google.android.exoplayer2.upstream.v vVar, v.a aVar, c cVar, com.google.android.exoplayer2.upstream.n nVar2, String str, int i) {
        this.a = uri;
        this.b = kVar;
        this.c = nVar;
        this.f = vVar;
        this.n = aVar;
        this.o = cVar;
        this.p = nVar2;
        this.q = str;
        this.r = (long) i;
        this.t = new b(qjVarArr);
        this.u = new l();
        this.v = new j(this);
        this.w = new k(this);
        this.x = new Handler();
        this.C = new f[0];
        this.B = new a0[0];
        this.Q = -9223372036854775807L;
        this.N = -1;
        this.M = -9223372036854775807L;
        this.H = 1;
        aVar.l();
    }

    private void E(a aVar) {
        if (this.N == -1) {
            this.N = aVar.k;
        }
    }

    private int F() {
        int i = 0;
        for (a0 a0Var : this.B) {
            i += a0Var.q();
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private long G() {
        long j = Long.MIN_VALUE;
        for (a0 a0Var : this.B) {
            j = Math.max(j, a0Var.n());
        }
        return j;
    }

    private boolean I() {
        return this.Q != -9223372036854775807L;
    }

    public static void K(x xVar) {
        int i;
        um umVar;
        xj xjVar = xVar.z;
        if (!(xVar.U || xVar.E || !xVar.D || xjVar == null)) {
            boolean z2 = false;
            for (a0 a0Var : xVar.B) {
                if (a0Var.p() == null) {
                    return;
                }
            }
            xVar.u.b();
            int length = xVar.B.length;
            e0[] e0VarArr = new e0[length];
            boolean[] zArr = new boolean[length];
            xVar.M = xjVar.j();
            for (int i2 = 0; i2 < length; i2++) {
                d0 p2 = xVar.B[i2].p();
                String str = p2.r;
                boolean h = com.google.android.exoplayer2.util.s.h(str);
                boolean z3 = h || com.google.android.exoplayer2.util.s.j(str);
                zArr[i2] = z3;
                xVar.G = z3 | xVar.G;
                fn fnVar = xVar.A;
                if (fnVar != null) {
                    if (h || xVar.C[i2].b) {
                        um umVar2 = p2.p;
                        if (umVar2 == null) {
                            umVar = new um(fnVar);
                        } else {
                            umVar = umVar2.a(fnVar);
                        }
                        p2 = p2.a(p2.u, umVar);
                    }
                    if (h && p2.n == -1 && (i = fnVar.a) != -1) {
                        p2 = p2.b(i);
                    }
                }
                e0VarArr[i2] = new e0(p2);
            }
            if (xVar.N == -1 && xjVar.j() == -9223372036854775807L) {
                z2 = true;
            }
            xVar.O = z2;
            xVar.H = z2 ? 7 : 1;
            xVar.F = new d(xjVar, new f0(e0VarArr), zArr);
            xVar.E = true;
            ((y) xVar.o).m(xVar.M, xjVar.h(), xVar.O);
            s.a aVar = xVar.y;
            aVar.getClass();
            aVar.j(xVar);
        }
    }

    private void M(int i) {
        d dVar = this.F;
        dVar.getClass();
        boolean[] zArr = dVar.e;
        if (!zArr[i]) {
            d0 a2 = dVar.b.a(i).a(0);
            this.n.c(com.google.android.exoplayer2.util.s.f(a2.r), a2, 0, null, this.P);
            zArr[i] = true;
        }
    }

    private void N(int i) {
        d dVar = this.F;
        dVar.getClass();
        boolean[] zArr = dVar.c;
        if (this.R && zArr[i] && !this.B[i].s(false)) {
            this.Q = 0;
            this.R = false;
            this.J = true;
            this.P = 0;
            this.S = 0;
            for (a0 a0Var : this.B) {
                a0Var.C(false);
            }
            s.a aVar = this.y;
            aVar.getClass();
            aVar.i(this);
        }
    }

    private zj P(f fVar) {
        int length = this.B.length;
        for (int i = 0; i < length; i++) {
            if (fVar.equals(this.C[i])) {
                return this.B[i];
            }
        }
        a0 a0Var = new a0(this.p, this.c);
        a0Var.G(this);
        int i2 = length + 1;
        f[] fVarArr = (f[]) Arrays.copyOf(this.C, i2);
        fVarArr[length] = fVar;
        int i3 = f0.a;
        this.C = fVarArr;
        a0[] a0VarArr = (a0[]) Arrays.copyOf(this.B, i2);
        a0VarArr[length] = a0Var;
        this.B = a0VarArr;
        return a0Var;
    }

    private void T() {
        a aVar = new a(this.a, this.b, this.t, this, this.u);
        if (this.E) {
            d dVar = this.F;
            dVar.getClass();
            xj xjVar = dVar.a;
            g.m(I());
            long j = this.M;
            if (j == -9223372036854775807L || this.Q <= j) {
                a.g(aVar, xjVar.e(this.Q).a.b, this.Q);
                this.Q = -9223372036854775807L;
            } else {
                this.T = true;
                this.Q = -9223372036854775807L;
                return;
            }
        }
        this.S = F();
        this.n.j(aVar.j, 1, -1, null, 0, null, aVar.i, this.M, this.s.m(aVar, this, ((t) this.f).b(this.H)));
    }

    private boolean U() {
        return this.J || I();
    }

    /* access modifiers changed from: package-private */
    public zj H() {
        return P(new f(0, true));
    }

    /* access modifiers changed from: package-private */
    public boolean J(int i) {
        return !U() && this.B[i].s(this.T);
    }

    public void L() {
        if (!this.U) {
            s.a aVar = this.y;
            aVar.getClass();
            aVar.i(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void O(int i) {
        this.B[i].t();
        this.s.k(((t) this.f).b(this.H));
    }

    /* access modifiers changed from: package-private */
    public int Q(int i, e0 e0Var, fj fjVar, boolean z2) {
        if (U()) {
            return -3;
        }
        M(i);
        int y2 = this.B[i].y(e0Var, fjVar, z2, this.T, this.P);
        if (y2 == -3) {
            N(i);
        }
        return y2;
    }

    public void R() {
        if (this.E) {
            for (a0 a0Var : this.B) {
                a0Var.x();
            }
        }
        this.s.l(this);
        this.x.removeCallbacksAndMessages(null);
        this.y = null;
        this.U = true;
        this.n.m();
    }

    /* access modifiers changed from: package-private */
    public int S(int i, long j) {
        int i2 = 0;
        if (U()) {
            return 0;
        }
        M(i);
        a0 a0Var = this.B[i];
        if (!this.T || j <= a0Var.n()) {
            int e2 = a0Var.e(j, true, true);
            if (e2 != -1) {
                i2 = e2;
            }
        } else {
            i2 = a0Var.f();
        }
        if (i2 == 0) {
            N(i);
        }
        return i2;
    }

    @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.source.c0
    public long a() {
        if (this.L == 0) {
            return Long.MIN_VALUE;
        }
        return c();
    }

    @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.source.c0
    public boolean b(long j) {
        if (this.T || this.s.h() || this.R) {
            return false;
        }
        if (this.E && this.L == 0) {
            return false;
        }
        boolean d2 = this.u.d();
        if (this.s.i()) {
            return d2;
        }
        T();
        return true;
    }

    @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.source.c0
    public long c() {
        long j;
        d dVar = this.F;
        dVar.getClass();
        boolean[] zArr = dVar.c;
        if (this.T) {
            return Long.MIN_VALUE;
        }
        if (I()) {
            return this.Q;
        }
        if (this.G) {
            int length = this.B.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.B[i].r()) {
                    j = Math.min(j, this.B[i].n());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = G();
        }
        return j == Long.MIN_VALUE ? this.P : j;
    }

    @Override // com.google.android.exoplayer2.source.a0.b
    public void d(d0 d0Var) {
        this.x.post(this.v);
    }

    @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.source.c0
    public void e(long j) {
    }

    @Override // com.google.android.exoplayer2.source.s
    public long f(gq[] gqVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j) {
        d dVar = this.F;
        dVar.getClass();
        f0 f0Var = dVar.b;
        boolean[] zArr3 = dVar.d;
        int i = this.L;
        int i2 = 0;
        for (int i3 = 0; i3 < gqVarArr.length; i3++) {
            if (b0VarArr[i3] != null && (gqVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((e) b0VarArr[i3]).a;
                g.m(zArr3[i4]);
                this.L--;
                zArr3[i4] = false;
                b0VarArr[i3] = null;
            }
        }
        boolean z2 = !this.I ? j != 0 : i == 0;
        for (int i5 = 0; i5 < gqVarArr.length; i5++) {
            if (b0VarArr[i5] == null && gqVarArr[i5] != null) {
                gq gqVar = gqVarArr[i5];
                g.m(gqVar.length() == 1);
                g.m(gqVar.e(0) == 0);
                int b2 = f0Var.b(gqVar.j());
                g.m(!zArr3[b2]);
                this.L++;
                zArr3[b2] = true;
                b0VarArr[i5] = new e(b2);
                zArr2[i5] = true;
                if (!z2) {
                    a0 a0Var = this.B[b2];
                    a0Var.D();
                    z2 = a0Var.e(j, true, true) == -1 && a0Var.o() != 0;
                }
            }
        }
        if (this.L == 0) {
            this.R = false;
            this.J = false;
            if (this.s.i()) {
                a0[] a0VarArr = this.B;
                int length = a0VarArr.length;
                while (i2 < length) {
                    a0VarArr[i2].j();
                    i2++;
                }
                this.s.e();
            } else {
                for (a0 a0Var2 : this.B) {
                    a0Var2.C(false);
                }
            }
        } else if (z2) {
            j = k(j);
            while (i2 < b0VarArr.length) {
                if (b0VarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.I = true;
        return j;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.exoplayer2.upstream.Loader$e, long, long, boolean] */
    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public void g(a aVar, long j, long j2, boolean z2) {
        a aVar2 = aVar;
        this.n.d(aVar2.j, aVar2.b.e(), aVar2.b.f(), 1, -1, null, 0, null, aVar2.i, this.M, j, j2, aVar2.b.d());
        if (!z2) {
            E(aVar2);
            for (a0 a0Var : this.B) {
                a0Var.C(false);
            }
            if (this.L > 0) {
                s.a aVar3 = this.y;
                aVar3.getClass();
                aVar3.i(this);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.s
    public /* synthetic */ List h(List list) {
        return r.a(this, list);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.exoplayer2.upstream.Loader$e, long, long] */
    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public void i(a aVar, long j, long j2) {
        xj xjVar;
        a aVar2 = aVar;
        if (this.M == -9223372036854775807L && (xjVar = this.z) != null) {
            boolean h = xjVar.h();
            long G2 = G();
            long j3 = G2 == Long.MIN_VALUE ? 0 : G2 + 10000;
            this.M = j3;
            ((y) this.o).m(j3, h, this.O);
        }
        this.n.f(aVar2.j, aVar2.b.e(), aVar2.b.f(), 1, -1, null, 0, null, aVar2.i, this.M, j, j2, aVar2.b.d());
        E(aVar2);
        this.T = true;
        s.a aVar3 = this.y;
        aVar3.getClass();
        aVar3.i(this);
    }

    @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.source.c0
    public boolean isLoading() {
        return this.s.i() && this.u.c();
    }

    @Override // defpackage.rj
    public void j(xj xjVar) {
        if (this.A != null) {
            xjVar = new xj.b(-9223372036854775807L, 0);
        }
        this.z = xjVar;
        this.x.post(this.v);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        r4 = false;
     */
    @Override // com.google.android.exoplayer2.source.s
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long k(long r8) {
        /*
            r7 = this;
            com.google.android.exoplayer2.source.x$d r0 = r7.F
            r0.getClass()
            xj r1 = r0.a
            boolean[] r0 = r0.c
            boolean r1 = r1.h()
            if (r1 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r8 = 0
        L_0x0012:
            r1 = 0
            r7.J = r1
            r7.P = r8
            boolean r2 = r7.I()
            if (r2 == 0) goto L_0x0020
            r7.Q = r8
            return r8
        L_0x0020:
            int r2 = r7.H
            r3 = 7
            if (r2 == r3) goto L_0x004e
            com.google.android.exoplayer2.source.a0[] r2 = r7.B
            int r2 = r2.length
            r3 = 0
        L_0x0029:
            r4 = 1
            if (r3 >= r2) goto L_0x004b
            com.google.android.exoplayer2.source.a0[] r5 = r7.B
            r5 = r5[r3]
            r5.D()
            int r5 = r5.e(r8, r4, r1)
            r6 = -1
            if (r5 == r6) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r4 = 0
        L_0x003c:
            if (r4 != 0) goto L_0x0048
            boolean r4 = r0[r3]
            if (r4 != 0) goto L_0x0046
            boolean r4 = r7.G
            if (r4 != 0) goto L_0x0048
        L_0x0046:
            r4 = 0
            goto L_0x004b
        L_0x0048:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x004b:
            if (r4 == 0) goto L_0x004e
            return r8
        L_0x004e:
            r7.R = r1
            r7.Q = r8
            r7.T = r1
            com.google.android.exoplayer2.upstream.Loader r0 = r7.s
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x0062
            com.google.android.exoplayer2.upstream.Loader r0 = r7.s
            r0.e()
            goto L_0x0075
        L_0x0062:
            com.google.android.exoplayer2.upstream.Loader r0 = r7.s
            r0.f()
            com.google.android.exoplayer2.source.a0[] r0 = r7.B
            int r2 = r0.length
            r3 = 0
        L_0x006b:
            if (r3 >= r2) goto L_0x0075
            r4 = r0[r3]
            r4.C(r1)
            int r3 = r3 + 1
            goto L_0x006b
        L_0x0075:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.x.k(long):long");
    }

    @Override // com.google.android.exoplayer2.source.s
    public long l(long j, t0 t0Var) {
        d dVar = this.F;
        dVar.getClass();
        xj xjVar = dVar.a;
        if (!xjVar.h()) {
            return 0;
        }
        xj.a e2 = xjVar.e(j);
        return f0.J(j, t0Var, e2.a.a, e2.b.a);
    }

    @Override // com.google.android.exoplayer2.source.s
    public long m() {
        if (!this.K) {
            this.n.o();
            this.K = true;
        }
        if (!this.J) {
            return -9223372036854775807L;
        }
        if (!this.T && F() <= this.S) {
            return -9223372036854775807L;
        }
        this.J = false;
        return this.P;
    }

    @Override // com.google.android.exoplayer2.source.s
    public void n(s.a aVar, long j) {
        this.y = aVar;
        this.u.d();
        T();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.exoplayer2.upstream.Loader$e, long, long, java.io.IOException, int] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.upstream.Loader.c o(com.google.android.exoplayer2.source.x.a r29, long r30, long r32, java.io.IOException r34, int r35) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            com.google.android.exoplayer2.source.x$a r1 = (com.google.android.exoplayer2.source.x.a) r1
            r0.E(r1)
            com.google.android.exoplayer2.upstream.v r2 = r0.f
            int r4 = r0.H
            r3 = r2
            com.google.android.exoplayer2.upstream.t r3 = (com.google.android.exoplayer2.upstream.t) r3
            r5 = r32
            r7 = r34
            r8 = r35
            long r2 = r3.c(r4, r5, r7, r8)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x0027
            com.google.android.exoplayer2.upstream.Loader$c r2 = com.google.android.exoplayer2.upstream.Loader.e
            goto L_0x007d
        L_0x0027:
            int r7 = r28.F()
            int r8 = r0.S
            r9 = 0
            if (r7 <= r8) goto L_0x0032
            r8 = 1
            goto L_0x0033
        L_0x0032:
            r8 = 0
        L_0x0033:
            long r10 = r0.N
            r12 = -1
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0071
            xj r10 = r0.z
            if (r10 == 0) goto L_0x0048
            long r10 = r10.j()
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x0048
            goto L_0x0071
        L_0x0048:
            boolean r4 = r0.E
            if (r4 == 0) goto L_0x0055
            boolean r4 = r28.U()
            if (r4 != 0) goto L_0x0055
            r0.R = r6
            goto L_0x0074
        L_0x0055:
            boolean r4 = r0.E
            r0.J = r4
            r4 = 0
            r0.P = r4
            r0.S = r9
            com.google.android.exoplayer2.source.a0[] r7 = r0.B
            int r10 = r7.length
            r11 = 0
        L_0x0063:
            if (r11 >= r10) goto L_0x006d
            r12 = r7[r11]
            r12.C(r9)
            int r11 = r11 + 1
            goto L_0x0063
        L_0x006d:
            com.google.android.exoplayer2.source.x.a.g(r1, r4, r4)
            goto L_0x0073
        L_0x0071:
            r0.S = r7
        L_0x0073:
            r9 = 1
        L_0x0074:
            if (r9 == 0) goto L_0x007b
            com.google.android.exoplayer2.upstream.Loader$c r2 = com.google.android.exoplayer2.upstream.Loader.g(r8, r2)
            goto L_0x007d
        L_0x007b:
            com.google.android.exoplayer2.upstream.Loader$c r2 = com.google.android.exoplayer2.upstream.Loader.d
        L_0x007d:
            com.google.android.exoplayer2.source.v$a r7 = r0.n
            com.google.android.exoplayer2.upstream.m r8 = com.google.android.exoplayer2.source.x.a.c(r1)
            com.google.android.exoplayer2.upstream.y r3 = com.google.android.exoplayer2.source.x.a.d(r1)
            android.net.Uri r9 = r3.e()
            com.google.android.exoplayer2.upstream.y r3 = com.google.android.exoplayer2.source.x.a.d(r1)
            java.util.Map r10 = r3.f()
            r11 = 1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            long r16 = com.google.android.exoplayer2.source.x.a.e(r1)
            long r3 = r0.M
            r18 = r3
            com.google.android.exoplayer2.upstream.y r1 = com.google.android.exoplayer2.source.x.a.d(r1)
            long r24 = r1.d()
            boolean r1 = r2.c()
            r27 = r1 ^ 1
            r20 = r30
            r22 = r32
            r26 = r34
            r7.h(r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r22, r24, r26, r27)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.x.o(com.google.android.exoplayer2.upstream.Loader$e, long, long, java.io.IOException, int):com.google.android.exoplayer2.upstream.Loader$c");
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.f
    public void p() {
        for (a0 a0Var : this.B) {
            a0Var.B();
        }
        this.t.a();
    }

    @Override // defpackage.rj
    public void q() {
        this.D = true;
        this.x.post(this.v);
    }

    @Override // com.google.android.exoplayer2.source.s
    public void r() {
        this.s.k(((t) this.f).b(this.H));
        if (this.T && !this.E) {
            throw new ParserException("Loading finished before preparation is complete.");
        }
    }

    @Override // defpackage.rj
    public zj s(int i, int i2) {
        return P(new f(i, false));
    }

    @Override // com.google.android.exoplayer2.source.s
    public f0 t() {
        d dVar = this.F;
        dVar.getClass();
        return dVar.b;
    }

    @Override // com.google.android.exoplayer2.source.s
    public void u(long j, boolean z2) {
        if (!I()) {
            d dVar = this.F;
            dVar.getClass();
            boolean[] zArr = dVar.d;
            int length = this.B.length;
            for (int i = 0; i < length; i++) {
                this.B[i].i(j, z2, zArr[i]);
            }
        }
    }
}
