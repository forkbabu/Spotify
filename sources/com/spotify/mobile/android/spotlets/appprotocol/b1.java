package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

public final /* synthetic */ class b1 implements n {
    public static final /* synthetic */ b1 a = new b1();

    private /* synthetic */ b1() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        int i = e4.D;
        return !((PlayerState) obj).isPaused();
    }
}
