package com.spotify.music.spotlets.radio.service;

import com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel;
import com.spotify.music.spotlets.radio.service.d0;
import io.reactivex.functions.g;

public final /* synthetic */ class k implements g {
    public final /* synthetic */ d0 a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ d0.a c;

    public /* synthetic */ k(d0 d0Var, String[] strArr, d0.a aVar) {
        this.a = d0Var;
        this.b = strArr;
        this.c = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.g(this.b, this.c, (TracksAndRadioStationModel) obj);
    }
}
