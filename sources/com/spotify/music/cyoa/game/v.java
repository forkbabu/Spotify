package com.spotify.music.cyoa.game;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.squareup.picasso.Picasso;
import io.reactivex.y;

public final class v implements fjf<u> {
    private final wlf<Context> a;
    private final wlf<Player> b;
    private final wlf<y> c;
    private final wlf<Picasso> d;

    public v(wlf<Context> wlf, wlf<Player> wlf2, wlf<y> wlf3, wlf<Picasso> wlf4) {
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
