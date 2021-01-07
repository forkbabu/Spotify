package com.spotify.music.libs.mediabrowserservice;

import io.reactivex.functions.g;

public final /* synthetic */ class c1 implements g {
    public final /* synthetic */ z2 a;
    public final /* synthetic */ String b;

    public /* synthetic */ c1(z2 z2Var, String str) {
        this.a = z2Var;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b(this.b, (ml1) obj);
    }
}
