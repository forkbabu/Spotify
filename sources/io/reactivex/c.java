package io.reactivex;

import io.reactivex.disposables.b;

public interface c {
    void onComplete();

    void onError(Throwable th);

    void onSubscribe(b bVar);
}
