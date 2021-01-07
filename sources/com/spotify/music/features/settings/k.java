package com.spotify.music.features.settings;

import com.google.common.base.MoreObjects;
import io.reactivex.functions.g;

public final /* synthetic */ class k implements g {
    public final /* synthetic */ SettingsFragment a;

    public /* synthetic */ k(SettingsFragment settingsFragment) {
        this.a = settingsFragment;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        SettingsFragment settingsFragment = this.a;
        u3 u3Var = (u3) obj;
        settingsFragment.getClass();
        F f = u3Var.a;
        f.getClass();
        F f2 = f;
        S s = u3Var.b;
        if (s == null) {
            settingsFragment.u0.setText(f2);
            settingsFragment.R0.a(settingsFragment.v0, null, f2, null, false, null);
            return;
        }
        String d = dqa.d(s);
        settingsFragment.u0.setText((String) MoreObjects.firstNonNull(s.n().i(), s.o().i()));
        settingsFragment.R0.a(settingsFragment.v0, d, s.o().i(), s.n().i(), false, null);
    }
}
