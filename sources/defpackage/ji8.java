package defpackage;

import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;

/* renamed from: ji8  reason: default package */
public class ji8 {
    private final PublishSubject<xi8> a = PublishSubject.h1();

    public void a(xi8 xi8) {
        this.a.onNext(xi8);
    }

    public s<xi8> b() {
        return this.a;
    }
}
