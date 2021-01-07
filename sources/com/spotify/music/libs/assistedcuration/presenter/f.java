package com.spotify.music.libs.assistedcuration.presenter;

import io.reactivex.functions.n;

public final /* synthetic */ class f implements n {
    public final /* synthetic */ t a;

    public /* synthetic */ f(t tVar) {
        this.a = tVar;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return this.a.b((Integer) obj);
    }
}
