package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.functions.l;
import io.reactivex.s;

public final /* synthetic */ class k0 implements l {
    public final /* synthetic */ w3 a;

    public /* synthetic */ k0(w3 w3Var) {
        this.a = w3Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        w3 w3Var = this.a;
        if (((Boolean) obj).booleanValue()) {
            return w3Var.c();
        }
        return s.i0(y3.a);
    }
}
