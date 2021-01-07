package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: zpe  reason: default package */
public final class zpe implements fjf<vpe> {
    private final wlf<xpe> a;

    public zpe(wlf<xpe> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        xpe xpe = this.a.get();
        h.e(xpe, "superbirdTipsAndTricksEndpoint");
        return new wpe(xpe);
    }
}
