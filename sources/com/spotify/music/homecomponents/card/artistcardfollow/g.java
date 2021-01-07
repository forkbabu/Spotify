package com.spotify.music.homecomponents.card.artistcardfollow;

import io.reactivex.y;

public final class g implements fjf<f> {
    private final wlf<ArtistCardFollowButtonLogger> a;
    private final wlf<a71> b;
    private final wlf<aq9> c;
    private final wlf<hha> d;
    private final wlf<y> e;
    private final wlf<y> f;

    public g(wlf<ArtistCardFollowButtonLogger> wlf, wlf<a71> wlf2, wlf<aq9> wlf3, wlf<hha> wlf4, wlf<y> wlf5, wlf<y> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    public static g a(wlf<ArtistCardFollowButtonLogger> wlf, wlf<a71> wlf2, wlf<aq9> wlf3, wlf<hha> wlf4, wlf<y> wlf5, wlf<y> wlf6) {
        return new g(wlf, wlf2, wlf3, wlf4, wlf5, wlf6);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
