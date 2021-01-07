package io.reactivex.internal.subscribers;

public interface d<T> {
    void a();

    void b(InnerQueuedSubscriber<T> innerQueuedSubscriber, T t);

    void c(InnerQueuedSubscriber<T> innerQueuedSubscriber);

    void d(InnerQueuedSubscriber<T> innerQueuedSubscriber, Throwable th);
}
