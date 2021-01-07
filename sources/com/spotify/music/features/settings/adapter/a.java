package com.spotify.music.features.settings.adapter;

import com.spotify.music.settings.SettingsState;

public final /* synthetic */ class a implements sg0 {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SettingsState) obj).downloadOver3g());
    }
}
