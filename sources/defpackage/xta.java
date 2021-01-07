package defpackage;

import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.EntityType;
import com.spotify.ubi.specification.factories.p3;

/* renamed from: xta  reason: default package */
public final class xta implements fjf<wta> {
    private final wlf<qqa> a;
    private final wlf<hwa<Entity, EntityType>> b;
    private final wlf<mwa> c;
    private final wlf<jwa> d;
    private final wlf<p3> e;
    private final wlf<Boolean> f;

    public xta(wlf<qqa> wlf, wlf<hwa<Entity, EntityType>> wlf2, wlf<mwa> wlf3, wlf<jwa> wlf4, wlf<p3> wlf5, wlf<Boolean> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wta(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get().booleanValue());
    }
}
