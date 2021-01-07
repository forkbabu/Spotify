package com.spotify.music.libs.bluetooth;

import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ j a;
    public final /* synthetic */ String b;

    public /* synthetic */ b(j jVar, String str) {
        this.a = jVar;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d(this.b, (CategorizerResponse) obj);
    }
}
