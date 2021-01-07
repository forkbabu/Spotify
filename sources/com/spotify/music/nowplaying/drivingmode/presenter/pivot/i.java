package com.spotify.music.nowplaying.drivingmode.presenter.pivot;

import io.reactivex.functions.n;

public final /* synthetic */ class i implements n {
    public static final /* synthetic */ i a = new i();

    private /* synthetic */ i() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        b91 b91 = (b91) obj;
        return b91 != null && !b91.body().isEmpty();
    }
}
