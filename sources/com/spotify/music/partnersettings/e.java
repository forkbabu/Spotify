package com.spotify.music.partnersettings;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.z;

public final class e implements fjf<MobiusLoop.g<ddc, bdc>> {
    private final wlf<MobiusLoop.h<ddc, bdc, adc>> a;

    public e(wlf<MobiusLoop.h<ddc, bdc, adc>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return z.b(this.a.get(), ddc.a, u92.b());
    }
}
