package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

public final class b implements w {
    private final RecyclerView.e a;

    public b(RecyclerView.e eVar) {
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

    @Override // androidx.recyclerview.widget.w
    public void c(int i, int i2, Object obj) {
        this.a.F(i, i2, obj);
    }

    @Override // androidx.recyclerview.widget.w
    public void d(int i, int i2) {
        this.a.D(i, i2);
    }
}
