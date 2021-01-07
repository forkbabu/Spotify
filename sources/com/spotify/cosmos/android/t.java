package com.spotify.cosmos.android;

import com.google.common.base.Optional;
import io.reactivex.functions.c;

public final /* synthetic */ class t implements c {
    public static final /* synthetic */ t a = new t();

    private /* synthetic */ t() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        int i;
        F f = ((u3) obj).a;
        if (f == null) {
            i = 0;
        } else {
            i = f.intValue() + 1;
        }
        return new u3(Integer.valueOf(i), Optional.of(obj2));
    }
}
