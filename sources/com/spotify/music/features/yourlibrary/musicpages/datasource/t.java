package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.collection.model.d;
import io.reactivex.functions.l;

public final /* synthetic */ class t implements l {
    public static final /* synthetic */ t a = new t();

    private /* synthetic */ t() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = l3.i;
        Logger.e((Throwable) obj, "Failed to subscribe to albums", new Object[0]);
        return d.a().build();
    }
}
