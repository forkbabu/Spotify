package defpackage;

import com.spotify.http.u;
import com.spotify.music.features.pushnotifications.a1;

/* renamed from: vv7  reason: default package */
public final class vv7 implements fjf<a1> {
    private final wlf<u> a;

    public vv7(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        a1 a1Var = (a1) this.a.get().c(a1.class);
        yif.g(a1Var, "Cannot return null from a non-@Nullable @Provides method");
        return a1Var;
    }
}
