package com.spotify.music.features.listeninghistory.datasource;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.listeninghistory.datasource.ListeningHistoryDataSource;
import kotlin.jvm.internal.h;

public final class e implements d {
    private static final SpSharedPreferences.b<Object, String> b = SpSharedPreferences.b.e("listening_history_last_filter");
    private final SpSharedPreferences<Object> a;

    public e(SpSharedPreferences<Object> spSharedPreferences) {
        h.e(spSharedPreferences, "sharedPreferences");
        this.a = spSharedPreferences;
    }

    @Override // com.spotify.music.features.listeninghistory.datasource.d
    public void a(ListeningHistoryDataSource.HistoryType historyType) {
        h.e(historyType, "type");
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.f(b, historyType.name());
        b2.i();
    }

    @Override // com.spotify.music.features.listeninghistory.datasource.d
    public ListeningHistoryDataSource.HistoryType getFilter() {
        ListeningHistoryDataSource.HistoryType historyType = ListeningHistoryDataSource.HistoryType.GROUP;
        String m = this.a.m(b, "");
        ListeningHistoryDataSource.HistoryType historyType2 = ListeningHistoryDataSource.HistoryType.ITEM;
        if (!h.a(m, historyType2.name())) {
            historyType2 = h.a(m, historyType.name()) ? historyType : null;
        }
        return historyType2 != null ? historyType2 : historyType;
    }
}
