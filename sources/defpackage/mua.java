package defpackage;

import com.spotify.music.libs.search.hubs.util.image.ImageConfig;
import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.RecommendationsType;
import com.spotify.ubi.specification.factories.q3;
import defpackage.wsa;
import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: mua  reason: default package */
public class mua implements l<jua, List<s81>> {
    private final jwa a;
    private final q3 b;

    public mua(jwa jwa, q3 q3Var) {
        this.a = jwa;
        this.b = q3Var;
    }

    /* renamed from: a */
    public List<s81> apply(jua jua) {
        List<Entity> a2 = zta.a(jua.e().o().l());
        if (a2.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(a2.size());
        for (int i = 0; i < a2.size(); i++) {
            Entity entity = a2.get(i);
            String d = jua.d();
            RecommendationsType m = jua.e().o().m();
            wsa.a a3 = wsa.a();
            a3.e(this.b.c().e(d).c().b().b(Integer.valueOf(i), entity.r()).a());
            a3.a(i);
            a3.b(entity.r());
            a3.d("top-recs-content-results");
            a3.c(d);
            iwa b2 = this.a.b(entity, a3.build());
            b2.b(RecommendationsType.RECOMMENDATIONS_TYPE_TOPICS_WITH_EPISODE == m ? ImageConfig.Style.ROUNDED_SQUARE : ImageConfig.Style.SQUARE);
            arrayList.add(b2.a());
        }
        return arrayList;
    }
}
