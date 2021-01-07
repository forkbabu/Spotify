package io.netty.channel;

import io.netty.buffer.j;
import io.netty.buffer.j0;
import io.netty.util.Recycler;
import io.netty.util.concurrent.p;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.e;
import io.netty.util.n;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public final class q {
    private static final io.netty.util.internal.logging.b l = io.netty.util.internal.logging.c.b(q.class.getName());
    private static final p<ByteBuffer[]> m = new a();
    private static final AtomicLongFieldUpdater<q> n;
    private static final AtomicIntegerFieldUpdater<q> o;
    private final d a;
    private d b;
    private d c;
    private d d;
    private int e;
    private int f;
    private long g;
    private boolean h;
    private volatile long i;
    private volatile int j;
    private volatile Runnable k;

    static class a extends p<ByteBuffer[]> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // io.netty.util.concurrent.p
        public ByteBuffer[] d() {
            return new ByteBuffer[1024];
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {
        final /* synthetic */ t a;

        b(q qVar, t tVar) {
            this.a = tVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.w();
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements Runnable {
        final /* synthetic */ ClosedChannelException a;

        c(ClosedChannelException closedChannelException) {
            this.a = closedChannelException;
        }

        @Override // java.lang.Runnable
        public void run() {
            q.this.d(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d {
        private static final Recycler<d> l = new a();
        private final Recycler.e<d> a;
        d b;
        Object c;
        ByteBuffer[] d;
        ByteBuffer e;
        v f;
        long g;
        long h;
        int i;
        int j = -1;
        boolean k;

        static class a extends Recycler<d> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.netty.util.Recycler$e] */
            /* access modifiers changed from: protected */
            @Override // io.netty.util.Recycler
            public d k(Recycler.e<d> eVar) {
                return new d(eVar, null);
            }
        }

        d(Recycler.e eVar, a aVar) {
            this.a = eVar;
        }

        static d a(Object obj, int i2, long j2, v vVar) {
            d j3 = l.j();
            j3.c = obj;
            j3.i = i2;
            j3.h = j2;
            j3.f = vVar;
            return j3;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.b = null;
            this.d = null;
            this.e = null;
            this.c = null;
            this.f = null;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = -1;
            this.k = false;
            this.a.a(this);
        }
    }

    static {
        int i2 = io.netty.util.internal.logging.c.b;
        AtomicIntegerFieldUpdater<q> M = PlatformDependent.M(q.class, "unwritable");
        if (M == null) {
            M = AtomicIntegerFieldUpdater.newUpdater(q.class, "j");
        }
        o = M;
        AtomicLongFieldUpdater<q> N = PlatformDependent.N(q.class, "totalPendingSize");
        if (N == null) {
            N = AtomicLongFieldUpdater.newUpdater(q.class, "i");
        }
        n = N;
    }

    q(AbstractChannel abstractChannel) {
        this.a = abstractChannel;
    }

    private void c() {
        int i2 = this.f;
        if (i2 > 0) {
            this.f = 0;
            Arrays.fill(m.b(), 0, i2, (Object) null);
        }
    }

    private void g(long j2, boolean z, boolean z2) {
        int i2;
        int i3;
        if (j2 != 0) {
            long addAndGet = n.addAndGet(this, -j2);
            if (z2 && addAndGet < ((long) ((y) this.a.X()).i())) {
                do {
                    i2 = this.j;
                    i3 = i2 & -2;
                } while (!o.compareAndSet(this, i2, i3));
                if (i2 != 0 && i3 == 0) {
                    i(z);
                }
            }
        }
    }

    private void i(boolean z) {
        t o2 = this.a.o();
        if (z) {
            Runnable runnable = this.k;
            if (runnable == null) {
                runnable = new b(this, o2);
                this.k = runnable;
            }
            this.a.V().execute(runnable);
            return;
        }
        o2.w();
    }

    private void k(long j2, boolean z) {
        int i2;
        int i3;
        if (j2 != 0 && n.addAndGet(this, j2) > ((long) ((y) this.a.X()).h())) {
            do {
                i2 = this.j;
                i3 = i2 | 1;
            } while (!o.compareAndSet(this, i2, i3));
            if (i2 == 0 && i3 != 0) {
                i(z);
            }
        }
    }

    private void t(d dVar) {
        int i2 = this.e - 1;
        this.e = i2;
        if (i2 == 0) {
            this.b = null;
            if (dVar == this.d) {
                this.d = null;
                this.c = null;
                return;
            }
            return;
        }
        this.b = dVar.b;
    }

    public void a() {
        int i2;
        d dVar = this.c;
        if (dVar != null) {
            if (this.b == null) {
                this.b = dVar;
            }
            do {
                this.e++;
                if (!dVar.f.k()) {
                    if (!dVar.k) {
                        dVar.k = true;
                        i2 = dVar.i;
                        n.b(dVar.c);
                        dVar.c = j0.b;
                        dVar.i = 0;
                        dVar.h = 0;
                        dVar.g = 0;
                        dVar.d = null;
                        dVar.e = null;
                    } else {
                        i2 = 0;
                    }
                    g((long) i2, false, true);
                }
                dVar = dVar.b;
            } while (dVar != null);
            this.c = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.lang.Object r3, int r4, io.netty.channel.v r5) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof io.netty.buffer.j
            if (r0 == 0) goto L_0x000d
            r0 = r3
            io.netty.buffer.j r0 = (io.netty.buffer.j) r0
            int r0 = r0.m1()
        L_0x000b:
            long r0 = (long) r0
            goto L_0x002b
        L_0x000d:
            boolean r0 = r3 instanceof io.netty.channel.k0
            if (r0 == 0) goto L_0x0019
            r0 = r3
            io.netty.channel.k0 r0 = (io.netty.channel.k0) r0
            long r0 = r0.l()
            goto L_0x002b
        L_0x0019:
            boolean r0 = r3 instanceof io.netty.buffer.l
            if (r0 == 0) goto L_0x0029
            r0 = r3
            io.netty.buffer.l r0 = (io.netty.buffer.l) r0
            io.netty.buffer.j r0 = r0.content()
            int r0 = r0.m1()
            goto L_0x000b
        L_0x0029:
            r0 = -1
        L_0x002b:
            io.netty.channel.q$d r3 = io.netty.channel.q.d.a(r3, r4, r0, r5)
            io.netty.channel.q$d r5 = r2.d
            if (r5 != 0) goto L_0x0039
            r5 = 0
            r2.b = r5
            r2.d = r3
            goto L_0x003d
        L_0x0039:
            r5.b = r3
            r2.d = r3
        L_0x003d:
            io.netty.channel.q$d r5 = r2.c
            if (r5 != 0) goto L_0x0043
            r2.c = r3
        L_0x0043:
            long r3 = (long) r4
            r5 = 0
            r2.k(r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.channel.q.b(java.lang.Object, int, io.netty.channel.v):void");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void d(ClosedChannelException closedChannelException) {
        if (this.h) {
            this.a.V().execute(new c(closedChannelException));
            return;
        }
        boolean z = true;
        this.h = true;
        if (!this.a.isOpen()) {
            if (this.e != 0) {
                z = false;
            }
            if (z) {
                try {
                    d dVar = this.c;
                    while (dVar != null) {
                        n.addAndGet(this, (long) (-dVar.i));
                        if (!dVar.k) {
                            n.b(dVar.c);
                            v vVar = dVar.f;
                            if (!(vVar instanceof w0)) {
                                yif.X(vVar, closedChannelException, l);
                            }
                        }
                        d dVar2 = dVar.b;
                        dVar.b();
                        dVar = dVar2;
                    }
                    this.h = false;
                    c();
                } catch (Throwable th) {
                    this.h = false;
                    throw th;
                }
            } else {
                throw new IllegalStateException("close() must be invoked after all flushed writes are handled.");
            }
        } else {
            throw new IllegalStateException("close() must be invoked after the channel is closed.");
        }
    }

    public Object e() {
        d dVar = this.b;
        if (dVar == null) {
            return null;
        }
        return dVar.c;
    }

    /* access modifiers changed from: package-private */
    public void f(long j2) {
        g(j2, true, true);
    }

    /* access modifiers changed from: package-private */
    public void h(Throwable th, boolean z) {
        boolean z2;
        if (!this.h) {
            boolean z3 = true;
            z3 = false;
            try {
                do {
                    d dVar = this.b;
                    if (dVar == null) {
                        c();
                        z2 = false;
                        continue;
                    } else {
                        Object obj = dVar.c;
                        v vVar = dVar.f;
                        int i2 = dVar.i;
                        t(dVar);
                        if (!dVar.k) {
                            n.b(obj);
                            if (!(vVar instanceof w0)) {
                                yif.X(vVar, th, l);
                            }
                            g((long) i2, z3, z);
                        }
                        dVar.b();
                        z2 = true;
                        continue;
                    }
                } while (z2);
                this.h = z3;
            } finally {
                this.h = z3;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j(long j2) {
        k(j2, true);
    }

    public boolean l() {
        return this.e == 0;
    }

    public boolean m() {
        return this.j == 0;
    }

    public int n() {
        return this.f;
    }

    public long o() {
        return this.g;
    }

    public ByteBuffer[] p() {
        j jVar;
        int n1;
        int Z1;
        e e2 = e.e();
        ByteBuffer[] c2 = m.c(e2);
        d dVar = this.b;
        long j2 = 0;
        int i2 = 0;
        while (true) {
            if (!((dVar == null || dVar == this.c) ? false : true)) {
                break;
            }
            Object obj = dVar.c;
            if (!(obj instanceof j)) {
                break;
            }
            if (!dVar.k && (Z1 = jVar.Z1() - (n1 = (jVar = (j) obj).n1())) > 0) {
                if (((long) (Integer.MAX_VALUE - Z1)) < j2) {
                    break;
                }
                j2 += (long) Z1;
                int i3 = dVar.j;
                if (i3 == -1) {
                    i3 = jVar.Q0();
                    dVar.j = i3;
                }
                int i4 = i2 + i3;
                if (i4 > c2.length) {
                    int length = c2.length;
                    do {
                        length <<= 1;
                        if (length < 0) {
                            throw new IllegalStateException();
                        }
                    } while (i4 > length);
                    ByteBuffer[] byteBufferArr = new ByteBuffer[length];
                    System.arraycopy(c2, 0, byteBufferArr, 0, i2);
                    m.h(e2, byteBufferArr);
                    c2 = byteBufferArr;
                }
                if (i3 == 1) {
                    ByteBuffer byteBuffer = dVar.e;
                    if (byteBuffer == null) {
                        byteBuffer = jVar.G0(n1, Z1);
                        dVar.e = byteBuffer;
                    }
                    c2[i2] = byteBuffer;
                    i2++;
                } else {
                    ByteBuffer[] byteBufferArr2 = dVar.d;
                    if (byteBufferArr2 == null) {
                        byteBufferArr2 = jVar.T0();
                        dVar.d = byteBufferArr2;
                    }
                    int length2 = byteBufferArr2.length;
                    int i5 = 0;
                    while (i5 < length2) {
                        ByteBuffer byteBuffer2 = byteBufferArr2[i5];
                        if (byteBuffer2 == null) {
                            break;
                        }
                        c2[i2] = byteBuffer2;
                        i5++;
                        i2++;
                    }
                }
            }
            dVar = dVar.b;
        }
        this.f = i2;
        this.g = j2;
        return c2;
    }

    public void q(long j2) {
        d dVar = this.b;
        v vVar = dVar.f;
        if (vVar instanceof u) {
            long j3 = dVar.g + j2;
            dVar.g = j3;
            ((u) vVar).w(j3, dVar.h);
        }
    }

    public boolean r() {
        d dVar = this.b;
        if (dVar == null) {
            c();
            return false;
        }
        Object obj = dVar.c;
        v vVar = dVar.f;
        int i2 = dVar.i;
        t(dVar);
        if (!dVar.k) {
            n.b(obj);
            if (!(vVar instanceof w0)) {
                yif.Y(vVar, null, l);
            }
            g((long) i2, false, true);
        }
        dVar.b();
        return true;
    }

    public void s(long j2) {
        Object obj;
        while (true) {
            d dVar = this.b;
            if (dVar == null) {
                obj = null;
            } else {
                obj = dVar.c;
            }
            if (!(obj instanceof j)) {
                break;
            }
            j jVar = (j) obj;
            int n1 = jVar.n1();
            long Z1 = (long) (jVar.Z1() - n1);
            if (Z1 <= j2) {
                if (j2 != 0) {
                    q(Z1);
                    j2 -= Z1;
                }
                r();
            } else if (j2 != 0) {
                jVar.p1(n1 + ((int) j2));
                q(j2);
            }
        }
        c();
    }

    public int u() {
        return this.e;
    }
}
