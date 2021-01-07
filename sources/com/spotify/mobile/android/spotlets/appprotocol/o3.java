package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import io.reactivex.functions.l;

public final /* synthetic */ class o3 implements l {
    public static final /* synthetic */ o3 a = new o3();

    private /* synthetic */ o3() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = zr1.h;
        return new AppProtocol.Capabilities("premium".equals((String) obj));
    }
}
