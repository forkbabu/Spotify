package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class e0 extends RecyclerView.j {
    boolean g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public boolean a(RecyclerView.b0 b0Var, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        int i;
        int i2;
        if (cVar == null || ((i = cVar.a) == (i2 = cVar2.a) && cVar.b == cVar2.b)) {
            return v(b0Var);
        }
        return x(b0Var, i, cVar.b, i2, cVar2.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public boolean b(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        int i;
        int i2;
        int i3 = cVar.a;
        int i4 = cVar.b;
        if (b0Var2.f0()) {
            int i5 = cVar.a;
            i = cVar.b;
            i2 = i5;
        } else {
            i2 = cVar2.a;
            i = cVar2.b;
        }
        return w(b0Var, b0Var2, i3, i4, i2, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public boolean c(RecyclerView.b0 b0Var, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        int i = cVar.a;
        int i2 = cVar.b;
        View view = b0Var.a;
        int left = cVar2 == null ? view.getLeft() : cVar2.a;
        int top = cVar2 == null ? view.getTop() : cVar2.b;
        if (b0Var.P() || (i == left && i2 == top)) {
            return y(b0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return x(b0Var, i, i2, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public boolean d(RecyclerView.b0 b0Var, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        int i = cVar.a;
        int i2 = cVar2.a;
        if (i != i2 || cVar.b != cVar2.b) {
            return x(b0Var, i, cVar.b, i2, cVar2.b);
        }
        h(b0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public boolean f(RecyclerView.b0 b0Var) {
        return !this.g || b0Var.J();
    }

    public abstract boolean v(RecyclerView.b0 b0Var);

    public abstract boolean w(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, int i, int i2, int i3, int i4);

    public abstract boolean x(RecyclerView.b0 b0Var, int i, int i2, int i3, int i4);

    public abstract boolean y(RecyclerView.b0 b0Var);

    public void z(boolean z) {
        this.g = z;
    }
}
