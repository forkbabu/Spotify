package com.spotify.music.libs.connect;

public final class t implements fjf<s> {
    private final wlf<uba> a;

    public t(wlf<uba> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s(this.a.get());
    }
}
