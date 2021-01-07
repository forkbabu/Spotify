package defpackage;

import com.spotify.base.java.logging.Logger;
import io.netty.handler.ssl.g0;
import io.netty.handler.ssl.h0;
import javax.net.ssl.SSLException;

/* renamed from: xse  reason: default package */
public final class xse implements fjf<g0> {

    /* renamed from: xse$a */
    private static final class a {
        private static final xse a = new xse();
    }

    public static xse a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        try {
            return h0.b().a();
        } catch (SSLException e) {
            Logger.e(e, "failed to get SSL context", new Object[0]);
            return null;
        }
    }
}
