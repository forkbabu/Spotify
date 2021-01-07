package com.spotify.music.ads.voice;

import com.google.common.base.Optional;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ f a;
    public final /* synthetic */ da2 b;

    public /* synthetic */ c(f fVar, da2 da2) {
        this.a = fVar;
        this.b = da2;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c(this.b, (Optional) obj);
    }
}
