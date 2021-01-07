package com.spotify.music.features.home.experimental;

import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.s;

public final class d implements fjf<hl5> {
    private final wlf<pf5> a;
    private final wlf<s<RecentlyPlayedItems>> b;
    private final wlf<li5> c;

    public d(wlf<pf5> wlf, wlf<s<RecentlyPlayedItems>> wlf2, wlf<li5> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hl5(this.a.get(), this.b.get(), this.c.get());
    }
}
