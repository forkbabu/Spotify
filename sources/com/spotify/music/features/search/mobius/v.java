package com.spotify.music.features.search.mobius;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.libs.search.history.SearchHistoryItem;
import com.spotify.libs.search.history.j;
import com.spotify.libs.search.history.k;
import com.spotify.mobile.android.hubframework.defaults.components.custom.a;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentIdentifier;
import com.spotify.mobile.android.util.x;
import defpackage.s81;

public class v implements j, k {
    @Override // com.spotify.libs.search.history.k
    public s81 a(SearchHistoryItem searchHistoryItem, int i, String str, boolean z) {
        String componentId = searchHistoryItem.getComponentId();
        HubsGlueRow hubsGlueRow = HubsGlueRow.NORMAL;
        HubsImmutableComponentIdentifier d = z81.d((String) x.n(componentId, hubsGlueRow.id()), (String) x.n(searchHistoryItem.getComponentCategory(), hubsGlueRow.category()));
        s81.a c = z81.c();
        StringBuilder V0 = je.V0("search-history-");
        V0.append(searchHistoryItem.getTargetUri());
        s81.a f = c.s(V0.toString()).n(d).y(z81.h().a(searchHistoryItem.getTitle()).d(searchHistoryItem.getSubtitle())).t(z81.f().g(h71.c(z81.e().g(searchHistoryItem.getImageUri()).c(), searchHistoryItem.getTargetUri()))).f("click", d71.a(str));
        String originUri = searchHistoryItem.getOriginUri();
        originUri.getClass();
        return f.f("rightAccessoryClick", z81.b().e("removeHistoryItem").b("uri", originUri).b("position", Integer.valueOf(i)).c()).d("secondary_icon", SpotifyIconV2.X.toString()).c(a.a(false)).l();
    }

    @Override // com.spotify.libs.search.history.j
    public boolean b(SearchHistoryItem searchHistoryItem) {
        return true;
    }
}
