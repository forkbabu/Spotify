package com.spotify.music.spotlets.radio.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.cosmos.player.v2.rx.RxPlayerState;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.y;

public final class l0 implements fjf<k0> {
    private final wlf<ObjectMapper> a;
    private final wlf<j0> b;
    private final wlf<SpSharedPreferences<Object>> c;
    private final wlf<RxPlayerState> d;
    private final wlf<y> e;

    public l0(wlf<ObjectMapper> wlf, wlf<j0> wlf2, wlf<SpSharedPreferences<Object>> wlf3, wlf<RxPlayerState> wlf4, wlf<y> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k0(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
