package com.spotify.music.podcast.speedcontrol;

public final class d implements fjf<y32> {
    private final wlf<ooc> a;
    private final wlf<moc> b;

    public d(wlf<ooc> wlf, wlf<moc> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new y32(this.a.get(), this.b.get());
    }
}
