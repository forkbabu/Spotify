package com.spotify.music.features.premiumreactivation;

import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ m a;
    public final /* synthetic */ String b;

    public /* synthetic */ e(m mVar, String str) {
        this.a = mVar;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b(this.b, (Throwable) obj);
    }
}
