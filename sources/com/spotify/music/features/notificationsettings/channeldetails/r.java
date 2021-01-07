package com.spotify.music.features.notificationsettings.channeldetails;

public final class r implements fjf<q> {
    private final wlf<ChannelDetailsInjector> a;
    private final wlf<ChannelDetailsAdapter> b;

    public r(wlf<ChannelDetailsInjector> wlf, wlf<ChannelDetailsAdapter> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q(this.a, this.b);
    }
}
