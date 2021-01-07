package com.spotify.music.features.settings.adapter;

import com.spotify.music.settings.SettingsState;

public final /* synthetic */ class g2 implements sg0 {
    public static final /* synthetic */ g2 a = new g2();

    private /* synthetic */ g2() {
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SettingsState) obj).normalize());
    }
}
