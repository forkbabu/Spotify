package io.netty.handler.ssl;

import java.security.cert.CertificateFactory;

public final class h0 {
    private h0(boolean z) {
    }

    public static h0 b() {
        return new h0(false);
    }

    public g0 a() {
        SslProvider sslProvider;
        g0 g0Var;
        e eVar = e.a;
        CertificateFactory certificateFactory = g0.b;
        if (q.d()) {
            sslProvider = SslProvider.OPENSSL;
        } else {
            sslProvider = SslProvider.JDK;
        }
        int ordinal = sslProvider.ordinal();
        if (ordinal == 0) {
            g0Var = new m(null, null, null, null, null, null, null, eVar, null, 0, 0);
        } else if (ordinal == 1) {
            g0Var = new t(null, null, null, null, null, null, null, eVar, null, 0, 0);
        } else if (ordinal == 2) {
            return new e0(null, null, null, null, null, null, null, eVar, null, 0, 0);
        } else {
            throw new Error(sslProvider.toString());
        }
        return g0Var;
    }
}
