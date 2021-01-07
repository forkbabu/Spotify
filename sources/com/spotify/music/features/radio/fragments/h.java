package com.spotify.music.features.radio.fragments;

import com.spotify.music.features.radio.common.AbstractContentFragment;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import io.reactivex.functions.g;

public final /* synthetic */ class h implements g {
    public final /* synthetic */ AbstractContentFragment.d a;

    public /* synthetic */ h(AbstractContentFragment.d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a((RadioStationModel) obj);
    }
}
