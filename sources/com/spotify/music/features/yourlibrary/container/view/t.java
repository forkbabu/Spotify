package com.spotify.music.features.yourlibrary.container.view;

import androidx.fragment.app.o;
import com.spotify.mobile.android.ui.fragments.logic.k;
import com.spotify.music.features.yourlibrary.container.utils.l;
import defpackage.ifd;

public final class t implements fjf<s> {
    private final wlf<o> a;
    private final wlf<k> b;
    private final wlf<w09> c;
    private final wlf<ifd.b> d;
    private final wlf<zpd> e;
    private final wlf<l> f;

    public t(wlf<o> wlf, wlf<k> wlf2, wlf<w09> wlf3, wlf<ifd.b> wlf4, wlf<zpd> wlf5, wlf<l> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
