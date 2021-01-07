package com.spotify.music.features.connectui.picker.contextmenu;

import com.spotify.music.features.connectui.picker.legacy.util.d;

public final class o implements fjf<n> {
    private final wlf<k> a;
    private final wlf<d> b;
    private final wlf<f> c;
    private final wlf<wr0> d;
    private final wlf<i> e;

    public o(wlf<k> wlf, wlf<d> wlf2, wlf<f> wlf3, wlf<wr0> wlf4, wlf<i> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
