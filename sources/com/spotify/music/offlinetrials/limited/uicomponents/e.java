package com.spotify.music.offlinetrials.limited.uicomponents;

import com.spotify.music.limitedofflineendpoints.api.UserMixDataSource;
import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ r a;
    public final /* synthetic */ String b;

    public /* synthetic */ e(r rVar, String str) {
        this.a = rVar;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d(this.b, (UserMixDataSource.TrackState) obj);
    }
}
