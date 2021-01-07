package com.spotify.music.libs.audio.focus;

public final class q implements fjf<p> {
    private final wlf<MediaFocusManager> a;

    public q(wlf<MediaFocusManager> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p(this.a.get());
    }
}
