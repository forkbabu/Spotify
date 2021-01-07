package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import io.reactivex.functions.l;

public final /* synthetic */ class n2 implements l {
    public static final /* synthetic */ n2 a = new n2();

    private /* synthetic */ n2() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        lk1 lk1 = (lk1) obj;
        int i = e4.D;
        return new AppProtocol.CrossfadeState(lk1.b(), lk1.a().intValue());
    }
}
