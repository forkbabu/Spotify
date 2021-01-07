package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

public class s<T> extends u<T> {
    private c1<LiveData<?>, a<?>> k = new c1<>();

    private static class a<V> implements v<V> {
        final LiveData<V> a;
        final v<? super V> b;
        int c = -1;

        a(LiveData<V> liveData, v<? super V> vVar) {
            this.a = liveData;
            this.b = vVar;
        }

        @Override // androidx.lifecycle.v
        public void a(V v) {
            if (this.c != this.a.f()) {
                this.c = this.a.f();
                this.b.a(v);
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.a.i(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void j() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void k() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.k.iterator();
        while (it.hasNext()) {
            a<?> value = it.next().getValue();
            value.a.m(value);
        }
    }

    public <S> void o(LiveData<S> liveData, v<? super S> vVar) {
        a<?> aVar = new a<>(liveData, vVar);
        a<?> i = this.k.i(liveData, aVar);
        if (i != null && i.b != vVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        } else if (i == null && g()) {
            aVar.a.i(aVar);
        }
    }
}
