package com.spotify.music.libs.mediabrowserservice;

import io.reactivex.functions.g;

public final /* synthetic */ class s implements g {
    public final /* synthetic */ x1 a;

    public /* synthetic */ s(x1 x1Var) {
        this.a = x1Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        x1.b(this.a, ((Boolean) obj).booleanValue());
    }
}
