package com.spotify.music.offlinetrials.limited.uicomponents;

import com.spotify.music.limitedofflineendpoints.api.UserMixDataSource;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ r a;

    public /* synthetic */ c(r rVar) {
        this.a = rVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c((UserMixDataSource.TrackState) obj);
    }
}
