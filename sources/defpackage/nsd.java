package defpackage;

import com.spotify.http.u;

/* renamed from: nsd  reason: default package */
public final class nsd implements fjf<zrd> {
    private final wlf<u> a;

    public nsd(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        zrd zrd = (zrd) this.a.get().a(zrd.class, okhttp3.u.j("https://pme-config.spotifycdn.com/"));
        yif.g(zrd, "Cannot return null from a non-@Nullable @Provides method");
        return zrd;
    }
}
