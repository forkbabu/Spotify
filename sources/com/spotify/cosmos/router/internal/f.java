package com.spotify.cosmos.router.internal;

import com.google.common.base.Optional;
import io.reactivex.functions.n;

public final /* synthetic */ class f implements n {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return !((Optional) obj).isPresent();
    }
}
