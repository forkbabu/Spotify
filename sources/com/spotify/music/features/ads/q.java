package com.spotify.music.features.ads;

import io.reactivex.functions.l;

public final /* synthetic */ class q implements l {
    public final /* synthetic */ n1 a;
    public final /* synthetic */ String b;

    public /* synthetic */ q(n1 n1Var, String str) {
        this.a = n1Var;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (Boolean) obj);
    }
}
