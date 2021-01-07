package com.spotify.music.features.findfriends.logging;

import com.spotify.music.loggers.InteractionLogger;

public final class a implements fjf<FindFriendsLogger> {
    private final wlf<InteractionLogger> a;
    private final wlf<ere> b;

    public a(wlf<InteractionLogger> wlf, wlf<ere> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new FindFriendsLogger(this.a.get(), this.b.get());
    }
}
