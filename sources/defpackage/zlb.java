package defpackage;

import io.reactivex.g;
import kotlin.jvm.internal.h;

/* renamed from: zlb  reason: default package */
public final class zlb implements fjf<g<eqd>> {
    private final wlf<dmb> a;

    public zlb(wlf<dmb> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        dmb dmb = this.a.get();
        h.e(dmb, "nowPlayingInsetsFlowable");
        return dmb.a();
    }
}
