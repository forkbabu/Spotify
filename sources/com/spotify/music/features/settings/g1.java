package com.spotify.music.features.settings;

public final class g1 implements fjf<sv3> {
    private final wlf<SettingsFragment> a;
    private final wlf<w52> b;
    private final wlf<qv3> c;

    public g1(wlf<SettingsFragment> wlf, wlf<w52> wlf2, wlf<qv3> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new sv3(this.a.get(), this.b.get(), this.c.get());
    }
}
