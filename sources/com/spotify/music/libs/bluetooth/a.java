package com.spotify.music.libs.bluetooth;

import io.reactivex.functions.g;
import io.reactivex.h;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ h a;

    public /* synthetic */ a(h hVar) {
        this.a = hVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        h hVar = this.a;
        Throwable th = (Throwable) obj;
        if (!hVar.isCancelled()) {
            hVar.onError(th);
        }
    }
}
