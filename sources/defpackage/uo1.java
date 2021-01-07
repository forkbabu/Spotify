package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: uo1  reason: default package */
public final class uo1 implements fjf<po1> {
    private final wlf<Cosmonaut> a;

    public uo1(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return (po1) je.c0(this.a.get(), "cosmonaut", po1.class, "cosmonaut.createCosmosSe…kipsEndpoint::class.java)");
    }
}
