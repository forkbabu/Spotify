package com.spotify.music.libs.carmodeengine.util;

import com.spotify.music.libs.carmodeengine.settings.CarModeUserSettingsLogger;

public final class v implements fjf<CarModeAutoActivationAlteringLogicPlugin> {
    private final wlf<j4a> a;
    private final wlf<c6a> b;
    private final wlf<CarModeUserSettingsLogger> c;
    private final wlf<y> d;

    public v(wlf<j4a> wlf, wlf<c6a> wlf2, wlf<CarModeUserSettingsLogger> wlf3, wlf<y> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new CarModeAutoActivationAlteringLogicPlugin(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
