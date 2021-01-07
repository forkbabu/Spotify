package com.spotify.music.newplaying.scroll.view;

import io.reactivex.g;
import java.util.concurrent.Callable;

public final /* synthetic */ class a implements Callable {
    public final /* synthetic */ PeekScrollView a;

    public /* synthetic */ a(PeekScrollView peekScrollView) {
        this.a = peekScrollView;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return g.N(Boolean.valueOf(this.a.getScrollY() > 0));
    }
}
