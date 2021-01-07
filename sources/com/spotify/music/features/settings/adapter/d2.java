package com.spotify.music.features.settings.adapter;

import com.spotify.music.settings.SettingsState;

public final /* synthetic */ class d2 implements sg0 {
    public static final /* synthetic */ d2 a = new d2();

    private /* synthetic */ d2() {
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        return Integer.valueOf(((SettingsState) obj).streamQuality());
    }
}
