package io.netty.handler.ssl;

import io.netty.handler.ssl.h;
import javax.net.ssl.SSLEngine;

public final class k extends i {
    private static final h.e i = new a();

    static class a implements h.e {
        a() {
            if (!l.b()) {
                throw new RuntimeException("NPN unsupported. Is your classpatch configured correctly? See https://wiki.eclipse.org/Jetty/Feature/NPN");
            }
        }

        @Override // io.netty.handler.ssl.h.e
        public SSLEngine a(SSLEngine sSLEngine, h hVar, boolean z) {
            return new l(sSLEngine, hVar, z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(boolean z, Iterable<String> iterable) {
        super(i, z ? i.e : i.f, z ? i.g : i.h, iterable);
    }
}
