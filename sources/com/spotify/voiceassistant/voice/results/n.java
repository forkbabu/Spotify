package com.spotify.voiceassistant.voice.results;

public final class n implements fjf<m> {
    private final wlf<ere> a;
    private final wlf<o> b;

    public n(wlf<ere> wlf, wlf<o> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m(this.a.get(), this.b.get());
    }
}
