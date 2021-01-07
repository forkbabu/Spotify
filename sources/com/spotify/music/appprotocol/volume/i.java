package com.spotify.music.appprotocol.volume;

import io.reactivex.functions.g;

public final /* synthetic */ class i implements g {
    public final /* synthetic */ l a;

    public /* synthetic */ i(l lVar) {
        this.a = lVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.k((VolumeState) obj);
    }
}
