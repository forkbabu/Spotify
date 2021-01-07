package defpackage;

import com.spotify.http.u;

/* renamed from: xp8  reason: default package */
public final class xp8 implements fjf<kq8> {
    private final wlf<u> a;

    public xp8(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        kq8 kq8 = (kq8) this.a.get().c(kq8.class);
        yif.g(kq8, "Cannot return null from a non-@Nullable @Provides method");
        return kq8;
    }
}
