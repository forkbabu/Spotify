package com.spotify.music.features.yourlibrary.container.utils;

import androidx.fragment.app.Fragment;

public final class p implements fjf<o> {
    private final wlf<ys2> a;
    private final wlf<Fragment> b;
    private final wlf<zpd> c;

    public p(wlf<ys2> wlf, wlf<Fragment> wlf2, wlf<zpd> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o(this.a.get(), this.b.get(), this.c.get());
    }
}
