package com.spotify.music.features.playlistentity.story.header;

import android.content.Context;
import com.spotify.libs.glue.custom.playbutton.c;
import com.squareup.picasso.Picasso;
import defpackage.r62;

public final class v0 implements fjf<u0> {
    private final wlf<Picasso> a;
    private final wlf<Context> b;
    private final wlf<n0> c;
    private final wlf<r62.a> d;
    private final wlf<l72> e;
    private final wlf<c.a> f;

    public v0(wlf<Picasso> wlf, wlf<Context> wlf2, wlf<n0> wlf3, wlf<r62.a> wlf4, wlf<l72> wlf5, wlf<c.a> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u0(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
