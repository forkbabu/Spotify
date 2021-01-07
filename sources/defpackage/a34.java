package defpackage;

import android.os.Bundle;
import com.google.common.base.MoreObjects;
import com.spotify.libs.search.history.SearchHistoryItem;
import com.spotify.libs.search.history.j;
import com.spotify.libs.search.history.k;
import com.spotify.mobile.android.hubframework.defaults.components.custom.a;
import com.spotify.mobile.android.hubframework.defaults.components.glue.w;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.x;
import com.spotify.player.model.Context;
import defpackage.o81;
import defpackage.s81;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: a34  reason: default package */
public class a34 implements j, k {
    private final Set<String> a;

    public a34(Bundle bundle) {
        HashSet hashSet = new HashSet(10);
        this.a = hashSet;
        ArrayList<String> stringArrayList = bundle.getStringArrayList("track_uris_to_ignore");
        if (stringArrayList != null) {
            hashSet.clear();
            hashSet.addAll(stringArrayList);
        }
    }

    @Override // com.spotify.libs.search.history.k
    public s81 a(SearchHistoryItem searchHistoryItem, int i, String str, boolean z) {
        q81 q81;
        s81.a aVar;
        s81.a c = z81.c();
        StringBuilder V0 = je.V0("search-history-");
        V0.append(searchHistoryItem.getTargetUri());
        s81.a s = c.s(V0.toString());
        String componentId = searchHistoryItem.getComponentId();
        String componentCategory = searchHistoryItem.getComponentCategory();
        if (MoreObjects.isNullOrEmpty(componentId) || MoreObjects.isNullOrEmpty(componentCategory)) {
            q81 = new z24(searchHistoryItem);
        } else {
            q81 = z81.d(componentId, componentCategory);
        }
        s81.a c2 = s.n(q81).y(z81.h().a(searchHistoryItem.getTitle()).d(searchHistoryItem.getSubtitle())).t(z81.f().g(h71.c(z81.e().g(searchHistoryItem.getImageUri()).c(), searchHistoryItem.getTargetUri()))).c(a.a(false));
        boolean isExplicit = searchHistoryItem.isExplicit();
        boolean isMogef19 = searchHistoryItem.isMogef19();
        if (isMogef19) {
            c2 = c2.k("is19plus", Boolean.TRUE);
        }
        if (l0.b(searchHistoryItem.getOriginUri(), LinkType.TRACK)) {
            String str2 = (String) x.n(searchHistoryItem.getPreviewId(), "");
            String c3 = rqa.c(str2, Context.Metadata.SHUFFLE_ALGORITHM_HISTORY);
            aVar = rqa.b(c2, c3).k("preview_id", str2).f("click", i24.a(str, str2, c3, isExplicit, isMogef19)).f("imageClick", i24.a(str, str2, c3, isExplicit, isMogef19)).f("rightAccessoryClick", z81.b().e("ac:addToPlaylistFromHistory").b("uri", str).b("position", Integer.valueOf(i)).c());
        } else {
            o81.a e = z81.b().e("ac:navigateFromHistory");
            str.getClass();
            aVar = c2.f("click", e.b("uri", str).b("position", Integer.valueOf(i)).c());
        }
        if (isExplicit) {
            aVar = aVar.c(z81.a().p("label", "explicit").d());
        }
        return aVar.c(w.a(searchHistoryItem.shouldAppearDisabled())).l();
    }

    @Override // com.spotify.libs.search.history.j
    public boolean b(SearchHistoryItem searchHistoryItem) {
        return !this.a.contains(searchHistoryItem.getTargetUri());
    }
}
