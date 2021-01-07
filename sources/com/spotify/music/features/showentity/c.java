package com.spotify.music.features.showentity;

import com.spotify.music.features.showentity.r;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ b0 a;

    public /* synthetic */ c(b0 b0Var) {
        this.a = b0Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        r.d dVar = (r.d) obj;
        ((ShowEntityResolverFragment) this.a).M4(dVar.b(), dVar.a());
    }
}
