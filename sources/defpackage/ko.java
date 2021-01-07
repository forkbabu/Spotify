package defpackage;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.source.a0;
import com.google.android.exoplayer2.source.b0;
import com.google.android.exoplayer2.source.c0;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.n;
import com.google.android.exoplayer2.upstream.t;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import com.spotify.mobile.android.video.exo.d;
import defpackage.lo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ko  reason: default package */
public class ko<T extends lo> implements b0, c0, Loader.b<ho>, Loader.f {
    private int A;
    long B;
    boolean C;
    public final int a;
    private final boolean[] b;
    private final T c;
    private final c0.a<ko<T>> f;
    private final v.a n;
    private final com.google.android.exoplayer2.upstream.v o;
    private final Loader p = new Loader("Loader:ChunkSampleStream");
    private final jo q = new jo();
    private final ArrayList<eo> r;
    private final List<eo> s;
    private final a0 t;
    private final a0[] u;
    private final go v;
    private d0 w;
    private a<T> x;
    private long y;
    private long z;

    /* renamed from: ko$a */
    public interface a<T extends lo> {
        void a(ko<T> koVar);
    }

    public ko(int i, int[] iArr, d0[] d0VarArr, T t2, c0.a<ko<T>> aVar, n nVar, long j, com.google.android.exoplayer2.drm.n<?> nVar2, com.google.android.exoplayer2.upstream.v vVar, v.a aVar2) {
        this.a = i;
        this.c = t2;
        this.f = aVar;
        this.n = aVar2;
        this.o = vVar;
        ArrayList<eo> arrayList = new ArrayList<>();
        this.r = arrayList;
        this.s = Collections.unmodifiableList(arrayList);
        this.u = new a0[0];
        this.b = new boolean[0];
        a0 a0Var = new a0(nVar, nVar2);
        this.t = a0Var;
        this.v = new go(new int[]{i}, new a0[]{a0Var});
        this.y = j;
        this.z = j;
    }

