package defpackage;

import io.reactivex.subjects.PublishSubject;

/* renamed from: ard  reason: default package */
public final class ard implements fjf<PublishSubject<uqd>> {

    /* access modifiers changed from: private */
    /* renamed from: ard$a */
    public static final class a {
        private static final ard a = new ard();
    }

    public static ard a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return PublishSubject.h1();
    }
}
