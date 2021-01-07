package com.spotify.nowplaying.ui.components.overlay;

import com.spotify.nowplaying.ui.components.overlay.k;
import io.reactivex.f;

final class g implements k.b {
    final /* synthetic */ f a;

    g(f fVar) {
        this.a = fVar;
    }

    @Override // com.spotify.nowplaying.ui.components.overlay.k.b
    public void a() {
        this.a.onNext(Boolean.FALSE);
    }

    @Override // com.spotify.nowplaying.ui.components.overlay.k.b
    public void b() {
        this.a.onNext(Boolean.TRUE);
    }
}
