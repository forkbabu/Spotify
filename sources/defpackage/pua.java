package defpackage;

import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.EntityType;
import com.spotify.ubi.specification.factories.q3;

/* renamed from: pua  reason: default package */
public final class pua implements fjf<oua> {
    private final wlf<owa<Entity>> a;
    private final wlf<yta<EntityType>> b;
    private final wlf<q3> c;

    public pua(wlf<owa<Entity>> wlf, wlf<yta<EntityType>> wlf2, wlf<q3> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new oua(this.a.get(), this.b.get(), this.c.get());
    }
}
