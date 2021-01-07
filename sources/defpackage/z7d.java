package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import defpackage.y7d;

/* renamed from: z7d  reason: default package */
public final class z7d implements fjf<v7d> {
    private final wlf<Cosmonaut> a;

    public z7d(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        y7d.a aVar = y7d.a;
        return (v7d) je.c0(this.a.get(), "cosmonaut", v7d.class, "cosmonaut.createCosmosSe…ionsEndpoint::class.java)");
    }
}
