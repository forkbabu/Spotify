package com.spotify.music.homecomponents.singleitem;

import android.content.Context;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.player.model.PlayerState;
import com.squareup.picasso.Picasso;
import io.reactivex.g;
import io.reactivex.y;

public final class f implements fjf<e> {
    private final wlf<Context> a;
    private final wlf<Picasso> b;
    private final wlf<g<PlayerState>> c;
    private final wlf<k> d;
    private final wlf<y> e;
    private final wlf<m71> f;
    private final wlf<w50> g;

    public f(wlf<Context> wlf, wlf<Picasso> wlf2, wlf<g<PlayerState>> wlf3, wlf<k> wlf4, wlf<y> wlf5, wlf<m71> wlf6, wlf<w50> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    public static f a(wlf<Context> wlf, wlf<Picasso> wlf2, wlf<g<PlayerState>> wlf3, wlf<k> wlf4, wlf<y> wlf5, wlf<m71> wlf6, wlf<w50> wlf7) {
        return new f(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
