package defpackage;

import com.spotify.libs.search.history.SearchHistoryItem;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;

/* renamed from: z24  reason: default package */
final class z24 implements q81 {
    final /* synthetic */ SearchHistoryItem a;

    z24(SearchHistoryItem searchHistoryItem) {
        this.a = searchHistoryItem;
    }

    @Override // defpackage.q81
    public String category() {
        return HubsGlueRow.NORMAL.category();
    }

    @Override // defpackage.q81
    public String id() {
        SearchHistoryItem searchHistoryItem = this.a;
        searchHistoryItem.getClass();
        if (l0.b(searchHistoryItem.getOriginUri(), LinkType.TRACK)) {
            return "ac:track";
        }
        return HubsGlueRow.NORMAL.id();
    }
}
