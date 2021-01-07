package defpackage;

import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.c;

/* renamed from: u9f  reason: default package */
public final class u9f implements fjf<c<k9f>> {

    /* access modifiers changed from: private */
    /* renamed from: u9f$a */
    public static final class a {
        private static final u9f a = new u9f();
    }

    public static u9f a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return PublishSubject.h1();
    }
}
