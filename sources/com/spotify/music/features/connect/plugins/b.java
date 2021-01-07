package com.spotify.music.features.connect.plugins;

import com.spotify.libs.connect.model.GaiaState;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ e a;

    public /* synthetic */ b(e eVar) {
        this.a = eVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        e.c(this.a, (GaiaState) obj);
    }
}
