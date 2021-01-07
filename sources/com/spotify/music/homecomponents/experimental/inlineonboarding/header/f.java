package com.spotify.music.homecomponents.experimental.inlineonboarding.header;

import androidx.lifecycle.n;
import io.reactivex.y;

public final class f implements fjf<HomeInlineOnboardingHeaderCommandHandler> {
    private final wlf<y> a;
    private final wlf<lq8> b;
    private final wlf<n> c;
    private final wlf<HomeInlineOnboardingDoneButtonLogger> d;
    private final wlf<hha> e;

    public f(wlf<y> wlf, wlf<lq8> wlf2, wlf<n> wlf3, wlf<HomeInlineOnboardingDoneButtonLogger> wlf4, wlf<hha> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static f a(wlf<y> wlf, wlf<lq8> wlf2, wlf<n> wlf3, wlf<HomeInlineOnboardingDoneButtonLogger> wlf4, wlf<hha> wlf5) {
        return new f(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new HomeInlineOnboardingHeaderCommandHandler(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
