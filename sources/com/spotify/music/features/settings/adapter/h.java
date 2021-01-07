package com.spotify.music.features.settings.adapter;

import com.spotify.music.settings.SettingsState;

public final /* synthetic */ class h implements sg0 {
    public static final /* synthetic */ h a = new h();

    private /* synthetic */ h() {
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        return Integer.valueOf(((SettingsState) obj).streamNonMeteredQuality());
    }
}
