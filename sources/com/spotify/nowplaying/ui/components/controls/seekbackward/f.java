package com.spotify.nowplaying.ui.components.controls.seekbackward;

import io.reactivex.functions.l;

public final /* synthetic */ class f implements l {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Long.valueOf(Math.max(0L, ((Long) obj).longValue() - 15000));
    }
}
