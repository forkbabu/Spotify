package com.spotify.music.features.notificationsettings.channels;

import com.spotify.music.navigation.t;
import com.spotify.ubi.specification.factories.t1;

public final class j implements fjf<ChannelsInjector> {
    private final wlf<t> a;
    private final wlf<w> b;
    private final wlf<t1> c;
    private final wlf<ere> d;

    public j(wlf<t> wlf, wlf<w> wlf2, wlf<t1> wlf3, wlf<ere> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ChannelsInjector(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
