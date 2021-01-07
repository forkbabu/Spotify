package com.spotify.music.features.settings.adapter;

import com.spotify.music.settings.SettingsState;

public final /* synthetic */ class j implements sg0 {
    public static final /* synthetic */ j a = new j();

    private /* synthetic */ j() {
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SettingsState) obj).showUnavailableTracks());
    }
}
