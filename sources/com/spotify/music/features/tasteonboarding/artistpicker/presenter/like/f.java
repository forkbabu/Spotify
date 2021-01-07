package com.spotify.music.features.tasteonboarding.artistpicker.presenter.like;

import com.spotify.mobile.android.util.ui.k;
import com.spotify.music.features.tasteonboarding.c;
import io.reactivex.y;

public final class f implements fjf<e> {
    private final wlf<t8a> a;
    private final wlf<c> b;
    private final wlf<y> c;
    private final wlf<fq8> d;
    private final wlf<Boolean> e;
    private final wlf<k> f;

    public f(wlf<t8a> wlf, wlf<c> wlf2, wlf<y> wlf3, wlf<fq8> wlf4, wlf<Boolean> wlf5, wlf<k> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get().booleanValue(), this.f.get());
    }
}
