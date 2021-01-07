package com.spotify.music.features.spoton;

import com.spotify.mobile.android.service.media.v1;
import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ SpotOnPlaybackManager a;

    public /* synthetic */ e(SpotOnPlaybackManager spotOnPlaybackManager) {
        this.a = spotOnPlaybackManager;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.j((v1) obj);
    }
}
