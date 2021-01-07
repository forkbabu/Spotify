package com.spotify.music.homecomponents.shortcuts;

import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ k a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ s81 f;
    public final /* synthetic */ w51 n;

    public /* synthetic */ c(k kVar, String str, boolean z, s81 s81, w51 w51) {
        this.a = kVar;
        this.b = str;
        this.c = z;
        this.f = s81;
        this.n = w51;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        HomeShortcutsItemComponent.f(this.a, this.b, this.c, this.f, this.n, (u3) obj);
    }
}
