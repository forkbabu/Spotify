package defpackage;

import io.reactivex.subjects.PublishSubject;
import kotlin.jvm.internal.h;

/* renamed from: ay9  reason: default package */
public final class ay9 {
    private final PublishSubject<Boolean> a;

    public ay9() {
        PublishSubject<Boolean> h1 = PublishSubject.h1();
        h.d(h1, "PublishSubject.create<Boolean>()");
        this.a = h1;
    }

    public final PublishSubject<Boolean> a() {
        return this.a;
    }
}
