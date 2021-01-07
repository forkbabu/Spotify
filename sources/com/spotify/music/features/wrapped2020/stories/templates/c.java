package com.spotify.music.features.wrapped2020.stories.templates;

import android.app.Activity;
import com.spotify.music.features.wrapped2020.stories.share.a;
import com.spotify.playlist.endpoints.p;
import com.spotify.playlist.endpoints.v;
import com.squareup.picasso.Picasso;

public final class c implements fjf<b> {
    private final wlf<Activity> a;
    private final wlf<Picasso> b;
    private final wlf<a> c;
    private final wlf<zy8> d;
    private final wlf<v> e;
    private final wlf<p> f;
    private final wlf<ez8> g;
    private final wlf<Boolean> h;

    public c(wlf<Activity> wlf, wlf<Picasso> wlf2, wlf<a> wlf3, wlf<zy8> wlf4, wlf<v> wlf5, wlf<p> wlf6, wlf<ez8> wlf7, wlf<Boolean> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get().booleanValue());
    }
}
