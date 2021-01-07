package com.spotify.libs.onboarding.allboarding;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.Assertion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class d extends RecyclerView.e<RecyclerView.b0> {
    private final List<b<?>> c = new ArrayList();
    private int f;
    private final boolean n;
    private final SparseArray<c> o = new SparseArray<>();
    private int p = 1;

    /* access modifiers changed from: private */
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
            d.X(d.this);
            d.this.z();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void b(int i, int i2) {
            d.this.E(this.c + i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void c(int i, int i2, Object obj) {
            d.this.F(this.c + i, i2, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void d(int i, int i2) {
            d.this.G(this.c + i, i2);
            d.Y(d.this, this.b + 1, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void e(int i, int i2, int i3) {
            if (i3 == 1) {
                d dVar = d.this;
                int i4 = this.c;
                dVar.D(i + i4, i4 + i2);
                return;
            }
            throw new IllegalArgumentException("only supports moving one item at the time");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void f(int i, int i2) {
            d.this.H(this.c + i, i2);
            d.Y(d.this, this.b + 1, -i2);
        }
    }

    private static class c {
        final int a;
        final int b;

        c(int i, int i2, a aVar) {
            this.a = i;
            this.b = i2;
        }
    }

    public d(boolean z) {
        this.n = z;
    }

    static void X(d dVar) {
        int i = 0;
        for (b<?> bVar : dVar.c) {
            if (bVar.e) {
                bVar.c = i;
                i += bVar.a.u();
            }
        }
        dVar.f = i;
    }

    static void Y(d dVar, int i, int i2) {
        while (i < dVar.c.size()) {
            if (dVar.c.get(i).e) {
                dVar.c.get(i).c += i2;
            }
            i++;
        }
        dVar.f += i2;
    }

    private b<?> b0(int i) {
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

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void J(RecyclerView recyclerView) {
        for (b<?> bVar : this.c) {
            bVar.a.J(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        b<?> b0 = b0(i);
        b0.a.K(b0Var, i - b0.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void L(RecyclerView.b0 b0Var, int i, List<Object> list) {
        b<?> b0 = b0(i);
        b0.a.L(b0Var, i - b0.c, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        c cVar = this.o.get(i);
        return this.c.get(cVar.a).a.s(viewGroup, cVar.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void N(RecyclerView recyclerView) {
        for (b<?> bVar : this.c) {
            bVar.a.N(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void P(RecyclerView.b0 b0Var) {
        this.c.get(this.o.get(b0Var.z()).a).a.P(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void Q(RecyclerView.b0 b0Var) {
        this.c.get(this.o.get(b0Var.z()).a).a.Q(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void R(RecyclerView.b0 b0Var) {
        this.c.get(this.o.get(b0Var.z()).a).a.R(b0Var);
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

    public ImmutableList<RecyclerView.e<?>> c0() {
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (b<?> bVar : this.c) {
            builder.mo53add((ImmutableList.Builder) bVar.a);
        }
        return builder.build();
    }

    public int f0(int i) {
        Assertion.j("Its not allowed to do actions using the SECTION_ID_NONE id", i != Integer.MIN_VALUE);
        for (b<?> bVar : this.c) {
            if (bVar.d == i) {
                return bVar.c;
            }
        }
        return -1;
    }

    public boolean g0(int... iArr) {
        b<?> bVar;
        if (iArr.length == 0 || this.c.isEmpty()) {
            return false;
        }
        for (int i : iArr) {
            Iterator<b<?>> it = this.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                }
                bVar = it.next();
                if (bVar.d == i) {
                    break;
                }
            }
            if (bVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        b<?> b0 = b0(i);
        return b0.a.v(i - b0.c) ^ ((long) b0.hashCode());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        b<?> b0 = b0(i);
        int w = b0.a.w(i - b0.c);
        if (this.n) {
            this.o.put(w, new c(b0.b, w, null));
            return w;
        }
        int i2 = b0.f.get(w, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.p;
        this.p = i3 + 1;
        b0.f.put(w, i3);
        this.o.put(i3, new c(b0.b, w, null));
        return i3;
    }
}
