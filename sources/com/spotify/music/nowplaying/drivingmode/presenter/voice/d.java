package com.spotify.music.nowplaying.drivingmode.presenter.voice;

import com.google.common.base.Optional;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ j a;

    public /* synthetic */ d(j jVar) {
        this.a = jVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.i((Optional) obj);
    }
}
