package com.spotify.music.features.settings;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.g;

public final /* synthetic */ class o implements g {
    public final /* synthetic */ SettingsFragment a;

    public /* synthetic */ o(SettingsFragment settingsFragment) {
        this.a = settingsFragment;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d5((GaiaDevice) obj);
    }
}
