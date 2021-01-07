package com.spotify.music.libs.bluetooth;

import io.reactivex.h;

public final /* synthetic */ class g implements io.reactivex.functions.g {
    public final /* synthetic */ h a;

    public /* synthetic */ g(h hVar) {
        this.a = hVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.onNext((CategorizerResponse) obj);
    }
}
