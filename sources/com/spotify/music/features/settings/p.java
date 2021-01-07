package com.spotify.music.features.settings;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.g;

public final /* synthetic */ class p implements g {
    public final /* synthetic */ SettingsFragment a;

    public /* synthetic */ p(SettingsFragment settingsFragment) {
        this.a = settingsFragment;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.U4((SessionState) obj);
    }
}
