package io.netty.handler.ssl;

import io.netty.handler.ssl.h;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLEngine;

/* access modifiers changed from: package-private */
public final class j implements h {
    public static final j a = new j();
    private static final h.e b = new a();

    static class a implements h.e {
        a() {
        }

        @Override // io.netty.handler.ssl.h.e
        public SSLEngine a(SSLEngine sSLEngine, h hVar, boolean z) {
            return sSLEngine;
        }
    }

    private j() {
    }

    @Override // io.netty.handler.ssl.a
    public List<String> c() {
        return Collections.emptyList();
    }

    @Override // io.netty.handler.ssl.h
    public h.b d() {
        throw new UnsupportedOperationException("Application protocol negotiation unsupported");
    }

    @Override // io.netty.handler.ssl.h
    public h.d f() {
        throw new UnsupportedOperationException("Application protocol negotiation unsupported");
    }

    @Override // io.netty.handler.ssl.h
    public h.e g() {
        return b;
    }
}
