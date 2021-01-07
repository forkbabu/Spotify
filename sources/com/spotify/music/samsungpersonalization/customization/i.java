package com.spotify.music.samsungpersonalization.customization;

import io.reactivex.functions.a;

final class i implements a {
    final /* synthetic */ TpoContextChangedService a;

    i(TpoContextChangedService tpoContextChangedService) {
        this.a = tpoContextChangedService;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.stopSelf();
    }
}
