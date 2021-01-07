package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.EntityType;
import com.spotify.ubi.specification.factories.q3;
import defpackage.s81;
import defpackage.wsa;
import io.reactivex.functions.l;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: oua  reason: default package */
class oua implements l<jua, List<s81>> {
    private final owa<Entity> a;
    private final yta<EntityType> b;
    private final q3 c;

    public oua(owa<Entity> owa, yta<EntityType> yta, q3 q3Var) {
        this.a = owa;
        this.b = yta;
        this.c = q3Var;
    }

    /* renamed from: a */
    public List<s81> apply(jua jua) {
        return FluentIterable.from(jua.e().i()).filter(pta.a).transform(new qta(this, new AtomicInteger(0), jua)).toList();
    }

    public s81 b(AtomicInteger atomicInteger, jua jua, EntityType entityType) {
        String str;
        int andIncrement = atomicInteger.getAndIncrement();
        String or = this.b.a(entityType, jua.c()).or((Optional<String>) "unsupported");
        String c2 = this.a.c(entityType);
        switch (entityType.ordinal()) {
            case 0:
                str = "unknown";
                break;
            case 1:
                str = "artist";
                break;
            case 2:
                str = AppProtocol.TrackData.TYPE_TRACK;
                break;
            case 3:
                str = "album";
                break;
            case 4:
                str = "playlist";
                break;
            case 5:
                str = "genre";
                break;
            case 6:
                str = "show";
                break;
            case 7:
                str = "audioepisode";
                break;
            case 8:
                str = "profile";
                break;
            case 9:
                str = "topic";
                break;
            case 10:
                str = "unrecognized";
                break;
            default:
                Assertion.g("Could not resolve see all identifier for unknown entity type: " + entityType);
                str = "invalid";
                break;
        }
        s81.a c3 = z81.c();
        s81.a x = c3.s("all-" + str + "-results").n(HubsGlueRow.NAVIGATION).y(z81.h().a(c2)).x(z81.g(or));
        String d = jua.d();
        wsa.a a2 = wsa.a();
        a2.e(this.c.c().e(d).b(Integer.valueOf(andIncrement), or).a());
        a2.a(andIncrement);
        a2.b(or);
        a2.d(str + "-results");
        a2.c(d);
        return x.v(pqa.a(a2.build())).l();
    }
}
