package com.spotify.music.features.editplaylist.operations;

import android.content.Context;
import androidx.lifecycle.n;

public final class p0 implements fjf<SetPictureOperationHandler> {
    private final wlf<Context> a;
    private final wlf<n> b;

    public p0(wlf<Context> wlf, wlf<n> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new SetPictureOperationHandler(this.a.get(), this.b.get());
    }
}
