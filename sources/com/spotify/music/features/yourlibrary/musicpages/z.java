package com.spotify.music.features.yourlibrary.musicpages;

import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import io.reactivex.functions.g;

public final /* synthetic */ class z implements g {
    public final /* synthetic */ MusicPagesLogger a;

    public /* synthetic */ z(MusicPagesLogger musicPagesLogger) {
        this.a = musicPagesLogger;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.C((r0.y) obj);
    }
}
