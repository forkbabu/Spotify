package com.spotify.libs.connect;

import com.google.common.base.Optional;
import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.l;

public final /* synthetic */ class f implements l {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Optional.fromNullable((GaiaDevice) obj);
    }
}
