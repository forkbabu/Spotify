package com.spotify.music.features.album.di;

import android.app.Activity;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.music.features.album.AlbumFragment;
import com.spotify.remoteconfig.d5;

public final class h0 implements fjf<e61> {
    private final wlf<AlbumFragment> a;
    private final wlf<m> b;
    private final wlf<Activity> c;
    private final wlf<tk9> d;
    private final wlf<d5> e;

    public h0(wlf<AlbumFragment> wlf, wlf<m> wlf2, wlf<Activity> wlf3, wlf<tk9> wlf4, wlf<d5> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        AlbumFragment albumFragment = this.a.get();
        m mVar = this.b.get();
        Activity activity = this.c.get();
        tk9 tk9 = this.d.get();
        if (!this.e.get().a()) {
            return new h04(activity, mVar, albumFragment, tk9);
        }
        je3 je3 = new je3(activity, mVar);
        tk9.o(true);
        tk9.g(je3.F());
        tk9.g(je3.G());
        return je3;
    }
}
