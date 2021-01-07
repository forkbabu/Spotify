package com.spotify.music.spotlets.radio.service;

import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.service.d0;
import io.reactivex.functions.g;

public final /* synthetic */ class m implements g {
    public final /* synthetic */ d0 a;
    public final /* synthetic */ d0.a b;

    public /* synthetic */ m(d0 d0Var, d0.a aVar) {
        this.a = d0Var;
        this.b = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.i(this.b, (RadioStationModel) obj);
    }
}
