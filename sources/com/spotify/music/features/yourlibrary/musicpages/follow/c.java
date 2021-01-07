package com.spotify.music.features.yourlibrary.musicpages.follow;

import androidx.lifecycle.n;
import com.spotify.music.follow.m;
import com.spotify.music.follow.resolver.f;
import io.reactivex.y;

public final class c implements fjf<FollowCompanion> {
    private final wlf<f> a;
    private final wlf<m> b;
    private final wlf<y> c;
    private final wlf<n> d;

    public c(wlf<f> wlf, wlf<m> wlf2, wlf<y> wlf3, wlf<n> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new FollowCompanion(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
