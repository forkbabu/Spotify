package com.spotify.music.features.premiumreactivation;

import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ m a;
    public final /* synthetic */ String b;

    public /* synthetic */ c(m mVar, String str) {
        this.a = mVar;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a(this.b, (Integer) obj);
    }
}
