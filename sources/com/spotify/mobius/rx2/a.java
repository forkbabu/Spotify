package com.spotify.mobius.rx2;

import io.reactivex.functions.g;
import io.reactivex.w;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ w a;

    public /* synthetic */ a(w wVar) {
        this.a = wVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        io.reactivex.plugins.a.g(EffectHandlerException.a(this.a, (Throwable) obj));
    }
}
