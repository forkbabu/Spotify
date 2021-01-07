package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import defpackage.y7d;

/* renamed from: b8d  reason: default package */
public final class b8d implements fjf<x7d> {
    private final wlf<Cosmonaut> a;

    public b8d(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        y7d.a aVar = y7d.a;
        return (x7d) je.c0(this.a.get(), "cosmonaut", x7d.class, "cosmonaut.createCosmosSe…CoreEndpoint::class.java)");
    }
}
