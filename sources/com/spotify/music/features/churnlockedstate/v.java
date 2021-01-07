package com.spotify.music.features.churnlockedstate;

import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.y;

public final class v implements fjf<u> {
    private final wlf<w> a;
    private final wlf<SpSharedPreferences<Object>> b;
    private final wlf<y> c;
    private final wlf<cqe> d;

    public v(wlf<w> wlf, wlf<SpSharedPreferences<Object>> wlf2, wlf<y> wlf3, wlf<cqe> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
