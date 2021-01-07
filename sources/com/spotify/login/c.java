package com.spotify.login;

import io.reactivex.disposables.b;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ s0 a;
    public final /* synthetic */ String b;

    public /* synthetic */ c(s0 s0Var, String str) {
        this.a = s0Var;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.j(this.b, (b) obj);
    }
}
