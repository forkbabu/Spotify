package com.spotify.music.libs.performance.tracking;

import com.spotify.messages.ViewLoadSequence;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ c0 a;

    public /* synthetic */ d(c0 c0Var) {
        this.a = c0Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c((ViewLoadSequence) obj);
    }
}
