package io.netty.handler.ssl;

import io.netty.handler.ssl.h;
import javax.net.ssl.SSLEngine;

public final class f extends i {
    private static final h.e i = new a();

    static class a implements h.e {
        a() {
            if (!g.b()) {
                throw new RuntimeException("ALPN unsupported. Is your classpatch configured correctly? See http://www.eclipse.org/jetty/documentation/current/alpn-chapter.html#alpn-starting");
            }
        }

        @Override // io.netty.handler.ssl.h.e
        public SSLEngine a(SSLEngine sSLEngine, h hVar, boolean z) {
            return new g(sSLEngine, hVar, z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(boolean z, Iterable<String> iterable) {
        super(i, z ? i.e : i.f, z ? i.g : i.h, iterable);
    }
}
