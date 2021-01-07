package com.spotify.music.features.editplaylist.operations;

import java.util.List;

public final class k0 implements fjf<j0> {
    private final wlf<f0> a;
    private final wlf<List<i0>> b;
    private final wlf<SetPictureOperationHandler> c;

    public k0(wlf<f0> wlf, wlf<List<i0>> wlf2, wlf<SetPictureOperationHandler> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j0(this.a.get(), this.b.get(), this.c.get());
    }
}
