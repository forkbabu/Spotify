package com.spotify.music.features.yourlibrary.musicpages;

import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import io.reactivex.functions.g;

public final /* synthetic */ class w implements g {
    public final /* synthetic */ MusicPagesLogger a;

    public /* synthetic */ w(MusicPagesLogger musicPagesLogger) {
        this.a = musicPagesLogger;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.s((r0.o) obj);
    }
}
