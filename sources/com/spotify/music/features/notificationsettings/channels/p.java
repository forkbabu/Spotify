package com.spotify.music.features.notificationsettings.channels;

public final class p implements fjf<o> {
    private final wlf<ChannelsInjector> a;
    private final wlf<ChannelsAdapter> b;

    public p(wlf<ChannelsInjector> wlf, wlf<ChannelsAdapter> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o(this.a, this.b);
    }
}
