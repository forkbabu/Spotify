package com.spotify.music.features.ads;

import com.spotify.music.productstate.AdsProductState;
import io.reactivex.functions.h;

public final /* synthetic */ class j implements h {
    public static final /* synthetic */ j a = new j();

    private /* synthetic */ j() {
    }

    @Override // io.reactivex.functions.h
    public final Object a(Object obj, Object obj2, Object obj3) {
        AdsProductState adsProductState = AdsProductState.ENABLED;
        return new t1(((String) obj).equals(adsProductState.d()), ((String) obj2).equals(adsProductState.d()), ((String) obj3).equals(adsProductState.d()));
    }
}
