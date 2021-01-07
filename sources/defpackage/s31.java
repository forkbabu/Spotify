package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import defpackage.r31;

/* renamed from: s31  reason: default package */
public final class s31 implements fjf<k31> {
    private final wlf<Cosmonaut> a;

    public s31(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        r31.a aVar = r31.a;
        return (k31) je.c0(this.a.get(), "cosmonaut", k31.class, "cosmonaut.createCosmosSe…osmosService::class.java)");
    }
}
