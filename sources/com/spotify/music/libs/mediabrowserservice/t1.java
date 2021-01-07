package com.spotify.music.libs.mediabrowserservice;

import java.util.Set;

public final class t1 implements fjf<s1> {
    private final wlf<Set<u1>> a;

    public t1(wlf<Set<u1>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s1(this.a.get());
    }
}
