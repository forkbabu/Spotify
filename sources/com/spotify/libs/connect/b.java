package com.spotify.libs.connect;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;
import io.reactivex.x;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ x a;

    public /* synthetic */ b(x xVar) {
        this.a = xVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        x xVar = this.a;
        Logger.e((Throwable) obj, "Failed to resolve volume controller", new Object[0]);
        xVar.onNext(Float.valueOf(0.0f));
    }
}
