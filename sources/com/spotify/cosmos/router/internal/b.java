package com.spotify.cosmos.router.internal;

import com.google.common.base.Optional;
import com.spotify.cosmos.router.RxRouter;
import io.reactivex.functions.l;

public final /* synthetic */ class b implements l {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (RxRouter) ((Optional) obj).get();
    }
}