    private int A(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.r.size()) {
                return this.r.size() - 1;
            }
        } while (this.r.get(i2).h(0) <= i);
        return i2 - 1;
    }

    private eo v(int i) {
        eo eoVar = this.r.get(i);
        ArrayList<eo> arrayList = this.r;
        f0.I(arrayList, i, arrayList.size());
        this.A = Math.max(this.A, this.r.size());
        int i2 = 0;
        this.t.k(eoVar.h(0));
        while (true) {
            a0[] a0VarArr = this.u;
            if (i2 >= a0VarArr.length) {
                return eoVar;
            }
            a0 a0Var = a0VarArr[i2];
            i2++;
            a0Var.k(eoVar.h(i2));
        }
    }

    private eo w() {
        ArrayList<eo> arrayList = this.r;
        return arrayList.get(arrayList.size() - 1);
    }

    private boolean x(int i) {
        int o2;
        eo eoVar = this.r.get(i);
        if (this.t.o() > eoVar.h(0)) {
            return true;
        }
        int i2 = 0;
        do {
            a0[] a0VarArr = this.u;
            if (i2 >= a0VarArr.length) {
                return false;
            }
            o2 = a0VarArr[i2].o();
            i2++;
        } while (o2 <= eoVar.h(i2));
        return true;
    }

    private void z() {
        int A2 = A(this.t.o(), this.A - 1);
        while (true) {
            int i = this.A;
            if (i <= A2) {
                this.A = i + 1;
                eo eoVar = this.r.get(i);
                d0 d0Var = eoVar.c;
                if (!d0Var.equals(this.w)) {
                    this.n.c(this.a, d0Var, eoVar.d, eoVar.e, eoVar.f);
                }
                this.w = d0Var;
            } else {
                return;
            }
        }
    }

    public void B() {
        this.x = null;
        this.t.x();
        for (a0 a0Var : this.u) {
            a0Var.x();
        }
        this.p.l(this);
    }

    public void C(long j) {
        boolean z2;
        this.z = j;
        if (y()) {
            this.y = j;
            return;
        }
        eo eoVar = null;
        int i = 0;
        while (true) {
            if (i >= this.r.size()) {
                break;
            }
            eo eoVar2 = this.r.get(i);
            long j2 = eoVar2.f;
            if (j2 == j && eoVar2.j == -9223372036854775807L) {
                eoVar = eoVar2;
                break;
            } else if (j2 > j) {
                break;
            } else {
                i++;
            }
        }
        this.t.D();
        if (eoVar != null) {
            z2 = this.t.E(eoVar.h(0));
            this.B = 0;
        } else {
            z2 = this.t.e(j, true, (j > a() ? 1 : (j == a() ? 0 : -1)) < 0) != -1;
            this.B = this.z;
        }
        if (z2) {
            this.A = A(this.t.o(), 0);
            a0[] a0VarArr = this.u;
            for (a0 a0Var : a0VarArr) {
                a0Var.D();
                a0Var.e(j, true, false);
            }
            return;
        }
        this.y = j;
        this.C = false;
        this.r.clear();
        this.A = 0;
        if (this.p.i()) {
            this.p.e();
            return;
        }
        this.p.f();
        this.t.C(false);
        for (a0 a0Var2 : this.u) {
            a0Var2.C(false);
        }
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long a() {
        if (y()) {
            return this.y;
        }
        if (this.C) {
            return Long.MIN_VALUE;
        }
        return w().g;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public boolean b(long j) {
        long j2;
        List<eo> list;
        boolean z2 = false;
        if (this.C || this.p.i() || this.p.h()) {
            return false;
        }
        boolean y2 = y();
        if (y2) {
            list = Collections.emptyList();
            j2 = this.y;
        } else {
            list = this.s;
            j2 = w().g;
        }
        ((d) this.c).b(j, j2, list, this.q);
        jo joVar = this.q;
        boolean z3 = joVar.b;
        ho hoVar = joVar.a;
        joVar.a = null;
        joVar.b = false;
        if (z3) {
            this.y = -9223372036854775807L;
            this.C = true;
            return true;
        } else if (hoVar == null) {
            return false;
        } else {
            if (hoVar instanceof eo) {
                eo eoVar = (eo) hoVar;
                if (y2) {
                    long j3 = eoVar.f;
                    long j4 = this.y;
                    if (j3 == j4) {
                        z2 = true;
                    }
                    if (z2) {
                        j4 = 0;
                    }
                    this.B = j4;
                    this.y = -9223372036854775807L;
                }
                eoVar.j(this.v);
                this.r.add(eoVar);
            }
            this.n.j(hoVar.a, hoVar.b, this.a, hoVar.c, hoVar.d, hoVar.e, hoVar.f, hoVar.g, this.p.m(hoVar, this, ((t) this.o).b(hoVar.b)));
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long c() {
        if (this.C) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.y;
        }
        long j = this.z;
        eo w2 = w();
        if (!w2.g()) {
            if (this.r.size() > 1) {
                ArrayList<eo> arrayList = this.r;
                w2 = arrayList.get(arrayList.size() - 2);
            } else {
                w2 = null;
            }
        }
        if (w2 != null) {
            j = Math.max(j, w2.g);
        }
        return Math.max(j, this.t.n());
    }

    @Override // com.google.android.exoplayer2.source.b0
    public boolean d() {
        return !y() && this.t.s(this.C);
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void e(long j) {
        int size;
        int c2;
        if (!this.p.i() && !this.p.h() && !y() && (size = this.r.size()) > (c2 = ((d) this.c).c(j, this.s))) {
            while (true) {
                if (c2 >= size) {
                    c2 = size;
                    break;
                } else if (!x(c2)) {
                    break;
                } else {
                    c2++;
                }
            }
            if (c2 != size) {
                long j2 = w().g;
                eo v2 = v(c2);
                if (this.r.isEmpty()) {
                    this.y = this.z;
                }
                this.C = false;
                this.n.q(this.a, v2.f, j2);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.exoplayer2.upstream.Loader$e, long, long, boolean] */
    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public void g(ho hoVar, long j, long j2, boolean z2) {
        ho hoVar2 = hoVar;
        this.n.d(hoVar2.a, hoVar2.e(), hoVar2.d(), hoVar2.b, this.a, hoVar2.c, hoVar2.d, hoVar2.e, hoVar2.f, hoVar2.g, j, j2, hoVar2.c());
        if (!z2) {
            this.t.C(false);
            for (a0 a0Var : this.u) {
                a0Var.C(false);
            }
            this.f.i(this);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.exoplayer2.upstream.Loader$e, long, long] */
    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public void i(ho hoVar, long j, long j2) {
        ho hoVar2 = hoVar;
        ((d) this.c).f(hoVar2);
        this.n.f(hoVar2.a, hoVar2.e(), hoVar2.d(), hoVar2.b, this.a, hoVar2.c, hoVar2.d, hoVar2.e, hoVar2.f, hoVar2.g, j, j2, hoVar2.c());
        this.f.i(this);
    }

    @Override // com.google.android.exoplayer2.source.c0
    public boolean isLoading() {
        return this.p.i();
    }

    @Override // com.google.android.exoplayer2.source.b0
    public void j() {
        this.p.j();
        this.t.t();
        if (!this.p.i()) {
            ((d) this.c).e();
        }
    }

    public long l(long j, t0 t0Var) {
        return ((d) this.c).a(j, t0Var);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.exoplayer2.upstream.Loader$e, long, long, java.io.IOException, int] */
    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public Loader.c o(ho hoVar, long j, long j2, IOException iOException, int i) {
        ho hoVar2 = hoVar;
        long c2 = hoVar2.c();
        boolean z2 = hoVar2 instanceof eo;
        int size = this.r.size() - 1;
        boolean z3 = c2 == 0 || !z2 || !x(size);
        Loader.c cVar = null;
        if (((d) this.c).g(hoVar2, z3, iOException, z3 ? ((t) this.o).a(hoVar2.b, j2, iOException, i) : -9223372036854775807L) && z3) {
            cVar = Loader.d;
            if (z2) {
                g.m(v(size) == hoVar2);
                if (this.r.isEmpty()) {
                    this.y = this.z;
                }
            }
        }
        if (cVar == null) {
            long c3 = ((t) this.o).c(hoVar2.b, j2, iOException, i);
            cVar = c3 != -9223372036854775807L ? Loader.g(false, c3) : Loader.e;
        }
        boolean z4 = !cVar.c();
        this.n.h(hoVar2.a, hoVar2.e(), hoVar2.d(), hoVar2.b, this.a, hoVar2.c, hoVar2.d, hoVar2.e, hoVar2.f, hoVar2.g, j, j2, c2, iOException, z4);
        if (z4) {
            this.f.i(this);
        }
        return cVar;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.f
    public void p() {
        this.t.B();
        for (a0 a0Var : this.u) {
            a0Var.B();
        }
        a<T> aVar = this.x;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    @Override // com.google.android.exoplayer2.source.b0
    public int q(e0 e0Var, fj fjVar, boolean z2) {
        if (y()) {
            return -3;
        }
        z();
        return this.t.y(e0Var, fjVar, z2, this.C, this.B);
    }

    @Override // com.google.android.exoplayer2.source.b0
    public int s(long j) {
        int i = 0;
        if (y()) {
            return 0;
        }
        if (!this.C || j <= this.t.n()) {
            int e = this.t.e(j, true, true);
            if (e != -1) {
                i = e;
            }
        } else {
            i = this.t.f();
        }
        z();
        return i;
    }

    public void u(long j, boolean z2) {
        if (!y()) {
            int l = this.t.l();
            this.t.i(j, z2, true);
            int l2 = this.t.l();
            if (l2 > l) {
                long m = this.t.m();
                int i = 0;
                while (true) {
                    a0[] a0VarArr = this.u;
                    if (i >= a0VarArr.length) {
                        break;
                    }
                    a0VarArr[i].i(m, z2, this.b[i]);
                    i++;
                }
            }
            int min = Math.min(A(l2, 0), this.A);
            if (min > 0) {
                f0.I(this.r, 0, min);
                this.A -= min;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean y() {
        return this.y != -9223372036854775807L;
    }
}
