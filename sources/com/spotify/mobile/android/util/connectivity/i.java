package com.spotify.mobile.android.util.connectivity;

import io.reactivex.functions.l;

public final /* synthetic */ class i implements l {
    public static final /* synthetic */ i a = new i();

    private /* synthetic */ i() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((ConnectionType) obj) != ConnectionType.CONNECTION_TYPE_NONE);
    }
}
