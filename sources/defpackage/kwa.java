package defpackage;

import com.spotify.searchview.proto.Entity;

/* renamed from: kwa  reason: default package */
public final class kwa implements fjf<jwa> {
    private final wlf<pwa<Entity>> a;
    private final wlf<awa> b;

    public kwa(wlf<pwa<Entity>> wlf, wlf<awa> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jwa(this.a, this.b);
    }
}
