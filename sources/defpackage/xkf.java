package defpackage;

import io.netty.util.concurrent.l;
import io.netty.util.concurrent.r;
import io.netty.util.concurrent.y;
import io.netty.util.internal.t;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.UnsupportedAddressTypeException;

/* renamed from: xkf  reason: default package */
public abstract class xkf<T extends SocketAddress> implements ykf<T> {
    private final l a;
    private final t b;

    protected xkf(l lVar, Class<? extends T> cls) {
        if (lVar != null) {
            this.a = lVar;
            this.b = t.c(cls);
            return;
        }
        throw new NullPointerException("executor");
    }

    @Override // defpackage.ykf
    public final r<T> F1(SocketAddress socketAddress) {
        if (socketAddress == null) {
            throw new NullPointerException("address");
        } else if (!this.b.d(socketAddress)) {
            return this.a.X0(new UnsupportedAddressTypeException());
        } else {
            if (g2(socketAddress)) {
                return this.a.W(socketAddress);
            }
            try {
                y q = this.a.q();
                dlf dlf = (dlf) this;
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
                dlf.c.b(inetSocketAddress.getHostName()).mo86d(new clf(dlf, q, inetSocketAddress));
                return q;
            } catch (Exception e) {
                return this.a.X0(e);
            }
        }
    }

    @Override // defpackage.ykf
    public final boolean g2(SocketAddress socketAddress) {
        if (this.b.d(socketAddress)) {
            return !((InetSocketAddress) socketAddress).isUnresolved();
        }
        throw new UnsupportedAddressTypeException();
    }

    @Override // defpackage.ykf
    public boolean u1(SocketAddress socketAddress) {
        return this.b.d(socketAddress);
    }
}
