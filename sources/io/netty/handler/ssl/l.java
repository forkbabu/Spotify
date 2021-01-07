package io.netty.handler.ssl;

import io.netty.handler.ssl.h;
import java.util.LinkedHashSet;
import javax.net.ssl.SSLEngine;
import org.eclipse.jetty.npn.NextProtoNego;

final class l extends o {
    private static boolean c;

    class a implements NextProtoNego.ServerProvider {
        final /* synthetic */ h.a a;
        final /* synthetic */ h b;

        a(l lVar, h.a aVar, h hVar) {
            this.a = aVar;
            this.b = hVar;
        }
    }

    class b implements NextProtoNego.ClientProvider {
        final /* synthetic */ h.c a;

        b(l lVar, h.c cVar) {
            this.a = cVar;
        }
    }

    l(SSLEngine sSLEngine, h hVar, boolean z) {
        super(sSLEngine);
        if (hVar == null) {
            throw new NullPointerException("applicationNegotiator");
        } else if (z) {
            h.a a2 = hVar.d().a(this, hVar.c());
            yif.i(a2, "protocolListener");
            NextProtoNego.put(sSLEngine, new a(this, a2, hVar));
        } else {
            h.c a3 = hVar.f().a(this, new LinkedHashSet(hVar.c()));
            yif.i(a3, "protocolSelector");
            NextProtoNego.put(sSLEngine, new b(this, a3));
        }
    }

    static boolean b() {
        if (!c) {
            try {
                Class.forName("sun.security.ssl.NextProtoNegoExtension", true, null);
                c = true;
            } catch (Exception unused) {
            }
        }
        return c;
    }

    @Override // io.netty.handler.ssl.o, javax.net.ssl.SSLEngine
    public void closeInbound() {
        NextProtoNego.remove(a());
        super.closeInbound();
    }

    @Override // io.netty.handler.ssl.o, javax.net.ssl.SSLEngine
    public void closeOutbound() {
        NextProtoNego.remove(a());
        super.closeOutbound();
    }
}
