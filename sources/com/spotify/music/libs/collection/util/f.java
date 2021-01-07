package com.spotify.music.libs.collection.util;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;
import io.reactivex.s;
import java.util.Collections;

public final /* synthetic */ class f implements l {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Logger.d(((Throwable) obj).getMessage(), new Object[0]);
        return s.i0(Collections.emptyMap());
    }
}
