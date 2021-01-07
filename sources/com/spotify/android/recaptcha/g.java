package com.spotify.android.recaptcha;

public final /* synthetic */ class g implements io.reactivex.functions.g {
    public final /* synthetic */ r a;
    public final /* synthetic */ String b;

    public /* synthetic */ g(r rVar, String str) {
        this.a = rVar;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.e(this.b, (String) obj);
    }
}
