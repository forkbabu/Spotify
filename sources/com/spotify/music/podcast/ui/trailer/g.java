package com.spotify.music.podcast.ui.trailer;

import android.content.Context;
import com.spotify.music.podcast.ui.trailer.d;
import io.reactivex.y;

public final class g implements fjf<d> {
    private final wlf<Context> a;
    private final wlf<d.b> b;
    private final wlf<cqe> c;
    private final wlf<y> d;

    public g(wlf<Context> wlf, wlf<d.b> wlf2, wlf<cqe> wlf3, wlf<y> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
