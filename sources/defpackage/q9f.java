package defpackage;

import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.c;
import java.nio.ByteBuffer;

/* renamed from: q9f  reason: default package */
public final class q9f implements fjf<c<ByteBuffer>> {

    /* access modifiers changed from: private */
    /* renamed from: q9f$a */
    public static final class a {
        private static final q9f a = new q9f();
    }

    public static q9f a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return PublishSubject.h1();
    }
}
