package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.searchview.assistedcuration.proto.EntityType;
import com.spotify.ubi.specification.factories.v;
import defpackage.s81;
import defpackage.wsa;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: pva  reason: default package */
class pva {
    private final twa a;
    private final yta<EntityType> b;
    private final jxa<EntityType> c;
    private final v d;

    pva(twa twa, yta<EntityType> yta, jxa<EntityType> jxa, v vVar) {
        this.c = jxa;
        this.a = twa;
        this.b = yta;
        this.d = vVar;
    }

    public s81 a(AtomicInteger atomicInteger, hva hva, EntityType entityType) {
        int andIncrement = atomicInteger.getAndIncrement();
        String or = this.b.a(entityType, hva.b()).or((Optional<String>) "unsupported");
        String d2 = this.a.d(entityType);
        String a2 = this.c.a(entityType);
        s81.a c2 = z81.c();
        s81.a x = c2.s("all-" + a2 + "-results").n(HubsGlueRow.NAVIGATION).y(z81.h().a(d2)).x(z81.g(or));
        String c3 = hva.c();
        wsa.a a3 = wsa.a();
        a3.e(this.d.c().c(c3).b(Integer.valueOf(andIncrement), or).a());
        a3.a(andIncrement);
        a3.b(or);
        a3.d(a2 + "-results");
        a3.c(c3);
        return x.v(pqa.a(a3.build())).l();
    }
}
