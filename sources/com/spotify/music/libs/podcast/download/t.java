package com.spotify.music.libs.podcast.download;

import com.spotify.music.settings.SettingsState;
import io.reactivex.functions.l;

public final /* synthetic */ class t implements l {
    public static final /* synthetic */ t a = new t();

    private /* synthetic */ t() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SettingsState) obj).downloadOver3g());
    }
}
