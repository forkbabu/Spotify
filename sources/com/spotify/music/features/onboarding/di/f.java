package com.spotify.music.features.onboarding.di;

import androidx.lifecycle.n;
import com.spotify.music.follow.m;

public final class f implements fjf<AllboardingFollowManagerImpl> {
    private final wlf<m> a;
    private final wlf<t8a> b;
    private final wlf<com.spotify.music.follow.resolver.f> c;
    private final wlf<n> d;

    public f(wlf<m> wlf, wlf<t8a> wlf2, wlf<com.spotify.music.follow.resolver.f> wlf3, wlf<n> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new AllboardingFollowManagerImpl(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
