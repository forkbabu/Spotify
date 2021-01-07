package com.spotify.mobile.android.service.feature;

import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;

public final /* synthetic */ class d implements l {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return new v(g.p(new c((FlagsManager) obj), BackpressureStrategy.LATEST));
    }
}
