package com.spotify.libs.connect;

import io.reactivex.functions.g;
import io.reactivex.x;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ p a;
    public final /* synthetic */ x b;

    public /* synthetic */ e(p pVar, x xVar) {
        this.a = pVar;
        this.b = xVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b(this.b, (Float) obj);
    }
}
