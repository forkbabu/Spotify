package com.spotify.music.autoplay;

import io.reactivex.functions.l;
import io.reactivex.s;

public final /* synthetic */ class i implements l {
    public final /* synthetic */ s a;

    public /* synthetic */ i(s sVar) {
        this.a = sVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        RadioSeedBundle radioSeedBundle = (RadioSeedBundle) obj;
        return this.a.Q(new h(radioSeedBundle)).N0(1).j0(new j(radioSeedBundle));
    }
}
