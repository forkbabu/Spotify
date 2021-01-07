package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class m3 implements l {
    public static final /* synthetic */ m3 a = new m3();

    private /* synthetic */ m3() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((PlayerState) obj).track();
    }
}
