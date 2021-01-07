package defpackage;

import com.spotify.collection.endpoints.artist.json.b;

/* renamed from: bh0  reason: default package */
public final class bh0 implements fjf<ah0> {
    private final wlf<wg0> a;
    private final wlf<b> b;

    public bh0(wlf<wg0> wlf, wlf<b> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ah0(this.a.get(), this.b.get());
    }
}
