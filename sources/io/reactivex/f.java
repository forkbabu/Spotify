package io.reactivex;

public interface f<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);
}
