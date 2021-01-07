package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: uxd  reason: default package */
public final class uxd implements fjf<txd> {
    private final wlf<Cosmonaut> a;

    public uxd(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return (txd) je.c0(this.a.get(), "cosmonaut", txd.class, "cosmonaut.createCosmosSe…etEndpointV1::class.java)");
    }
}
