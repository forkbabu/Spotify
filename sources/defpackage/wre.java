package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.net.HostAndPort;
import io.netty.channel.d;
import io.netty.channel.i;
import io.netty.channel.n;
import io.netty.channel.t;
import io.netty.handler.codec.http.m;
import io.netty.handler.logging.a;
import io.netty.handler.ssl.g0;
import io.reactivex.h;

/* renamed from: wre  reason: default package */
public class wre extends n<d> {
    private final i f = new a();
    private final h<?> n;
    private final g0 o;
    private final ObjectMapper p;
    private final HostAndPort q;

    public wre(h<?> hVar, g0 g0Var, ObjectMapper objectMapper, HostAndPort hostAndPort) {
        this.n = hVar;
        this.o = g0Var;
        this.p = objectMapper;
        this.q = hostAndPort;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.channel.n
    public void b(d dVar) {
        t o2 = dVar.o();
        h<?> hVar = this.n;
        o2.A0(this.o.g(dVar.t(), this.q.getHost(), this.q.getPort()), new m(), this.f, new zre(hVar), new ase(hVar), new wkf(), new qre(this.p));
    }
}
