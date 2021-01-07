package defpackage;

import defpackage.ckf;
import io.netty.channel.d;
import io.netty.channel.g;
import io.netty.channel.h;
import java.net.SocketAddress;

/* access modifiers changed from: package-private */
/* renamed from: ekf  reason: default package */
public class ekf implements h {
    final /* synthetic */ ckf.a c;
    final /* synthetic */ d d;
    final /* synthetic */ SocketAddress e;
    final /* synthetic */ SocketAddress f;
    final /* synthetic */ fkf g;

    ekf(fkf fkf, ckf.a aVar, d dVar, SocketAddress socketAddress, SocketAddress socketAddress2) {
        this.g = fkf;
        this.c = aVar;
        this.d = dVar;
        this.e = socketAddress;
        this.f = socketAddress2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.netty.util.concurrent.r] */
    @Override // io.netty.util.concurrent.s
    public void a(g gVar) {
        Throwable r = gVar.r();
        if (r != null) {
            this.c.mo85g(r);
            return;
        }
        this.c.P();
        g unused = this.g.x(this.d, this.e, this.f, this.c);
    }
}
