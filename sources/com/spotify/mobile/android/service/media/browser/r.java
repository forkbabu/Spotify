package com.spotify.mobile.android.service.media.browser;

import com.spotify.music.libs.collection.model.d;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.f;
import com.spotify.playlist.models.i;
import io.reactivex.s;

public final class r implements fjf<q> {
    private final wlf<s<d>> a;
    private final wlf<s<i<Episode>>> b;
    private final wlf<s<f>> c;
    private final wlf<o> d;

    public r(wlf<s<d>> wlf, wlf<s<i<Episode>>> wlf2, wlf<s<f>> wlf3, wlf<o> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
