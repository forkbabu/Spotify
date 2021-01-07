package com.spotify.music.homecomponents.experimental.inlineonboarding.header;

import androidx.lifecycle.n;

public final class h implements fjf<g> {
    private final wlf<aq9> a;
    private final wlf<n> b;
    private final wlf<HomeInlineOnboardingDoneButtonLogger> c;

    public h(wlf<aq9> wlf, wlf<n> wlf2, wlf<HomeInlineOnboardingDoneButtonLogger> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get(), this.b.get(), this.c.get());
    }
}
