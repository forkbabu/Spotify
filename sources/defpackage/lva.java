package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import com.spotify.music.libs.viewuri.c;
import com.spotify.searchview.assistedcuration.proto.Entity;
import com.spotify.searchview.assistedcuration.proto.EntityType;
import com.spotify.ubi.specification.factories.u;
import defpackage.p81;
import defpackage.wsa;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lva  reason: default package */
public class lva implements sg0<gva, b91> {
    private final c.a a;
    private final hwa<Entity, EntityType> b;
    private final yva c;
    private final rta<EntityType> d;
    private final qqa e;
    private final jxa<Entity.EntityCase> f;
    private u g;

    public lva(c.a aVar, hwa<Entity, EntityType> hwa, yva yva, rta<EntityType> rta, qqa qqa, jxa<Entity.EntityCase> jxa) {
        this.a = aVar;
        this.b = hwa;
        this.c = yva;
        this.d = rta;
        this.e = qqa;
        this.f = jxa;
    }

    private p81 a(gva gva) {
        p81.a b2 = HubsImmutableComponentBundle.builder().p("searchTerm", gva.d()).p("requestId", gva.e()).p("pageIdentifier", this.d.a(gva.b())).b("isLastPage", gva.f().h() < 20);
        if (gva.c().isPresent()) {
            b2 = b2.j("lastOffset", gva.c().get().intValue());
        }
        return b2.d();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.sg0
    public b91 apply(gva gva) {
        gva gva2 = gva;
        this.g = new u(this.d.a(gva2.b()), this.a.getViewUri().toString(), gva2.e());
        if (gva2.f().h() > 0) {
            List<Entity> i = gva2.f().i();
            ArrayList arrayList = new ArrayList(i.size());
            for (int i2 = 0; i2 < i.size(); i2++) {
                Entity entity = i.get(i2);
                String e2 = gva2.e();
                String str = this.f.a(entity.i()) + "-results";
                wsa.a a2 = wsa.a();
                a2.e(this.g.c(Integer.valueOf(i2), entity.o()).a());
                a2.a(i2);
                a2.b(entity.o());
                a2.d(str);
                a2.c(e2);
                xva b2 = this.c.b(entity, a2.build(), str);
                int ordinal = entity.i().ordinal();
                b2.b(ordinal == 1 || ordinal == 2);
                arrayList.add(b2.a());
            }
            return z81.i().m(this.b.e(gva2.b(), gva2.d())).e(arrayList).c(a(gva2)).g();
        } else if (!gva2.c().isPresent() || gva2.c().get().intValue() == 0) {
            return this.e.b(gva2.d(), false).toBuilder().c(a(gva2)).g();
        } else {
            return HubsImmutableViewModel.EMPTY.toBuilder().c(z81.a().b("isLastPage", true).d()).g();
        }
    }
}
