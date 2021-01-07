package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class p3 implements l {
    public static final /* synthetic */ p3 a = new p3();

    private /* synthetic */ p3() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return AppProtocol.TrackData.trackDataFor((PlayerState) obj);
    }
}
