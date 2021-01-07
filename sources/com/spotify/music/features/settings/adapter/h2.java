package com.spotify.music.features.settings.adapter;

import com.spotify.music.settings.SettingsState;

public final /* synthetic */ class h2 implements sg0 {
    public static final /* synthetic */ h2 a = new h2();

    private /* synthetic */ h2() {
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SettingsState) obj).silenceTrimmer());
    }
}
