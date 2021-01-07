package com.spotify.music.nowplaying.musicvideotoggle.widget;

import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ MusicVideoToggleHandlerImpl a;

    public /* synthetic */ d(MusicVideoToggleHandlerImpl musicVideoToggleHandlerImpl) {
        this.a = musicVideoToggleHandlerImpl;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.h((zwd) obj);
    }
}
