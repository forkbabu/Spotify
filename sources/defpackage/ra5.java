package defpackage;

import com.jakewharton.rxrelay2.PublishRelay;
import com.jakewharton.rxrelay2.c;

/* renamed from: ra5  reason: default package */
public final class ra5 implements fjf<c<Boolean>> {

    /* access modifiers changed from: private */
    /* renamed from: ra5$a */
    public static final class a {
        private static final ra5 a = new ra5();
    }

    public static ra5 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return PublishRelay.g1();
    }
}
