package com.spotify.music.features.settings.adapter;

import com.spotify.music.settings.SettingsState;

public final /* synthetic */ class e2 implements sg0 {
    public static final /* synthetic */ e2 a = new e2();

    private /* synthetic */ e2() {
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        return Integer.valueOf(((SettingsState) obj).downloadQuality());
    }
}
