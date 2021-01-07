package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class k3 implements l {
    public static final /* synthetic */ k3 a = new k3();

    private /* synthetic */ k3() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return new AppProtocol.Saved((PlayerState) obj);
    }
}
