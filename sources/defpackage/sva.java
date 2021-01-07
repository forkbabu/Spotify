package defpackage;

import com.spotify.searchview.assistedcuration.proto.Entity;
import com.spotify.ubi.specification.factories.v;

/* renamed from: sva  reason: default package */
public final class sva implements fjf<rva> {
    private final wlf<yva> a;
    private final wlf<jxa<Entity.EntityCase>> b;
    private final wlf<v> c;

    public sva(wlf<yva> wlf, wlf<jxa<Entity.EntityCase>> wlf2, wlf<v> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rva(this.a.get(), this.b.get(), this.c.get());
    }
}
