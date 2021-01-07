package defpackage;

import defpackage.jkf;
import io.netty.channel.ChannelException;
import io.netty.channel.r0;
import io.netty.channel.u0;
import io.netty.util.concurrent.c0;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.s;
import io.netty.util.l;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractSelector;
import java.nio.channels.spi.SelectorProvider;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: kkf  reason: default package */
public final class kkf extends u0 {
    private static final io.netty.util.internal.logging.b R = io.netty.util.internal.logging.c.b(kkf.class.getName());
    private static final boolean S = s.b("io.netty.noKeySetOptimization", false);
    private static final int T;
    private final l I = new a();
    Selector J;
    private nkf K;
    private final SelectorProvider L;
    private final AtomicBoolean M = new AtomicBoolean();
    private final r0 N;
    private volatile int O = 50;
    private int P;
    private boolean Q;

    /* renamed from: kkf$a */
    class a implements l {
        a() {
        }

        @Override // io.netty.util.l
        public int get() {
            return kkf.this.k0();
        }
    }

    /* renamed from: kkf$b */
    static class b implements PrivilegedAction<Void> {
        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.security.PrivilegedAction
        public Void run() {
            System.setProperty("sun.nio.ch.bugLevel", "");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kkf$c */
    public class c implements PrivilegedAction<Object> {
        c(kkf kkf) {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                return Class.forName("sun.nio.ch.SelectorImpl", false, PlatformDependent.x());
            } catch (ClassNotFoundException e) {
                return e;
            } catch (SecurityException e2) {
                return e2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kkf$d */
    public class d implements PrivilegedAction<Object> {
        final /* synthetic */ Class a;
        final /* synthetic */ Selector b;
        final /* synthetic */ nkf c;

        d(kkf kkf, Class cls, Selector selector, nkf nkf) {
            this.a = cls;
            this.b = selector;
            this.c = nkf;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                Field declaredField = this.a.getDeclaredField("selectedKeys");
                Field declaredField2 = this.a.getDeclaredField("publicSelectedKeys");
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                declaredField.set(this.b, this.c);
                declaredField2.set(this.b, this.c);
                return null;
            } catch (NoSuchFieldException e) {
                return e;
            } catch (IllegalAccessException e2) {
                return e2;
            } catch (RuntimeException e3) {
                if ("java.lang.reflect.InaccessibleObjectException".equals(e3.getClass().getName())) {
                    return e3;
                }
                throw e3;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kkf$e */
    public class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            kkf.this.g0();
        }
    }

    static {
        int i = io.netty.util.internal.logging.c.b;
        int i2 = 0;
        if (s.a("sun.nio.ch.bugLevel", null) == null) {
            try {
                AccessController.doPrivileged(new b());
            } catch (SecurityException e2) {
                R.t("Unable to get/set System Property: sun.nio.ch.bugLevel", e2);
            }
        }
        int c2 = s.c("io.netty.selectorAutoRebuildThreshold", 512);
        if (c2 >= 3) {
            i2 = c2;
        }
        T = i2;
        io.netty.util.internal.logging.b bVar = R;
        if (bVar.c()) {
            bVar.r("-Dio.netty.noKeySetOptimization: {}", Boolean.valueOf(S));
            bVar.r("-Dio.netty.selectorAutoRebuildThreshold: {}", Integer.valueOf(i2));
        }
    }

    kkf(lkf lkf, Executor executor, SelectorProvider selectorProvider, r0 r0Var, c0 c0Var) {
        super(lkf, executor, false, u0.H, c0Var);
        if (selectorProvider == null) {
            throw new NullPointerException("selectorProvider");
        } else if (r0Var != null) {
            this.L = selectorProvider;
            this.J = Z();
            this.N = r0Var;
        } else {
            throw new NullPointerException("selectStrategy");
        }
    }

    private void X() {
        i0();
        Set<SelectionKey> keys = this.J.keys();
        ArrayList arrayList = new ArrayList(keys.size());
        for (SelectionKey selectionKey : keys) {
            Object attachment = selectionKey.attachment();
            if (attachment instanceof jkf) {
                arrayList.add((jkf) attachment);
            } else {
                selectionKey.cancel();
                Y((mkf) attachment, selectionKey, null);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jkf jkf = (jkf) it.next();
            jkf.l0().k(jkf.l0().l());
        }
    }

    private static void Y(mkf<SelectableChannel> mkf, SelectionKey selectionKey, Throwable th) {
        try {
            mkf.a(selectionKey.channel(), th);
        } catch (Exception e2) {
            R.j("Unexpected exception while running NioTask.channelUnregistered()", e2);
        }
    }

    private Selector Z() {
        try {
            AbstractSelector openSelector = this.L.openSelector();
            if (S) {
                return openSelector;
            }
            nkf nkf = new nkf();
            Object doPrivileged = AccessController.doPrivileged(new c(this));
            if (doPrivileged instanceof Class) {
                Class cls = (Class) doPrivileged;
                if (cls.isAssignableFrom(openSelector.getClass())) {
                    Object doPrivileged2 = AccessController.doPrivileged(new d(this, cls, openSelector, nkf));
                    if (doPrivileged2 instanceof Exception) {
                        this.K = null;
                        R.e("failed to instrument a special java.util.Set into: {}", openSelector, (Exception) doPrivileged2);
                    } else {
                        this.K = nkf;
                        R.m("instrumented a special java.util.Set into: {}", openSelector);
                    }
                    return openSelector;
                }
            }
            if (doPrivileged instanceof Exception) {
                R.e("failed to instrument a special java.util.Set into: {}", openSelector, (Exception) doPrivileged);
            }
            return openSelector;
        } catch (IOException e2) {
            throw new ChannelException("failed to open a new selector", e2);
        }
    }

    private void a0(SelectionKey selectionKey, jkf jkf) {
        jkf.c e1 = jkf.l0();
        if (!selectionKey.isValid()) {
            try {
                if (jkf.V() == this) {
                    e1.k(e1.l());
                }
            } catch (Throwable unused) {
            }
        } else {
            try {
                int readyOps = selectionKey.readyOps();
                if ((readyOps & 8) != 0) {
                    selectionKey.interestOps(selectionKey.interestOps() & -9);
                    e1.b();
                }
                if ((readyOps & 4) != 0) {
                    jkf.l0().a();
                }
                if ((readyOps & 17) != 0 || readyOps == 0) {
                    e1.read();
                    if (jkf.isOpen()) {
                    }
                }
            } catch (CancelledKeyException unused2) {
                e1.k(e1.l());
            }
        }
    }

    private static void d0(SelectionKey selectionKey, mkf<SelectableChannel> mkf) {
        try {
            mkf.b(selectionKey.channel(), selectionKey);
            if (!selectionKey.isValid()) {
                Y(mkf, selectionKey, null);
            }
        } catch (Exception e2) {
            selectionKey.cancel();
            Y(mkf, selectionKey, e2);
        } catch (Throwable th) {
            selectionKey.cancel();
            Y(mkf, selectionKey, null);
            throw th;
        }
    }

    private void e0() {
        nkf nkf = this.K;
        if (nkf != null) {
            SelectionKey[] c2 = nkf.c();
            int i = 0;
            while (true) {
                SelectionKey selectionKey = c2[i];
                if (selectionKey != null) {
                    c2[i] = null;
                    Object attachment = selectionKey.attachment();
                    if (attachment instanceof jkf) {
                        a0(selectionKey, (jkf) attachment);
                    } else {
                        d0(selectionKey, (mkf) attachment);
                    }
                    if (this.Q) {
                        while (true) {
                            i++;
                            if (c2[i] == null) {
                                break;
                            }
                            c2[i] = null;
                        }
                        i0();
                        c2 = this.K.c();
                        i = -1;
                    }
                    i++;
                } else {
                    return;
                }
            }
        } else {
            Set<SelectionKey> selectedKeys = this.J.selectedKeys();
            if (!selectedKeys.isEmpty()) {
                Iterator<SelectionKey> it = selectedKeys.iterator();
                while (true) {
                    SelectionKey next = it.next();
                    Object attachment2 = next.attachment();
                    it.remove();
                    if (attachment2 instanceof jkf) {
                        a0(next, (jkf) attachment2);
                    } else {
                        d0(next, (mkf) attachment2);
                    }
                    if (it.hasNext()) {
                        if (this.Q) {
                            i0();
                            Set<SelectionKey> selectedKeys2 = this.J.selectedKeys();
                            if (!selectedKeys2.isEmpty()) {
                                it = selectedKeys2.iterator();
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0096, code lost:
        r6 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h0(boolean r14) {
        /*
            r13 = this;
            java.nio.channels.Selector r0 = r13.J
            long r1 = java.lang.System.nanoTime()     // Catch:{ CancelledKeyException -> 0x00b1 }
            long r3 = r13.E(r1)     // Catch:{ CancelledKeyException -> 0x00b1 }
            long r3 = r3 + r1
            r5 = 0
            r6 = 0
        L_0x000d:
            long r7 = r3 - r1
            r9 = 500000(0x7a120, double:2.47033E-318)
            long r7 = r7 + r9
            r9 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 / r9
            r9 = 0
            r11 = 1
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 > 0) goto L_0x0025
            if (r6 != 0) goto L_0x009b
            r0.selectNow()     // Catch:{ CancelledKeyException -> 0x00b1 }
            goto L_0x0096
        L_0x0025:
            boolean r9 = r13.J()     // Catch:{ CancelledKeyException -> 0x00b1 }
            if (r9 == 0) goto L_0x0037
            java.util.concurrent.atomic.AtomicBoolean r9 = r13.M     // Catch:{ CancelledKeyException -> 0x00b1 }
            boolean r9 = r9.compareAndSet(r5, r11)     // Catch:{ CancelledKeyException -> 0x00b1 }
            if (r9 == 0) goto L_0x0037
            r0.selectNow()     // Catch:{ CancelledKeyException -> 0x00b1 }
            goto L_0x0096
        L_0x0037:
            int r9 = r0.select(r7)     // Catch:{ CancelledKeyException -> 0x00b1 }
            int r6 = r6 + 1
            if (r9 != 0) goto L_0x009b
            if (r14 != 0) goto L_0x009b
            java.util.concurrent.atomic.AtomicBoolean r9 = r13.M     // Catch:{ CancelledKeyException -> 0x00b1 }
            boolean r9 = r9.get()     // Catch:{ CancelledKeyException -> 0x00b1 }
            if (r9 != 0) goto L_0x009b
            boolean r9 = r13.J()     // Catch:{ CancelledKeyException -> 0x00b1 }
            if (r9 != 0) goto L_0x009b
            boolean r9 = r13.d()     // Catch:{ CancelledKeyException -> 0x00b1 }
            if (r9 == 0) goto L_0x0056
            goto L_0x009b
        L_0x0056:
            boolean r9 = java.lang.Thread.interrupted()     // Catch:{ CancelledKeyException -> 0x00b1 }
            if (r9 == 0) goto L_0x006a
            io.netty.util.internal.logging.b r14 = defpackage.kkf.R     // Catch:{ CancelledKeyException -> 0x00b1 }
            boolean r1 = r14.c()     // Catch:{ CancelledKeyException -> 0x00b1 }
            if (r1 == 0) goto L_0x0096
            java.lang.String r1 = "Selector.select() returned prematurely because Thread.currentThread().interrupt() was called. Use NioEventLoop.shutdownGracefully() to shutdown the NioEventLoop."
            r14.p(r1)     // Catch:{ CancelledKeyException -> 0x00b1 }
            goto L_0x0096
        L_0x006a:
            long r9 = java.lang.System.nanoTime()     // Catch:{ CancelledKeyException -> 0x00b1 }
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ CancelledKeyException -> 0x00b1 }
            long r7 = r12.toNanos(r7)     // Catch:{ CancelledKeyException -> 0x00b1 }
            long r7 = r9 - r7
            int r12 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r12 < 0) goto L_0x007d
            r1 = 1
            r6 = 1
            goto L_0x0098
        L_0x007d:
            int r1 = defpackage.kkf.T     // Catch:{ CancelledKeyException -> 0x00b1 }
            if (r1 <= 0) goto L_0x0098
            if (r6 < r1) goto L_0x0098
            io.netty.util.internal.logging.b r14 = defpackage.kkf.R     // Catch:{ CancelledKeyException -> 0x00b1 }
            java.lang.String r1 = "Selector.select() returned prematurely {} times in a row; rebuilding Selector {}."
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ CancelledKeyException -> 0x00b1 }
            r14.g(r1, r2, r0)     // Catch:{ CancelledKeyException -> 0x00b1 }
            r13.g0()     // Catch:{ CancelledKeyException -> 0x00b1 }
            java.nio.channels.Selector r0 = r13.J     // Catch:{ CancelledKeyException -> 0x00b1 }
            r0.selectNow()     // Catch:{ CancelledKeyException -> 0x00b1 }
        L_0x0096:
            r6 = 1
            goto L_0x009b
        L_0x0098:
            r1 = r9
            goto L_0x000d
        L_0x009b:
            r14 = 3
            if (r6 <= r14) goto L_0x00ca
            io.netty.util.internal.logging.b r14 = defpackage.kkf.R     // Catch:{ CancelledKeyException -> 0x00b1 }
            boolean r1 = r14.c()     // Catch:{ CancelledKeyException -> 0x00b1 }
            if (r1 == 0) goto L_0x00ca
            java.lang.String r1 = "Selector.select() returned prematurely {} times in a row for Selector {}."
            int r6 = r6 - r11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ CancelledKeyException -> 0x00b1 }
            r14.b(r1, r2, r0)     // Catch:{ CancelledKeyException -> 0x00b1 }
            goto L_0x00ca
        L_0x00b1:
            r14 = move-exception
            io.netty.util.internal.logging.b r1 = defpackage.kkf.R
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x00ca
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class<java.nio.channels.CancelledKeyException> r3 = java.nio.channels.CancelledKeyException.class
            java.lang.String r4 = " raised by a Selector {} - JDK bug?"
            java.lang.String r2 = defpackage.je.m0(r3, r2, r4)
            r1.b(r2, r0, r14)
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kkf.h0(boolean):void");
    }

    private void i0() {
        this.Q = false;
        try {
            this.J.selectNow();
        } catch (Throwable th) {
            R.j("Failed to update SelectionKeys.", th);
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.util.concurrent.g0
    public Runnable K() {
        Runnable K2 = super.K();
        if (this.Q) {
            i0();
        }
        return K2;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.util.concurrent.g0
    public void M() {
        while (true) {
            try {
                int a2 = this.N.a(this.I, J());
                if (a2 == -2) {
                    continue;
                } else {
                    if (a2 == -1) {
                        h0(this.M.getAndSet(false));
                        if (this.M.get()) {
                            this.J.wakeup();
                        }
                    }
                    this.P = 0;
                    this.Q = false;
                    int i = this.O;
                    if (i == 100) {
                        try {
                            e0();
                        } finally {
                            N();
                        }
                    } else {
                        long nanoTime = System.nanoTime();
                        try {
                            e0();
                        } finally {
                            O(((System.nanoTime() - nanoTime) * ((long) (100 - i))) / ((long) i));
                        }
                    }
                    try {
                        if (c1()) {
                            X();
                            if (A()) {
                                return;
                            }
                        } else {
                            continue;
                        }
                    } catch (Throwable th) {
                        R.j("Unexpected exception in the selector loop.", th);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            } catch (Throwable th2) {
                R.j("Unexpected exception in the selector loop.", th2);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException unused2) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.util.concurrent.g0
    public void T(boolean z) {
        if (!z && this.M.compareAndSet(false, true)) {
            this.J.wakeup();
        }
    }

    /* access modifiers changed from: package-private */
    public void V(SelectionKey selectionKey) {
        selectionKey.cancel();
        int i = this.P + 1;
        this.P = i;
        if (i >= 256) {
            this.P = 0;
            this.Q = true;
        }
    }

    public void g0() {
        if (!G()) {
            execute(new e());
            return;
        }
        Selector selector = this.J;
        if (selector != null) {
            try {
                Selector Z = Z();
                int i = 0;
                while (true) {
                    try {
                        break;
                    } catch (ConcurrentModificationException unused) {
                    }
                }
                for (SelectionKey selectionKey : selector.keys()) {
                    Object attachment = selectionKey.attachment();
                    try {
                        if (selectionKey.isValid()) {
                            if (selectionKey.channel().keyFor(Z) == null) {
                                int interestOps = selectionKey.interestOps();
                                selectionKey.cancel();
                                SelectionKey register = selectionKey.channel().register(Z, interestOps, attachment);
                                if (attachment instanceof jkf) {
                                    ((jkf) attachment).F = register;
                                }
                                i++;
                            }
                        }
                    } catch (Exception e2) {
                        R.j("Failed to re-register a Channel to the new Selector.", e2);
                        if (attachment instanceof jkf) {
                            jkf jkf = (jkf) attachment;
                            jkf.l0().k(jkf.l0().l());
                        } else {
                            Y((mkf) attachment, selectionKey, e2);
                        }
                    }
                }
                this.J = Z;
                try {
                    selector.close();
                } catch (Throwable th) {
                    if (R.a()) {
                        R.j("Failed to close the old Selector.", th);
                    }
                }
                io.netty.util.internal.logging.b bVar = R;
                bVar.u("Migrated " + i + " channel(s) to the new Selector.");
            } catch (Exception e3) {
                R.j("Failed to create a new Selector.", e3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int k0() {
        try {
            return this.J.selectNow();
        } finally {
            if (this.M.get()) {
                this.J.wakeup();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.util.concurrent.g0
    public void z() {
        try {
            this.J.close();
        } catch (IOException e2) {
            R.j("Failed to close a selector.", e2);
        }
    }
}
