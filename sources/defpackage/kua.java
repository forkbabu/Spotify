package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueSectionHeader;
import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.MainViewResponse;
import com.spotify.searchview.proto.Recommendations;
import com.spotify.searchview.proto.RecommendationsType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: kua  reason: default package */
public class kua {
    private final qua a;
    private final mua b;
    private final owa<Entity> c;
    private final int d;

    public kua(qua qua, mua mua, owa<Entity> owa, int i) {
        this.a = qua;
        this.b = mua;
        this.c = owa;
        this.d = i;
    }

    public List<s81> a(jua jua, List<Entity> list) {
        Optional optional;
        List<s81> a2 = this.a.a(list, jua.d());
        boolean z = true;
        ArrayList arrayList = new ArrayList(((ArrayList) a2).size() + 1);
        arrayList.addAll(a2);
        MainViewResponse e = jua.e();
        if (e.o().i() > 0) {
            RecommendationsType m = e.o().m();
            if (m == RecommendationsType.UNRECOGNIZED || m == RecommendationsType.RECOMMENDATIONS_TYPE_UNKNOWN) {
                z = false;
            }
            if (z) {
                Recommendations o = e.o();
                List<s81> a3 = this.b.apply(jua);
                if (a3.isEmpty()) {
                    optional = Optional.absent();
                } else {
                    optional = Optional.of(z81.c().s("top-recs-content-results-carousel").n(HubsGlueComponent.CAROUSEL).m(a3).l());
                }
                if (optional.isPresent()) {
                    arrayList.add(this.d, optional.get());
                    arrayList.add(this.d, z81.c().s("top-recs-content-results-header").n(HubsGlueSectionHeader.SECTION_HEADER).y(z81.h().a(this.c.b(o.m(), e.l(0).o()))).l());
                }
            }
        }
        return arrayList;
    }
}
