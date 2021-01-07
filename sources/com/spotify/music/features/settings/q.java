package com.spotify.music.features.settings;

import io.reactivex.functions.g;

public final /* synthetic */ class q implements g {
    public final /* synthetic */ SettingsFragment a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ q(SettingsFragment settingsFragment, boolean z) {
        this.a = settingsFragment;
        this.b = z;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.f5(this.b, (Throwable) obj);
    }
}
