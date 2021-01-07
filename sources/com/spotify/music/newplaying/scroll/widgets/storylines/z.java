package com.spotify.music.newplaying.scroll.widgets.storylines;

import com.spotify.mobile.android.storylines.ui.j;
import com.squareup.picasso.Picasso;

public final class z implements fjf<v> {
    private final wlf<StorylinesWidgetPresenter> a;
    private final wlf<Picasso> b;
    private final wlf<j> c;

    public z(wlf<StorylinesWidgetPresenter> wlf, wlf<Picasso> wlf2, wlf<j> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v(this.a.get(), this.b.get(), this.c.get());
    }
}
