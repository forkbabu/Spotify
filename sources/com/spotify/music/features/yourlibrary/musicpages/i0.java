package com.spotify.music.features.yourlibrary.musicpages;

import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import io.reactivex.functions.g;

public final /* synthetic */ class i0 implements g {
    public final /* synthetic */ MusicPagesLogger a;

    public /* synthetic */ i0(MusicPagesLogger musicPagesLogger) {
        this.a = musicPagesLogger;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.D((r0.z) obj);
    }
}
