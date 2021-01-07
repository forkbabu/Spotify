package defpackage;

import com.spotify.music.libs.search.hubs.util.image.b;

/* renamed from: hra  reason: default package */
public final class hra implements fjf<gra> {
    private final wlf<b> a;
    private final wlf<kra> b;

    public hra(wlf<b> wlf, wlf<kra> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gra(this.a.get(), this.b.get());
    }
}
