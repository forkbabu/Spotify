package defpackage;

import defpackage.ev8;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import kotlin.jvm.internal.h;

/* renamed from: mv8  reason: default package */
public final class mv8 implements lv8 {
    private final PublishSubject<ev8> a;

    public mv8() {
        PublishSubject<ev8> h1 = PublishSubject.h1();
        h.d(h1, "PublishSubject.create<UpdateEmailEvent>()");
        this.a = h1;
    }

    @Override // defpackage.lv8
    public s<ev8> a() {
        return this.a;
    }

    @Override // defpackage.lv8
    public void b() {
        this.a.onNext(ev8.e.a);
    }

    @Override // defpackage.lv8
    public void c(gv8 gv8) {
        h.e(gv8, "inputType");
        this.a.onNext(new ev8.c(gv8));
    }

    @Override // defpackage.lv8
    public void d(String str) {
        h.e(str, "email");
        this.a.onNext(new ev8.b(str));
    }
}
