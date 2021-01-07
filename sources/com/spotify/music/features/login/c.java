package com.spotify.music.features.login;

import com.spotify.cosmos.session.model.LoginResponse;
import io.reactivex.functions.l;
import java.util.concurrent.Callable;

public final /* synthetic */ class c implements l {
    public final /* synthetic */ g1 a;
    public final /* synthetic */ l b;
    public final /* synthetic */ Callable c;

    public /* synthetic */ c(g1 g1Var, l lVar, Callable callable) {
        this.a = g1Var;
        this.b = lVar;
        this.c = callable;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(this.b, this.c, (LoginResponse) obj);
    }
}
