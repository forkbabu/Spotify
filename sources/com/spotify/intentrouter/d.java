package com.spotify.intentrouter;

import io.reactivex.functions.l;

public final /* synthetic */ class d implements l {
    public final /* synthetic */ CommandRunner a;
    public final /* synthetic */ g b;

    public /* synthetic */ d(CommandRunner commandRunner, g gVar) {
        this.a = commandRunner;
        this.b = gVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.f(this.b, (Throwable) obj);
    }
}
