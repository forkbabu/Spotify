package com.spotify.music.homecomponents.experimental.inlineonboarding.header;

import com.spotify.music.libs.viewuri.c;
import com.spotify.music.loggers.ImpressionLogger;

public final class e implements fjf<HomeInlineOnboardingDoneButtonLogger> {
    private final wlf<jz1> a;
    private final wlf<ImpressionLogger> b;
    private final wlf<ifd> c;
    private final wlf<c> d;
    private final wlf<cqe> e;

    public e(wlf<jz1> wlf, wlf<ImpressionLogger> wlf2, wlf<ifd> wlf3, wlf<c> wlf4, wlf<cqe> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static e a(wlf<jz1> wlf, wlf<ImpressionLogger> wlf2, wlf<ifd> wlf3, wlf<c> wlf4, wlf<cqe> wlf5) {
        return new e(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new HomeInlineOnboardingDoneButtonLogger(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
