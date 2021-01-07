package com.spotify.music.libs.mediabrowserservice;

import io.reactivex.functions.g;

public final /* synthetic */ class l implements g {
    public final /* synthetic */ g a;

    public /* synthetic */ l(g gVar) {
        this.a = gVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        this.a.accept(null);
    }
}
