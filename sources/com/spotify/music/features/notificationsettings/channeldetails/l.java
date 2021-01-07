package com.spotify.music.features.notificationsettings.channeldetails;

import com.spotify.music.notification.c;
import com.spotify.ubi.specification.factories.s1;
import io.reactivex.y;

public final class l implements fjf<ChannelDetailsInjector> {
    private final wlf<c> a;
    private final wlf<y> b;
    private final wlf<x> c;
    private final wlf<s1> d;
    private final wlf<ere> e;

    public l(wlf<c> wlf, wlf<y> wlf2, wlf<x> wlf3, wlf<s1> wlf4, wlf<ere> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ChannelDetailsInjector(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
