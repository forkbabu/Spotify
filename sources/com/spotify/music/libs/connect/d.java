package com.spotify.music.libs.connect;

import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ n a;

    public /* synthetic */ d(n nVar) {
        this.a = nVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.k((Throwable) obj);
    }
}
