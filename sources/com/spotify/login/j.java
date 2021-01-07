package com.spotify.login;

import io.reactivex.functions.g;

public final /* synthetic */ class j implements g {
    public final /* synthetic */ s0 a;
    public final /* synthetic */ re0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ j(s0 s0Var, re0 re0, String str) {
        this.a = s0Var;
        this.b = re0;
        this.c = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        s0 s0Var = this.a;
        re0 re0 = this.b;
        String str = this.c;
        s0Var.getClass();
        ((w0) obj).b(new u(s0Var, re0, str), new b0(s0Var, re0, str));
    }
}
