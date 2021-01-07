package com.spotify.music.nowplaying.drivingmode.view.pivot;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = PivotListRecyclerView.Z0;
        Logger.e((Throwable) obj, "Error observing center child.", new Object[0]);
    }
}
