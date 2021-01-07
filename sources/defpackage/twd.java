package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.util.Assertion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: twd  reason: default package */
public class twd extends RecyclerView.e<d> {
    private final List<b<?>> c;
    private int f;
    private final boolean n;
    private final SparseArray<c> o;
    private int p;

    /* access modifiers changed from: private */
    /* renamed from: twd$b */
    public class b<H extends RecyclerView.b0> extends RecyclerView.g {
        RecyclerView.e<H> a;
        int b;
        int c;
        int d;
        boolean e = true;
        SparseIntArray f = new SparseIntArray();

        b(RecyclerView.e eVar, a aVar) {
            this.a = eVar;
            eVar.T(this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void a() {
            twd.this.k0();
            twd.this.z();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void b(int i, int i2) {
            twd.this.E(this.c + i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void c(int i, int i2, Object obj) {
            twd.this.F(this.c + i, i2, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void d(int i, int i2) {
            twd.this.G(this.c + i, i2);
            twd.Y(twd.this, this.b + 1, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void e(int i, int i2, int i3) {
            if (i3 == 1) {
                twd twd = twd.this;
                int i4 = this.c;
                twd.D(i + i4, i4 + i2);
                return;
            }
            throw new IllegalArgumentException("only supports moving one item at the time");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void f(int i, int i2) {
            twd.this.H(this.c + i, i2);
            twd.Y(twd.this, this.b + 1, -i2);
        }
    }

    /* renamed from: twd$c */
    private static class c {
        final int a;
        final int b;

        c(int i, int i2, a aVar) {
            this.a = i;
            this.b = i2;
        }
    }

    /* renamed from: twd$d */
    public static class d extends RecyclerView.b0 {
        private final RecyclerView.b0 C;

        d(RecyclerView.b0 b0Var, a aVar) {
            super(b0Var.a);
            this.C = b0Var;
        }

        public RecyclerView.b0 h0() {
            return this.C;
        }
    }

    public twd() {
        this(false);
    }

    static void Y(twd twd, int i, int i2) {
        while (i < twd.c.size()) {
            if (twd.c.get(i).e) {
                twd.c.get(i).c += i2;
            }
            i++;
        }
        twd.f += i2;
    }

    private void b0(int i) {
        Assertion.j("Its not allowed to do actions using the SECTION_ID_NONE id", i != Integer.MIN_VALUE);
    }

    private b<?> c0(int i) {
        for (b<?> bVar : this.c) {
            if (bVar.d == i) {
                return bVar;
            }
        }
        return null;
    }

    private b<?> f0(int i) {
        int i2 = 0;
        b<?> bVar = this.c.get(0);
        while (true) {
            b<?> bVar2 = bVar;
            if (i < bVar2.a.u() + bVar2.c && bVar2.e) {
                return bVar2;
            }
            i2++;
            bVar = this.c.get(i2);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void k0() {
        int i = 0;
        for (b<?> bVar : this.c) {
            if (bVar.e) {
                bVar.c = i;
                i += bVar.a.u();
            }
        }
        this.f = i;
    }

    private void m0(boolean z, int... iArr) {
        boolean z2 = false;
        for (int i : iArr) {
            b0(i);
            b<?> c0 = c0(i);
            if (!(c0 == null || c0.e == z)) {
                c0.e = z;
                z2 = true;
            }
        }
        if (z2) {
            k0();
            z();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void J(RecyclerView recyclerView) {
        for (b<?> bVar : this.c) {
            bVar.a.J(recyclerView);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(d dVar, int i) {
        b<?> f0 = f0(i);
        f0.a.K(dVar.h0(), i - f0.c);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void L(d dVar, int i, List list) {
        b<?> f0 = f0(i);
        f0.a.L(dVar.h0(), i - f0.c, list);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public d M(ViewGroup viewGroup, int i) {
        c cVar = this.o.get(i);
        return new d(this.c.get(cVar.a).a.s(viewGroup, cVar.b), null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void N(RecyclerView recyclerView) {
        for (b<?> bVar : this.c) {
            bVar.a.N(recyclerView);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void P(d dVar) {
        d dVar2 = dVar;
        this.c.get(this.o.get(dVar2.z()).a).a.P(dVar2.h0());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void Q(d dVar) {
        d dVar2 = dVar;
        this.c.get(this.o.get(dVar2.z()).a).a.Q(dVar2.h0());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void R(d dVar) {
        d dVar2 = dVar;
        this.c.get(this.o.get(dVar2.z()).a).a.R(dVar2.h0());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void T(RecyclerView.g gVar) {
        boolean z;
        if (!x()) {
            Iterator<b<?>> it = this.c.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!it.next().a.y()) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            U(z);
        }
        super.T(gVar);
    }

    public <H extends RecyclerView.b0> void Z(RecyclerView.e<H> eVar, int i) {
        int size = this.c.size();
        b<?> bVar = new b<>(eVar, null);
        bVar.c = this.f;
        bVar.b = size;
        bVar.d = i;
        this.c.add(bVar);
        this.f = eVar.u() + this.f;
        if (eVar.u() > 0) {
            G(this.f, eVar.u());
        }
    }

    public int g0(int i) {
        b0(i);
        for (b<?> bVar : this.c) {
            if (bVar.d == i) {
                return bVar.c;
            }
        }
        return -1;
    }

    public void i0(int... iArr) {
        m0(false, iArr);
    }

    public boolean j0(int i) {
        b0(i);
        b<?> c0 = c0(i);
        return c0 != null && c0.e;
    }

    public void l0(int... iArr) {
        m0(true, iArr);
    }

    public boolean n0(int i) {
        b0(i);
        b<?> c0 = c0(i);
        boolean z = false;
        if (c0 == null) {
            return false;
        }
        boolean z2 = c0.e;
        if (c0.a.u() > 0) {
            z = true;
        }
        c0.e = z;
        if (z2 != z) {
            k0();
            z();
        }
        return c0.e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        b<?> f0 = f0(i);
        return f0.a.v(i - f0.c) ^ ((long) f0.hashCode());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        b<?> f0 = f0(i);
        int w = f0.a.w(i - f0.c);
        if (this.n) {
            this.o.put(w, new c(f0.b, w, null));
            return w;
        }
        int i2 = f0.f.get(w, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.p;
        this.p = i3 + 1;
        f0.f.put(w, i3);
        this.o.put(i3, new c(f0.b, w, null));
        return i3;
    }

    public twd(boolean z) {
        this.c = new ArrayList();
        this.o = new SparseArray<>();
        this.p = 1;
        this.n = z;
    }
}
