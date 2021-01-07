package io.reactivex.internal.observers;

public interface f<T> {
    void a();

    void b(InnerQueuedObserver<T> innerQueuedObserver, Throwable th);

    void c(InnerQueuedObserver<T> innerQueuedObserver);

    void e(InnerQueuedObserver<T> innerQueuedObserver, T t);
}
