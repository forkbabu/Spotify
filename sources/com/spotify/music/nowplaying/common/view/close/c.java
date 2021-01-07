package com.spotify.music.nowplaying.common.view.close;

public final class c implements fjf<b> {
    private final wlf<com.spotify.mobile.android.ui.activity.c> a;
    private final wlf<jqd> b;

    public c(wlf<com.spotify.mobile.android.ui.activity.c> wlf, wlf<jqd> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get(), this.b.get());
    }
}
