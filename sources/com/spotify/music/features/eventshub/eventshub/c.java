package com.spotify.music.features.eventshub.eventshub;

import io.reactivex.functions.g;
import retrofit2.v;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ j a;

    public /* synthetic */ c(j jVar) {
        this.a = jVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b((v) obj);
    }
}
