package androidx.work.impl.utils.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractFuture<V> implements ListenableFuture<V> {
    static final boolean f = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger n = Logger.getLogger(AbstractFuture.class.getName());
    static final b o;
    private static final Object p = new Object();
    volatile Object a;
    volatile d b;
    volatile h c;

    /* access modifiers changed from: private */
    public static final class Failure {
        static final Failure b = new Failure(new Throwable("Failure occurred while trying to finish a future.") {
            /* class androidx.work.impl.utils.futures.AbstractFuture.Failure.AnonymousClass1 */

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable a;

        Failure(Throwable th) {
            boolean z = AbstractFuture.f;
            th.getClass();
            this.a = th;
        }
    }

    /* access modifiers changed from: private */
    public static abstract class b {
        b(a aVar) {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a(AbstractFuture<?> abstractFuture, d dVar, d dVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        public abstract boolean c(AbstractFuture<?> abstractFuture, h hVar, h hVar2);

        /* access modifiers changed from: package-private */
        public abstract void d(h hVar, h hVar2);

        /* access modifiers changed from: package-private */
        public abstract void e(h hVar, Thread thread);
    }

    /* access modifiers changed from: private */
    public static final class c {
        static final c c;
        static final c d;
        final boolean a;
        final Throwable b;

        static {
            if (AbstractFuture.f) {
                d = null;
                c = null;
                return;
            }
            d = new c(false, null);
            c = new c(true, null);
        }

        c(boolean z, Throwable th) {
            this.a = z;
            this.b = th;
        }
    }

    /* access modifiers changed from: private */
    public static final class d {
        static final d d = new d(null, null);
        final Runnable a;
        final Executor b;
        d c;

        d(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }

    private static final class e extends b {
        final AtomicReferenceFieldUpdater<h, Thread> a;
        final AtomicReferenceFieldUpdater<h, h> b;
        final AtomicReferenceFieldUpdater<AbstractFuture, h> c;
        final AtomicReferenceFieldUpdater<AbstractFuture, d> d;
        final AtomicReferenceFieldUpdater<AbstractFuture, Object> e;

        e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            super(null);
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public boolean a(AbstractFuture<?> abstractFuture, d dVar, d dVar2) {
            return this.d.compareAndSet(abstractFuture, dVar, dVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            return this.e.compareAndSet(abstractFuture, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public boolean c(AbstractFuture<?> abstractFuture, h hVar, h hVar2) {
            return this.c.compareAndSet(abstractFuture, hVar, hVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public void d(h hVar, h hVar2) {
            this.b.lazySet(hVar, hVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public void e(h hVar, Thread thread) {
            this.a.lazySet(hVar, thread);
        }
    }

    /* access modifiers changed from: private */
    public static final class f<V> implements Runnable {
        final AbstractFuture<V> a;
        final ListenableFuture<? extends V> b;

        f(AbstractFuture<V> abstractFuture, ListenableFuture<? extends V> listenableFuture) {
            this.a = abstractFuture;
            this.b = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.a == this) {
                if (AbstractFuture.o.b(this.a, this, AbstractFuture.f(this.b))) {
                    AbstractFuture.b(this.a);
                }
            }
        }
    }

    private static final class g extends b {
        g() {
            super(null);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public boolean a(AbstractFuture<?> abstractFuture, d dVar, d dVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.b != dVar) {
                    return false;
                }
                abstractFuture.b = dVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                if (abstractFuture.a != obj) {
                    return false;
                }
                abstractFuture.a = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public boolean c(AbstractFuture<?> abstractFuture, h hVar, h hVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.c != hVar) {
                    return false;
                }
                abstractFuture.c = hVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public void d(h hVar, h hVar2) {
            hVar.b = hVar2;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public void e(h hVar, Thread thread) {
            hVar.a = thread;
        }
    }

    /* access modifiers changed from: private */
    public static final class h {
        static final h c = new h(false);
        volatile Thread a;
        volatile h b;

        h(boolean z) {
        }

        h() {
            AbstractFuture.o.e(this, Thread.currentThread());
        }
    }

    static {
        b bVar;
        Throwable th;
        try {
            bVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            bVar = new g();
        }
        o = bVar;
        if (th != null) {
            n.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    protected AbstractFuture() {
    }

    private void a(StringBuilder sb) {
        String str;
        try {
            Object j = j(this);
            sb.append("SUCCESS, result=[");
            if (j == this) {
                str = "this future";
            } else {
                str = String.valueOf(j);
            }
            sb.append(str);
            sb.append("]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x0002 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:25:0x0002 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.work.impl.utils.futures.AbstractFuture<?>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.work.impl.utils.futures.AbstractFuture] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.work.impl.utils.futures.AbstractFuture, androidx.work.impl.utils.futures.AbstractFuture<V>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.work.impl.utils.futures.AbstractFuture$b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void b(androidx.work.impl.utils.futures.AbstractFuture<?> r5) {
        /*
            r0 = 0
            r1 = r0
        L_0x0002:
            androidx.work.impl.utils.futures.AbstractFuture$h r2 = r5.c
            androidx.work.impl.utils.futures.AbstractFuture$b r3 = androidx.work.impl.utils.futures.AbstractFuture.o
            androidx.work.impl.utils.futures.AbstractFuture$h r4 = androidx.work.impl.utils.futures.AbstractFuture.h.c
            boolean r3 = r3.c(r5, r2, r4)
            if (r3 == 0) goto L_0x0002
        L_0x000e:
            if (r2 == 0) goto L_0x001c
            java.lang.Thread r3 = r2.a
            if (r3 == 0) goto L_0x0019
            r2.a = r0
            java.util.concurrent.locks.LockSupport.unpark(r3)
        L_0x0019:
            androidx.work.impl.utils.futures.AbstractFuture$h r2 = r2.b
            goto L_0x000e
        L_0x001c:
            androidx.work.impl.utils.futures.AbstractFuture$d r2 = r5.b
            androidx.work.impl.utils.futures.AbstractFuture$b r3 = androidx.work.impl.utils.futures.AbstractFuture.o
            androidx.work.impl.utils.futures.AbstractFuture$d r4 = androidx.work.impl.utils.futures.AbstractFuture.d.d
            boolean r3 = r3.a(r5, r2, r4)
            if (r3 == 0) goto L_0x001c
        L_0x0028:
            r5 = r1
            r1 = r2
            if (r1 == 0) goto L_0x0031
            androidx.work.impl.utils.futures.AbstractFuture$d r2 = r1.c
            r1.c = r5
            goto L_0x0028
        L_0x0031:
            if (r5 == 0) goto L_0x0059
            androidx.work.impl.utils.futures.AbstractFuture$d r1 = r5.c
            java.lang.Runnable r2 = r5.a
            boolean r3 = r2 instanceof androidx.work.impl.utils.futures.AbstractFuture.f
            if (r3 == 0) goto L_0x0052
            androidx.work.impl.utils.futures.AbstractFuture$f r2 = (androidx.work.impl.utils.futures.AbstractFuture.f) r2
            androidx.work.impl.utils.futures.AbstractFuture<V> r5 = r2.a
            java.lang.Object r3 = r5.a
            if (r3 != r2) goto L_0x0057
            com.google.common.util.concurrent.ListenableFuture<? extends V> r3 = r2.b
            java.lang.Object r3 = f(r3)
            androidx.work.impl.utils.futures.AbstractFuture$b r4 = androidx.work.impl.utils.futures.AbstractFuture.o
            boolean r2 = r4.b(r5, r2, r3)
            if (r2 == 0) goto L_0x0057
            goto L_0x0002
        L_0x0052:
            java.util.concurrent.Executor r5 = r5.b
            c(r2, r5)
        L_0x0057:
            r5 = r1
            goto L_0x0031
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.b(androidx.work.impl.utils.futures.AbstractFuture):void");
    }

    private static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = n;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    private V e(Object obj) {
        if (obj instanceof c) {
            Throwable th = ((c) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).a);
        } else if (obj == p) {
            return null;
        } else {
            return obj;
        }
    }

    static Object f(ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof AbstractFuture) {
            Object obj = ((AbstractFuture) listenableFuture).a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (!cVar.a) {
                return obj;
            }
            if (cVar.b != null) {
                return new c(false, cVar.b);
            }
            return c.d;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!f) && isCancelled) {
            return c.d;
        }
        try {
            Object j = j(listenableFuture);
            return j == null ? p : j;
        } catch (ExecutionException e2) {
            return new Failure(e2.getCause());
        } catch (CancellationException e3) {
            if (isCancelled) {
                return new c(false, e3);
            }
            return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e3));
        } catch (Throwable th) {
            return new Failure(th);
        }
    }

    private static <V> V j(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    private void o(h hVar) {
        hVar.a = null;
        while (true) {
            h hVar2 = this.c;
            if (hVar2 != h.c) {
                h hVar3 = null;
                while (hVar2 != null) {
                    h hVar4 = hVar2.b;
                    if (hVar2.a != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.b = hVar4;
                        if (hVar3.a == null) {
                        }
                    } else if (!o.c(this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        d dVar = d.d;
        executor.getClass();
        d dVar2 = this.b;
        if (dVar2 != dVar) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.c = dVar2;
                if (!o.a(this, dVar2, dVar3)) {
                    dVar2 = this.b;
                } else {
                    return;
                }
            } while (dVar2 != dVar);
        }
        c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        c cVar;
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        if (f) {
            cVar = new c(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            cVar = c.c;
        } else {
            cVar = c.d;
        }
        boolean z2 = false;
        AbstractFuture<V> abstractFuture = this;
        while (true) {
            if (o.b(abstractFuture, obj, cVar)) {
                b(abstractFuture);
                if (!(obj instanceof f)) {
                    return true;
                }
                ListenableFuture<? extends V> listenableFuture = ((f) obj).b;
                if (listenableFuture instanceof AbstractFuture) {
                    abstractFuture = (AbstractFuture) listenableFuture;
                    obj = abstractFuture.a;
                    if (!(obj == null) && !(obj instanceof f)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    listenableFuture.cancel(z);
                    return true;
                }
            } else {
                obj = abstractFuture.a;
                if (!(obj instanceof f)) {
                    return z2;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0093  */
    @Override // java.util.concurrent.Future
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V get(long r18, java.util.concurrent.TimeUnit r20) {
        /*
        // Method dump skipped, instructions count: 376
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.a;
        return (!(obj instanceof f)) & (obj != null);
    }

    /* access modifiers changed from: protected */
    public String l() {
        String str;
        Object obj = this.a;
        if (obj instanceof f) {
            StringBuilder V0 = je.V0("setFuture=[");
            ListenableFuture<? extends V> listenableFuture = ((f) obj).b;
            if (listenableFuture == this) {
                str = "this future";
            } else {
                str = String.valueOf(listenableFuture);
            }
            return je.I0(V0, str, "]");
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            StringBuilder V02 = je.V0("remaining delay=[");
            V02.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            V02.append(" ms]");
            return V02.toString();
        }
    }

    /* access modifiers changed from: protected */
    public boolean t(V v) {
        if (v == null) {
            v = (V) p;
        }
        if (!o.b(this, null, v)) {
            return false;
        }
        b(this);
        return true;
    }

    @Override // java.lang.Object
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof c) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = l();
            } catch (RuntimeException e2) {
                StringBuilder V0 = je.V0("Exception thrown from implementation: ");
                V0.append(e2.getClass());
                str = V0.toString();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        h hVar = h.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) && (!(obj2 instanceof f))) {
                return e(obj2);
            }
            h hVar2 = this.c;
            if (hVar2 != hVar) {
                h hVar3 = new h();
                do {
                    b bVar = o;
                    bVar.d(hVar3, hVar2);
                    if (bVar.c(this, hVar2, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                o(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return e(obj);
                    }
                    hVar2 = this.c;
                } while (hVar2 != hVar);
            }
            return e(this.a);
        }
        throw new InterruptedException();
    }
}
