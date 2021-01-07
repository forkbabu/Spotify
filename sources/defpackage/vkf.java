package defpackage;

import defpackage.ikf;
import io.netty.buffer.j;
import io.netty.channel.AbstractChannel;
import io.netty.channel.ChannelException;
import io.netty.channel.d;
import io.netty.channel.e;
import io.netty.channel.e0;
import io.netty.channel.g;
import io.netty.channel.k0;
import io.netty.channel.v;
import io.netty.util.concurrent.t;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.logging.c;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;
import java.util.concurrent.Executor;

/* renamed from: vkf  reason: default package */
public class vkf extends ikf implements qkf {
    private static final SelectorProvider R = SelectorProvider.provider();
    private final rkf Q;

    /* renamed from: vkf$a */
    private final class a extends pkf {
        a(vkf vkf, Socket socket, skf skf) {
            super(vkf, socket);
        }

        /* access modifiers changed from: protected */
        @Override // io.netty.channel.y
        public void c() {
            vkf.this.Y0();
        }
    }

    /* renamed from: vkf$b */
    private final class b extends ikf.b {
        b(skf skf) {
            super();
        }

        /* access modifiers changed from: protected */
        @Override // io.netty.channel.AbstractChannel.a
        public Executor r() {
            try {
                if (!vkf.this.c1().isOpen() || ((pkf) vkf.this.o1()).y() <= 0) {
                    return null;
                }
                vkf.this.F0();
                return t.w;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    static {
        int i = c.b;
        c.b(vkf.class.getName());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public vkf() {
        this(null, R.openSocketChannel());
        try {
        } catch (IOException e) {
            throw new ChannelException("Failed to open a socket.", e);
        }
    }

    /* access modifiers changed from: private */
    public void q1(v vVar) {
        try {
            if (PlatformDependent.J() >= 7) {
                c1().shutdownInput();
            } else {
                c1().socket().shutdownInput();
            }
            vVar.m();
        } catch (Throwable th) {
            vVar.mo85g(th);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jkf, io.netty.channel.AbstractChannel
    public void E0() {
        super.E0();
        c1().close();
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.channel.AbstractChannel
    public void G0() {
        E0();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        r9 = r8;
        r8 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0077 A[SYNTHETIC] */
    @Override // defpackage.ikf, io.netty.channel.AbstractChannel
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void I0(io.netty.channel.q r18) {
        /*
            r17 = this;
            r0 = r17
        L_0x0002:
            int r1 = r18.u()
            if (r1 != 0) goto L_0x000d
            r17.f1()
            goto L_0x007a
        L_0x000d:
            java.nio.ByteBuffer[] r1 = r18.p()
            int r2 = r18.n()
            long r3 = r18.o()
            java.nio.channels.SocketChannel r5 = r17.c1()
            if (r2 == 0) goto L_0x007b
            r6 = 0
            r8 = 1
            r9 = 0
            if (r2 == r8) goto L_0x0048
            rkf r10 = r0.Q
            io.netty.channel.y r10 = (io.netty.channel.y) r10
            int r10 = r10.j()
            int r10 = r10 - r8
            r11 = r6
        L_0x002f:
            if (r10 < 0) goto L_0x0044
            long r13 = r5.write(r1, r9, r2)
            int r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r15 != 0) goto L_0x003a
            goto L_0x006b
        L_0x003a:
            long r3 = r3 - r13
            long r11 = r11 + r13
            int r13 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r13 != 0) goto L_0x0041
            goto L_0x0045
        L_0x0041:
            int r10 = r10 + -1
            goto L_0x002f
        L_0x0044:
            r8 = 0
        L_0x0045:
            r1 = r18
            goto L_0x0072
        L_0x0048:
            r1 = r1[r9]
            rkf r2 = r0.Q
            io.netty.channel.y r2 = (io.netty.channel.y) r2
            int r2 = r2.j()
            int r2 = r2 - r8
            r11 = r6
        L_0x0054:
            if (r2 < 0) goto L_0x0068
            int r10 = r5.write(r1)
            if (r10 != 0) goto L_0x005d
            goto L_0x006b
        L_0x005d:
            long r13 = (long) r10
            long r3 = r3 - r13
            long r11 = r11 + r13
            int r10 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0065
            goto L_0x0069
        L_0x0065:
            int r2 = r2 + -1
            goto L_0x0054
        L_0x0068:
            r8 = 0
        L_0x0069:
            r9 = r8
            r8 = 0
        L_0x006b:
            r1 = r18
            r16 = r9
            r9 = r8
            r8 = r16
        L_0x0072:
            r1.s(r11)
            if (r8 != 0) goto L_0x0002
            r0.j1(r9)
        L_0x007a:
            return
        L_0x007b:
            r1 = r18
            super.I0(r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vkf.I0(io.netty.channel.q):void");
    }

    @Override // io.netty.channel.AbstractChannel
    public SocketAddress M0() {
        return (InetSocketAddress) super.M0();
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.channel.AbstractChannel
    public SocketAddress N0() {
        return c1().socket().getLocalSocketAddress();
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.channel.AbstractChannel
    public AbstractChannel.a O0() {
        return new b(null);
    }

    @Override // io.netty.channel.AbstractChannel
    public SocketAddress P0() {
        return (InetSocketAddress) super.P0();
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.channel.AbstractChannel
    public SocketAddress Q0() {
        return c1().socket().getRemoteSocketAddress();
    }

    @Override // io.netty.channel.d
    public e X() {
        return this.Q;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jkf
    public boolean Z0(SocketAddress socketAddress, SocketAddress socketAddress2) {
        if (socketAddress2 != null) {
            if (PlatformDependent.J() >= 7) {
                c1().bind(socketAddress2);
            } else {
                c1().socket().bind(socketAddress2);
            }
        }
        try {
            boolean connect = c1().connect(socketAddress);
            if (!connect) {
                d1().interestOps(8);
            }
            return connect;
        } catch (Throwable th) {
            E0();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jkf
    public void a1() {
        if (!c1().finishConnect()) {
            throw new Error();
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ikf
    public int g1(j jVar) {
        e0.a aVar = (e0.a) l0().y();
        aVar.d(jVar.O1());
        return jVar.Q1(c1(), aVar.c());
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ikf
    public int h1(j jVar) {
        return jVar.d1(c1(), jVar.m1());
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ikf
    public long i1(k0 k0Var) {
        return k0Var.k(c1(), k0Var.i());
    }

    @Override // io.netty.channel.d
    public boolean isActive() {
        SocketChannel p1 = c1();
        return p1.isOpen() && p1.isConnected();
    }

    @Override // defpackage.ikf
    public g k1() {
        v q = q();
        Executor r = ((b) l0()).r();
        if (r != null) {
            ((t) r).execute(new tkf(this, q));
        } else {
            kkf b1 = V();
            if (b1.G()) {
                q1(q);
            } else {
                b1.execute(new ukf(this, q));
            }
        }
        return q;
    }

    public rkf o1() {
        return this.Q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p1 */
    public SocketChannel c1() {
        return (SocketChannel) super.c1();
    }

    public vkf(d dVar, SocketChannel socketChannel) {
        super(null, socketChannel);
        this.Q = new a(this, socketChannel.socket(), null);
    }
}
