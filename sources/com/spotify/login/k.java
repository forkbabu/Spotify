package com.spotify.login;

import io.reactivex.disposables.b;
import io.reactivex.functions.g;

public final /* synthetic */ class k implements g {
    public final /* synthetic */ s0 a;
    public final /* synthetic */ re0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ k(s0 s0Var, re0 re0, String str) {
        this.a = s0Var;
        this.b = re0;
        this.c = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.k(this.b, this.c, (b) obj);
    }
}
