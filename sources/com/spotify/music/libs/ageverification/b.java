package com.spotify.music.libs.ageverification;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;
import io.reactivex.z;

public final /* synthetic */ class b implements l {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Logger.e((Throwable) obj, "Error resolving cover art URI", new Object[0]);
        return z.z(Optional.absent());
    }
}
