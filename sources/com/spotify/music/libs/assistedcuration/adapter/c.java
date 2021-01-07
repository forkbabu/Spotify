package com.spotify.music.libs.assistedcuration.adapter;

import com.spotify.music.libs.assistedcuration.b;
import com.spotify.music.preview.q;
import com.squareup.picasso.Picasso;

public final class c implements fjf<b> {
    private final wlf<q.a> a;
    private final wlf<Picasso> b;
    private final wlf<b> c;

    public c(wlf<q.a> wlf, wlf<Picasso> wlf2, wlf<b> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a, this.b, this.c);
    }
}
