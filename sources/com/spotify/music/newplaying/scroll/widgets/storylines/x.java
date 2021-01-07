package com.spotify.music.newplaying.scroll.widgets.storylines;

public final class x implements fjf<w> {
    private final wlf<sjd> a;
    private final wlf<djd> b;

    public x(wlf<sjd> wlf, wlf<djd> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w(this.a.get(), this.b.get());
    }
}
