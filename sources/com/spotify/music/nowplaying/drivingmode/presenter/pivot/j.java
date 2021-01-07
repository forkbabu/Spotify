package com.spotify.music.nowplaying.drivingmode.presenter.pivot;

import io.reactivex.functions.l;

public final /* synthetic */ class j implements l {
    public static final /* synthetic */ j a = new j();

    private /* synthetic */ j() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        b91 b91 = (b91) obj;
        if (b91.body().size() > 1) {
            return b91.body();
        }
        return ((s81) b91.body().get(0)).children();
    }
}
