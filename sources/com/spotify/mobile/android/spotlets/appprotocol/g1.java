package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;

public final /* synthetic */ class g1 implements l {
    public static final /* synthetic */ g1 a = new g1();

    private /* synthetic */ g1() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = e4.D;
        if (((Boolean) obj).booleanValue()) {
            return s.i0(AppProtocolBase.a);
        }
        return o.a;
    }
}
