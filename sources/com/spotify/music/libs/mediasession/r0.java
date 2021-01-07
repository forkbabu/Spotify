package com.spotify.music.libs.mediasession;

import android.content.Context;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.player.model.PlayerState;
import com.squareup.picasso.Picasso;
import io.reactivex.g;
import io.reactivex.y;

public final class r0 implements fjf<SpotifyRemoteControlClient> {
    private final wlf<Context> a;
    private final wlf<SpSharedPreferences<Object>> b;
    private final wlf<o0> c;
    private final wlf<Picasso> d;
    private final wlf<y> e;
    private final wlf<g<PlayerState>> f;
    private final wlf<b0> g;
    private final wlf<cqe> h;
    private final wlf<ConnectManager> i;

    public r0(wlf<Context> wlf, wlf<SpSharedPreferences<Object>> wlf2, wlf<o0> wlf3, wlf<Picasso> wlf4, wlf<y> wlf5, wlf<g<PlayerState>> wlf6, wlf<b0> wlf7, wlf<cqe> wlf8, wlf<ConnectManager> wlf9) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new SpotifyRemoteControlClient(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
