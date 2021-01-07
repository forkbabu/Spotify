package io.reactivex;

import io.reactivex.disposables.b;

public interface b0<T> {
    void onError(Throwable th);

    void onSubscribe(b bVar);

    void onSuccess(T t);
}
