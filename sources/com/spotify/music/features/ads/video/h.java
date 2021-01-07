package com.spotify.music.features.ads.video;

import io.reactivex.functions.g;

public final /* synthetic */ class h implements g {
    public final /* synthetic */ o a;

    public /* synthetic */ h(o oVar) {
        this.a = oVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.i((VideoPlayerResponse) obj);
    }
}
