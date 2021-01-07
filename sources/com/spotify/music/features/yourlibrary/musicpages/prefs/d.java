package com.spotify.music.features.yourlibrary.musicpages.prefs;

import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.m;
import io.reactivex.functions.n;

public final /* synthetic */ class d implements n {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        int i = MusicPagesPrefs.u;
        return ((m) obj).d().isPresent();
    }
}
