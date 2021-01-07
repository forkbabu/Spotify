package defpackage;

import io.netty.channel.AbstractChannel;
import io.netty.channel.ChannelException;
import io.netty.channel.ConnectTimeoutException;
import io.netty.channel.a0;
import io.netty.channel.d;
import io.netty.channel.g;
import io.netty.channel.h;
import io.netty.channel.i0;
import io.netty.channel.v;
import io.netty.channel.y;
import io.netty.util.concurrent.r;
import io.netty.util.concurrent.s;
import java.io.IOException;
import java.net.SocketAddress;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ConnectionPendingException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: jkf  reason: default package */
public abstract class jkf extends AbstractChannel {
    private static final io.netty.util.internal.logging.b L = io.netty.util.internal.logging.c.b(jkf.class.getName());
    private static final ClosedChannelException M;
    private final SelectableChannel D;
    protected final int E;
    volatile SelectionKey F;
    boolean G;
    private final Runnable H = new a();
    private v I;
    private ScheduledFuture<?> J;
    private SocketAddress K;

    /* renamed from: jkf$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            jkf jkf = jkf.this;
            jkf.G = false;
            ((b) jkf.l0()).F();
        }
    }

    /* renamed from: jkf$b */
    protected abstract class b extends AbstractChannel.a implements c {

        /* renamed from: jkf$b$a */
        class a implements Runnable {
            final /* synthetic */ SocketAddress a;

            a(SocketAddress socketAddress) {
                this.a = socketAddress;
            }

            @Override // java.lang.Runnable
            public void run() {
                v vVar = jkf.this.I;
                StringBuilder V0 = je.V0("connection timed out: ");
                V0.append(this.a);
                ConnectTimeoutException connectTimeoutException = new ConnectTimeoutException(V0.toString());
                if (vVar != null && vVar.n(connectTimeoutException)) {
                    b bVar = b.this;
                    bVar.k(bVar.l());
                }
            }
        }

        /* renamed from: jkf$b$b  reason: collision with other inner class name */
        class C0630b implements h {
            C0630b() {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.netty.util.concurrent.r] */
            @Override // io.netty.util.concurrent.s
            public void a(g gVar) {
                if (gVar.isCancelled()) {
                    if (jkf.this.J != null) {
                        jkf.this.J.cancel(false);
                    }
                    jkf.this.I = null;
                    b bVar = b.this;
                    bVar.k(bVar.l());
                }
            }
        }

        protected b() {
            super();
        }

        private void w(v vVar, boolean z) {
            if (vVar != null) {
                boolean isActive = ((vkf) jkf.this).isActive();
                boolean q = vVar.q();
                if (!z && isActive) {
                    ((a0) jkf.this.o()).Z();
                }
                if (!q) {
                    k(l());
                }
            }
        }

        /* access modifiers changed from: protected */
        public final void F() {
            SelectionKey selectionKey = jkf.this.F;
            if (selectionKey.isValid()) {
                int interestOps = selectionKey.interestOps();
                int i = jkf.this.E;
                if ((interestOps & i) != 0) {
                    selectionKey.interestOps(interestOps & (i ^ -1));
                }
            }
        }

