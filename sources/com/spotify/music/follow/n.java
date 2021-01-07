package com.spotify.music.follow;

import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.music.json.g;
import io.reactivex.y;

public final class n implements fjf<FollowManagerImpl> {
    private final wlf<o> a;
    private final wlf<FireAndForgetResolver> b;
    private final wlf<g> c;
    private final wlf<y> d;

    public n(wlf<o> wlf, wlf<FireAndForgetResolver> wlf2, wlf<g> wlf3, wlf<y> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new FollowManagerImpl(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
