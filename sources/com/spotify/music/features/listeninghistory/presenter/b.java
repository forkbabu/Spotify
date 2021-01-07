package com.spotify.music.features.listeninghistory.presenter;

import android.content.Context;
import com.spotify.music.features.listeninghistory.datasource.ListeningHistoryDataSource;
import com.spotify.music.features.listeninghistory.datasource.d;
import io.reactivex.y;

public final class b implements fjf<ListeningHistoryPresenterImpl> {
    private final wlf<Context> a;
    private final wlf<y> b;
    private final wlf<y> c;
    private final wlf<cbc<rm5>> d;
    private final wlf<ListeningHistoryDataSource> e;
    private final wlf<d> f;

    public b(wlf<Context> wlf, wlf<y> wlf2, wlf<y> wlf3, wlf<cbc<rm5>> wlf4, wlf<ListeningHistoryDataSource> wlf5, wlf<d> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ListeningHistoryPresenterImpl(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
