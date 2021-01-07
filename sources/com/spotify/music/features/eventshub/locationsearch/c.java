package com.spotify.music.features.eventshub.locationsearch;

import com.google.common.base.MoreObjects;
import io.reactivex.functions.n;

public final /* synthetic */ class c implements n {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        String str = (String) obj;
        return !MoreObjects.isNullOrEmpty(str) && str.length() >= 3;
    }
}
