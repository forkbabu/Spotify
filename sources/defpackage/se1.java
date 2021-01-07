package defpackage;

import com.spotify.http.u;

/* renamed from: se1  reason: default package */
public final class se1 implements fjf<ij1> {
    private final wlf<u> a;

    public se1(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ij1 ij1 = (ij1) this.a.get().a(ij1.class, okhttp3.u.j("https://api-partner.spotify.com/partner-promotions/v1/"));
        yif.g(ij1, "Cannot return null from a non-@Nullable @Provides method");
        return ij1;
    }
}
