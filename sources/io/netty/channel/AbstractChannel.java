package io.netty.channel;

import io.netty.buffer.k;
import io.netty.channel.d;
import io.netty.channel.f0;
import io.netty.channel.p0;
import io.netty.util.DefaultAttributeMap;
import io.netty.util.concurrent.g0;
import io.netty.util.concurrent.r;
import io.netty.util.concurrent.s;
import io.netty.util.concurrent.y;
import io.netty.util.internal.logging.c;
import io.netty.util.n;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.NotYetConnectedException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public abstract class AbstractChannel extends DefaultAttributeMap implements d {
    private static final ClosedChannelException A;
    private static final ClosedChannelException B;
    private static final NotYetConnectedException C;
    private static final io.netty.util.internal.logging.b x = c.b(AbstractChannel.class.getName());
    private static final ClosedChannelException y;
    private static final ClosedChannelException z;
    private final d c;
    private final ChannelId f;
    private final d.a n;
    private final a0 o;
    private final w0 p = new w0(this, false);
    private final b q = new b(this);
    private volatile SocketAddress r;
    private volatile SocketAddress s;
    private volatile i0 t;
    private volatile boolean u;
    private boolean v;
    private String w;

    /* access modifiers changed from: private */
    public static final class AnnotatedConnectException extends ConnectException {
        private static final long serialVersionUID = 3901958112696433556L;

        AnnotatedConnectException(ConnectException connectException, SocketAddress socketAddress) {
            super(connectException.getMessage() + ": " + socketAddress);
            setStackTrace(connectException.getStackTrace());
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }
    }

    /* access modifiers changed from: private */
    public static final class AnnotatedNoRouteToHostException extends NoRouteToHostException {
        private static final long serialVersionUID = -6801433937592080623L;

        AnnotatedNoRouteToHostException(NoRouteToHostException noRouteToHostException, SocketAddress socketAddress) {
            super(noRouteToHostException.getMessage() + ": " + socketAddress);
            setStackTrace(noRouteToHostException.getStackTrace());
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }
    }

    /* access modifiers changed from: private */
    public static final class AnnotatedSocketException extends SocketException {
        private static final long serialVersionUID = 3896743275010454039L;

        AnnotatedSocketException(SocketException socketException, SocketAddress socketAddress) {
            super(socketException.getMessage() + ": " + socketAddress);
            setStackTrace(socketException.getStackTrace());
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }
    }

    /* access modifiers changed from: protected */
    public abstract class a implements d.a {
        private volatile q a;
        private p0.a b;
        private boolean c;
        private boolean d = true;

        /* renamed from: io.netty.channel.AbstractChannel$a$a  reason: collision with other inner class name */
        class RunnableC0600a implements Runnable {
            final /* synthetic */ v a;

            RunnableC0600a(v vVar) {
                this.a = vVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.s(this.a);
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.M0(AbstractChannel.this.o.a);
            }
        }

        /* access modifiers changed from: package-private */
        public class c implements h {
            final /* synthetic */ v c;

            c(a aVar, v vVar) {
                this.c = vVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.netty.util.concurrent.r] */
            @Override // io.netty.util.concurrent.s
            public void a(g gVar) {
                this.c.m();
            }
        }

        /* access modifiers changed from: package-private */
        public class d implements Runnable {
            final /* synthetic */ v a;
            final /* synthetic */ q b;
            final /* synthetic */ Throwable c;
            final /* synthetic */ boolean f;
            final /* synthetic */ ClosedChannelException n;
            final /* synthetic */ boolean o;

            /* renamed from: io.netty.channel.AbstractChannel$a$d$a  reason: collision with other inner class name */
            class RunnableC0601a implements Runnable {
                RunnableC0601a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    d dVar = d.this;
                    dVar.b.h(dVar.c, dVar.f);
                    d dVar2 = d.this;
                    dVar2.b.d(dVar2.n);
                    d dVar3 = d.this;
                    a.this.o(dVar3.o);
                }
            }

            d(v vVar, q qVar, Throwable th, boolean z, ClosedChannelException closedChannelException, boolean z2) {
                this.a = vVar;
                this.b = qVar;
                this.c = th;
                this.f = z;
                this.n = closedChannelException;
                this.o = z2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.m(this.a);
                } finally {
                    a.this.q(new RunnableC0601a());
                }
            }
        }

        /* access modifiers changed from: package-private */
        public class e implements Runnable {
            final /* synthetic */ boolean a;

            e(boolean z) {
                this.a = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.o(this.a);
            }
        }

        /* access modifiers changed from: package-private */
        public class f implements Runnable {
            final /* synthetic */ Exception a;

            f(Exception exc) {
                this.a = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                a0 a0Var = AbstractChannel.this.o;
                b.b1(a0Var.a, this.a);
            }
        }

        protected a() {
            this.a = new q(AbstractChannel.this);
        }

        /* JADX INFO: finally extract failed */
        private void h(v vVar, Throwable th, ClosedChannelException closedChannelException, boolean z) {
            if (vVar.k()) {
                q qVar = this.a;
                if (qVar == null) {
                    if (!(vVar instanceof w0)) {
                        AbstractChannel.this.q.mo86d((s<? extends r<? super Void>>) new c(this, vVar));
                    }
                } else if (AbstractChannel.this.q.isDone()) {
                    v(vVar);
                } else {
                    boolean isActive = ((vkf) AbstractChannel.this).isActive();
                    this.a = null;
                    Executor r = r();
                    if (r != null) {
                        r.execute(new d(vVar, qVar, th, z, closedChannelException, isActive));
                        return;
                    }
                    try {
                        m(vVar);
                        qVar.h(th, z);
                        qVar.d(closedChannelException);
                        if (this.c) {
                            q(new e(isActive));
                        } else {
                            o(isActive);
                        }
                    } catch (Throwable th2) {
                        qVar.h(th, z);
                        qVar.d(closedChannelException);
                        throw th2;
                    }
                }
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void m(v vVar) {
            try {
                AbstractChannel.this.E0();
                AbstractChannel.this.q.P();
                v(vVar);
            } catch (Throwable th) {
                AbstractChannel.this.q.P();
                t(vVar, th);
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void o(boolean z) {
            v l = l();
            boolean z2 = z && !((vkf) AbstractChannel.this).isActive();
            l.getClass();
            if (!AbstractChannel.this.u) {
                v(l);
            } else {
                q(new a(this, z2, l));
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void q(Runnable runnable) {
            try {
                AbstractChannel.this.V().execute(runnable);
            } catch (RejectedExecutionException e2) {
                AbstractChannel.x.j("Can't invoke task later as EventLoop rejected it", e2);
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void s(v vVar) {
            try {
                if (!vVar.k()) {
                    return;
                }
                if (n(vVar)) {
                    boolean z = this.d;
                    AbstractChannel.this.H0();
                    this.d = false;
                    AbstractChannel.this.u = true;
                    AbstractChannel.this.o.o0();
                    v(vVar);
                    b.S0(AbstractChannel.this.o.a);
                    if (!((vkf) AbstractChannel.this).isActive()) {
                        return;
                    }
                    if (z) {
                        b.K0(AbstractChannel.this.o.a);
                    } else if (((y) ((vkf) AbstractChannel.this).X()).l()) {
                        B();
                    }
                }
            } catch (Throwable th) {
                D();
                AbstractChannel.this.q.P();
                t(vVar, th);
            }
        }

        @Override // io.netty.channel.d.a
        public final q A() {
            return this.a;
        }

        @Override // io.netty.channel.d.a
        public final void B() {
            if (((vkf) AbstractChannel.this).isActive()) {
                try {
                    AbstractChannel.this.D0();
                } catch (Exception e2) {
                    q(new f(e2));
                    k(l());
                }
            }
        }

        @Override // io.netty.channel.d.a
        public final void C(i0 i0Var, v vVar) {
            if (AbstractChannel.this.g0()) {
                vVar.mo85g((Throwable) new IllegalStateException("registered to an event loop already"));
            } else if (!AbstractChannel.this.L0(i0Var)) {
                StringBuilder V0 = je.V0("incompatible event loop type: ");
                V0.append(i0Var.getClass().getName());
                vVar.mo85g((Throwable) new IllegalStateException(V0.toString()));
            } else {
                AbstractChannel.this.t = i0Var;
                if (((io.netty.util.concurrent.a) i0Var).G()) {
                    s(vVar);
                    return;
                }
                try {
                    ((g0) i0Var).execute(new RunnableC0600a(vVar));
                } catch (Throwable th) {
                    AbstractChannel.x.g("Force-closing a channel whose registration task was not accepted by an event loop: {}", AbstractChannel.this, th);
                    D();
                    AbstractChannel.this.q.P();
                    t(vVar, th);
                }
            }
        }

        @Override // io.netty.channel.d.a
        public final void D() {
            try {
                AbstractChannel.this.E0();
            } catch (Exception e2) {
                AbstractChannel.x.j("Failed to close a channel.", e2);
            }
        }

        @Override // io.netty.channel.d.a
        public final SocketAddress E() {
            return AbstractChannel.this.N0();
        }

        @Override // io.netty.channel.d.a
        public final void flush() {
            q qVar = this.a;
            if (qVar != null) {
                qVar.a();
                p();
            }
        }

        /* access modifiers changed from: protected */
        public final Throwable g(Throwable th, SocketAddress socketAddress) {
            if (th instanceof ConnectException) {
                return new AnnotatedConnectException((ConnectException) th, socketAddress);
            }
            if (th instanceof NoRouteToHostException) {
                return new AnnotatedNoRouteToHostException((NoRouteToHostException) th, socketAddress);
            }
            return th instanceof SocketException ? new AnnotatedSocketException((SocketException) th, socketAddress) : th;
        }

        @Override // io.netty.channel.d.a
        public final void i(v vVar) {
            if (vVar.k()) {
                boolean isActive = ((vkf) AbstractChannel.this).isActive();
                try {
                    AbstractChannel.this.G0();
                    if (isActive && !((vkf) AbstractChannel.this).isActive()) {
                        q(new b());
                    }
                    v(vVar);
                    j();
                } catch (Throwable th) {
                    t(vVar, th);
                    j();
                }
            }
        }

        /* access modifiers changed from: protected */
        public final void j() {
            if (!((jkf) AbstractChannel.this).isOpen()) {
                k(l());
            }
        }

        @Override // io.netty.channel.d.a
        public final void k(v vVar) {
            h(vVar, AbstractChannel.A, AbstractChannel.A, false);
        }

        @Override // io.netty.channel.d.a
        public final v l() {
            return AbstractChannel.this.p;
        }

        /* access modifiers changed from: protected */
        @Deprecated
        public final boolean n(v vVar) {
            if (((jkf) AbstractChannel.this).isOpen()) {
                return true;
            }
            t(vVar, AbstractChannel.z);
            return false;
        }

        /* access modifiers changed from: protected */
        public void p() {
            q qVar;
            if (!this.c && (qVar = this.a) != null && !qVar.l()) {
                this.c = true;
                if (!((vkf) AbstractChannel.this).isActive()) {
                    try {
                        if (((jkf) AbstractChannel.this).isOpen()) {
                            qVar.h(AbstractChannel.C, true);
                        } else {
                            qVar.h(AbstractChannel.y, false);
                        }
                    } finally {
                        this.c = false;
                    }
                } else {
                    try {
                        AbstractChannel.this.I0(qVar);
                    } catch (Throwable th) {
                        this.c = false;
                        throw th;
                    }
                    this.c = false;
                }
            }
        }

        /* access modifiers changed from: protected */
        public Executor r() {
            return null;
        }

        /* access modifiers changed from: protected */
        public final void t(v vVar, Throwable th) {
            if (!(vVar instanceof w0) && !vVar.n(th)) {
                AbstractChannel.x.g("Failed to mark a promise as failure because it's done already: {}", vVar, th);
            }
        }

        /* access modifiers changed from: protected */
        public final void v(v vVar) {
            if (!(vVar instanceof w0) && !vVar.q()) {
                AbstractChannel.x.l("Failed to mark a promise as success because it is done already: {}", vVar);
            }
        }

        @Override // io.netty.channel.d.a
        public final void x(Object obj, v vVar) {
            q qVar = this.a;
            if (qVar == null) {
                t(vVar, AbstractChannel.B);
                n.a(obj);
                return;
            }
            try {
                obj = AbstractChannel.this.J0(obj);
                int a2 = ((f0.b) AbstractChannel.this.o.S()).a(obj);
                if (a2 < 0) {
                    a2 = 0;
                }
                qVar.b(obj, a2, vVar);
            } catch (Throwable th) {
                t(vVar, th);
                n.a(obj);
            }
        }

        @Override // io.netty.channel.d.a
        public p0.a y() {
            if (this.b == null) {
                this.b = ((y) ((vkf) AbstractChannel.this).X()).g().a();
            }
            return this.b;
        }

        @Override // io.netty.channel.d.a
        public final SocketAddress z() {
            return AbstractChannel.this.Q0();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends d0 {
        b(AbstractChannel abstractChannel) {
            super(abstractChannel);
        }

        /* access modifiers changed from: package-private */
        public boolean P() {
            return super.q();
        }

        @Override // io.netty.channel.d0, io.netty.util.concurrent.i, io.netty.util.concurrent.y, io.netty.channel.v
        /* renamed from: g */
        public v mo85g(Throwable th) {
            throw new IllegalStateException();
        }

        @Override // io.netty.channel.d0, io.netty.channel.v
        public v m() {
            throw new IllegalStateException();
        }

        @Override // io.netty.util.concurrent.i, io.netty.util.concurrent.y
        public boolean n(Throwable th) {
            throw new IllegalStateException();
        }

        @Override // io.netty.channel.d0, io.netty.channel.v
        public boolean q() {
            throw new IllegalStateException();
        }

        @Override // io.netty.channel.d0, io.netty.util.concurrent.i, io.netty.util.concurrent.y, io.netty.channel.v
        /* renamed from: g  reason: collision with other method in class */
        public y mo85g(Throwable th) {
            throw new IllegalStateException();
        }
    }

    static {
        int i = c.b;
        ClosedChannelException closedChannelException = new ClosedChannelException();
        yif.Z(closedChannelException, a.class, "flush0()");
        y = closedChannelException;
        ClosedChannelException closedChannelException2 = new ClosedChannelException();
        yif.Z(closedChannelException2, a.class, "ensureOpen(...)");
        z = closedChannelException2;
        ClosedChannelException closedChannelException3 = new ClosedChannelException();
        yif.Z(closedChannelException3, a.class, "close(...)");
        A = closedChannelException3;
        ClosedChannelException closedChannelException4 = new ClosedChannelException();
        yif.Z(closedChannelException4, a.class, "write(...)");
        B = closedChannelException4;
        NotYetConnectedException notYetConnectedException = new NotYetConnectedException();
        yif.Z(notYetConnectedException, a.class, "flush0()");
        C = notYetConnectedException;
    }

    protected AbstractChannel(d dVar) {
        this.c = dVar;
        this.f = DefaultChannelId.d();
        this.n = O0();
        this.o = new a0(this);
    }

    /* access modifiers changed from: protected */
    public abstract void D0();

    /* access modifiers changed from: protected */
    public abstract void E0();

    /* access modifiers changed from: protected */
    public void F0() {
    }

    /* access modifiers changed from: protected */
    public abstract void G0();

    /* access modifiers changed from: protected */
    public void H0() {
    }

    /* access modifiers changed from: protected */
    public abstract void I0(q qVar);

    /* access modifiers changed from: protected */
    public Object J0(Object obj) {
        return obj;
    }

    public d K0() {
        this.o.b.flush();
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract boolean L0(i0 i0Var);

    public SocketAddress M0() {
        SocketAddress socketAddress = this.r;
        if (socketAddress != null) {
            return socketAddress;
        }
        try {
            SocketAddress E = l0().E();
            this.r = E;
            return E;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract SocketAddress N0();

    /* access modifiers changed from: protected */
    public abstract a O0();

    public SocketAddress P0() {
        SocketAddress socketAddress = this.s;
        if (socketAddress != null) {
            return socketAddress;
        }
        try {
            SocketAddress z2 = l0().z();
            this.s = z2;
            return z2;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract SocketAddress Q0();

    @Override // io.netty.channel.d
    public i0 V() {
        i0 i0Var = this.t;
        if (i0Var != null) {
            return i0Var;
        }
        throw new IllegalStateException("channel not registered to an event loop");
    }

    @Override // io.netty.channel.s
    public g close() {
        return this.o.close();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public int compareTo(d dVar) {
        d dVar2 = dVar;
        if (this == dVar2) {
            return 0;
        }
        return this.f.compareTo(dVar2.id());
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // io.netty.channel.d
    public boolean g0() {
        return this.u;
    }

    @Override // io.netty.channel.s
    public g h0(SocketAddress socketAddress, v vVar) {
        this.o.b.u(socketAddress, null, vVar);
        return vVar;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // io.netty.channel.d
    public final ChannelId id() {
        return this.f;
    }

    @Override // io.netty.channel.s
    public final v l() {
        return this.o.l();
    }

    @Override // io.netty.channel.d
    public d.a l0() {
        return this.n;
    }

    @Override // io.netty.channel.d
    public boolean n0() {
        q A2 = this.n.A();
        return A2 != null && A2.m();
    }

    @Override // io.netty.channel.d
    public t o() {
        return this.o;
    }

    @Override // io.netty.channel.s
    public v q() {
        return this.o.q();
    }

    @Override // io.netty.channel.d
    public d read() {
        this.o.b.read();
        return this;
    }

    @Override // io.netty.channel.d
    public k t() {
        return ((y) ((vkf) this).X()).d();
    }

    @Override // java.lang.Object
    public String toString() {
        String str;
        boolean isActive = ((vkf) this).isActive();
        if (this.v == isActive && (str = this.w) != null) {
            return str;
        }
        SocketAddress P0 = P0();
        SocketAddress M0 = M0();
        if (P0 != null) {
            StringBuilder T0 = je.T0(96, "[id: 0x");
            T0.append(this.f.U0());
            T0.append(", L:");
            T0.append(M0);
            T0.append(isActive ? " - " : " ! ");
            T0.append("R:");
            T0.append(P0);
            T0.append(']');
            this.w = T0.toString();
        } else if (M0 != null) {
            StringBuilder T02 = je.T0(64, "[id: 0x");
            T02.append(this.f.U0());
            T02.append(", L:");
            T02.append(M0);
            T02.append(']');
            this.w = T02.toString();
        } else {
            StringBuilder T03 = je.T0(16, "[id: 0x");
            T03.append(this.f.U0());
            T03.append(']');
            this.w = T03.toString();
        }
        this.v = isActive;
        return this.w;
    }

    @Override // io.netty.channel.s
    public g u(SocketAddress socketAddress, SocketAddress socketAddress2, v vVar) {
        return this.o.b.u(socketAddress, socketAddress2, vVar);
    }

    @Override // io.netty.channel.s
    public g z(Object obj) {
        b bVar = this.o.b;
        v q2 = bVar.q();
        bVar.t1(obj, q2);
        return q2;
    }
}
