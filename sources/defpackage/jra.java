package defpackage;

import com.spotify.music.libs.search.hubs.util.image.b;

/* renamed from: jra  reason: default package */
public final class jra implements fjf<ira> {
    private final wlf<b> a;
    private final wlf<kra> b;

    public jra(wlf<b> wlf, wlf<kra> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ira(this.a.get(), this.b.get());
    }
}
