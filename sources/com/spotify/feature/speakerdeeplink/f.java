package com.spotify.feature.speakerdeeplink;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.g;

public final /* synthetic */ class f implements g {
    public final /* synthetic */ t a;

    public /* synthetic */ f(t tVar) {
        this.a = tVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        t.b(this.a, (GaiaDevice) obj);
    }
}
