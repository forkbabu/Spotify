package com.spotify.music.features.browse.component.findcard;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.squareup.picasso.Picasso;

public final class c implements fjf<b> {
    private final wlf<u64> a;
    private final wlf<HubsGlueImageDelegate> b;
    private final wlf<Picasso> c;

    public c(wlf<u64> wlf, wlf<HubsGlueImageDelegate> wlf2, wlf<Picasso> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a, this.b, this.c);
    }
}
