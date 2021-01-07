package com.spotify.music.sleeptimer;

import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ l a;
    public final /* synthetic */ String b;

    public /* synthetic */ b(l lVar, String str) {
        this.a = lVar;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.f(this.b, (u3) obj);
    }
}
