package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.functions.l;
import io.reactivex.s;

public final /* synthetic */ class v0 implements l {
    public final /* synthetic */ w3 a;
    public final /* synthetic */ s b;

    public /* synthetic */ v0(w3 w3Var, s sVar) {
        this.a = w3Var;
        this.b = sVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        w3 w3Var = this.a;
        s<x3> sVar = this.b;
        if (((Boolean) obj).booleanValue()) {
            return w3Var.d(sVar);
        }
        return s.i0(y3.a);
    }
}
