package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.music.features.yourlibrary.musicpages.datasource.x3;
import io.reactivex.functions.c;

public final /* synthetic */ class a1 implements c {
    public static final /* synthetic */ a1 a = new a1();

    private /* synthetic */ a1() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        x3 x3Var = (x3) obj;
        x3.a i = x3Var.i();
        i.h(x3Var.k() - ((Integer) obj2).intValue());
        return i.b();
    }
}
