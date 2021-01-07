package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.c;
import io.reactivex.x;
import kotlin.jvm.internal.h;

/* renamed from: y1c  reason: default package */
public final class y1c<T> implements x<T> {
    private final g<T> a;
    private final boolean b;
    private final /* synthetic */ c<T> c;

    public y1c(boolean z, int i) {
        z = (i & 1) != 0 ? true : z;
        PublishSubject h1 = PublishSubject.h1();
        h.d(h1, "PublishSubject.create()");
        this.c = h1;
        this.b = z;
        g<T> Y0 = h1.Y0(BackpressureStrategy.LATEST);
        g<T> Z = (z ? Y0.s() : Y0).Z();
        h.c(Z);
        this.a = Z;
    }

    public final g<T> a() {
        return this.a;
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onComplete() {
        this.c.onComplete();
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onError(Throwable th) {
        h.e(th, "p0");
        this.c.onError(th);
    }

    @Override // io.reactivex.x
    public void onNext(T t) {
        h.e(t, "p0");
        this.c.onNext(t);
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onSubscribe(b bVar) {
        h.e(bVar, "p0");
        this.c.onSubscribe(bVar);
    }
}
