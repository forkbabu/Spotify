package com.spotify.music.features.connectui.picker.frictionlessjoin.ui;

import com.spotify.music.features.connectui.picker.legacy.util.f;

public final class c implements fjf<GroupSessionViewBinderImpl> {
    private final wlf<f> a;

    public c(wlf<f> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new GroupSessionViewBinderImpl(this.a.get());
    }
}
