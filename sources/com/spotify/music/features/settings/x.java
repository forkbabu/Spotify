package com.spotify.music.features.settings;

import com.google.common.base.Optional;
import io.reactivex.functions.l;
import io.reactivex.s;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class x implements l {
    public final /* synthetic */ SettingsFragment a;

    public /* synthetic */ x(SettingsFragment settingsFragment) {
        this.a = settingsFragment;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        SettingsFragment settingsFragment = this.a;
        String str = (String) obj;
        u3 u3Var = new u3(str, null);
        return s.n(settingsFragment.Q0.a(str).j0(new u(str)).r0(new j(u3Var)).j0(b.a).G0((R) Optional.absent()), s.s(s.i0(Optional.absent()), s.i0(Optional.of(u3Var)).C(100, TimeUnit.MILLISECONDS, settingsFragment.W0)), d0.a).Q(c.a).j0(l0.a);
    }
}
