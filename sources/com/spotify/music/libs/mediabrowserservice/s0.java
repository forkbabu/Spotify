package com.spotify.music.libs.mediabrowserservice;

import com.google.common.base.Optional;
import io.reactivex.functions.g;

public final /* synthetic */ class s0 implements g {
    public final /* synthetic */ x2 a;

    public /* synthetic */ s0(x2 x2Var) {
        this.a = x2Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c((Optional) obj);
    }
}
