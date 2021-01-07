package com.spotify.music.features.radio.fragments;

import com.spotify.music.features.radio.common.AbstractContentFragment;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ AbstractContentFragment.d a;

    public /* synthetic */ a(AbstractContentFragment.d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        AbstractContentFragment.d dVar = this.a;
        Throwable th = (Throwable) obj;
        int i = AbstractStationFragment.V0;
        dVar.b();
    }
}
