package com.spotify.imageresolve;

import com.spotify.imageresolve.proto.ProjectionMap;
import io.reactivex.functions.g;

public final /* synthetic */ class o implements g {
    public final /* synthetic */ b0 a;

    public /* synthetic */ o(b0 b0Var) {
        this.a = b0Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.e((ProjectionMap) obj);
    }
}
