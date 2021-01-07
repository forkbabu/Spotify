package com.spotify.music.features.ads.screensaver;

import android.content.Context;
import com.spotify.music.features.ads.api.SlotApi;
import com.spotify.music.features.ads.api.e;
import com.squareup.picasso.Picasso;
import io.reactivex.y;

public final class o0 implements fjf<n0> {
    private final wlf<Context> a;
    private final wlf<e> b;
    private final wlf<SlotApi> c;
    private final wlf<Picasso> d;
    private final wlf<jp3> e;
    private final wlf<y> f;

    public o0(wlf<Context> wlf, wlf<e> wlf2, wlf<SlotApi> wlf3, wlf<Picasso> wlf4, wlf<jp3> wlf5, wlf<y> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n0(this.a.get(), this.b.get(), this.c.get(), ejf.a(this.d), this.e.get(), this.f.get());
    }
}
