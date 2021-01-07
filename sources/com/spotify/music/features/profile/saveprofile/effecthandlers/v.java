package com.spotify.music.features.profile.saveprofile.effecthandlers;

import com.google.common.base.Optional;
import com.spotify.music.features.profile.saveprofile.domain.o;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

public final /* synthetic */ class v implements l {
    public static final /* synthetic */ v a = new v();

    private /* synthetic */ v() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        Optional absent = Optional.absent();
        h.e(absent, "uploadToken");
        return new o.h(false, absent, 0.0f);
    }
}
