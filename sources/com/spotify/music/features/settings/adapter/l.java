package com.spotify.music.features.settings.adapter;

import com.spotify.music.settings.SettingsState;

public final /* synthetic */ class l implements sg0 {
    public static final /* synthetic */ l a = new l();

    private /* synthetic */ l() {
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        return Integer.valueOf(((SettingsState) obj).loudnessEnvironment());
    }
}
