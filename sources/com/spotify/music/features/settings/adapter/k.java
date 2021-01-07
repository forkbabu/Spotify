package com.spotify.music.features.settings.adapter;

import com.spotify.music.settings.SettingsState;

public final /* synthetic */ class k implements sg0 {
    public static final /* synthetic */ k a = new k();

    private /* synthetic */ k() {
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SettingsState) obj).offlineMode());
    }
}
