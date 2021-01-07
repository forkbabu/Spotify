package defpackage;

import com.google.protobuf.u;
import defpackage.o15;
import kotlin.jvm.internal.h;

/* renamed from: p15  reason: default package */
public final class p15 implements fjf<c25> {
    private final wlf<ere> a;
    private final wlf<gl0<u>> b;

    public p15(wlf<ere> wlf, wlf<gl0<u>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        ere ere = this.a.get();
        gl0<u> gl0 = this.b.get();
        o15.a aVar = o15.a;
        h.e(ere, "eventLogger");
        h.e(gl0, "eventPublisher");
        return new d25(ere, gl0);
    }
}
