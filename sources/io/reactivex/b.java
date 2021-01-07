package io.reactivex;

import io.reactivex.functions.f;

public interface b {
    @Override // io.reactivex.disposables.b
    boolean d();

    void e(f fVar);

    boolean f(Throwable th);

    void onComplete();

    void onError(Throwable th);
}
