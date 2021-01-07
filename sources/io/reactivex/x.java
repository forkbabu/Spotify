package io.reactivex;

import io.reactivex.disposables.b;

public interface x<T> {
    @Override // io.reactivex.c
    void onComplete();

    @Override // io.reactivex.c
    void onError(Throwable th);

    void onNext(T t);

    @Override // io.reactivex.c
    void onSubscribe(b bVar);
}
