package com.spotify.mobile.android.spotlets.appprotocol;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

public final /* synthetic */ class c3 implements l {
    public static final /* synthetic */ c3 a = new c3();

    private /* synthetic */ c3() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (String) ((Optional) obj).get();
    }
}
