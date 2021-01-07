package com.spotify.music.libs.mediabrowserservice;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;
import java.util.Collections;

public final /* synthetic */ class b0 implements l {
    public static final /* synthetic */ b0 a = new b0();

    private /* synthetic */ b0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Logger.e((Throwable) obj, "Couldn't populate extended search results", new Object[0]);
        return Collections.emptyList();
    }
}
