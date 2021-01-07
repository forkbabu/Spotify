package com.spotify.mobile.android.service.media.search;

import android.os.Bundle;
import io.reactivex.functions.l;

public final /* synthetic */ class b implements l {
    public final /* synthetic */ f a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int f;
    public final /* synthetic */ Bundle n;

    public /* synthetic */ b(f fVar, String str, int i, int i2, Bundle bundle) {
        this.a = fVar;
        this.b = str;
        this.c = i;
        this.f = i2;
        this.n = bundle;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, this.c, this.f, this.n, (Boolean) obj);
    }
}
