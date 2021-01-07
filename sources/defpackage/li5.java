package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.functions.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: li5  reason: default package */
public class li5 implements c<b91, RecentlyPlayedItems, b91> {
    private final ri5 a;

    li5(ri5 ri5) {
        ri5.getClass();
        this.a = ri5;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.c
    public b91 a(b91 b91, RecentlyPlayedItems recentlyPlayedItems) {
        p81 bundle;
        b91 b912 = b91;
        RecentlyPlayedItems recentlyPlayedItems2 = recentlyPlayedItems;
        p81 bundle2 = b912.custom().bundle("recentlyPlayed");
        int intValue = bundle2 != null ? bundle2.intValue("position", -1) : -1;
        if (!(!b912.body().isEmpty() && recentlyPlayedItems2.length > 0 && intValue != -1)) {
            return b912;
        }
        p81 bundle3 = b912.custom().bundle("recentlyPlayed");
        String str = null;
        String string = bundle3 != null ? bundle3.string("title") : null;
        p81 bundle4 = b912.custom().bundle("recentlyPlayed");
        if (!(bundle4 == null || (bundle = bundle4.bundle("logging")) == null)) {
            str = bundle.string("ui:source");
        }
        p81 d = z81.a().p("ui:source", str).p("ui:group", "shows-recently-played-group").j("ui:index_in_block", Integer.valueOf(intValue).intValue()).d();
        List<? extends s81> body = b912.body();
        Integer valueOf = Integer.valueOf(intValue);
        List<s81> a2 = this.a.a(recentlyPlayedItems2, str, valueOf.intValue());
        ArrayList arrayList = new ArrayList(body.size() + 2);
        arrayList.addAll(body);
        arrayList.addAll(valueOf.intValue(), Arrays.asList(z81.c().n(ip9.a).y(z81.h().a(string)).d("client-added-header", Boolean.TRUE).l(), z81.c().s("shows-recently-played-group").o("home:recentlyPlayedCarousel", HubsComponentCategory.ROW.name()).m(a2).v(d).l()));
        return b912.toBuilder().e(arrayList).g();
    }
}
