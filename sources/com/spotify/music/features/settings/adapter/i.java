package com.spotify.music.features.settings.adapter;

import com.spotify.music.settings.SettingsState;

public final /* synthetic */ class i implements sg0 {
    public static final /* synthetic */ i a = new i();

    private /* synthetic */ i() {
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SettingsState) obj).automix());
    }
}
