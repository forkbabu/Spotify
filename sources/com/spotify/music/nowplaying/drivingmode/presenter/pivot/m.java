package com.spotify.music.nowplaying.drivingmode.presenter.pivot;

import io.reactivex.functions.g;

public final /* synthetic */ class m implements g {
    public final /* synthetic */ n0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String f;

    public /* synthetic */ m(n0 n0Var, String str, boolean z, String str2) {
        this.a = n0Var;
        this.b = str;
        this.c = z;
        this.f = str2;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.j(this.b, this.c, this.f, (Throwable) obj);
    }
}
