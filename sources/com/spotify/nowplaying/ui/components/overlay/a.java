package com.spotify.nowplaying.ui.components.overlay;

import io.reactivex.g;
import java.util.concurrent.Callable;

public final /* synthetic */ class a implements Callable {
    public final /* synthetic */ k a;

    public /* synthetic */ a(k kVar) {
        this.a = kVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return g.N(Boolean.valueOf(this.a.isVisible()));
    }
}
