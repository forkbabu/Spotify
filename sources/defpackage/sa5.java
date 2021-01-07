package defpackage;

import com.jakewharton.rxrelay2.PublishRelay;
import com.jakewharton.rxrelay2.c;

/* renamed from: sa5  reason: default package */
public final class sa5 implements fjf<c<Boolean>> {

    /* access modifiers changed from: private */
    /* renamed from: sa5$a */
    public static final class a {
        private static final sa5 a = new sa5();
    }

    public static sa5 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return PublishRelay.g1();
    }
}
