package com.spotify.music.spotlets.apprater;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class h implements l {
    public static final /* synthetic */ h a = new h();

    private /* synthetic */ h() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((PlayerState) obj).track();
    }
}
