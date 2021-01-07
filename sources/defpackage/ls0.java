package defpackage;

import com.spotify.remoteconfig.ej;
import kotlin.jvm.internal.h;

/* renamed from: ls0  reason: default package */
public final class ls0 implements fjf<Boolean> {
    private final ks0 a;
    private final wlf<ej> b;

    public ls0(ks0 ks0, wlf<ej> wlf) {
        this.a = ks0;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ks0 ks0 = this.a;
        ej ejVar = this.b.get();
        ks0.getClass();
        h.e(ejVar, "properties");
        return Boolean.valueOf(ejVar.a());
    }
}
