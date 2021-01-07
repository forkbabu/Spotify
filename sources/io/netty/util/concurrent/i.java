package io.netty.util.concurrent;

import com.spotify.voiceassistant.player.models.SearchResponse;
import io.netty.util.Signal;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.e;
import io.netty.util.internal.logging.c;
import io.netty.util.internal.r;
import io.netty.util.internal.s;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class i<V> extends c<V> implements y<V> {
    private static final io.netty.util.internal.logging.b o = c.b(i.class.getName());
    private static final io.netty.util.internal.logging.b p = c.b(i.class.getName() + ".rejectedExecution");
    private static final int q = Math.min(8, s.c("io.netty.defaultPromise.maxListenerStackDepth", 8));
    private static final AtomicReferenceFieldUpdater<i, Object> r;
    private static final Signal s = Signal.d(i.class, SearchResponse.RESULT_SUCCESS);
    private static final Signal t = Signal.d(i.class, "UNCANCELLABLE");
    private static final b u;
    private volatile Object a;
    private final l b;
    private Object c;
    private short f;
    private boolean n;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.M();
        }
    }

    /* access modifiers changed from: private */
    public static final class b {
        final Throwable a;

        b(Throwable th) {
            this.a = th;
        }
    }

    static {
        int i = c.b;
        CancellationException cancellationException = new CancellationException();
        yif.Z(cancellationException, i.class, "cancel(...)");
        u = new b(cancellationException);
        AtomicReferenceFieldUpdater<i, Object> O = PlatformDependent.O(i.class, "result");
        if (O == null) {
            O = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "a");
        }
        r = O;
    }

    public i(l lVar) {
        if (lVar != null) {
            this.b = lVar;
            return;
        }
        throw new NullPointerException("executor");
    }

    private void D() {
        this.f = (short) (this.f - 1);
    }

    private void G() {
        short s2 = this.f;
        if (s2 != Short.MAX_VALUE) {
            this.f = (short) (s2 + 1);
            return;
        }
        throw new IllegalStateException("too many waiters: " + this);
    }

    protected static void I(l lVar, r<?> rVar, s<?> sVar) {
        e e;
        int d;
        if (lVar == null) {
            throw new NullPointerException("eventExecutor");
        } else if (!lVar.G() || (d = (e = e.e()).d()) >= q) {
            try {
                lVar.execute(new j(rVar, sVar));
            } catch (Throwable th) {
                p.n("Failed to submit a listener notification task. Event loop shut down?", th);
            }
        } else {
            e.m(d + 1);
            try {
                J(rVar, sVar);
            } finally {
                e.m(d);
            }
        }
    }

    /* access modifiers changed from: private */
    public static void J(r rVar, s sVar) {
        try {
            sVar.a(rVar);
        } catch (Throwable th) {
            io.netty.util.internal.logging.b bVar = o;
            StringBuilder V0 = je.V0("An exception was thrown by ");
            V0.append(sVar.getClass().getName());
            V0.append(".operationComplete()");
            bVar.j(V0.toString(), th);
        }
    }

    private void L() {
        e e;
        int d;
        l F = F();
        if (!F.G() || (d = (e = e.e()).d()) >= q) {
            try {
                F.execute(new a());
            } catch (Throwable th) {
                p.n("Failed to submit a listener notification task. Event loop shut down?", th);
            }
        } else {
            e.m(d + 1);
            try {
                M();
            } finally {
                e.m(d);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void M() {
        Object obj;
        synchronized (this) {
            if (!this.n) {
                obj = this.c;
                if (obj != null) {
                    this.n = true;
                    this.c = null;
                }
            }
            return;
        }
        while (true) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                s<? extends r<?>>[] b2 = hVar.b();
                int c2 = hVar.c();
                for (int i = 0; i < c2; i++) {
                    J(this, b2[i]);
                }
            } else {
                J(this, (s) obj);
            }
            synchronized (this) {
                obj = this.c;
                if (obj == null) {
                    this.n = false;
                    return;
                }
                this.c = null;
            }
        }
    }

    private boolean N(Object obj) {
        AtomicReferenceFieldUpdater<i, Object> atomicReferenceFieldUpdater = r;
        if (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && !atomicReferenceFieldUpdater.compareAndSet(this, t, obj)) {
            return false;
        }
        synchronized (this) {
            if (this.f > 0) {
                notifyAll();
            }
        }
        return true;
    }

    /* renamed from: B */
    public y<V> u() {
        if (isDone()) {
            return this;
        }
        if (!Thread.interrupted()) {
            C();
            synchronized (this) {
                while (!isDone()) {
                    G();
                    try {
                        wait();
                    } finally {
                        D();
                    }
                }
            }
            return this;
        }
        throw new InterruptedException(toString());
    }

    /* access modifiers changed from: protected */
    public void C() {
        l F = F();
        if (F != null && F.G()) {
            throw new BlockingOperationException(toString());
        }
    }

    /* access modifiers changed from: protected */
    public l F() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public StringBuilder O() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(r.f(this));
        sb.append('@');
        sb.append(Integer.toHexString(hashCode()));
        Object obj = this.a;
        if (obj == s) {
            sb.append("(success)");
        } else if (obj == t) {
            sb.append("(uncancellable)");
        } else if (obj instanceof b) {
            sb.append("(failure: ");
            sb.append(((b) obj).a);
            sb.append(')');
        } else if (obj != null) {
            sb.append("(success: ");
            sb.append(obj);
            sb.append(')');
        } else {
            sb.append("(incomplete)");
        }
        return sb;
    }

    @Override // io.netty.util.concurrent.r, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (!r.compareAndSet(this, null, u)) {
            return false;
        }
        synchronized (this) {
            if (this.f > 0) {
                notifyAll();
            }
        }
        L();
        return true;
    }

    @Override // io.netty.util.concurrent.y, io.netty.channel.v
    /* renamed from: g */
    public y<V> mo85g(Throwable th) {
        if (th == null) {
            throw new NullPointerException("cause");
        } else if (N(new b(th))) {
            L();
            return this;
        } else {
            throw new IllegalStateException("complete already: " + this, th);
        }
    }

    @Override // io.netty.util.concurrent.r
    public boolean i(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (isDone()) {
            return true;
        }
        if (nanos <= 0) {
            return isDone();
        }
        if (!Thread.interrupted()) {
            C();
            long nanoTime = System.nanoTime();
            long j2 = nanos;
            do {
                synchronized (this) {
                    if (isDone()) {
                        return true;
                    }
                    G();
                    try {
                        wait(j2 / 1000000, (int) (j2 % 1000000));
                        D();
                    } catch (InterruptedException e) {
                        throw e;
                    } catch (Throwable th) {
                        D();
                        throw th;
                    }
                }
                if (isDone()) {
                    return true;
                }
                j2 = nanos - (System.nanoTime() - nanoTime);
            } while (j2 > 0);
            return isDone();
        }
        throw new InterruptedException(toString());
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        Object obj = this.a;
        return (obj instanceof b) && (((b) obj).a instanceof CancellationException);
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.a;
        return (obj == null || obj == t) ? false : true;
    }

    @Override // io.netty.util.concurrent.y
    public boolean k() {
        AtomicReferenceFieldUpdater<i, Object> atomicReferenceFieldUpdater = r;
        Signal signal = t;
        if (atomicReferenceFieldUpdater.compareAndSet(this, null, signal)) {
            return true;
        }
        Object obj = this.a;
        if (!((obj == null || obj == signal) ? false : true)) {
            return true;
        }
        if (!((obj instanceof b) && (((b) obj).a instanceof CancellationException))) {
            return true;
        }
        return false;
    }

    @Override // io.netty.util.concurrent.y
    public boolean n(Throwable th) {
        if (th == null) {
            throw new NullPointerException("cause");
        } else if (!N(new b(th))) {
            return false;
        } else {
            L();
            return true;
        }
    }

    @Override // io.netty.util.concurrent.y
    public boolean p(V v) {
        if (v == null) {
            v = (V) s;
        }
        if (!N(v)) {
            return false;
        }
        L();
        return true;
    }

    @Override // io.netty.util.concurrent.r
    public Throwable r() {
        Object obj = this.a;
        if (obj instanceof b) {
            return ((b) obj).a;
        }
        return null;
    }

    @Override // io.netty.util.concurrent.r
    public V s() {
        V v = (V) this.a;
        if ((v instanceof b) || v == s) {
            return null;
        }
        return v;
    }

    @Override // java.lang.Object
    public String toString() {
        return O().toString();
    }

    @Override // io.netty.util.concurrent.y
    public y<V> v(V v) {
        if (v == null) {
            v = (V) s;
        }
        if (N(v)) {
            L();
            return this;
        }
        throw new IllegalStateException("complete already: " + this);
    }

    @Override // io.netty.util.concurrent.r
    public boolean x() {
        Object obj = this.a;
        return (obj == null || obj == t || (obj instanceof b)) ? false : true;
    }

    @Override // io.netty.util.concurrent.r, io.netty.util.concurrent.y, io.netty.channel.v, io.netty.channel.g
    /* renamed from: d */
    public y<V> mo86d(s<? extends r<? super V>> sVar) {
        if (sVar != null) {
            synchronized (this) {
                Object obj = this.c;
                if (obj == null) {
                    this.c = sVar;
                } else if (obj instanceof h) {
                    ((h) obj).a(sVar);
                } else {
                    this.c = new h((s) obj, sVar);
                }
            }
            if (isDone()) {
                L();
            }
            return this;
        }
        throw new NullPointerException("listener");
    }

    protected i() {
        this.b = null;
    }
}
