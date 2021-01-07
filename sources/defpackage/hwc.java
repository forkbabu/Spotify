package defpackage;

import com.spotify.music.json.g;

/* renamed from: hwc  reason: default package */
public final class hwc implements fjf<fwc> {
    private final wlf<iwc> a;
    private final wlf<g> b;

    public hwc(wlf<iwc> wlf, wlf<g> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fwc(this.a.get(), this.b.get());
    }
}
