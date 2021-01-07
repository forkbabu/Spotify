package defpackage;

import com.spotify.music.libs.search.ondemand.editorial.e;

/* renamed from: h58  reason: default package */
public final class h58 implements fjf<g58> {
    private final wlf<e> a;
    private final wlf<r58> b;

    public h58(wlf<e> wlf, wlf<r58> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g58(this.a.get(), this.b.get());
    }
}
