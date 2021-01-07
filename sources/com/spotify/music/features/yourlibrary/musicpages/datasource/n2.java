package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.functions.l;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;

public final /* synthetic */ class n2 implements l {
    public final /* synthetic */ y3 a;

    public /* synthetic */ n2(y3 y3Var) {
        this.a = y3Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        y3 y3Var = this.a;
        x3 x3Var = (x3) obj;
        x3 a2 = y3Var.a();
        if (a2 == null || !rw.equal(a2.c(), x3Var.c())) {
            return o.a;
        }
        return s.i0(y3Var);
    }
}
