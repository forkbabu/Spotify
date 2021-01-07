package defpackage;

import defpackage.ckf;
import io.netty.channel.d;
import io.netty.channel.g;
import io.netty.channel.h;
import io.netty.channel.p;
import io.netty.channel.v;
import io.netty.util.concurrent.r;
import io.netty.util.concurrent.s;
import io.netty.util.e;
import io.netty.util.internal.logging.c;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Map;

/* renamed from: fkf  reason: default package */
public class fkf extends ckf<fkf, d> {
    private static final io.netty.util.internal.logging.b s = c.b(fkf.class.getName());
    private static final zkf<?> t = alf.c;
    private final gkf p = new gkf(this);
    private volatile zkf<SocketAddress> q = t;
    private volatile SocketAddress r;

    /* access modifiers changed from: package-private */
    /* renamed from: fkf$a */
    public class a implements Object<SocketAddress> {
        final /* synthetic */ d c;
        final /* synthetic */ v d;
        final /* synthetic */ SocketAddress e;

        a(fkf fkf, d dVar, v vVar, SocketAddress socketAddress) {
            this.c = dVar;
            this.d = vVar;
            this.e = socketAddress;
        }

        public void a(r<SocketAddress> rVar) {
            if (rVar.r() != null) {
                this.c.close();
                this.d.mo85g(rVar.r());
                return;
            }
            fkf.w(rVar.s(), this.e, this.d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fkf$b */
    public static class b implements Runnable {
        final /* synthetic */ SocketAddress a;
        final /* synthetic */ d b;
        final /* synthetic */ SocketAddress c;
        final /* synthetic */ v f;

        b(SocketAddress socketAddress, d dVar, SocketAddress socketAddress2, v vVar) {
            this.a = socketAddress;
            this.b = dVar;
            this.c = socketAddress2;
            this.f = vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            SocketAddress socketAddress = this.a;
            if (socketAddress == null) {
                this.b.h0(this.c, this.f);
            } else {
                this.b.u(this.c, socketAddress, this.f);
            }
            this.f.mo86d((s<? extends r<? super Void>>) h.b);
        }
    }

    static {
        int i = c.b;
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: zkf<?>, zkf<java.net.SocketAddress> */
    public fkf() {
    }

    /* access modifiers changed from: private */
    public static void w(SocketAddress socketAddress, SocketAddress socketAddress2, v vVar) {
        d h = vVar.h();
        h.V().execute(new b(socketAddress2, h, socketAddress, vVar));
    }

    /* access modifiers changed from: private */
    public g x(d dVar, SocketAddress socketAddress, SocketAddress socketAddress2, v vVar) {
        try {
            ykf<SocketAddress> b2 = this.q.b(dVar.V());
            if (b2.u1(socketAddress)) {
                if (!b2.g2(socketAddress)) {
                    r<SocketAddress> F1 = b2.F1(socketAddress);
                    if (F1.isDone()) {
                        Throwable r2 = F1.r();
                        if (r2 != null) {
                            dVar.close();
                            vVar.mo85g(r2);
                        } else {
                            w(F1.s(), socketAddress2, vVar);
                        }
                        return vVar;
                    }
                    F1.mo86d(new a(this, dVar, vVar, socketAddress2));
                    return vVar;
                }
            }
            w(socketAddress, socketAddress2, vVar);
            return vVar;
        } catch (Throwable th) {
            vVar.n(th);
        }
    }

    @Override // java.lang.Object
    public Object clone() {
        return new fkf(this);
    }

    /* Return type fixed from 'dkf' to match base method */
    @Override // defpackage.ckf
    public dkf<fkf, d> f() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.ckf
    public void n(d dVar) {
        dVar.o().A0(this.p.a());
        Map<p<?>, Object> r2 = r();
        synchronized (r2) {
            for (Map.Entry<p<?>, Object> entry : r2.entrySet()) {
                try {
                    if (!dVar.X().a(entry.getKey(), entry.getValue())) {
                        io.netty.util.internal.logging.b bVar = s;
                        bVar.v("Unknown channel option: " + entry);
                    }
                } catch (Throwable th) {
                    io.netty.util.internal.logging.b bVar2 = s;
                    bVar2.j("Failed to set a channel option: " + dVar, th);
                }
            }
        }
        Map<e<?>, Object> c = c();
        synchronized (c) {
            for (Map.Entry<e<?>, Object> entry2 : c.entrySet()) {
                dVar.O(entry2.getKey()).set(entry2.getValue());
            }
        }
    }

    public g v(String str, int i) {
        InetSocketAddress createUnresolved = InetSocketAddress.createUnresolved(str, i);
        if (createUnresolved != null) {
            s();
            if (this.p.a() != null) {
                SocketAddress p2 = this.p.a.p();
                g o = o();
                d h = o.h();
                if (!o.isDone()) {
                    ckf.a aVar = new ckf.a(h);
                    o.mo86d((s<? extends r<? super Void>>) new ekf(this, aVar, h, createUnresolved, p2));
                    return aVar;
                } else if (!o.x()) {
                    return o;
                } else {
                    return x(h, createUnresolved, p2, h.q());
                }
            } else {
                throw new IllegalStateException("handler not set");
            }
        } else {
            throw new NullPointerException("remoteAddress");
        }
    }

    /* access modifiers changed from: package-private */
    public final SocketAddress y() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public final zkf<?> z() {
        return this.q;
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: zkf<?>, zkf<java.net.SocketAddress> */
    private fkf(fkf fkf) {
        super(fkf);
        this.q = fkf.q;
        this.r = fkf.r;
    }
}
