package com.spotify.music.podcast.speedcontrol;

public final class h implements fjf<g> {
    private final wlf<Boolean> a;
    private final wlf<Boolean> b;

    public h(wlf<Boolean> wlf, wlf<Boolean> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static g a(boolean z, boolean z2) {
        return new g(z, z2);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get().booleanValue(), this.b.get().booleanValue());
    }
}
