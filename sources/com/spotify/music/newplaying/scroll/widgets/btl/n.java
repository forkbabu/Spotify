package com.spotify.music.newplaying.scroll.widgets.btl;

public final class n implements fjf<i> {
    private final wlf<l> a;
    private final wlf<qlb> b;
    private final wlf<nk2> c;

    public n(wlf<l> wlf, wlf<qlb> wlf2, wlf<nk2> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i(this.a.get(), this.b.get(), this.c.get());
    }
}
