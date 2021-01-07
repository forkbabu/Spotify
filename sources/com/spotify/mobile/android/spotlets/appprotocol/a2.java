package com.spotify.mobile.android.spotlets.appprotocol;

import io.reactivex.functions.l;

public final /* synthetic */ class a2 implements l {
    public static final /* synthetic */ a2 a = new a2();

    private /* synthetic */ a2() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = e4.D;
        return IapException.b(((Throwable) obj).getClass().getName());
    }
}
