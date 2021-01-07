package com.spotify.music.autoplay;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

public final /* synthetic */ class h implements n {
    public final /* synthetic */ RadioSeedBundle a;

    public /* synthetic */ h(RadioSeedBundle radioSeedBundle) {
        this.a = radioSeedBundle;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return !((PlayerState) obj).contextUri().contains(this.a.getRadioSeed());
    }
}
