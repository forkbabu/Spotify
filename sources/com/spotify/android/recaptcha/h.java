package com.spotify.android.recaptcha;

import io.reactivex.functions.g;

public final /* synthetic */ class h implements g {
    public final /* synthetic */ r a;
    public final /* synthetic */ String b;

    public /* synthetic */ h(r rVar, String str) {
        this.a = rVar;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.f(this.b, (Throwable) obj);
    }
}
