package com.spotify.mobile.android.service.session;

import io.reactivex.functions.l;

public final /* synthetic */ class b implements l {
    public final /* synthetic */ f a;

    public /* synthetic */ b(f fVar) {
        this.a = fVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        f fVar = this.a;
        ServerTime serverTime = (ServerTime) obj;
        fVar.getClass();
        return new a(fVar, serverTime.currentServerTime(), serverTime.currentTimeMillis());
    }
}
