package io.netty.handler.ssl;

import io.netty.buffer.j;
import io.netty.channel.ChannelException;
import io.netty.channel.h;
import io.netty.channel.k;
import io.netty.channel.o0;
import io.netty.channel.r;
import io.netty.channel.v;
import io.netty.channel.w;
import io.netty.handler.codec.UnsupportedMessageTypeException;
import io.netty.util.concurrent.e0;
import io.netty.util.concurrent.i;
import io.netty.util.concurrent.l;
import io.netty.util.concurrent.s;
import io.netty.util.concurrent.u;
import io.netty.util.concurrent.y;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;

public class j0 extends io.netty.handler.codec.a implements r {
    private static final io.netty.util.internal.logging.b L = io.netty.util.internal.logging.c.b(j0.class.getName());
    private static final Pattern M = Pattern.compile("^.*(?:Socket|Datagram|Sctp|Udt)Channel.*$");
    private static final Pattern N = Pattern.compile("^.*(?:connection.*(?:reset|closed|abort|broken)|broken.*pipe).*$", 2);
    private static final SSLException O;
    private static final SSLException P;
    private static final ClosedChannelException Q;
    private boolean A;
    private boolean B;
    private o0 C;
    private y<io.netty.channel.d> D = new g(null);
    private final g E = new g(null);
    private boolean F;
    private boolean G;
    private int H;
    private boolean I;
    private volatile long J = 10000;
    private volatile long K = 3000;
    private volatile k r;
    private final SSLEngine s;
    private final int t;
    private final Executor u;
    private final ByteBuffer[] v = new ByteBuffer[1];
    private final boolean w;
    private final boolean x;
    private final boolean y;
    private boolean z;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        final /* synthetic */ List a;
        final /* synthetic */ CountDownLatch b;

