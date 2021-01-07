package com.spotify.music.samsungpersonalization;

import androidx.fragment.app.Fragment;
import com.spotify.music.samsungpersonalization.customization.c;

public final class d implements fjf<c> {
    private final wlf<Fragment> a;
    private final wlf<pyc> b;
    private final wlf<c> c;

    public d(wlf<Fragment> wlf, wlf<pyc> wlf2, wlf<c> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get(), this.c.get());
    }
}
