package com.spotify.music.features.settings;

import io.reactivex.functions.a;

public final /* synthetic */ class f0 implements a {
    public final /* synthetic */ SettingsFragment a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ f0(SettingsFragment settingsFragment, boolean z) {
        this.a = settingsFragment;
        this.b = z;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.e5(this.b);
    }
}
