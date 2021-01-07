package com.spotify.music.features.settings.adapter;

import com.spotify.music.settings.SettingsState;

public final /* synthetic */ class b implements sg0 {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SettingsState) obj).gapless());
    }
}
