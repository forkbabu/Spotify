package com.spotify.music.features.editplaylist.operations;

import io.reactivex.t;
import io.reactivex.u;

public final /* synthetic */ class h implements u {
    public final /* synthetic */ SetPictureOperationHandler a;
    public final /* synthetic */ o0 b;

    public /* synthetic */ h(SetPictureOperationHandler setPictureOperationHandler, o0 o0Var) {
        this.a = setPictureOperationHandler;
        this.b = o0Var;
    }

    @Override // io.reactivex.u
    public final void subscribe(t tVar) {
        this.a.b(this.b, tVar);
    }
}
