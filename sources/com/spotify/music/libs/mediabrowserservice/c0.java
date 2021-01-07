package com.spotify.music.libs.mediabrowserservice;

import io.reactivex.functions.l;

public final /* synthetic */ class c0 implements l {
    public final /* synthetic */ j2 a;
    public final /* synthetic */ int b;

    public /* synthetic */ c0(j2 j2Var, int i) {
        this.a = j2Var;
        this.b = i;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.a(this.b, (u3) obj);
    }
}
