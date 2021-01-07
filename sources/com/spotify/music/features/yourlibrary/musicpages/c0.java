package com.spotify.music.features.yourlibrary.musicpages;

import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import io.reactivex.functions.g;

public final /* synthetic */ class c0 implements g {
    public final /* synthetic */ MusicPagesLogger a;

    public /* synthetic */ c0(MusicPagesLogger musicPagesLogger) {
        this.a = musicPagesLogger;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        r0.j jVar = (r0.j) obj;
        this.a.f();
    }
}
