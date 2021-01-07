package com.spotify.music.features.ads;

import com.spotify.music.features.ads.model.AdBreakState;
import io.reactivex.functions.l;

public final /* synthetic */ class o implements l {
    public static final /* synthetic */ o a = new o();

    private /* synthetic */ o() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((Boolean) obj).booleanValue() ? AdBreakState.IN_PROGRESS : AdBreakState.IDLE;
    }
}
