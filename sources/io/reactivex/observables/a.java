package io.reactivex.observables;

import io.reactivex.disposables.b;
import io.reactivex.functions.g;
import io.reactivex.internal.operators.observable.ObservablePublishAlt;
import io.reactivex.internal.operators.observable.ObservableRefCount;
import io.reactivex.internal.operators.observable.h0;
import io.reactivex.s;

public abstract class a<T> extends s<T> {
    public abstract void g1(g<? super b> gVar);

    public s<T> h1() {
        return new ObservableRefCount(this instanceof h0 ? new ObservablePublishAlt<>(((h0) this).a()) : this);
    }
}
