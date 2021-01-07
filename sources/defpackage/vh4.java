package defpackage;

import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import kotlin.jvm.internal.h;

/* renamed from: vh4  reason: default package */
public final class vh4 {
    private final PublishSubject<String> a;

    public vh4() {
        PublishSubject<String> h1 = PublishSubject.h1();
        h.d(h1, "PublishSubject.create<String>()");
        this.a = h1;
    }

    public final void a(String str) {
        h.e(str, "entityUri");
        this.a.onNext(str);
    }

    public final s<String> b() {
        return this.a;
    }
}
