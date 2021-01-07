package com.spotify.mobile.android.rx;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

public final /* synthetic */ class g implements l {
    public static final /* synthetic */ g a = new g();

    private /* synthetic */ g() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (String) ((Optional) obj).get();
    }
}
