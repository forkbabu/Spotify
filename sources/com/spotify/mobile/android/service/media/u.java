package com.spotify.mobile.android.service.media;

import io.reactivex.functions.a;

public final /* synthetic */ class u implements a {
    public final /* synthetic */ c2 a;
    public final /* synthetic */ String b;

    public /* synthetic */ u(c2 c2Var, String str) {
        this.a = c2Var;
        this.b = str;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.m(this.b);
    }
}
