package com.spotify.effortlesslogin;

import com.spotify.login.r0;

public final class t implements fjf<s> {
    private final wlf<r0> a;

    public t(wlf<r0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s(this.a.get());
    }
}
