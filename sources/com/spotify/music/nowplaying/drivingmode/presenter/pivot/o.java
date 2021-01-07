package com.spotify.music.nowplaying.drivingmode.presenter.pivot;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.nowplaying.drivingmode.presenter.pivot.q0;

public final /* synthetic */ class o implements si0 {
    public static final /* synthetic */ o a = new o();

    private /* synthetic */ o() {
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        Logger.d("Error when loading content: %s", ((q0.a) obj).b().getMessage());
    }
}
