package com.spotify.music.libs.mediabrowserservice;

import java.util.Set;

public final class w1 implements fjf<v1> {
    private final wlf<Set<u1>> a;

    public w1(wlf<Set<u1>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v1(this.a.get());
    }
}
