package defpackage;

import io.netty.util.concurrent.r;
import io.netty.util.concurrent.y;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/* renamed from: clf  reason: default package */
class clf implements Object<InetAddress> {
    final /* synthetic */ y c;
    final /* synthetic */ InetSocketAddress d;

    clf(dlf dlf, y yVar, InetSocketAddress inetSocketAddress) {
        this.c = yVar;
        this.d = inetSocketAddress;
    }

    public void a(r<InetAddress> rVar) {
        if (rVar.x()) {
            this.c.v(new InetSocketAddress(rVar.s(), this.d.getPort()));
        } else {
            this.c.mo85g(rVar.r());
        }
    }
}
