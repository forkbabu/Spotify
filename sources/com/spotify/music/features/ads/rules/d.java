package com.spotify.music.features.ads.rules;

import com.spotify.music.features.ads.model.State;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ q a;

    public /* synthetic */ d(q qVar) {
        this.a = qVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        q qVar = this.a;
        qVar.getClass();
        if (((State) obj).isAdsEnabled()) {
            qVar.f(Boolean.TRUE);
        }
    }
}
