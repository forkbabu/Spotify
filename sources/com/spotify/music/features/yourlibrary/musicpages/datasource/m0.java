package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.functions.l;
import io.reactivex.s;

public final /* synthetic */ class m0 implements l {
    public final /* synthetic */ w3 a;

    public /* synthetic */ m0(w3 w3Var) {
        this.a = w3Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        w3 w3Var = this.a;
        if (((Boolean) obj).booleanValue()) {
            return w3Var.b();
        }
        return s.i0(Boolean.FALSE);
    }
}
