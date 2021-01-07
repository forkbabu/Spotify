package defpackage;

import com.spotify.music.libs.search.hubs.util.image.b;

/* renamed from: fra  reason: default package */
public final class fra implements fjf<era> {
    private final wlf<b> a;
    private final wlf<kra> b;

    public fra(wlf<b> wlf, wlf<kra> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new era(this.a.get(), this.b.get());
    }
}
