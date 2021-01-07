package defpackage;

import com.spotify.music.libs.search.ondemand.editorial.e;

/* renamed from: h68  reason: default package */
public final class h68 implements fjf<g68> {
    private final wlf<Boolean> a;
    private final wlf<e> b;

    public h68(wlf<Boolean> wlf, wlf<e> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g68(this.a.get().booleanValue(), this.b.get());
    }
}
