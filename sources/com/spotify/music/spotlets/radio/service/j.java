package com.spotify.music.spotlets.radio.service;

import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.service.d0;
import io.reactivex.functions.l;
import org.apache.commons.lang3.tuple.Pair;

public final /* synthetic */ class j implements l {
    public final /* synthetic */ d0 a;
    public final /* synthetic */ RadioStationModel b;
    public final /* synthetic */ RadioStationTracksModel c;
    public final /* synthetic */ d0.a f;
    public final /* synthetic */ Integer n;
    public final /* synthetic */ Long o;

    public /* synthetic */ j(d0 d0Var, RadioStationModel radioStationModel, RadioStationTracksModel radioStationTracksModel, d0.a aVar, Integer num, Long l) {
        this.a = d0Var;
        this.b = radioStationModel;
        this.c = radioStationTracksModel;
        this.f = aVar;
        this.n = num;
        this.o = l;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.l(this.b, this.c, this.f, this.n, this.o, (Pair) obj);
    }
}
