package com.spotify.music.features.tasteonboarding.artistpicker.presenter.like;

import java.util.Map;

public final class k implements fjf<j> {
    private final wlf<Map<ContentType, wlf<i>>> a;

    public k(wlf<Map<ContentType, wlf<i>>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j(this.a.get());
    }
}
