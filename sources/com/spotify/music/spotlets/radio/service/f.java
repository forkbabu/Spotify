package com.spotify.music.spotlets.radio.service;

import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.service.d0;
import io.reactivex.functions.g;

public final /* synthetic */ class f implements g {
    public final /* synthetic */ d0 a;
    public final /* synthetic */ RadioStationModel b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ d0.a f;

    public /* synthetic */ f(d0 d0Var, RadioStationModel radioStationModel, boolean z, d0.a aVar) {
        this.a = d0Var;
        this.b = radioStationModel;
        this.c = z;
        this.f = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.j(this.b, this.c, this.f, (RadioStationTracksModel) obj);
    }
}
