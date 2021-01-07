package defpackage;

import com.spotify.remoteconfig.hc;

/* renamed from: uka  reason: default package */
public final class uka implements fjf<tka> {
    private final wlf<hc> a;

    public uka(wlf<hc> wlf) {
        this.a = wlf;
    }

    public static tka a(hc hcVar) {
        return new tka(hcVar);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tka(this.a.get());
    }
}
