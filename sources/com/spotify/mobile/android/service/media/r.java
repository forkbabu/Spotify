package com.spotify.mobile.android.service.media;

import io.reactivex.functions.l;

public final /* synthetic */ class r implements l {
    public final /* synthetic */ c2 a;
    public final /* synthetic */ String b;

    public /* synthetic */ r(c2 c2Var, String str) {
        this.a = c2Var;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.h(this.b, (Boolean) obj);
    }
}
