package com.spotify.intentrouter;

import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ CommandRunner a;
    public final /* synthetic */ g b;

    public /* synthetic */ b(CommandRunner commandRunner, g gVar) {
        this.a = commandRunner;
        this.b = gVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d(this.b, (io.reactivex.disposables.b) obj);
    }
}
