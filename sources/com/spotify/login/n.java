package com.spotify.login;

import io.reactivex.functions.g;

public final /* synthetic */ class n implements g {
    public final /* synthetic */ s0 a;
    public final /* synthetic */ String b;

    public /* synthetic */ n(s0 s0Var, String str) {
        this.a = s0Var;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        s0 s0Var = this.a;
        String str = this.b;
        s0Var.getClass();
        ((w0) obj).b(new d0(s0Var, str), new e0(s0Var, str));
    }
}
