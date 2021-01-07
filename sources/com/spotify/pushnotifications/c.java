package com.spotify.pushnotifications;

import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ g a;

    public /* synthetic */ c(g gVar) {
        this.a = gVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d((Throwable) obj);
    }
}
