package com.spotify.imageresolve;

import com.google.common.collect.ImmutableMultimap;

public final /* synthetic */ class g implements io.reactivex.functions.g {
    public final /* synthetic */ w a;

    public /* synthetic */ g(w wVar) {
        this.a = wVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        w.b(this.a, (ImmutableMultimap) obj);
    }
}
