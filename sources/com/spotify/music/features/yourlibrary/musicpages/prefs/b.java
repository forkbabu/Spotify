package com.spotify.music.features.yourlibrary.musicpages.prefs;

import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.m;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ MusicPagesPrefs a;

    public /* synthetic */ b(MusicPagesPrefs musicPagesPrefs) {
        this.a = musicPagesPrefs;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.g((m) obj);
    }
}
