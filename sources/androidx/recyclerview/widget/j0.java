package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* access modifiers changed from: package-private */
public class j0 {
    final t1<RecyclerView.b0, a> a = new t1<>();
    final q1<RecyclerView.b0> b = new q1<>(10);

    /* access modifiers changed from: package-private */
    public static class a {
        static w3<a> d = new w3<>(20);
        int a;
        RecyclerView.j.c b;
        RecyclerView.j.c c;

        private a() {
        }

        static a a() {
            a a2 = d.a();
            return a2 == null ? new a() : a2;
        }

        static void b(a aVar) {
            aVar.a = 0;
            aVar.b = null;
            aVar.c = null;
            d.b(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public interface b {
    }

    j0() {
    }

    private RecyclerView.j.c e(RecyclerView.b0 b0Var, int i) {
        a m;
        RecyclerView.j.c cVar;
        int f = this.a.f(b0Var);
        if (f >= 0 && (m = this.a.m(f)) != null) {
            int i2 = m.a;
            if ((i2 & i) != 0) {
                int i3 = (i ^ -1) & i2;
                m.a = i3;
                if (i == 4) {
                    cVar = m.b;
                } else if (i == 8) {
                    cVar = m.c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.a.k(f);
                    a.b(m);
                }
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.b0 b0Var) {
        a orDefault = this.a.getOrDefault(b0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.a.put(b0Var, orDefault);
        }
        orDefault.a |= 1;
    }

    /* access modifiers changed from: package-private */
    public void b(RecyclerView.b0 b0Var, RecyclerView.j.c cVar) {
        a orDefault = this.a.getOrDefault(b0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.a.put(b0Var, orDefault);
        }
        orDefault.c = cVar;
        orDefault.a |= 8;
    }

    /* access modifiers changed from: package-private */
    public void c(RecyclerView.b0 b0Var, RecyclerView.j.c cVar) {
        a orDefault = this.a.getOrDefault(b0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.a.put(b0Var, orDefault);
        }
        orDefault.b = cVar;
        orDefault.a |= 4;
    }

    /* access modifiers changed from: package-private */
    public boolean d(RecyclerView.b0 b0Var) {
        a orDefault = this.a.getOrDefault(b0Var, null);
        if (orDefault == null || (orDefault.a & 1) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.j.c f(RecyclerView.b0 b0Var) {
        return e(b0Var, 8);
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.j.c g(RecyclerView.b0 b0Var) {
        return e(b0Var, 4);
    }

    /* access modifiers changed from: package-private */
    public void h(RecyclerView.b0 b0Var) {
        a orDefault = this.a.getOrDefault(b0Var, null);
        if (orDefault != null) {
            orDefault.a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    public void i(RecyclerView.b0 b0Var) {
        int r = this.b.r() - 1;
        while (true) {
            if (r < 0) {
                break;
            } else if (b0Var == this.b.s(r)) {
                this.b.q(r);
                break;
            } else {
                r--;
            }
        }
        a remove = this.a.remove(b0Var);
        if (remove != null) {
            a.b(remove);
        }
    }
}
