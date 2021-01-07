package com.spotify.music.newplaying.scroll.view;

import io.reactivex.functions.g;

public final /* synthetic */ class f implements g {
    public final /* synthetic */ TouchBlockingFrameLayout a;

    public /* synthetic */ f(TouchBlockingFrameLayout touchBlockingFrameLayout) {
        this.a = touchBlockingFrameLayout;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a((vpf) obj);
    }
}
