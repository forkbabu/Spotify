package com.spotify.music.libs.bluetooth;

import io.reactivex.h;
import io.reactivex.i;

public final /* synthetic */ class c implements i {
    public final /* synthetic */ j a;
    public final /* synthetic */ String b;

    public /* synthetic */ c(j jVar, String str) {
        this.a = jVar;
        this.b = str;
    }

    @Override // io.reactivex.i
    public final void subscribe(h hVar) {
        this.a.c(this.b, hVar);
    }
}
