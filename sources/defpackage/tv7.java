package defpackage;

import com.spotify.music.features.pushnotifications.i0;
import com.spotify.music.features.pushnotifications.k0;
import com.spotify.music.features.pushnotifications.t0;
import com.spotify.remoteconfig.ak;

/* renamed from: tv7  reason: default package */
public final class tv7 implements fjf<t0> {
    private final wlf<i0> a;
    private final wlf<k0> b;
    private final wlf<ak> c;

    public tv7(wlf<i0> wlf, wlf<k0> wlf2, wlf<ak> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        t0 t0Var = (i0) this.a.get();
        t0 t0Var2 = (k0) this.b.get();
        if (this.c.get().a()) {
            t0Var = t0Var2;
        }
        yif.g(t0Var, "Cannot return null from a non-@Nullable @Provides method");
        return t0Var;
    }
}
