package com.spotify.mobile.android.util.connectivity;

import com.spotify.mobile.android.util.connectivity.q;
import io.reactivex.functions.h;

public final /* synthetic */ class l implements h {
    public static final /* synthetic */ l a = new l();

    private /* synthetic */ l() {
    }

    @Override // io.reactivex.functions.h
    public final Object a(Object obj, Object obj2, Object obj3) {
        q.b bVar = new q.b();
        bVar.a(ConnectionType.CONNECTION_TYPE_UNKNOWN);
        bVar.b(false);
        bVar.c(false);
        bVar.a((ConnectionType) obj);
        bVar.b(((Boolean) obj2).booleanValue());
        bVar.c(((Boolean) obj3).booleanValue());
        return bVar.build();
    }
}
