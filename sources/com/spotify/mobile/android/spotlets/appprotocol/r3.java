package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class r3 implements l {
    public static final /* synthetic */ r3 a = new r3();

    private /* synthetic */ r3() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return new AppProtocol.Shuffle((PlayerState) obj);
    }
}
