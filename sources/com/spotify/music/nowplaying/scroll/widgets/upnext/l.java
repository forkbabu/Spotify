package com.spotify.music.nowplaying.scroll.widgets.upnext;

public final class l implements fjf<b> {
    private final wlf<i> a;
    private final wlf<qlb> b;
    private final wlf<f4c> c;

    public l(wlf<i> wlf, wlf<qlb> wlf2, wlf<f4c> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get(), this.b.get(), this.c.get());
    }
}
