package com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.segments;

import com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position.a;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position.f;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position.i;
import io.reactivex.y;

public final class e implements fjf<TimeLineFlowablesImpl> {
    private final wlf<i> a;
    private final wlf<n1c> b;
    private final wlf<a> c;
    private final wlf<a> d;
    private final wlf<f> e;
    private final wlf<y> f;

    public e(wlf<i> wlf, wlf<n1c> wlf2, wlf<a> wlf3, wlf<a> wlf4, wlf<f> wlf5, wlf<y> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new TimeLineFlowablesImpl(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
