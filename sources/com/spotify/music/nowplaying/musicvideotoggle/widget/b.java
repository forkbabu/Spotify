package com.spotify.music.nowplaying.musicvideotoggle.widget;

import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ MusicVideoToggleHandlerImpl a;

    public /* synthetic */ b(MusicVideoToggleHandlerImpl musicVideoToggleHandlerImpl) {
        this.a = musicVideoToggleHandlerImpl;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        MusicVideoToggleHandlerImpl musicVideoToggleHandlerImpl = this.a;
        musicVideoToggleHandlerImpl.getClass();
        if (((Boolean) obj).booleanValue()) {
            musicVideoToggleHandlerImpl.d();
        }
    }
}
