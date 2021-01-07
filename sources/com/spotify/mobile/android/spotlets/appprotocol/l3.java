package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class l3 implements l {
    public static final /* synthetic */ l3 a = new l3();

    private /* synthetic */ l3() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return new AppProtocol.Repeat((PlayerState) obj);
    }
}
