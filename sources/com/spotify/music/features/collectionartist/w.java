package com.spotify.music.features.collectionartist;

import com.spotify.music.settings.SettingsState;
import io.reactivex.functions.l;

public final /* synthetic */ class w implements l {
    public static final /* synthetic */ w a = new w();

    private /* synthetic */ w() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SettingsState) obj).showUnavailableTracks());
    }
}
