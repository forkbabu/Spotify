package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsAllboardingProperties;
import com.spotify.remoteconfig.ye;

public final /* synthetic */ class x0 implements o0e {
    public static final /* synthetic */ x0 a = new x0();

    private /* synthetic */ x0() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        AndroidLibsAllboardingProperties.LoadingAnimation loadingAnimation = AndroidLibsAllboardingProperties.LoadingAnimation.UNKNOWN;
        ye.b bVar = new ye.b();
        bVar.b(loadingAnimation);
        bVar.b((AndroidLibsAllboardingProperties.LoadingAnimation) p0e.b("android-libs-allboarding", "loading_animation", loadingAnimation));
        return bVar.a();
    }
}
