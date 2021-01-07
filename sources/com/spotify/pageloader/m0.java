package com.spotify.pageloader;

import com.spotify.pageloader.l0;
import io.reactivex.z;
import java.io.IOException;
import retrofit2.HttpException;

public final class m0 {
    public static <T> o0<T> a(z<T> zVar) {
        return new c(zVar.P().j0(j0.a).G0((R) new l0.c()).r0(a.a));
    }

    public static <T> l0<T> b(Throwable th) {
        NetworkErrorReason networkErrorReason = NetworkErrorReason.UNKNOWN;
        if (th instanceof IOException) {
            return new l0.d(th, networkErrorReason);
        }
        if (!(th instanceof HttpException)) {
            return new l0.f(th);
        }
        int a = ((HttpException) th).a();
        if (a == 404) {
            return new l0.e();
        }
        if (a != 503) {
            return new l0.f(th);
        }
        return new l0.d(th, networkErrorReason);
    }
}
