package defpackage;

import com.spotify.remoteconfig.ej;
import kotlin.jvm.internal.h;

/* renamed from: ns0  reason: default package */
public final class ns0 implements fjf<Boolean> {
    private final ms0 a;
    private final wlf<ej> b;

    public ns0(ms0 ms0, wlf<ej> wlf) {
        this.a = ms0;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ms0 ms0 = this.a;
        ej ejVar = this.b.get();
        ms0.getClass();
        h.e(ejVar, "properties");
        return Boolean.valueOf(ejVar.b());
    }
}
