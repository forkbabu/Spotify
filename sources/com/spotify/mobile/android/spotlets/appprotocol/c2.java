package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class c2 implements l {
    public static final /* synthetic */ c2 a = new c2();

    private /* synthetic */ c2() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = e4.D;
        return new AppProtocol.Shuffle(!((PlayerState) obj).options().shufflingContext());
    }
}
