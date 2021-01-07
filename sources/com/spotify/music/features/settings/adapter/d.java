package com.spotify.music.features.settings.adapter;

import com.spotify.music.settings.SettingsState;

public final /* synthetic */ class d implements sg0 {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SettingsState) obj).playExplicitContent());
    }
}
