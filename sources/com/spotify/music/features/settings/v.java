package com.spotify.music.features.settings;

import io.reactivex.functions.g;

public final /* synthetic */ class v implements g {
    public final /* synthetic */ SettingsFragment a;
    public final /* synthetic */ int b;

    public /* synthetic */ v(SettingsFragment settingsFragment, int i) {
        this.a = settingsFragment;
        this.b = i;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.W4(this.b, (Throwable) obj);
    }
}
