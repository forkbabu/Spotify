package io.reactivex;

import io.reactivex.disposables.b;
import io.reactivex.functions.f;

public interface h<T> extends f<T> {
    void a(b bVar);

    void e(f fVar);

    boolean f(Throwable th);

    boolean isCancelled();
}
