package com.spotify.music.libs.carmodeengine.util;

import io.reactivex.functions.l;

public final /* synthetic */ class c implements l {
    public final /* synthetic */ wlf a;

    public /* synthetic */ c(wlf wlf) {
        this.a = wlf;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) this.a.get()).booleanValue());
    }
}
