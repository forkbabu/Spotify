package defpackage;

import defpackage.zuc;
import kotlin.jvm.internal.h;
import org.threeten.bp.Clock;

/* renamed from: avc  reason: default package */
public final class avc implements fjf<Clock> {

    /* access modifiers changed from: private */
    /* renamed from: avc$a */
    public static final class a {
        private static final avc a = new avc();
    }

    public static avc a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        zuc.a aVar = zuc.a;
        Clock d = Clock.d();
        h.d(d, "Clock.systemUTC()");
        return d;
    }
}
