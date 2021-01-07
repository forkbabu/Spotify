package com.spotify.music.autoplay;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class j implements l {
    public final /* synthetic */ RadioSeedBundle a;

    public /* synthetic */ j(RadioSeedBundle radioSeedBundle) {
        this.a = radioSeedBundle;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return new u3((PlayerState) obj, this.a);
    }
}
