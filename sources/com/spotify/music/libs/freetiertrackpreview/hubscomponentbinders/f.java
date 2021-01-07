package com.spotify.music.libs.freetiertrackpreview.hubscomponentbinders;

import com.spotify.music.libs.freetiertrackpreview.b;
import com.spotify.music.libs.freetiertrackpreview.e;
import com.spotify.music.libs.freetiertrackpreview.logging.c;
import com.spotify.music.preview.q;
import com.squareup.picasso.Picasso;

public final class f implements fjf<e> {
    private final wlf<b<qfa>> a;
    private final wlf<Picasso> b;
    private final wlf<q> c;
    private final wlf<e> d;
    private final wlf<c> e;

    public f(wlf<b<qfa>> wlf, wlf<Picasso> wlf2, wlf<q> wlf3, wlf<e> wlf4, wlf<c> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
