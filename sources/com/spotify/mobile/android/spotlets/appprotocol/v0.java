package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class v0 implements l {
    public static final /* synthetic */ v0 a = new v0();

    private /* synthetic */ v0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return AppProtocol.Repeat.getNextRepeatMode((PlayerState) obj);
    }
}
