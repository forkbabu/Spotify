package com.spotify.music.mainactivity;

import com.spotify.music.features.ads.screensaver.k0;
import kotlin.jvm.internal.h;

public class z {
    private final k0 a;
    private final nsb b;

    public z(k0 k0Var, nsb nsb) {
        h.e(k0Var, "pendingAdState");
        h.e(nsb, "nowPlayingViewNavigator");
        this.a = k0Var;
        this.b = nsb;
    }

    public void a() {
        if (!this.a.a()) {
            this.b.a();
        }
    }
}
