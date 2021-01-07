package com.spotify.music.features.login;

import io.reactivex.d0;
import io.reactivex.functions.l;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements l {
    public final /* synthetic */ Callable a;

    public /* synthetic */ b(Callable callable) {
        this.a = callable;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        return (d0) this.a.call();
    }
}
