package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g0;

public abstract class h0<T2> extends g0.b<T2> {
    final RecyclerView.e a;

    public h0(RecyclerView.e eVar) {
        this.a = eVar;
    }

    @Override // androidx.recyclerview.widget.w
    public void a(int i, int i2) {
        this.a.G(i, i2);
    }

    @Override // androidx.recyclerview.widget.w
    public void b(int i, int i2) {
        this.a.H(i, i2);
    }

    @Override // androidx.recyclerview.widget.g0.b, androidx.recyclerview.widget.w
    public void c(int i, int i2, Object obj) {
        this.a.F(i, i2, obj);
    }

    @Override // androidx.recyclerview.widget.w
    public void d(int i, int i2) {
        this.a.D(i, i2);
    }
}
