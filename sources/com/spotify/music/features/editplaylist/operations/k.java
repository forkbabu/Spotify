package com.spotify.music.features.editplaylist.operations;

import io.reactivex.functions.a;

public final /* synthetic */ class k implements a {
    public final /* synthetic */ SetPictureOperationHandler a;
    public final /* synthetic */ o0 b;

    public /* synthetic */ k(SetPictureOperationHandler setPictureOperationHandler, o0 o0Var) {
        this.a = setPictureOperationHandler;
        this.b = o0Var;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.c(this.b);
    }
}
