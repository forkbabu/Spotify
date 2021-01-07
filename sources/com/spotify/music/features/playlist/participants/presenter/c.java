package com.spotify.music.features.playlist.participants.presenter;

import com.spotify.music.navigation.t;
import io.reactivex.y;

public final class c implements fjf<PlaylistParticipantsPresenterImpl> {
    private final wlf<n06> a;
    private final wlf<vs2> b;
    private final wlf<t> c;
    private final wlf<h06> d;
    private final wlf<y> e;

    public c(wlf<n06> wlf, wlf<vs2> wlf2, wlf<t> wlf3, wlf<h06> wlf4, wlf<y> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PlaylistParticipantsPresenterImpl(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
