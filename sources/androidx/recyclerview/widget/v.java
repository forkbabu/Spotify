package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.b0;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.m;
import java.util.List;

public abstract class v<T, VH extends RecyclerView.b0> extends RecyclerView.e<VH> {
    final d<T> c;
    private final d.b<T> f;

    class a implements d.b<T> {
        a() {
        }

        @Override // androidx.recyclerview.widget.d.b
        public void a(List<T> list, List<T> list2) {
            v.this.Z(list, list2);
        }
    }

    protected v(m.d<T> dVar) {
        a aVar = new a();
        this.f = aVar;
        d<T> dVar2 = new d<>(new b(this), new c.a(dVar).a());
        this.c = dVar2;
        dVar2.a(aVar);
    }

    public List<T> X() {
        return this.c.b();
    }

    /* access modifiers changed from: protected */
    public T Y(int i) {
        return this.c.b().get(i);
    }

    public void Z(List<T> list, List<T> list2) {
    }

    public void b0(List<T> list) {
        this.c.e(list, null);
    }

    public void c0(List<T> list, Runnable runnable) {
        this.c.e(list, runnable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.b().size();
    }
}
