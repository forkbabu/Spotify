package com.spotify.music.homecomponents.promotionv2;

import com.spotify.mobile.android.util.ui.k;
import com.spotify.player.model.PlayerState;
import com.squareup.picasso.Picasso;
import io.reactivex.g;
import io.reactivex.y;

public final class i implements fjf<h> {
    private final wlf<Picasso> a;
    private final wlf<g<PlayerState>> b;
    private final wlf<y> c;
    private final wlf<k> d;
    private final wlf<w50> e;

    public i(wlf<Picasso> wlf, wlf<g<PlayerState>> wlf2, wlf<y> wlf3, wlf<k> wlf4, wlf<w50> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static i a(wlf<Picasso> wlf, wlf<g<PlayerState>> wlf2, wlf<y> wlf3, wlf<k> wlf4, wlf<w50> wlf5) {
        return new i(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
