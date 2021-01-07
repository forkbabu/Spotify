package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* access modifiers changed from: package-private */
public class b0 implements a.AbstractC0044a {
    final /* synthetic */ RecyclerView a;

    b0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    /* access modifiers changed from: package-private */
    public void a(a.b bVar) {
        int i = bVar.a;
        if (i == 1) {
            RecyclerView recyclerView = this.a;
            recyclerView.v.W0(recyclerView, bVar.b, bVar.d);
        } else if (i == 2) {
            RecyclerView recyclerView2 = this.a;
            recyclerView2.v.Z0(recyclerView2, bVar.b, bVar.d);
        } else if (i == 4) {
            RecyclerView recyclerView3 = this.a;
            recyclerView3.v.b1(recyclerView3, bVar.b, bVar.d, bVar.c);
        } else if (i == 8) {
            RecyclerView recyclerView4 = this.a;
            recyclerView4.v.Y0(recyclerView4, bVar.b, bVar.d, 1);
        }
    }

    public RecyclerView.b0 b(int i) {
        RecyclerView.b0 T = this.a.T(i, true);
        if (T != null && !this.a.n.l(T.a)) {
            return T;
        }
        return null;
    }

    public void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int h = recyclerView.n.h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < h; i6++) {
            View g = recyclerView.n.g(i6);
            RecyclerView.b0 b0 = RecyclerView.b0(g);
            if (b0 != null && !b0.f0() && (i4 = b0.c) >= i && i4 < i5) {
                b0.t(2);
                b0.q(obj);
                ((RecyclerView.LayoutParams) g.getLayoutParams()).c = true;
            }
        }
        RecyclerView.s sVar = recyclerView.b;
        int size = sVar.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                RecyclerView.b0 b0Var = sVar.c.get(size);
                if (b0Var != null && (i3 = b0Var.c) >= i && i3 < i5) {
                    b0Var.t(2);
                    sVar.j(size);
                }
            } else {
                this.a.u0 = true;
                return;
            }
        }
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int h = recyclerView.n.h();
        for (int i3 = 0; i3 < h; i3++) {
            RecyclerView.b0 b0 = RecyclerView.b0(recyclerView.n.g(i3));
            if (b0 != null && !b0.f0() && b0.c >= i) {
                b0.W(i2, false);
                recyclerView.q0.f = true;
            }
        }
        RecyclerView.s sVar = recyclerView.b;
        int size = sVar.c.size();
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.b0 b0Var = sVar.c.get(i4);
            if (b0Var != null && b0Var.c >= i) {
                b0Var.W(i2, true);
            }
        }
        recyclerView.requestLayout();
        this.a.t0 = true;
    }

    public void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.a;
        int h = recyclerView.n.h();
        int i10 = -1;
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i11 = 0; i11 < h; i11++) {
            RecyclerView.b0 b0 = RecyclerView.b0(recyclerView.n.g(i11));
            if (b0 != null && (i9 = b0.c) >= i5 && i9 <= i4) {
                if (i9 == i) {
                    b0.W(i2 - i, false);
                } else {
                    b0.W(i3, false);
                }
                recyclerView.q0.f = true;
            }
        }
        RecyclerView.s sVar = recyclerView.b;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = sVar.c.size();
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.b0 b0Var = sVar.c.get(i12);
            if (b0Var != null && (i8 = b0Var.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    b0Var.W(i2 - i, false);
                } else {
                    b0Var.W(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.a.t0 = true;
    }
}
