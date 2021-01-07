package com.spotify.music.features.imagerecs.presenter;

import com.spotify.music.features.imagerecs.model.TrackRecsEntity;
import io.reactivex.functions.l;

public final /* synthetic */ class i implements l {
    public final /* synthetic */ vl5 a;

    public /* synthetic */ i(vl5 vl5) {
        this.a = vl5;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.a((TrackRecsEntity) obj);
    }
}
