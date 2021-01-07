package com.spotify.music.features.notificationsettings.channels;

import android.app.Activity;

public final class b implements fjf<ChannelsAdapter> {
    private final wlf<Activity> a;
    private final wlf<w> b;

    public b(wlf<Activity> wlf, wlf<w> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ChannelsAdapter(this.a.get(), this.b.get());
    }
}
