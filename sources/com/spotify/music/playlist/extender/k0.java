package com.spotify.music.playlist.extender;

public final class k0 implements fjf<Integer> {
    private final wlf<Integer> a;

    public k0(wlf<Integer> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Integer.valueOf(this.a.get().intValue() * 2);
    }
}
