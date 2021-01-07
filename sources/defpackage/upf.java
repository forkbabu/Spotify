package defpackage;

/* renamed from: upf  reason: default package */
public interface upf<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(vpf vpf);
}
