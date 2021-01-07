package com.spotify.music.features.yourlibrary.musicpages.prefs;

import com.google.common.base.MoreObjects;
import io.reactivex.functions.n;

public final /* synthetic */ class c implements n {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        int i = MusicPagesPrefs.u;
        return !MoreObjects.isNullOrEmpty((String) obj);
    }
}
