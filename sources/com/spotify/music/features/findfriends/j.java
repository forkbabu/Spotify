package com.spotify.music.features.findfriends;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.findfriends.p0;
import io.reactivex.functions.l;
import io.reactivex.s;
import retrofit2.HttpException;

public final /* synthetic */ class j implements l {
    public final /* synthetic */ p0 a;

    public /* synthetic */ j(p0 p0Var) {
        this.a = p0Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        p0 p0Var = this.a;
        Throwable th = (Throwable) obj;
        if (th instanceof HttpException) {
            HttpException httpException = (HttpException) th;
            Logger.d("Find friends http error: %s", httpException.getMessage());
            int a2 = httpException.a();
            if (a2 == 403 || a2 == 404) {
                p0.a d = p0Var.d();
                d.c(Optional.of(Boolean.TRUE));
                return s.i0(d.a());
            }
        }
        return s.P(th);
    }
}
