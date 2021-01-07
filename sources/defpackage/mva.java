package defpackage;

import com.spotify.music.libs.viewuri.c;
import com.spotify.searchview.assistedcuration.proto.Entity;
import com.spotify.searchview.assistedcuration.proto.EntityType;

/* renamed from: mva  reason: default package */
public final class mva implements fjf<lva> {
    private final wlf<c.a> a;
    private final wlf<hwa<Entity, EntityType>> b;
    private final wlf<yva> c;
    private final wlf<rta<EntityType>> d;
    private final wlf<qqa> e;
    private final wlf<jxa<Entity.EntityCase>> f;

    public mva(wlf<c.a> wlf, wlf<hwa<Entity, EntityType>> wlf2, wlf<yva> wlf3, wlf<rta<EntityType>> wlf4, wlf<qqa> wlf5, wlf<jxa<Entity.EntityCase>> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lva(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
