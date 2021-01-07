package com.spotify.inappmessaging.display;

import androidx.fragment.app.Fragment;

public final class g implements fjf<m> {
    private final wlf<o> a;
    private final wlf<n> b;
    private final wlf<Fragment> c;

    public g(wlf<o> wlf, wlf<n> wlf2, wlf<Fragment> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m(this.a.get(), this.b.get(), this.c.get().R2().getDisplayMetrics().density);
    }
}
