package com.spotify.mobile.android.service.media.search;

import android.os.Bundle;
import io.reactivex.a0;
import io.reactivex.c0;

public final /* synthetic */ class c implements c0 {
    public final /* synthetic */ j a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int f;
    public final /* synthetic */ int n;
    public final /* synthetic */ Bundle o;

    public /* synthetic */ c(j jVar, String str, String str2, int i, int i2, Bundle bundle) {
        this.a = jVar;
        this.b = str;
        this.c = str2;
        this.f = i;
        this.n = i2;
        this.o = bundle;
    }

    @Override // io.reactivex.c0
    public final void subscribe(a0 a0Var) {
        this.a.a(this.b, this.c, this.f, this.n, this.o, a0Var);
    }
}
