package io.netty.channel;

import io.netty.channel.AbstractChannel;
import io.netty.channel.f0;
import io.netty.channel.u0;
import io.netty.util.DefaultAttributeMap;
import io.netty.util.Recycler;
import io.netty.util.concurrent.x;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.s;
import io.netty.util.r;
import java.net.SocketAddress;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* access modifiers changed from: package-private */
public abstract class b extends DefaultAttributeMap implements k, r {
    private static final io.netty.util.internal.logging.b y = io.netty.util.internal.logging.c.b(b.class.getName());
    private static final AtomicIntegerFieldUpdater<b> z;
    volatile b c;
    volatile b f;
    private final boolean n;
    private final boolean o;
    private final a0 p;
    private final String q;
    private final boolean r;
    final io.netty.util.concurrent.l s;
    private Runnable t;
    private Runnable u;
    private Runnable v;
    private Runnable w;
    private volatile int x = 0;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        final /* synthetic */ b a;
        final /* synthetic */ SocketAddress b;
        final /* synthetic */ SocketAddress c;
        final /* synthetic */ v f;

        a(b bVar, b bVar2, SocketAddress socketAddress, SocketAddress socketAddress2, v vVar) {
            this.a = bVar2;
            this.b = socketAddress;
            this.c = socketAddress2;
            this.f = vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.Z0(this.b, this.c, this.f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.netty.channel.b$b  reason: collision with other inner class name */
    public class RunnableC0602b implements Runnable {
        final /* synthetic */ b a;
        final /* synthetic */ v b;

        RunnableC0602b(b bVar, v vVar) {
            this.a = bVar;
            this.b = vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!b.this.h().metadata().b()) {
                this.a.Y0(this.b);
            } else {
                this.a.a1(this.b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements Runnable {
        final /* synthetic */ b a;
        final /* synthetic */ v b;

        c(b bVar, b bVar2, v vVar) {
            this.a = bVar2;
            this.b = vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.Y0(this.b);
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements Runnable {
        final /* synthetic */ b a;

        d(b bVar, b bVar2) {
            this.a = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.f1();
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements Runnable {
        final /* synthetic */ b a;

        e(b bVar, b bVar2) {
            this.a = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.d1();
        }
    }

    /* access modifiers changed from: package-private */
    public static class f implements Runnable {
        final /* synthetic */ b a;

        f(b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.R0();
        }
    }

    /* access modifiers changed from: package-private */
    public static class g implements Runnable {
        final /* synthetic */ b a;

        g(b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.T0();
        }
    }

    /* access modifiers changed from: package-private */
    public static class h implements Runnable {
        final /* synthetic */ b a;

        h(b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.J0();
        }
    }

    /* access modifiers changed from: package-private */
    public static class i implements Runnable {
        final /* synthetic */ b a;

        i(b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.L0();
        }
    }

    /* access modifiers changed from: package-private */
    public static class j implements Runnable {
        final /* synthetic */ b a;
        final /* synthetic */ Throwable b;

        j(b bVar, Throwable th) {
            this.a = bVar;
            this.b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.c1(this.b);
        }
    }

    /* access modifiers changed from: package-private */
    public static class k implements Runnable {
        final /* synthetic */ b a;
        final /* synthetic */ Object b;

        k(b bVar, Object obj) {
            this.a = bVar;
            this.b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.h1(this.b);
        }
    }

    /* access modifiers changed from: package-private */
    public static class l implements Runnable {
        final /* synthetic */ b a;
        final /* synthetic */ Object b;

        l(b bVar, Object obj) {
            this.a = bVar;
            this.b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.O0(this.b);
        }
    }

    /* access modifiers changed from: package-private */
    public static class m implements Runnable {
        final /* synthetic */ b a;

        m(b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.P0();
        }
    }

    /* access modifiers changed from: package-private */
    public static class n implements Runnable {
        final /* synthetic */ b a;

        n(b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.W0();
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class o implements Runnable {
        private static final boolean o = s.b("io.netty.transport.estimateSizeOnSubmit", true);
        private static final int p = s.c("io.netty.transport.writeTaskSizeOverhead", 48);
        private final Recycler.e<o> a;
        private b b;
        private Object c;
        private v f;
        private int n;

        o(Recycler.e eVar, f fVar) {
            this.a = eVar;
        }

        protected static void a(o oVar, b bVar, Object obj, v vVar) {
            oVar.b = bVar;
            oVar.c = obj;
            oVar.f = vVar;
            if (o) {
                q A = bVar.h().l0().A();
                if (A != null) {
                    int a2 = ((f0.b) bVar.p.S()).a(obj) + p;
                    oVar.n = a2;
                    A.j((long) a2);
                    return;
                }
                oVar.n = 0;
                return;
            }
            oVar.n = 0;
        }

        /* access modifiers changed from: protected */
        public void b(b bVar, Object obj, v vVar) {
            bVar.i1(obj, vVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                q A = this.b.h().l0().A();
                if (o && A != null) {
                    A.f((long) this.n);
                }
                b(this.b, this.c, this.f);
            } finally {
                this.b = null;
                this.c = null;
                this.f = null;
                this.a.a(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p extends o {
        private static final Recycler<p> q = new a();

        static class a extends Recycler<p> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.netty.util.Recycler$e] */
            /* access modifiers changed from: protected */
            @Override // io.netty.util.Recycler
            public p k(Recycler.e<p> eVar) {
                return new p(eVar, null);
            }
        }

        p(Recycler.e eVar, f fVar) {
            super(eVar, null);
        }

        static p c(b bVar, Object obj, v vVar) {
            p j = q.j();
            o.a(j, bVar, obj, vVar);
            return j;
        }

        @Override // io.netty.channel.b.o
        public void b(b bVar, Object obj, v vVar) {
            bVar.i1(obj, vVar);
            bVar.d1();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q extends o implements u0.a {
        private static final Recycler<q> q = new a();

        static class a extends Recycler<q> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.netty.util.Recycler$e] */
            /* access modifiers changed from: protected */
            @Override // io.netty.util.Recycler
            public q k(Recycler.e<q> eVar) {
                return new q(eVar, null);
            }
        }

        q(Recycler.e eVar, f fVar) {
            super(eVar, null);
        }

        static q c(b bVar, Object obj, v vVar) {
            q j = q.j();
            o.a(j, bVar, obj, vVar);
            return j;
        }
    }

    static {
        int i2 = io.netty.util.internal.logging.c.b;
        AtomicIntegerFieldUpdater<b> M = PlatformDependent.M(b.class, "handlerState");
        if (M == null) {
            M = AtomicIntegerFieldUpdater.newUpdater(b.class, "x");
        }
        z = M;
    }

    b(a0 a0Var, io.netty.util.concurrent.l lVar, String str, boolean z2, boolean z3) {
        boolean z4 = false;
        if (str != null) {
            this.q = str;
            this.p = a0Var;
            this.s = lVar;
            this.n = z2;
            this.o = z3;
            this.r = (lVar == null || (lVar instanceof x)) ? true : z4;
            return;
        }
        throw new NullPointerException("name");
    }

    private b H0() {
        b bVar = this;
        do {
            bVar = bVar.c;
        } while (!bVar.n);
        return bVar;
    }

    private b I0() {
        b bVar = this;
        do {
            bVar = bVar.f;
        } while (!bVar.o);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void J0() {
        if (e1()) {
            try {
                ((l) T()).M(this);
            } catch (Throwable th) {
                k1(th);
            }
        } else {
            P();
        }
    }

    static void K0(b bVar) {
        io.netty.util.concurrent.l k0 = bVar.k0();
        if (k0.G()) {
            bVar.J0();
        } else {
            k0.execute(new h(bVar));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void L0() {
        if (e1()) {
            try {
                ((l) T()).G(this);
            } catch (Throwable th) {
                k1(th);
            }
        } else {
            m0();
        }
    }

    static void M0(b bVar) {
        io.netty.util.concurrent.l k0 = bVar.k0();
        if (k0.G()) {
            bVar.L0();
        } else {
            k0.execute(new i(bVar));
        }
    }

    static void N0(b bVar, Object obj) {
        a0 a0Var = bVar.p;
        if (obj != null) {
            Object q0 = a0Var.q0(obj, bVar);
            io.netty.util.concurrent.l k0 = bVar.k0();
            if (k0.G()) {
                bVar.O0(q0);
            } else {
                k0.execute(new l(bVar, q0));
            }
        } else {
            throw new NullPointerException("msg");
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void O0(Object obj) {
        if (e1()) {
            try {
                ((l) T()).S(this, obj);
            } catch (Throwable th) {
                k1(th);
            }
        } else {
            N(obj);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void P0() {
        if (e1()) {
            try {
                ((l) T()).B(this);
            } catch (Throwable th) {
                k1(th);
            }
        } else {
            A();
        }
    }

    static void Q0(b bVar) {
        io.netty.util.concurrent.l k0 = bVar.k0();
        if (k0.G()) {
            bVar.P0();
            return;
        }
        Runnable runnable = bVar.t;
        if (runnable == null) {
            runnable = new m(bVar);
            bVar.t = runnable;
        }
        k0.execute(runnable);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void R0() {
        if (e1()) {
            try {
                ((l) T()).F(this);
            } catch (Throwable th) {
                k1(th);
            }
        } else {
            m();
        }
    }

    static void S0(b bVar) {
        io.netty.util.concurrent.l k0 = bVar.k0();
        if (k0.G()) {
            bVar.R0();
        } else {
            k0.execute(new f(bVar));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void T0() {
        if (e1()) {
            try {
                ((l) T()).p(this);
            } catch (Throwable th) {
                k1(th);
            }
        } else {
            I();
        }
    }

    static void V0(b bVar) {
        io.netty.util.concurrent.l k0 = bVar.k0();
        if (k0.G()) {
            bVar.T0();
        } else {
            k0.execute(new g(bVar));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void W0() {
        if (e1()) {
            try {
                ((l) T()).b0(this);
            } catch (Throwable th) {
                k1(th);
            }
        } else {
            w();
        }
    }

    static void X0(b bVar) {
        io.netty.util.concurrent.l k0 = bVar.k0();
        if (k0.G()) {
            bVar.W0();
            return;
        }
        Runnable runnable = bVar.v;
        if (runnable == null) {
            runnable = new n(bVar);
            bVar.v = runnable;
        }
        k0.execute(runnable);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void Y0(v vVar) {
        if (e1()) {
            try {
                ((r) T()).U(this, vVar);
            } catch (Throwable th) {
                l1(th, vVar);
            }
        } else {
            k(vVar);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void Z0(SocketAddress socketAddress, SocketAddress socketAddress2, v vVar) {
        if (e1()) {
            try {
                ((r) T()).J(this, socketAddress, socketAddress2, vVar);
            } catch (Throwable th) {
                l1(th, vVar);
            }
        } else {
            u(socketAddress, socketAddress2, vVar);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a1(v vVar) {
        if (e1()) {
            try {
                ((r) T()).Q(this, vVar);
            } catch (Throwable th) {
                l1(th, vVar);
            }
        } else {
            i(vVar);
        }
    }

    static void b1(b bVar, Throwable th) {
        if (th != null) {
            io.netty.util.concurrent.l k0 = bVar.k0();
            if (k0.G()) {
                bVar.c1(th);
                return;
            }
            try {
                k0.execute(new j(bVar, th));
            } catch (Throwable th2) {
                io.netty.util.internal.logging.b bVar2 = y;
                if (bVar2.a()) {
                    bVar2.j("Failed to submit an exceptionCaught() event.", th2);
                    bVar2.j("The exceptionCaught() event that was failed to submit was:", th);
                }
            }
        } else {
            throw new NullPointerException("cause");
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void c1(Throwable th) {
        if (e1()) {
            try {
                T().d(this, th);
            } catch (Throwable th2) {
                io.netty.util.internal.logging.b bVar = y;
                if (bVar.c()) {
                    bVar.b("An exception {}was thrown by a user handler's exceptionCaught() method while handling the following exception:", yif.U(th2), th);
                } else if (bVar.a()) {
                    bVar.g("An exception '{}' [enable DEBUG level for full stacktrace] was thrown by a user handler's exceptionCaught() method while handling the following exception:", th2, th);
                }
            }
        } else {
            b1(this.c, th);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void d1() {
        if (e1()) {
            try {
                ((r) T()).g(this);
            } catch (Throwable th) {
                k1(th);
            }
        } else {
            flush();
        }
    }

    private boolean e1() {
        int i2 = this.x;
        if (i2 == 2) {
            return true;
        }
        if (this.r || i2 != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void f1() {
        if (e1()) {
            try {
                ((r) T()).L(this);
            } catch (Throwable th) {
                k1(th);
            }
        } else {
            read();
        }
    }

    static void g1(b bVar, Object obj) {
        if (obj != null) {
            io.netty.util.concurrent.l k0 = bVar.k0();
            if (k0.G()) {
                bVar.h1(obj);
            } else {
                k0.execute(new k(bVar, obj));
            }
        } else {
            throw new NullPointerException("event");
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void h1(Object obj) {
        if (e1()) {
            try {
                ((l) T()).c0(this, obj);
            } catch (Throwable th) {
                k1(th);
            }
        } else {
            s(obj);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void i1(Object obj, v vVar) {
        if (e1()) {
            try {
                ((r) T()).W(this, obj, vVar);
            } catch (Throwable th) {
                l1(th, vVar);
            }
        } else {
            x(obj, vVar);
        }
    }

    private void k1(Throwable th) {
        boolean z2;
        Throwable th2 = th;
        loop0:
        while (true) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            z2 = false;
            if (stackTrace != null) {
                int length = stackTrace.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    if (stackTraceElement == null) {
                        break;
                    } else if ("exceptionCaught".equals(stackTraceElement.getMethodName())) {
                        z2 = true;
                        break loop0;
                    } else {
                        i2++;
                    }
                }
            }
            th2 = th2.getCause();
            if (th2 == null) {
                break;
            }
        }
        if (z2) {
            io.netty.util.internal.logging.b bVar = y;
            if (bVar.a()) {
                bVar.j("An exception was thrown by a user handler while handling an exceptionCaught event", th);
                return;
            }
            return;
        }
        c1(th);
    }

    private static void l1(Throwable th, v vVar) {
        if (!(vVar instanceof w0)) {
            yif.X(vVar, th, y);
        }
    }

    private static void m1(io.netty.util.concurrent.l lVar, Runnable runnable, v vVar, Object obj) {
        try {
            lVar.execute(runnable);
        } catch (Throwable th) {
            if (obj != null) {
                io.netty.util.n.a(obj);
            }
            throw th;
        }
    }

    private boolean q1(v vVar, boolean z2) {
        if (vVar == null) {
            throw new NullPointerException("promise");
        } else if (vVar.isDone()) {
            if (vVar.isCancelled()) {
                return false;
            }
            throw new IllegalArgumentException("promise already done: " + vVar);
        } else if (vVar.h() != h()) {
            throw new IllegalArgumentException(String.format("promise.channel does not match: %s (expected: %s)", vVar.h(), h()));
        } else if (vVar.getClass() == d0.class) {
            return true;
        } else {
            if (!z2 && (vVar instanceof w0)) {
                throw new IllegalArgumentException(io.netty.util.internal.r.e(w0.class) + " not allowed for this operation");
            } else if (!(vVar instanceof AbstractChannel.b)) {
                return true;
            } else {
                throw new IllegalArgumentException(io.netty.util.internal.r.e(AbstractChannel.b.class) + " not allowed in a pipeline");
            }
        }
    }

    private void r1(Object obj, boolean z2, v vVar) {
        Runnable runnable;
        b I0 = I0();
        Object q0 = this.p.q0(obj, I0);
        io.netty.util.concurrent.l k0 = I0.k0();
        if (!k0.G()) {
            if (z2) {
                runnable = p.c(I0, q0, vVar);
            } else {
                runnable = q.c(I0, q0, vVar);
            }
            m1(k0, runnable, vVar, q0);
        } else if (!z2) {
            I0.i1(q0, vVar);
        } else if (I0.e1()) {
            try {
                ((r) I0.T()).W(I0, q0, vVar);
            } catch (Throwable th) {
                l1(th, vVar);
            }
            try {
                ((r) I0.T()).g(I0);
            } catch (Throwable th2) {
                I0.k1(th2);
            }
        } else {
            I0.t1(q0, vVar);
        }
    }

    @Override // io.netty.channel.k
    public k A() {
        Q0(H0());
        return this;
    }

    @Override // io.netty.util.r
    public String C() {
        return je.I0(je.S0('\''), this.q, "' will handle the message from this point.");
    }

    @Override // io.netty.channel.k
    public k I() {
        V0(H0());
        return this;
    }

    @Override // io.netty.channel.k
    public k N(Object obj) {
        N0(H0(), obj);
        return this;
    }

    @Override // io.netty.channel.k
    public k P() {
        K0(H0());
        return this;
    }

    @Override // io.netty.channel.s
    public g close() {
        v q2 = q();
        k(q2);
        return q2;
    }

    @Override // io.netty.channel.k
    public boolean d0() {
        return this.x == 3;
    }

    @Override // io.netty.channel.k
    public k flush() {
        b I0 = I0();
        io.netty.util.concurrent.l k0 = I0.k0();
        if (k0.G()) {
            I0.d1();
        } else {
            Runnable runnable = I0.w;
            if (runnable == null) {
                runnable = new e(this, I0);
                I0.w = runnable;
            }
            m1(k0, runnable, h().l(), null);
        }
        return this;
    }

    @Override // io.netty.channel.k
    public d h() {
        return this.p.h();
    }

    @Override // io.netty.channel.s
    public g h0(SocketAddress socketAddress, v vVar) {
        u(socketAddress, null, vVar);
        return vVar;
    }

    @Override // io.netty.channel.s
    public g i(v vVar) {
        if (!q1(vVar, false)) {
            return vVar;
        }
        b I0 = I0();
        io.netty.util.concurrent.l k0 = I0.k0();
        if (!k0.G()) {
            m1(k0, new RunnableC0602b(I0, vVar), vVar, null);
        } else if (!h().metadata().b()) {
            I0.Y0(vVar);
        } else {
            I0.a1(vVar);
        }
        return vVar;
    }

    public String j1() {
        return this.q;
    }

    @Override // io.netty.channel.s
    public g k(v vVar) {
        if (!q1(vVar, false)) {
            return vVar;
        }
        b I0 = I0();
        io.netty.util.concurrent.l k0 = I0.k0();
        if (k0.G()) {
            I0.Y0(vVar);
        } else {
            m1(k0, new c(this, I0, vVar), vVar, null);
        }
        return vVar;
    }

    @Override // io.netty.channel.k
    public io.netty.util.concurrent.l k0() {
        io.netty.util.concurrent.l lVar = this.s;
        return lVar == null ? h().V() : lVar;
    }

    @Override // io.netty.channel.s
    public v l() {
        return h().l();
    }

    @Override // io.netty.channel.k
    public k m() {
        S0(H0());
        return this;
    }

    @Override // io.netty.channel.k
    public k m0() {
        M0(H0());
        return this;
    }

    @Override // io.netty.channel.s
    public g n(Object obj) {
        v q2 = q();
        x(obj, q2);
        return q2;
    }

    /* access modifiers changed from: package-private */
    public final void n1() {
        int i2;
        do {
            i2 = this.x;
            if (i2 == 3) {
                return;
            }
        } while (!z.compareAndSet(this, i2, 2));
    }

    @Override // io.netty.channel.k
    public t o() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public final void o1() {
        z.compareAndSet(this, 0, 1);
    }

    /* access modifiers changed from: package-private */
    public final void p1() {
        this.x = 3;
    }

    @Override // io.netty.channel.s
    public v q() {
        return new d0(h(), k0());
    }

    @Override // io.netty.channel.k
    public k read() {
        b I0 = I0();
        io.netty.util.concurrent.l k0 = I0.k0();
        if (k0.G()) {
            I0.f1();
        } else {
            Runnable runnable = I0.u;
            if (runnable == null) {
                runnable = new d(this, I0);
                I0.u = runnable;
            }
            k0.execute(runnable);
        }
        return this;
    }

    @Override // io.netty.channel.k
    public k s(Object obj) {
        g1(H0(), obj);
        return this;
    }

    @Override // io.netty.channel.k
    public io.netty.buffer.k t() {
        return ((y) h().X()).d();
    }

    public g t1(Object obj, v vVar) {
        if (obj == null) {
            throw new NullPointerException("msg");
        } else if (!q1(vVar, true)) {
            io.netty.util.n.a(obj);
            return vVar;
        } else {
            r1(obj, true, vVar);
            return vVar;
        }
    }

    public String toString() {
        return io.netty.util.internal.r.e(k.class) + '(' + this.q + ", " + h() + ')';
    }

    @Override // io.netty.channel.s
    public g u(SocketAddress socketAddress, SocketAddress socketAddress2, v vVar) {
        if (socketAddress == null) {
            throw new NullPointerException("remoteAddress");
        } else if (!q1(vVar, false)) {
            return vVar;
        } else {
            b I0 = I0();
            io.netty.util.concurrent.l k0 = I0.k0();
            if (k0.G()) {
                I0.Z0(socketAddress, socketAddress2, vVar);
            } else {
                m1(k0, new a(this, I0, socketAddress, socketAddress2, vVar), vVar, null);
            }
            return vVar;
        }
    }

    @Override // io.netty.channel.k
    public k v(Throwable th) {
        b1(this.c, th);
        return this;
    }

    @Override // io.netty.channel.k
    public k w() {
        X0(H0());
        return this;
    }

    @Override // io.netty.channel.s
    public g x(Object obj, v vVar) {
        if (obj != null) {
            try {
                if (!q1(vVar, true)) {
                    io.netty.util.n.a(obj);
                    return vVar;
                }
                r1(obj, false, vVar);
                return vVar;
            } catch (RuntimeException e2) {
                io.netty.util.n.a(obj);
                throw e2;
            }
        } else {
            throw new NullPointerException("msg");
        }
    }

    @Override // io.netty.channel.s
    public g z(Object obj) {
        v q2 = q();
        t1(obj, q2);
        return q2;
    }
}
