package com.spotify.music.features.listeninghistory.datasource;

import com.spotify.music.features.listeninghistory.datasource.ListeningHistoryDataSource;
import io.reactivex.z;
import kotlin.jvm.internal.h;

public final class a implements ListeningHistoryDataSource {
    private final c a;
    private final tm5 b;

    public a(c cVar, tm5 tm5) {
        h.e(cVar, "endpoint");
        h.e(tm5, "eventTransformer");
        this.a = cVar;
        this.b = tm5;
    }

    @Override // com.spotify.music.features.listeninghistory.datasource.ListeningHistoryDataSource
    public z<b91> a(Long l, ListeningHistoryDataSource.HistoryType historyType) {
        String str;
        h.e(historyType, "type");
        c cVar = this.a;
        if (l == null || (str = String.valueOf(l.longValue())) == null) {
            str = "";
        }
        z<R> f = cVar.a(str, historyType.name()).e(b91.class).f(this.b);
        h.d(f, "endpoint\n            .ge…compose(eventTransformer)");
        return f;
    }
}
