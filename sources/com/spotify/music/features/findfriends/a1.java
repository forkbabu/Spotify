package com.spotify.music.features.findfriends;

import com.spotify.music.features.findfriends.logging.FindFriendsLogger;
import com.spotify.music.follow.m;
import com.spotify.music.navigation.t;
import io.reactivex.y;

public final class a1 implements fjf<z0> {
    private final wlf<y> a;
    private final wlf<m> b;
    private final wlf<FindFriendsLogger> c;
    private final wlf<t> d;
    private final wlf<u0> e;

    public a1(wlf<y> wlf, wlf<m> wlf2, wlf<FindFriendsLogger> wlf3, wlf<t> wlf4, wlf<u0> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new z0(this.a, this.b, this.c, this.d, this.e);
    }
}
