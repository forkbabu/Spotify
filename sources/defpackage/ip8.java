package defpackage;

import com.spotify.http.u;

/* renamed from: ip8  reason: default package */
public final class ip8 implements fjf<kp8> {
    private final wlf<u> a;

    public ip8(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        kp8 kp8 = (kp8) this.a.get().c(kp8.class);
        yif.g(kp8, "Cannot return null from a non-@Nullable @Provides method");
        return kp8;
    }
}
