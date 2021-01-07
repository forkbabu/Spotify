package com.spotify.music.lyrics.fullscreen;

import com.spotify.music.lyrics.core.experience.rx.LyricsEventPublisher;
import io.reactivex.functions.g;

public final /* synthetic */ class j implements g {
    public final /* synthetic */ t a;

    public /* synthetic */ j(t tVar) {
        this.a = tVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b((LyricsEventPublisher.a) obj);
    }
}
