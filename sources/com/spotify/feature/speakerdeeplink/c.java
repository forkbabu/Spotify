package com.spotify.feature.speakerdeeplink;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ km0 a;

    public /* synthetic */ c(km0 km0) {
        this.a = km0;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a((GaiaDevice) obj);
    }
}
