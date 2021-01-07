package com.spotify.music.features.playlistentity.homemix.usertoggle;

import com.spotify.music.features.playlistentity.homemix.models.HomeMixTuning;
import io.reactivex.functions.l;

public final /* synthetic */ class g implements l {
    public final /* synthetic */ k a;
    public final /* synthetic */ HomeMixTuning b;

    public /* synthetic */ g(k kVar, HomeMixTuning homeMixTuning) {
        this.a = kVar;
        this.b = homeMixTuning;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.f(this.b, (xe6) obj);
    }
}
