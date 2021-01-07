package com.spotify.music.features.playlistentity.homemix.header.mixtuning;

import com.spotify.music.features.playlistentity.homemix.models.HomeMixTuning;
import io.reactivex.functions.l;

public final /* synthetic */ class k implements l {
    public final /* synthetic */ o a;
    public final /* synthetic */ HomeMixTuning b;

    public /* synthetic */ k(o oVar, HomeMixTuning homeMixTuning) {
        this.a = oVar;
        this.b = homeMixTuning;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d(this.b, (xe6) obj);
    }
}
