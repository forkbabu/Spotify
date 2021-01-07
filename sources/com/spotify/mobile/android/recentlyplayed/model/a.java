package com.spotify.mobile.android.recentlyplayed.model;

import io.reactivex.functions.l;
import java.util.Map;

public final /* synthetic */ class a implements l {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return String.valueOf(((Map.Entry) obj).getValue());
    }
}
