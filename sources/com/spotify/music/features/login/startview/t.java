package com.spotify.music.features.login.startview;

import com.spotify.libs.pse.model.a;

public final class t implements fjf<s> {
    private final wlf<a> a;

    public t(wlf<a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s(this.a.get());
    }
}
