package com.spotify.mobile.android.spotlets.appprotocol;

import io.reactivex.a0;
import io.reactivex.c0;

public final /* synthetic */ class j1 implements c0 {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ String b;

    public /* synthetic */ j1(String[] strArr, String str) {
        this.a = strArr;
        this.b = str;
    }

    @Override // io.reactivex.c0
    public final void subscribe(a0 a0Var) {
        e4.N(this.a, this.b, a0Var);
    }
}
