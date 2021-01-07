package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.jvm.internal.h;
import retrofit2.HttpException;

/* renamed from: ve0  reason: default package */
public final class ve0 implements se0 {
    ve0() {
    }

    @Override // defpackage.se0
    public Integer a(Throwable th) {
        int i;
        h.e(th, "t");
        h.e(th, "throwable");
        if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
            i = 408;
        } else if (th instanceof IOException) {
            i = -1;
        } else {
            i = th instanceof HttpException ? ((HttpException) th).a() : -2;
        }
        return Integer.valueOf(i);
    }
}
