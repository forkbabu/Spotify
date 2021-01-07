package com.spotify.music.features.ads.screensaver;

import com.spotify.cosmos.router.Response;
import com.spotify.music.features.ads.model.AdSlot;
import io.reactivex.functions.g;

public final /* synthetic */ class y implements g {
    public static final /* synthetic */ y a = new y();

    private /* synthetic */ y() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Response response = (Response) obj;
        AdSlot.MOBILE_SCREENSAVER.setRegistered(true);
    }
}
