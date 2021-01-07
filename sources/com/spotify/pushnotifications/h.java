package com.spotify.pushnotifications;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

public final class h implements fjf<g> {
    private final wlf<i> a;
    private final wlf<o> b;
    private final wlf<yzd> c;
    private final wlf<SpSharedPreferences<Object>> d;
    private final wlf<cqe> e;

    public h(wlf<i> wlf, wlf<o> wlf2, wlf<yzd> wlf3, wlf<SpSharedPreferences<Object>> wlf4, wlf<cqe> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