        a(List list, CountDownLatch countDownLatch) {
            this.a = list;
            this.b = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                for (Runnable runnable : this.a) {
                    runnable.run();
                }
            } catch (Exception e) {
                j0.this.r.v(e);
            } catch (Throwable th) {
                this.b.countDown();
                throw th;
            }
            this.b.countDown();
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {
        final /* synthetic */ y a;

        b(y yVar) {
            this.a = yVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.a.isDone()) {
                j0.this.y(j0.P);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements Object<io.netty.channel.d> {
        final /* synthetic */ ScheduledFuture c;

        c(j0 j0Var, ScheduledFuture scheduledFuture) {
            this.c = scheduledFuture;
        }

        public void a(io.netty.util.concurrent.r<io.netty.channel.d> rVar) {
            this.c.cancel(false);
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements Runnable {
        final /* synthetic */ k a;
        final /* synthetic */ v b;

        d(j0 j0Var, k kVar, v vVar) {
            this.a = kVar;
            this.b = vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            j0.L.l("{} Last write attempt timed out; force-closing the connection.", this.a.h());
            k kVar = this.a;
            kVar.k(kVar.q()).mo86d((s<? extends io.netty.util.concurrent.r<? super Void>>) new w(false, this.b));
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements h {
        final /* synthetic */ ScheduledFuture c;
        final /* synthetic */ k d;
        final /* synthetic */ v e;

        e(j0 j0Var, ScheduledFuture scheduledFuture, k kVar, v vVar) {
            this.c = scheduledFuture;
            this.d = kVar;
            this.e = vVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.netty.util.concurrent.r] */
        @Override // io.netty.util.concurrent.s
        public void a(io.netty.channel.g gVar) {
            ScheduledFuture scheduledFuture = this.c;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            k kVar = this.d;
            kVar.k(kVar.q()).mo86d((s<? extends io.netty.util.concurrent.r<? super Void>>) new w(false, this.e));
        }
    }

    /* access modifiers changed from: package-private */
    public static /* synthetic */ class f {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[SSLEngineResult.Status.values().length];
            b = iArr;
            try {
                iArr[SSLEngineResult.Status.BUFFER_OVERFLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[SSLEngineResult.Status.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[SSLEngineResult.HandshakeStatus.values().length];
            a = iArr2;
            try {
                iArr2[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* access modifiers changed from: private */
    public final class g extends i<io.netty.channel.d> {
        g(i0 i0Var) {
        }

        /* access modifiers changed from: protected */
        @Override // io.netty.util.concurrent.i
        public void C() {
            if (j0.this.r != null) {
                super.C();
            }
        }

        /* access modifiers changed from: protected */
        @Override // io.netty.util.concurrent.i
        public l F() {
            if (j0.this.r != null) {
                return j0.this.r.k0();
            }
            throw new IllegalStateException();
        }
    }

    static {
        int i = io.netty.util.internal.logging.c.b;
        SSLException sSLException = new SSLException("SSLEngine closed already");
        yif.Z(sSLException, j0.class, "wrap(...)");
        O = sSLException;
        SSLException sSLException2 = new SSLException("handshake timed out");
        yif.Z(sSLException2, j0.class, "handshake(...)");
        P = sSLException2;
        ClosedChannelException closedChannelException = new ClosedChannelException();
        yif.Z(closedChannelException, j0.class, "channelInactive(...)");
        Q = closedChannelException;
    }

    public j0(SSLEngine sSLEngine, boolean z2) {
        u uVar = u.a;
        if (sSLEngine != null) {
            this.s = sSLEngine;
            this.u = uVar;
            this.y = z2;
            this.t = sSLEngine.getSession().getPacketBufferSize();
            boolean z3 = sSLEngine instanceof w;
            this.w = z3;
            this.x = !z3;
            m(z3 ? io.netty.handler.codec.a.q : io.netty.handler.codec.a.p);
            return;
        }
        throw new NullPointerException("engine");
    }

    private void A() {
        if (this.u == u.a) {
            while (true) {
                Runnable delegatedTask = this.s.getDelegatedTask();
                if (delegatedTask != null) {
                    delegatedTask.run();
                } else {
                    return;
                }
            }
        } else {
            ArrayList arrayList = new ArrayList(2);
            while (true) {
                Runnable delegatedTask2 = this.s.getDelegatedTask();
                if (delegatedTask2 == null) {
                    break;
                }
                arrayList.add(delegatedTask2);
            }
            if (!arrayList.isEmpty()) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                this.u.execute(new a(arrayList, countDownLatch));
                boolean z2 = false;
                while (countDownLatch.getCount() != 0) {
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException unused) {
                        z2 = true;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    private void C(k kVar, io.netty.channel.g gVar, v vVar) {
        if (!kVar.h().isActive()) {
            kVar.k(vVar);
            return;
        }
        e0<?> e0Var = null;
        if (!gVar.isDone() && this.K > 0) {
            e0Var = kVar.k0().schedule((Runnable) new d(this, kVar, vVar), this.K, TimeUnit.MILLISECONDS);
        }
        gVar.mo86d((s<? extends io.netty.util.concurrent.r<? super Void>>) new e(this, e0Var, kVar, vVar));
    }

    private void E(k kVar, Throwable th, boolean z2) {
        this.s.closeOutbound();
        if (z2) {
            try {
                this.s.closeInbound();
            } catch (SSLException e2) {
                String message = e2.getMessage();
                if (message == null || !message.contains("possible truncation attack")) {
                    L.b("{} SSLEngine.closeInbound() raised an exception.", kVar.h(), e2);
                }
            }
        }
        y(th);
        this.C.f(th);
    }

    private void H() {
        this.D.p(this.r.h());
        io.netty.util.internal.logging.b bVar = L;
        if (bVar.c()) {
            bVar.b("{} HANDSHAKEN: {}", this.r.h(), this.s.getSession().getCipherSuite());
        }
        this.r.s(k0.b);
        if (this.B && !((io.netty.channel.y) this.r.h().X()).l()) {
            this.B = false;
            this.r.read();
        }
    }

    private boolean I() {
        if (this.D.isDone()) {
            return false;
        }
        H();
        return true;
    }

    private static ByteBuffer K(j jVar, int i, int i2) {
        return jVar.Q0() == 1 ? jVar.G0(i, i2) : jVar.P0(i, i2);
    }

    private SSLEngineResult N(SSLEngine sSLEngine, j jVar, int i, int i2, j jVar2) {
        SSLEngineResult sSLEngineResult;
        int Q0 = jVar.Q0();
        int Z1 = jVar2.Z1();
        if (!(sSLEngine instanceof w) || Q0 <= 1) {
            sSLEngineResult = sSLEngine.unwrap(K(jVar, i, i2), K(jVar2, Z1, jVar2.O1()));
        } else {
            w wVar = (w) sSLEngine;
            try {
                this.v[0] = K(jVar2, Z1, jVar2.O1());
                sSLEngineResult = wVar.O(jVar.W0(i, i2), this.v);
                jVar2.a2(sSLEngineResult.bytesProduced() + Z1);
            } finally {
                this.v[0] = null;
            }
        }
        jVar2.a2(sSLEngineResult.bytesProduced() + Z1);
        return sSLEngineResult;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0099, code lost:
        if (r3 != javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009b, code lost:
        z(r18);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean O(io.netty.channel.k r18, io.netty.buffer.j r19, int r20, int r21) {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.ssl.j0.O(io.netty.channel.k, io.netty.buffer.j, int, int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007c A[LOOP:0: B:18:0x0041->B:24:0x007c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0072 A[EDGE_INSN: B:31:0x0072->B:20:0x0072 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private javax.net.ssl.SSLEngineResult P(io.netty.buffer.k r8, javax.net.ssl.SSLEngine r9, io.netty.buffer.j r10, io.netty.buffer.j r11) {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            int r2 = r10.n1()     // Catch:{ all -> 0x0082 }
            int r3 = r10.m1()     // Catch:{ all -> 0x0082 }
            boolean r4 = r10.I0()     // Catch:{ all -> 0x0082 }
            r5 = 1
            if (r4 != 0) goto L_0x0028
            boolean r4 = r7.w     // Catch:{ all -> 0x0082 }
            if (r4 != 0) goto L_0x0016
            goto L_0x0028
        L_0x0016:
            io.netty.buffer.j r8 = r8.h(r3)     // Catch:{ all -> 0x0082 }
            r8.S1(r10, r2, r3)     // Catch:{ all -> 0x0026 }
            java.nio.ByteBuffer[] r2 = r7.v     // Catch:{ all -> 0x0026 }
            java.nio.ByteBuffer r3 = r8.G0(r1, r3)     // Catch:{ all -> 0x0026 }
            r2[r1] = r3     // Catch:{ all -> 0x0026 }
            goto L_0x0041
        L_0x0026:
            r9 = move-exception
            goto L_0x0084
        L_0x0028:
            boolean r8 = r10 instanceof io.netty.buffer.p
            if (r8 != 0) goto L_0x003c
            int r8 = r10.Q0()
            if (r8 != r5) goto L_0x003c
            java.nio.ByteBuffer[] r8 = r7.v
            java.nio.ByteBuffer r2 = r10.G0(r2, r3)
            r8[r1] = r2
            r2 = r8
            goto L_0x0040
        L_0x003c:
            java.nio.ByteBuffer[] r2 = r10.T0()
        L_0x0040:
            r8 = r0
        L_0x0041:
            int r3 = r11.Z1()
            int r4 = r11.O1()
            java.nio.ByteBuffer r3 = r11.P0(r3, r4)
            javax.net.ssl.SSLEngineResult r3 = r9.wrap(r2, r3)
            int r4 = r3.bytesConsumed()
            r10.I1(r4)
            int r4 = r11.Z1()
            int r6 = r3.bytesProduced()
            int r4 = r4 + r6
            r11.a2(r4)
            int[] r4 = io.netty.handler.ssl.j0.f.b
            javax.net.ssl.SSLEngineResult$Status r6 = r3.getStatus()
            int r6 = r6.ordinal()
            r4 = r4[r6]
            if (r4 == r5) goto L_0x007c
            java.nio.ByteBuffer[] r9 = r7.v
            r9[r1] = r0
            if (r8 == 0) goto L_0x007b
            r8.d()
        L_0x007b:
            return r3
        L_0x007c:
            int r3 = r7.t
            r11.P(r3)
            goto L_0x0041
        L_0x0082:
            r9 = move-exception
            r8 = r0
        L_0x0084:
            java.nio.ByteBuffer[] r10 = r7.v
            r10[r1] = r0
            if (r8 == 0) goto L_0x008d
            r8.d()
        L_0x008d:
            goto L_0x008f
        L_0x008e:
            throw r9
        L_0x008f:
            goto L_0x008e
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.ssl.j0.P(io.netty.buffer.k, javax.net.ssl.SSLEngine, io.netty.buffer.j, io.netty.buffer.j):javax.net.ssl.SSLEngineResult");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0063, code lost:
        if (r1 == 2) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0066, code lost:
        if (r1 == 3) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0069, code lost:
        if (r1 == 4) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006c, code lost:
        if (r1 != 5) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006e, code lost:
        r6 = true;
        r1 = r11;
        r2 = r12;
        r3 = r9;
        r4 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008e, code lost:
        throw new java.lang.IllegalStateException("Unknown handshake status: " + r2.getHandshakeStatus());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008f, code lost:
        H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0092, code lost:
        I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b5, code lost:
        w(r12, r3, r4, r13, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00bc, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void R(io.netty.channel.k r12, boolean r13) {
        /*
        // Method dump skipped, instructions count: 206
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.ssl.j0.R(io.netty.channel.k, boolean):void");
    }

    private void T(k kVar, boolean z2) {
        io.netty.buffer.k t2 = kVar.t();
        j jVar = null;
        while (true) {
            try {
                if (!kVar.d0()) {
                    if (jVar == null) {
                        jVar = u(kVar, 0);
                    }
                    SSLEngine sSLEngine = this.s;
                    j jVar2 = io.netty.buffer.j0.b;
                    SSLEngineResult P2 = P(t2, sSLEngine, jVar2, jVar);
                    if (P2.bytesProduced() > 0) {
                        kVar.n(jVar);
                        if (z2) {
                            this.F = true;
                        }
                        jVar = null;
                    }
                    int i = f.a[P2.getHandshakeStatus().ordinal()];
                    if (i == 1) {
                        A();
                    } else if (i == 2) {
                        H();
                    } else if (i == 3) {
                        I();
                        if (!z2) {
                            O(kVar, jVar2, 0, 0);
                        }
                    } else if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("Unknown handshake status: " + P2.getHandshakeStatus());
                        } else if (!z2) {
                            O(kVar, jVar2, 0, 0);
                        }
                    }
                    if (P2.bytesProduced() != 0) {
                        if (P2.bytesConsumed() == 0 && P2.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } catch (SSLException e2) {
                E(kVar, e2, true);
                if (this.F) {
                    this.F = false;
                    kVar.flush();
                }
                throw e2;
            } catch (Throwable th) {
                if (jVar != null) {
                    jVar.d();
                }
                throw th;
            }
        }
        if (jVar != null) {
            jVar.d();
        }
    }

    private j t(k kVar, int i) {
        io.netty.buffer.k t2 = kVar.t();
        if (this.w) {
            return t2.h(i);
        }
        return t2.j(i);
    }

    private j u(k kVar, int i) {
        if (this.x) {
            return t(kVar, this.t);
        }
        return t(kVar, Math.min(i + 2329, this.t));
    }

    private void v(k kVar, v vVar, boolean z2) {
        if (kVar.h().isActive()) {
            this.G = true;
            this.s.closeOutbound();
            v q = kVar.q();
            try {
                this.C.a(io.netty.buffer.j0.b, q);
                g(kVar);
            } finally {
                C(kVar, q, vVar);
            }
        } else if (z2) {
            kVar.i(vVar);
        } else {
            kVar.k(vVar);
        }
    }

    private void w(k kVar, j jVar, v vVar, boolean z2, boolean z3) {
        if (jVar == null) {
            jVar = io.netty.buffer.j0.b;
        } else if (!jVar.K0()) {
            jVar.d();
            jVar = io.netty.buffer.j0.b;
        }
        if (vVar != null) {
            kVar.x(jVar, vVar);
        } else {
            kVar.n(jVar);
        }
        if (z2) {
            this.F = true;
        }
        if (z3) {
            z(kVar);
        }
    }

    private void x(y<io.netty.channel.d> yVar) {
        if (this.s.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            y<io.netty.channel.d> yVar2 = this.D;
            k kVar = this.r;
            try {
                this.s.beginHandshake();
                T(kVar, false);
                kVar.flush();
            } catch (Exception e2) {
                y(e2);
            }
            long j = this.J;
            if (j > 0 && !yVar2.isDone()) {
                yVar2.mo86d((s<? extends io.netty.util.concurrent.r<? super io.netty.channel.d>>) new c(this, kVar.k0().schedule((Runnable) new b(yVar2), j, TimeUnit.MILLISECONDS)));
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void y(Throwable th) {
        if (this.D.n(th)) {
            k kVar = this.r;
            kVar.flush();
            kVar.s(new k0(th));
            kVar.close();
        }
    }

    private void z(k kVar) {
        if (((io.netty.channel.y) kVar.h().X()).l()) {
            return;
        }
        if (!this.I || !this.D.isDone()) {
            kVar.read();
        }
    }

    @Override // io.netty.handler.codec.a, io.netty.channel.m, io.netty.channel.l
    public void B(k kVar) {
        j();
        if (this.F) {
            this.F = false;
            kVar.flush();
        }
        z(kVar);
        this.I = false;
        kVar.A();
    }

    @Override // io.netty.channel.j, io.netty.channel.i
    public void D(k kVar) {
        this.r = kVar;
        this.C = new o0(kVar);
        if (kVar.h().isActive() && this.s.getUseClientMode()) {
            x(null);
        }
    }

    @Override // io.netty.handler.codec.a, io.netty.channel.m, io.netty.channel.l
    public void G(k kVar) {
        E(kVar, Q, !this.G);
        super.G(kVar);
    }

    @Override // io.netty.channel.r
    public void J(k kVar, SocketAddress socketAddress, SocketAddress socketAddress2, v vVar) {
        kVar.u(socketAddress, socketAddress2, vVar);
    }

    @Override // io.netty.channel.r
    public void L(k kVar) {
        if (!this.D.isDone()) {
            this.B = true;
        }
        kVar.read();
    }

    @Override // io.netty.channel.m, io.netty.channel.l
    public void M(k kVar) {
        if (!this.y && this.s.getUseClientMode()) {
            x(null);
        }
        kVar.P();
    }

    @Override // io.netty.channel.r
    public void Q(k kVar, v vVar) {
        v(kVar, vVar, true);
    }

    @Override // io.netty.channel.r
    public void U(k kVar, v vVar) {
        v(kVar, vVar, false);
    }

    @Override // io.netty.channel.r
    public void W(k kVar, Object obj, v vVar) {
        if (!(obj instanceof j)) {
            vVar.mo85g((Throwable) new UnsupportedMessageTypeException(obj, j.class));
        } else {
            this.C.a(obj, vVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b7  */
    @Override // io.netty.channel.m, io.netty.channel.j, io.netty.channel.i, io.netty.channel.l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(io.netty.channel.k r9, java.lang.Throwable r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof javax.net.ssl.SSLException
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0095
            boolean r0 = r10 instanceof java.io.IOException
            if (r0 == 0) goto L_0x0095
            io.netty.handler.ssl.j0$g r0 = r8.E
            boolean r0 = r0.isDone()
            if (r0 == 0) goto L_0x0095
            java.lang.String r0 = r10.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r0.toLowerCase()
            java.util.regex.Pattern r3 = io.netty.handler.ssl.j0.N
            java.util.regex.Matcher r0 = r3.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x002c
            goto L_0x0096
        L_0x002c:
            java.lang.StackTraceElement[] r0 = r10.getStackTrace()
            int r3 = r0.length
            r4 = 0
        L_0x0032:
            if (r4 >= r3) goto L_0x0095
            r5 = r0[r4]
            java.lang.String r6 = r5.getClassName()
            java.lang.String r5 = r5.getMethodName()
            java.lang.String r7 = "io.netty."
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x0047
            goto L_0x0092
        L_0x0047:
            java.lang.String r7 = "read"
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L_0x0050
            goto L_0x0092
        L_0x0050:
            java.util.regex.Pattern r5 = io.netty.handler.ssl.j0.M
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r5 = r5.matches()
            if (r5 == 0) goto L_0x005d
            goto L_0x0096
        L_0x005d:
            java.lang.Class r5 = r8.getClass()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.ClassLoader r5 = io.netty.util.internal.PlatformDependent.o(r5)     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.Class r5 = r5.loadClass(r6)     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.Class<java.nio.channels.SocketChannel> r6 = java.nio.channels.SocketChannel.class
            boolean r6 = r6.isAssignableFrom(r5)     // Catch:{ ClassNotFoundException -> 0x0092 }
            if (r6 != 0) goto L_0x0096
            java.lang.Class<java.nio.channels.DatagramChannel> r6 = java.nio.channels.DatagramChannel.class
            boolean r6 = r6.isAssignableFrom(r5)     // Catch:{ ClassNotFoundException -> 0x0092 }
            if (r6 == 0) goto L_0x007a
            goto L_0x0096
        L_0x007a:
            int r6 = io.netty.util.internal.PlatformDependent.J()     // Catch:{ ClassNotFoundException -> 0x0092 }
            r7 = 7
            if (r6 < r7) goto L_0x0092
            java.lang.String r6 = "com.sun.nio.sctp.SctpChannel"
            java.lang.Class r5 = r5.getSuperclass()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r5 = r5.getName()     // Catch:{ ClassNotFoundException -> 0x0092 }
            boolean r5 = r6.equals(r5)     // Catch:{ ClassNotFoundException -> 0x0092 }
            if (r5 == 0) goto L_0x0092
            goto L_0x0096
        L_0x0092:
            int r4 = r4 + 1
            goto L_0x0032
        L_0x0095:
            r1 = 0
        L_0x0096:
            if (r1 == 0) goto L_0x00b7
            io.netty.util.internal.logging.b r0 = io.netty.handler.ssl.j0.L
            boolean r1 = r0.c()
            if (r1 == 0) goto L_0x00a9
            io.netty.channel.d r1 = r9.h()
            java.lang.String r2 = "{} Swallowing a harmless 'connection reset by peer / broken pipe' error that occurred while writing close_notify in response to the peer's close_notify"
            r0.b(r2, r1, r10)
        L_0x00a9:
            io.netty.channel.d r10 = r9.h()
            boolean r10 = r10.isActive()
            if (r10 == 0) goto L_0x00ba
            r9.close()
            goto L_0x00ba
        L_0x00b7:
            r9.v(r10)
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.ssl.j0.d(io.netty.channel.k, java.lang.Throwable):void");
    }

    @Override // io.netty.channel.r
    public void g(k kVar) {
        if (!this.y || this.z) {
            if (this.C.c()) {
                this.C.a(io.netty.buffer.j0.b, kVar.q());
            }
            if (!this.D.isDone()) {
                this.A = true;
            }
            try {
                R(kVar, false);
            } catch (Throwable th) {
                kVar.flush();
                throw th;
            }
            kVar.flush();
            return;
        }
        this.z = true;
        this.C.g();
        kVar.flush();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0073, code lost:
        if (r10 <= r8) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0078 A[SYNTHETIC] */
    @Override // io.netty.handler.codec.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(io.netty.channel.k r13, io.netty.buffer.j r14, java.util.List<java.lang.Object> r15) {
        /*
            r12 = this;
            int r15 = r14.n1()
            int r0 = r14.Z1()
            int r1 = r12.H
            r2 = 0
            if (r1 <= 0) goto L_0x0017
            int r3 = r0 - r15
            if (r3 >= r1) goto L_0x0012
            return
        L_0x0012:
            int r3 = r15 + r1
            r12.H = r2
            goto L_0x0019
        L_0x0017:
            r1 = 0
            r3 = r15
        L_0x0019:
            r4 = 18713(0x4919, float:2.6222E-41)
            r5 = 1
            if (r1 >= r4) goto L_0x0087
            int r6 = r0 - r3
            r7 = 5
            if (r6 >= r7) goto L_0x0025
            goto L_0x0087
        L_0x0025:
            short r8 = r14.u0(r3)
            switch(r8) {
                case 20: goto L_0x002e;
                case 21: goto L_0x002e;
                case 22: goto L_0x002e;
                case 23: goto L_0x002e;
                default: goto L_0x002c;
            }
        L_0x002c:
            r8 = 0
            goto L_0x002f
        L_0x002e:
            r8 = 1
        L_0x002f:
            r9 = 3
            if (r8 == 0) goto L_0x0046
            int r10 = r3 + 1
            short r10 = r14.u0(r10)
            if (r10 != r9) goto L_0x0045
            int r10 = r3 + 3
            int r10 = r14.D0(r10)
            int r10 = r10 + r7
            if (r10 > r7) goto L_0x0047
            r8 = 0
            goto L_0x0047
        L_0x0045:
            r8 = 0
        L_0x0046:
            r10 = 0
        L_0x0047:
            r7 = -1
            if (r8 != 0) goto L_0x0076
            short r8 = r14.u0(r3)
            r8 = r8 & 128(0x80, float:1.794E-43)
            r10 = 2
            if (r8 == 0) goto L_0x0055
            r8 = 2
            goto L_0x0056
        L_0x0055:
            r8 = 3
        L_0x0056:
            int r11 = r3 + r8
            int r11 = r11 + r5
            short r11 = r14.u0(r11)
            if (r11 == r10) goto L_0x0061
            if (r11 != r9) goto L_0x0075
        L_0x0061:
            if (r8 != r10) goto L_0x006c
            short r9 = r14.q0(r3)
            r9 = r9 & 32767(0x7fff, float:4.5916E-41)
            int r9 = r9 + r10
            r10 = r9
            goto L_0x0073
        L_0x006c:
            short r10 = r14.q0(r3)
            r10 = r10 & 16383(0x3fff, float:2.2957E-41)
            int r10 = r10 + r9
        L_0x0073:
            if (r10 > r8) goto L_0x0076
        L_0x0075:
            r10 = -1
        L_0x0076:
            if (r10 != r7) goto L_0x007a
            r0 = 1
            goto L_0x0088
        L_0x007a:
            if (r10 <= r6) goto L_0x007f
            r12.H = r10
            goto L_0x0087
        L_0x007f:
            int r6 = r1 + r10
            if (r6 <= r4) goto L_0x0084
            goto L_0x0087
        L_0x0084:
            int r3 = r3 + r10
            r1 = r6
            goto L_0x0019
        L_0x0087:
            r0 = 0
        L_0x0088:
            if (r1 <= 0) goto L_0x009a
            r14.I1(r1)
            boolean r15 = r12.O(r13, r14, r15, r1)
            if (r15 != 0) goto L_0x0097
            boolean r15 = r12.I
            if (r15 == 0) goto L_0x0098
        L_0x0097:
            r2 = 1
        L_0x0098:
            r12.I = r2
        L_0x009a:
            if (r0 == 0) goto L_0x00bf
            io.netty.handler.ssl.NotSslRecordException r15 = new io.netty.handler.ssl.NotSslRecordException
            java.lang.String r0 = "not an SSL/TLS record: "
            java.lang.StringBuilder r0 = defpackage.je.V0(r0)
            java.lang.String r1 = io.netty.buffer.o.g(r14)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            int r0 = r14.m1()
            r14.I1(r0)
            r12.E(r13, r15, r5)
            r13.v(r15)
        L_0x00bf:
            return
            switch-data {20->0x002e, 21->0x002e, 22->0x002e, 23->0x002e, }
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.ssl.j0.h(io.netty.channel.k, io.netty.buffer.j, java.util.List):void");
    }

    @Override // io.netty.handler.codec.a
    public void l(k kVar) {
        if (!this.C.c()) {
            this.C.f(new ChannelException("Pending write on removal of SslHandler"));
        }
        SSLEngine sSLEngine = this.s;
        if (sSLEngine instanceof ReferenceCountedOpenSslEngine) {
            ((ReferenceCountedOpenSslEngine) sSLEngine).d();
        }
    }
}
