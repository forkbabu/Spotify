package io.netty.handler.codec;

import io.netty.channel.j;
import io.netty.channel.k;
import io.netty.channel.r;
import io.netty.channel.v;
import io.netty.util.internal.t;
import io.netty.util.n;
import java.net.SocketAddress;
import java.util.List;

/* JADX WARN: Incorrect class signature, class is equals to this class: <I:Ljava/lang/Object;>Lio/netty/handler/codec/i; */
public abstract class i<I> extends j implements r {
    private final t b = t.b(this, i.class, "I");

    protected i() {
    }

    @Override // io.netty.channel.r
    public void J(k kVar, SocketAddress socketAddress, SocketAddress socketAddress2, v vVar) {
        kVar.u(socketAddress, socketAddress2, vVar);
    }

    @Override // io.netty.channel.r
    public void L(k kVar) {
        kVar.read();
    }

    @Override // io.netty.channel.r
    public void Q(k kVar, v vVar) {
        kVar.i(vVar);
    }

    @Override // io.netty.channel.r
    public void U(k kVar, v vVar) {
        kVar.k(vVar);
    }

    /* JADX INFO: finally extract failed */
    @Override // io.netty.channel.r
    public void W(k kVar, Object obj, v vVar) {
        v vVar2;
        Throwable th;
        v vVar3;
        c h;
        c cVar = null;
        int i = 0;
        boolean z = true;
        try {
            if (b(obj)) {
                h = c.h();
                try {
                    c(kVar, obj, h);
                    n.a(obj);
                    if (!h.isEmpty()) {
                        cVar = h;
                    } else {
                        h.i();
                        throw new EncoderException(io.netty.util.internal.r.f(this) + " must produce at least one message.");
                    }
                } catch (Throwable th2) {
                    n.a(obj);
                    throw th2;
                }
            } else {
                kVar.x(obj, vVar);
            }
            if (cVar != null) {
                int size = cVar.size() - 1;
                if (size == 0) {
                    kVar.x(cVar.get(0), vVar);
                } else if (size > 0) {
                    v l = kVar.l();
                    if (vVar != l) {
                        z = false;
                    }
                    while (i < size) {
                        if (z) {
                            vVar3 = l;
                        } else {
                            vVar3 = kVar.q();
                        }
                        kVar.x(cVar.d(i), vVar3);
                        i++;
                    }
                    kVar.x(cVar.d(size), vVar);
                }
                cVar.i();
            }
        } catch (EncoderException e) {
            throw e;
        } catch (EncoderException e2) {
            throw e2;
        } catch (Throwable th3) {
            if (cVar != null) {
                int size2 = cVar.size() - 1;
                if (size2 == 0) {
                    kVar.x(cVar.get(0), vVar);
                } else if (size2 > 0) {
                    v l2 = kVar.l();
                    if (vVar != l2) {
                        z = false;
                    }
                    while (i < size2) {
                        if (z) {
                            vVar2 = l2;
                        } else {
                            vVar2 = kVar.q();
                        }
                        kVar.x(cVar.d(i), vVar2);
                        i++;
                    }
                    kVar.x(cVar.d(size2), vVar);
                }
                cVar.i();
            }
            throw th3;
        }
    }

    public boolean b(Object obj) {
        return this.b.d(obj);
    }

    /* access modifiers changed from: protected */
    public abstract void c(k kVar, I i, List<Object> list);

    @Override // io.netty.channel.r
    public void g(k kVar) {
        kVar.flush();
    }
}
