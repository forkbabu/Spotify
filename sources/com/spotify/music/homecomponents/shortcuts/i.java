package com.spotify.music.homecomponents.shortcuts;

import android.content.Context;
import androidx.lifecycle.n;
import com.spotify.player.model.PlayerState;
import com.squareup.picasso.Picasso;
import io.reactivex.g;
import io.reactivex.y;

public final class i implements fjf<HomeShortcutsItemComponent> {
    private final wlf<Context> a;
    private final wlf<Picasso> b;
    private final wlf<g<PlayerState>> c;
    private final wlf<y> d;
    private final wlf<m71> e;
    private final wlf<w50> f;
    private final wlf<n> g;
    private final wlf<wo9> h;

    public i(wlf<Context> wlf, wlf<Picasso> wlf2, wlf<g<PlayerState>> wlf3, wlf<y> wlf4, wlf<m71> wlf5, wlf<w50> wlf6, wlf<n> wlf7, wlf<wo9> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    public static i a(wlf<Context> wlf, wlf<Picasso> wlf2, wlf<g<PlayerState>> wlf3, wlf<y> wlf4, wlf<m71> wlf5, wlf<w50> wlf6, wlf<n> wlf7, wlf<wo9> wlf8) {
        return new i(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new HomeShortcutsItemComponent(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
