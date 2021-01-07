package com.spotify.remoteconfig;

import com.spotify.remoteconfig.sd;

public abstract class v5 implements n0e {

    public static abstract class a {
        public abstract v5 a();

        public abstract a b(boolean z);
    }

    public static v5 a(p0e p0e) {
        boolean a2 = p0e.a("android-feature-free-tier-taste-onboarding", "taste_onboarding_skip_when_deeplink", false);
        boolean a3 = p0e.a("android-feature-free-tier-taste-onboarding", "to_extended_search", true);
        sd.b bVar = new sd.b();
        bVar.c(false);
        bVar.b(true);
        bVar.c(a2);
        bVar.b(a3);
        return bVar.a();
    }

    public abstract boolean b();

    public abstract boolean c();
}
