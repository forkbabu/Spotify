package com.spotify.music.features.settings;

import com.google.common.base.MoreObjects;
import io.reactivex.functions.l;

public final /* synthetic */ class i0 implements l {
    public static final /* synthetic */ i0 a = new i0();

    private /* synthetic */ i0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(!MoreObjects.isNullOrEmpty((String) obj));
    }
}
