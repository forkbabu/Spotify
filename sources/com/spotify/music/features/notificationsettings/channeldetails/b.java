package com.spotify.music.features.notificationsettings.channeldetails;

import android.app.Activity;

public final class b implements fjf<ChannelDetailsAdapter> {
    private final wlf<Activity> a;
    private final wlf<x> b;

    public b(wlf<Activity> wlf, wlf<x> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ChannelDetailsAdapter(this.a.get(), this.b.get());
    }
}
