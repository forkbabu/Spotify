package com.spotify.music.features.login;

import com.spotify.cosmos.session.model.LoginResponse;
import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public final /* synthetic */ g1 a;
    public final /* synthetic */ l b;

    public /* synthetic */ a(g1 g1Var, l lVar) {
        this.a = g1Var;
        this.b = lVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.a(this.b, (LoginResponse) obj);
    }
}
