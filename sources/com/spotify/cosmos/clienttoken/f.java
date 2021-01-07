package com.spotify.cosmos.clienttoken;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

public final /* synthetic */ class f implements l {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String str = (String) obj;
        if (str.isEmpty()) {
            return Optional.absent();
        }
        return Optional.of(str);
    }
}
