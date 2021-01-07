package com.spotify.mobile.android.service.media;

public final /* synthetic */ class l implements io.reactivex.functions.l {
    public final /* synthetic */ c2 a;
    public final /* synthetic */ String b;

    public /* synthetic */ l(c2 c2Var, String str) {
        this.a = c2Var;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.n(this.b, (Boolean) obj);
    }
}
