package com.spotify.music.features.ads.video;

import com.spotify.music.features.ads.model.Ad;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ o a;

    public /* synthetic */ d(o oVar) {
        this.a = oVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c((Ad) obj);
    }
}
