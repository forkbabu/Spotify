package com.spotify.music.spotlets.radio.service;

import com.spotify.music.spotlets.radio.model.RadioStationModel;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ d0 a;
    public final /* synthetic */ RadioStationModel b;

    public /* synthetic */ c(d0 d0Var, RadioStationModel radioStationModel) {
        this.a = d0Var;
        this.b = radioStationModel;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.k(this.b, (Throwable) obj);
    }
}
