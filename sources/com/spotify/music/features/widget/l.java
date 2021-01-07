package com.spotify.music.features.widget;

import android.content.Context;
import com.spotify.mobile.android.service.o;
import com.spotify.player.model.PlayerState;
import com.squareup.picasso.Picasso;
import io.reactivex.g;
import io.reactivex.y;

public final class l implements fjf<k> {
    private final wlf<Context> a;
    private final wlf<i> b;
    private final wlf<g<PlayerState>> c;
    private final wlf<y> d;
    private final wlf<o> e;
    private final wlf<Picasso> f;

    public l(wlf<Context> wlf, wlf<i> wlf2, wlf<g<PlayerState>> wlf3, wlf<y> wlf4, wlf<o> wlf5, wlf<Picasso> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
