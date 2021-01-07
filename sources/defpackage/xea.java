package defpackage;

import defpackage.wea;
import kotlin.jvm.internal.h;

/* renamed from: xea  reason: default package */
public final class xea implements fjf<oea> {
    private final wlf<cea> a;

    public xea(wlf<cea> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        cea cea = this.a.get();
        wea.a aVar = wea.a;
        h.e(cea, "logger");
        return cea;
    }
}
