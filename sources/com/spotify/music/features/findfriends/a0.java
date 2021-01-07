package com.spotify.music.features.findfriends;

import io.reactivex.functions.l;

public final /* synthetic */ class a0 implements l {
    public static final /* synthetic */ a0 a = new a0();

    private /* synthetic */ a0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        boolean z = true;
        if (((Integer) obj).intValue() < 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
