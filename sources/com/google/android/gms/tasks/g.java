package com.google.android.gms.tasks;

import android.app.Activity;
import java.util.concurrent.Executor;

public abstract class g<TResult> {
    public g<TResult> a(Executor executor, b bVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public g<TResult> b(c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public g<TResult> c(Executor executor, c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract g<TResult> d(Activity activity, d dVar);

    public abstract g<TResult> e(d dVar);

    public abstract g<TResult> f(Executor executor, d dVar);

    public abstract g<TResult> g(Activity activity, e<? super TResult> eVar);

    public abstract g<TResult> h(e<? super TResult> eVar);

    public abstract g<TResult> i(Executor executor, e<? super TResult> eVar);

    public <TContinuationResult> g<TContinuationResult> j(a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> g<TContinuationResult> k(Executor executor, a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> g<TContinuationResult> l(Executor executor, a<TResult, g<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception m();

    public abstract TResult n();

    public abstract <X extends Throwable> TResult o(Class<X> cls);

    public abstract boolean p();

    public abstract boolean q();

    public abstract boolean r();

    public <TContinuationResult> g<TContinuationResult> s(f<TResult, TContinuationResult> fVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public <TContinuationResult> g<TContinuationResult> t(Executor executor, f<TResult, TContinuationResult> fVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
