package com.spotify.mobile.android.recentlyplayed.model;

import io.reactivex.functions.l;
import java.util.Map;

public final /* synthetic */ class c implements l {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (String) ((Map.Entry) obj).getKey();
    }
}
