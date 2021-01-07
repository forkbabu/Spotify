package com.spotify.music.features.ads.video;

import com.spotify.music.features.ads.model.Ad;
import io.reactivex.functions.n;

public final /* synthetic */ class f implements n {
    public final /* synthetic */ o a;

    public /* synthetic */ f(o oVar) {
        this.a = oVar;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        this.a.getClass();
        return Boolean.parseBoolean(((Ad) obj).metadata().get("fireImpressionOnStart"));
    }
}
