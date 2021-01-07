package com.spotify.mobius.rx2;

import com.spotify.mobius.rx2.t;
import java.util.concurrent.Callable;

class s implements Callable<E> {
    final /* synthetic */ Object a;
    final /* synthetic */ t.a b;

    s(t.a aVar, Object obj) {
        this.b = aVar;
        this.a = obj;
    }

    @Override // java.util.concurrent.Callable
    public E call() {
        return (E) t.this.a.apply(this.a);
    }
}
