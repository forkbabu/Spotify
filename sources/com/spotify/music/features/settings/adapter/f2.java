package com.spotify.music.features.settings.adapter;

import com.spotify.music.settings.SettingsState;

public final /* synthetic */ class f2 implements sg0 {
    public static final /* synthetic */ f2 a = new f2();

    private /* synthetic */ f2() {
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SettingsState) obj).privateSession());
    }
}
