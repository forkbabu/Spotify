package com.spotify.libs.connect.volume.controllers;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ l a;

    public /* synthetic */ d(l lVar) {
        this.a = lVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.j((GaiaDevice) obj);
    }
}
