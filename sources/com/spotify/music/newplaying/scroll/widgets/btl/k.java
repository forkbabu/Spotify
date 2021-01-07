package com.spotify.music.newplaying.scroll.widgets.btl;

import com.spotify.remoteconfig.AndroidLibsNewplayingScrollWidgetsBtlProperties;

public final class k implements fjf<j> {
    private final wlf<lk2> a;
    private final wlf<AndroidLibsNewplayingScrollWidgetsBtlProperties> b;

    public k(wlf<lk2> wlf, wlf<AndroidLibsNewplayingScrollWidgetsBtlProperties> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j(this.a.get(), this.b.get());
    }
}
