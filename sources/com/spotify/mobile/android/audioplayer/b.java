package com.spotify.mobile.android.audioplayer;

import androidx.lifecycle.Lifecycle;
import com.google.android.exoplayer2.source.w;
import com.google.android.exoplayer2.y;
import com.spotify.mobile.android.audioplayer.domain.a;

public final class b implements fjf<MobiusAudioPlayer> {
    private final wlf<cqe> a;
    private final wlf<y> b;
    private final wlf<w> c;
    private final wlf<a> d;
    private final wlf<Lifecycle> e;

    public b(wlf<cqe> wlf, wlf<y> wlf2, wlf<w> wlf3, wlf<a> wlf4, wlf<Lifecycle> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new MobiusAudioPlayer(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
