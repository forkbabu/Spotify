package defpackage;

import defpackage.ce0;
import kotlin.jvm.internal.h;

/* renamed from: zd0  reason: default package */
public final class zd0 {
    public static final oe0 a(ae0 ae0, cqe cqe, pe0 pe0, re0 re0) {
        h.e(ae0, "authTracker");
        h.e(cqe, "clock");
        h.e(pe0, "randomIdProvider");
        h.e(re0, "trackedRequest");
        String a = pe0.a();
        oe0 oe0 = new oe0(ae0, cqe, re0, a);
        ae0.a(new ce0.j(re0, a, cqe.b()));
        return oe0;
    }
}
