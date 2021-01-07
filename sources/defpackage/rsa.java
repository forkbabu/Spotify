package defpackage;

import com.spotify.libs.search.history.SearchHistoryItem;

/* renamed from: rsa  reason: default package */
public class rsa implements oqa<SearchHistoryItem> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.oqa
    public boolean a(SearchHistoryItem searchHistoryItem) {
        return searchHistoryItem.isExplicit();
    }
}