        @Override // defpackage.jkf.c
        public final void a() {
            super.p();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
            if (r5.f.J == null) goto L_0x0029;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x001e, code lost:
            if (r5.f.J != null) goto L_0x0020;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
            r5.f.J.cancel(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
            r5.f.I = null;
         */
        @Override // defpackage.jkf.c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b() {
            /*
                r5 = this;
                r0 = 0
                r1 = 0
                jkf r2 = defpackage.jkf.this     // Catch:{ all -> 0x002f }
                vkf r2 = (defpackage.vkf) r2
                boolean r2 = r2.isActive()
                jkf r3 = defpackage.jkf.this
                r3.a1()
                jkf r3 = defpackage.jkf.this
                io.netty.channel.v r3 = defpackage.jkf.R0(r3)
                r5.w(r3, r2)
                jkf r2 = defpackage.jkf.this
                java.util.concurrent.ScheduledFuture r2 = defpackage.jkf.W0(r2)
                if (r2 == 0) goto L_0x0029
            L_0x0020:
                jkf r2 = defpackage.jkf.this
                java.util.concurrent.ScheduledFuture r2 = defpackage.jkf.W0(r2)
                r2.cancel(r0)
            L_0x0029:
                jkf r0 = defpackage.jkf.this
                defpackage.jkf.S0(r0, r1)
                goto L_0x0052
            L_0x002f:
                r2 = move-exception
                jkf r3 = defpackage.jkf.this     // Catch:{ all -> 0x0053 }
                io.netty.channel.v r3 = defpackage.jkf.R0(r3)     // Catch:{ all -> 0x0053 }
                jkf r4 = defpackage.jkf.this     // Catch:{ all -> 0x0053 }
                java.net.SocketAddress r4 = defpackage.jkf.T0(r4)     // Catch:{ all -> 0x0053 }
                java.lang.Throwable r2 = r5.g(r2, r4)     // Catch:{ all -> 0x0053 }
                if (r3 != 0) goto L_0x0043
                goto L_0x0049
            L_0x0043:
                r3.n(r2)     // Catch:{ all -> 0x0053 }
                r5.j()     // Catch:{ all -> 0x0053 }
            L_0x0049:
                jkf r2 = defpackage.jkf.this
                java.util.concurrent.ScheduledFuture r2 = defpackage.jkf.W0(r2)
                if (r2 == 0) goto L_0x0029
                goto L_0x0020
            L_0x0052:
                return
            L_0x0053:
                r2 = move-exception
                jkf r3 = defpackage.jkf.this
                java.util.concurrent.ScheduledFuture r3 = defpackage.jkf.W0(r3)
                if (r3 == 0) goto L_0x0065
                jkf r3 = defpackage.jkf.this
                java.util.concurrent.ScheduledFuture r3 = defpackage.jkf.W0(r3)
                r3.cancel(r0)
            L_0x0065:
                jkf r0 = defpackage.jkf.this
                defpackage.jkf.S0(r0, r1)
                goto L_0x006c
            L_0x006b:
                throw r2
            L_0x006c:
                goto L_0x006b
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.jkf.b.b():void");
        }

        /* access modifiers changed from: protected */
        @Override // io.netty.channel.AbstractChannel.a
        public final void p() {
            SelectionKey selectionKey = jkf.this.F;
            if (!(selectionKey.isValid() && (selectionKey.interestOps() & 4) != 0)) {
                super.p();
            }
        }

        @Override // io.netty.channel.d.a
        public final void u(SocketAddress socketAddress, SocketAddress socketAddress2, v vVar) {
            if (vVar.k() && n(vVar)) {
                try {
                    if (jkf.this.I == null) {
                        boolean isActive = ((vkf) jkf.this).isActive();
                        if (jkf.this.Z0(socketAddress, socketAddress2)) {
                            w(vVar, isActive);
                            return;
                        }
                        jkf.this.I = vVar;
                        jkf.this.K = socketAddress;
                        int e = ((y) ((vkf) jkf.this).X()).e();
                        if (e > 0) {
                            jkf jkf = jkf.this;
                            jkf.J = jkf.V().schedule((Runnable) new a(socketAddress), (long) e, TimeUnit.MILLISECONDS);
                        }
                        vVar.mo86d((s<? extends r<? super Void>>) new C0630b());
                        return;
                    }
                    throw new ConnectionPendingException();
                } catch (Throwable th) {
                    vVar.n(g(th, socketAddress));
                    j();
                }
            }
        }
    }

    /* renamed from: jkf$c */
    public interface c extends d.a {
        void a();

        void b();

        void read();
    }

    static {
        int i = io.netty.util.internal.logging.c.b;
        ClosedChannelException closedChannelException = new ClosedChannelException();
        yif.Z(closedChannelException, jkf.class, "doClose()");
        M = closedChannelException;
    }

    protected jkf(d dVar, SelectableChannel selectableChannel, int i) {
        super(dVar);
        this.D = selectableChannel;
        this.E = i;
        try {
            selectableChannel.configureBlocking(false);
        } catch (IOException e) {
            try {
                selectableChannel.close();
            } catch (IOException e2) {
                if (L.a()) {
                    L.j("Failed to close a partially initialized socket.", e2);
                }
            }
            throw new ChannelException("Failed to enter non-blocking mode.", e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.channel.AbstractChannel
    public void D0() {
        SelectionKey selectionKey = this.F;
        if (selectionKey.isValid()) {
            this.G = true;
            int interestOps = selectionKey.interestOps();
            int i = this.E;
            if ((interestOps & i) == 0) {
                selectionKey.interestOps(interestOps | i);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.channel.AbstractChannel
    public void E0() {
        v vVar = this.I;
        if (vVar != null) {
            vVar.n(M);
            this.I = null;
        }
        ScheduledFuture<?> scheduledFuture = this.J;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.J = null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.channel.AbstractChannel
    public void F0() {
        V().V(this.F);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.channel.AbstractChannel
    public void H0() {
        boolean z = false;
        while (true) {
            try {
                this.F = c1().register(V().J, 0, this);
                return;
            } catch (CancelledKeyException e) {
                if (!z) {
                    V().k0();
                    z = true;
                } else {
                    throw e;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.channel.AbstractChannel
    public boolean L0(i0 i0Var) {
        return i0Var instanceof kkf;
    }

    /* access modifiers changed from: protected */
    public final void Y0() {
        if (g0()) {
            kkf b1 = V();
            if (b1.G()) {
                this.G = false;
                ((b) l0()).F();
                return;
            }
            b1.execute(this.H);
            return;
        }
        this.G = false;
    }

    /* access modifiers changed from: protected */
    public abstract boolean Z0(SocketAddress socketAddress, SocketAddress socketAddress2);

    /* access modifiers changed from: protected */
    public abstract void a1();

    /* renamed from: b1 */
    public kkf V() {
        return (kkf) super.V();
    }

    /* access modifiers changed from: protected */
    public SelectableChannel c1() {
        return this.D;
    }

    /* access modifiers changed from: protected */
    public SelectionKey d1() {
        return this.F;
    }

    /* renamed from: e1 */
    public c l0() {
        return (c) super.l0();
    }

    @Override // io.netty.channel.d
    public boolean isOpen() {
        return this.D.isOpen();
    }
}
