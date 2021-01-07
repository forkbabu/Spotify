package io.netty.handler.ssl;

import io.netty.handler.ssl.h;
import java.util.LinkedHashSet;
import javax.net.ssl.SSLEngine;
import org.eclipse.jetty.alpn.ALPN;

final class g extends o {
    private static boolean c;

    class a implements ALPN.ServerProvider {
        final /* synthetic */ h.c a;

        a(g gVar, h.c cVar) {
            this.a = cVar;
        }
    }

    class b implements ALPN.ClientProvider {
        final /* synthetic */ h a;
        final /* synthetic */ h.a b;

        b(g gVar, h hVar, h.a aVar) {
            this.a = hVar;
            this.b = aVar;
        }
    }

    g(SSLEngine sSLEngine, h hVar, boolean z) {
        super(sSLEngine);
        if (hVar == null) {
            throw new NullPointerException("applicationNegotiator");
        } else if (z) {
            h.c a2 = hVar.f().a(this, new LinkedHashSet(hVar.c()));
            yif.i(a2, "protocolSelector");
            ALPN.put(sSLEngine, new a(this, a2));
        } else {
            h.a a3 = hVar.d().a(this, hVar.c());
            yif.i(a3, "protocolListener");
            ALPN.put(sSLEngine, new b(this, hVar, a3));
        }
    }

    static boolean b() {
        if (!c) {
            try {
                Class.forName("sun.security.ssl.ALPNExtension", true, null);
                c = true;
            } catch (Exception unused) {
            }
        }
        return c;
    }

    @Override // io.netty.handler.ssl.o, javax.net.ssl.SSLEngine
    public void closeInbound() {
        ALPN.remove(a());
        super.closeInbound();
    }

    @Override // io.netty.handler.ssl.o, javax.net.ssl.SSLEngine
    public void closeOutbound() {
        ALPN.remove(a());
        super.closeOutbound();
    }
}
