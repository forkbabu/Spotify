package com.spotify.music.libs.mediabrowserservice;

import io.reactivex.a0;
import io.reactivex.c0;

public final /* synthetic */ class q0 implements c0 {
    public final /* synthetic */ t2 a;
    public final /* synthetic */ String b;

    public /* synthetic */ q0(t2 t2Var, String str) {
        this.a = t2Var;
        this.b = str;
    }

    @Override // io.reactivex.c0
    public final void subscribe(a0 a0Var) {
        this.a.a(this.b, a0Var);
    }
}
