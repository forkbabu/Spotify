package com.spotify.music.nowplaying.musicvideotoggle.widget;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ MusicVideoToggleHandlerImpl a;

    public /* synthetic */ c(MusicVideoToggleHandlerImpl musicVideoToggleHandlerImpl) {
        this.a = musicVideoToggleHandlerImpl;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        MusicVideoToggleHandlerImpl.g(this.a, (PlayerState) obj);
    }
}
