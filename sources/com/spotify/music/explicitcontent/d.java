package com.spotify.music.explicitcontent;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;
import io.reactivex.z;

public final /* synthetic */ class d implements l {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Logger.e((Throwable) obj, "Error getting product state for lock-filter-explicit-content", new Object[0]);
        return z.z(Boolean.FALSE);
    }
}
