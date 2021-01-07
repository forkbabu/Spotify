package defpackage;

import com.spotify.music.libs.search.hubs.util.image.b;

/* renamed from: dra  reason: default package */
public final class dra implements fjf<cra> {
    private final wlf<b> a;
    private final wlf<kra> b;

    public dra(wlf<b> wlf, wlf<kra> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cra(this.a.get(), this.b.get());
    }
}
