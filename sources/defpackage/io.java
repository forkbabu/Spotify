package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.v;
import defpackage.zj;

/* renamed from: io  reason: default package */
public final class io implements rj {
    public final qj a;
    private final int b;
    private final d0 c;
    private final SparseArray<a> f = new SparseArray<>();
    private boolean n;
    private b o;
    private long p;
    private xj q;
    private d0[] r;

    /* renamed from: io$a */
    private static final class a implements zj {
        private final int a;
        private final int b;
        private final d0 c;
        private final pj d = new pj();
        public d0 e;
        private zj f;
        private long g;

        public a(int i, int i2, d0 d0Var) {
            this.a = i;
            this.b = i2;
            this.c = d0Var;
        }

        @Override // defpackage.zj
        public int a(nj njVar, int i, boolean z) {
            return this.f.a(njVar, i, z);
        }

        @Override // defpackage.zj
        public void b(v vVar, int i) {
            this.f.b(vVar, i);
        }

        @Override // defpackage.zj
        public void c(d0 d0Var) {
            d0 d0Var2 = this.c;
            if (d0Var2 != null) {
                d0Var = d0Var.h(d0Var2);
            }
            this.e = d0Var;
            this.f.c(d0Var);
        }

        @Override // defpackage.zj
        public void d(long j, int i, int i2, int i3, zj.a aVar) {
            long j2 = this.g;
            if (j2 != -9223372036854775807L && j >= j2) {
                this.f = this.d;
            }
            this.f.d(j, i, i2, i3, aVar);
        }

        public void e(b bVar, long j) {
            if (bVar == null) {
                this.f = this.d;
                return;
            }
            this.g = j;
            zj c2 = ((go) bVar).c(this.a, this.b);
            this.f = c2;
            d0 d0Var = this.e;
            if (d0Var != null) {
                c2.c(d0Var);
            }
        }
    }

    /* renamed from: io$b */
    public interface b {
    }

    public io(qj qjVar, int i, d0 d0Var) {
        this.a = qjVar;
        this.b = i;
        this.c = d0Var;
    }

    public d0[] a() {
        return this.r;
    }

    public void b(b bVar, long j, long j2) {
        this.o = bVar;
        this.p = j2;
        if (!this.n) {
            this.a.b(this);
            if (j != -9223372036854775807L) {
                this.a.c(0, j);
            }
            this.n = true;
            return;
        }
        qj qjVar = this.a;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        qjVar.c(0, j);
        for (int i = 0; i < this.f.size(); i++) {
            this.f.valueAt(i).e(bVar, j2);
        }
    }

    @Override // defpackage.rj
    public void j(xj xjVar) {
        this.q = xjVar;
    }

    @Override // defpackage.rj
    public void q() {
        d0[] d0VarArr = new d0[this.f.size()];
        for (int i = 0; i < this.f.size(); i++) {
            d0VarArr[i] = this.f.valueAt(i).e;
        }
        this.r = d0VarArr;
    }

    @Override // defpackage.rj
    public zj s(int i, int i2) {
        a aVar = this.f.get(i);
        if (aVar == null) {
            g.m(this.r == null);
            aVar = new a(i, i2, i2 == this.b ? this.c : null);
            aVar.e(this.o, this.p);
            this.f.put(i, aVar);
        }
        return aVar;
    }
}
