package com.spotify.music.features.playlistentity.header;

import android.content.Context;
import com.spotify.libs.glue.custom.playbutton.c;
import com.squareup.picasso.Picasso;

public final class b1 implements fjf<a1> {
    private final wlf<Picasso> a;
    private final wlf<Context> b;
    private final wlf<s0> c;
    private final wlf<c.a> d;
    private final wlf<cqe> e;

    public b1(wlf<Picasso> wlf, wlf<Context> wlf2, wlf<s0> wlf3, wlf<c.a> wlf4, wlf<cqe> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a1(this.a, this.b, this.c, this.d, this.e);
    }
}
