package com.spotify.music.features.connect.dialogs;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ j a;

    public /* synthetic */ e(j jVar) {
        this.a = jVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        j.d(this.a, (GaiaDevice) obj);
    }
}
