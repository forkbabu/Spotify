package defpackage;

import com.spotify.searchview.assistedcuration.proto.EntityType;
import com.spotify.ubi.specification.factories.v;

/* renamed from: qva  reason: default package */
public final class qva implements fjf<pva> {
    private final wlf<twa> a;
    private final wlf<yta<EntityType>> b;
    private final wlf<jxa<EntityType>> c;
    private final wlf<v> d;

    public qva(wlf<twa> wlf, wlf<yta<EntityType>> wlf2, wlf<jxa<EntityType>> wlf3, wlf<v> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pva(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
