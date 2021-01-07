package com.spotify.music.genie;

import io.reactivex.functions.l;
import io.reactivex.z;

public final /* synthetic */ class j implements l {
    public static final /* synthetic */ j a = new j();

    private /* synthetic */ j() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return z.q(new GenieException((Throwable) obj));
    }
}
