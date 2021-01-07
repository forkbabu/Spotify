package com.spotify.music.lyrics.fullscreen;

import com.spotify.music.lyrics.core.experience.rx.LyricsEventPublisher;
import io.reactivex.functions.g;

public final /* synthetic */ class i implements g {
    public final /* synthetic */ t a;

    public /* synthetic */ i(t tVar) {
        this.a = tVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a((LyricsEventPublisher.a) obj);
    }
}
