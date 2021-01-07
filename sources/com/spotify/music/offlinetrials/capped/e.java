package com.spotify.music.offlinetrials.capped;

import io.reactivex.functions.c;

public final /* synthetic */ class e implements c {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        int i = n.k;
        return Boolean.valueOf(((Boolean) obj).booleanValue() && bool.booleanValue());
    }
}
