package com.spotify.music.homecomponents.singleitem.card;

import android.app.Activity;
import androidx.lifecycle.n;
import com.spotify.music.libs.home.common.contentapi.b;
import com.spotify.player.model.PlayerState;
import com.squareup.picasso.Picasso;
import io.reactivex.g;

public final class f implements fjf<HomeSingleFocusCardTallComponent> {
    private final wlf<Activity> a;
    private final wlf<Picasso> b;
    private final wlf<m71> c;
    private final wlf<n> d;
    private final wlf<b> e;
    private final wlf<b> f;
    private final wlf<g<PlayerState>> g;

    public f(wlf<Activity> wlf, wlf<Picasso> wlf2, wlf<m71> wlf3, wlf<n> wlf4, wlf<b> wlf5, wlf<b> wlf6, wlf<g<PlayerState>> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    public static f a(wlf<Activity> wlf, wlf<Picasso> wlf2, wlf<m71> wlf3, wlf<n> wlf4, wlf<b> wlf5, wlf<b> wlf6, wlf<g<PlayerState>> wlf7) {
        return new f(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new HomeSingleFocusCardTallComponent(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
