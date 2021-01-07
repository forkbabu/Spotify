package com.spotify.mobile.android.service.media;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

public final /* synthetic */ class p1 implements l {
    public static final /* synthetic */ p1 a = new p1();

    private /* synthetic */ p1() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (String) ((Optional) obj).get();
    }
}
