package io.reactivex;

import io.reactivex.disposables.b;

public interface n<T> {
    void onComplete();

    void onError(Throwable th);

    void onSubscribe(b bVar);

    void onSuccess(T t);
}
