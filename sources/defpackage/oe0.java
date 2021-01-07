package defpackage;

import defpackage.ce0;
import kotlin.jvm.internal.h;

/* renamed from: oe0  reason: default package */
public final class oe0 {
    private final ae0 a;
    private final cqe b;
    private final re0 c;
    private final String d;

    public oe0(ae0 ae0, cqe cqe, re0 re0, String str) {
        h.e(ae0, "authTracker");
        h.e(cqe, "clock");
        h.e(re0, "trackedRequest");
        h.e(str, "uniqueId");
        this.a = ae0;
        this.b = cqe;
        this.c = re0;
        this.d = str;
    }

    public final void a(Integer num) {
        this.a.a(new ce0.i(this.c, this.d, this.b.b(), num));
    }
}
