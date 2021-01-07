package com.spotify.mobile.android.service.media;

import com.spotify.music.spotlets.radio.formatlist.i;
import io.reactivex.y;

public final class s2 implements fjf<r2> {
    private final wlf<y> a;
    private final wlf<i> b;

    public s2(wlf<y> wlf, wlf<i> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r2(this.a.get(), this.b.get());
    }
}
