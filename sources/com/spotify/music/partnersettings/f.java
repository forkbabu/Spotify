package com.spotify.music.partnersettings;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.extras.b;
import com.spotify.mobius.rx2.i;

public final class f implements fjf<MobiusLoop.h<ddc, bdc, adc>> {
    private final wlf<mdc> a;
    private final wlf<tdc> b;

    public f(wlf<mdc> wlf, wlf<tdc> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        MobiusLoop.f f = i.c(a.a, this.a.get().a()).e(c.a).h(this.b.get().b()).f(b.g("Settings Feature"));
        yif.g(f, "Cannot return null from a non-@Nullable @Provides method");
        return f;
    }
}
