package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.json.g;
import io.reactivex.y;

public final class l1 implements fjf<MusicPagesFiltering> {
    private final wlf<g1> a;
    private final wlf<g> b;
    private final wlf<io.reactivex.g<SessionState>> c;
    private final wlf<y> d;

    public l1(wlf<g1> wlf, wlf<g> wlf2, wlf<io.reactivex.g<SessionState>> wlf3, wlf<y> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new MusicPagesFiltering(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
