package com.spotify.music.nowplaying.drivingmode.presenter.voice;

import com.google.common.base.Optional;
import io.reactivex.functions.n;

public final /* synthetic */ class e implements n {
    public final /* synthetic */ j a;

    public /* synthetic */ e(j jVar) {
        this.a = jVar;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return this.a.h((Optional) obj);
    }
}
