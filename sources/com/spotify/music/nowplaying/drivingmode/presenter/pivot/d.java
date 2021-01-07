package com.spotify.music.nowplaying.drivingmode.presenter.pivot;

import io.reactivex.functions.l;
import io.reactivex.s;

public final /* synthetic */ class d implements l {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        a91 target = ((s81) obj).target();
        return s.i0(target != null ? target.uri() : null);
    }
}
