package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

public final /* synthetic */ class u1 implements n {
    public static final /* synthetic */ u1 a = new u1();

    private /* synthetic */ u1() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        int i = e4.D;
        return !((PlayerState) obj).isPaused();
    }
}
