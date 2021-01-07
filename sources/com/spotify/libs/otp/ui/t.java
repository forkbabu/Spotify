package com.spotify.libs.otp.ui;

import io.reactivex.functions.g;

public final /* synthetic */ class t implements g {
    public final /* synthetic */ l0 a;
    public final /* synthetic */ String b;

    public /* synthetic */ t(l0 l0Var, String str) {
        this.a = l0Var;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.e(this.b, (m0) obj);
    }
}
