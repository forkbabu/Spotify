package com.spotify.effortlesslogin;

import io.reactivex.functions.l;

public final /* synthetic */ class f implements l {
    public final /* synthetic */ p a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ f(p pVar, boolean z) {
        this.a = pVar;
        this.b = z;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.m(this.b, (b2e) obj);
    }
}
