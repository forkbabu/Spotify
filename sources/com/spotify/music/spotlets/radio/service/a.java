package com.spotify.music.spotlets.radio.service;

import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ k0 a;

    public /* synthetic */ a(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.s((RadioStationsModel) obj);
    }
}
