package io.reactivex;

import io.reactivex.functions.f;

public interface a0<T> {
    @Override // io.reactivex.disposables.b
    boolean d();

    void e(f fVar);

    boolean f(Throwable th);

    void onError(Throwable th);

    void onSuccess(T t);
}
