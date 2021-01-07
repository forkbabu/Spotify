package com.spotify.music.mainactivity;

import com.spotify.music.MainActivity;
import com.spotify.music.navigation.j;
import com.spotify.music.navigation.m;

public final class q implements fjf<j> {
    private final wlf<MainActivity> a;
    private final wlf<com.spotify.music.navigation.q> b;

    public q(wlf<MainActivity> wlf, wlf<com.spotify.music.navigation.q> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m(new m(this.b.get()), new g(this.a.get()));
    }
}
