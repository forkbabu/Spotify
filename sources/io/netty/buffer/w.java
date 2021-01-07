package io.netty.buffer;

import io.netty.buffer.PoolArena;
import io.netty.util.Recycler;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.i;
import io.netty.util.s;
import java.nio.ByteBuffer;
import java.util.Queue;

/* access modifiers changed from: package-private */
public final class w {
    private static final io.netty.util.internal.logging.b o = io.netty.util.internal.logging.c.b(w.class.getName());
    final PoolArena<byte[]> a;
    final PoolArena<ByteBuffer> b;
    private final b<byte[]>[] c;
    private final b<byte[]>[] d;
    private final b<ByteBuffer>[] e;
    private final b<ByteBuffer>[] f;
    private final b<byte[]>[] g;
    private final b<ByteBuffer>[] h;
    private final int i;
    private final int j;
    private final int k;
    private int l;
    private final Thread m;
    private final Runnable n;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w.this.o();
        }
    }

    /* access modifiers changed from: private */
    public static abstract class b<T> {
        private static final Recycler<C0599b> e = new a();
        private final int a;
        private final Queue<C0599b<T>> b;
        private final PoolArena.SizeClass c;
        private int d;

        static class a extends Recycler<C0599b> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.netty.util.Recycler$e] */
            /* access modifiers changed from: protected */
            @Override // io.netty.util.Recycler
            public C0599b k(Recycler.e<C0599b> eVar) {
                return new C0599b(eVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: io.netty.buffer.w$b$b  reason: collision with other inner class name */
        public static final class C0599b<T> {
            final Recycler.e<C0599b<?>> a;
            t<T> b;
            long c = -1;

            C0599b(Recycler.e<C0599b<?>> eVar) {
                this.a = eVar;
            }

            /* access modifiers changed from: package-private */
            public void a() {
                this.b = null;
                this.c = -1;
                this.a.a(this);
            }
        }

        b(int i, PoolArena.SizeClass sizeClass) {
            int b2 = i.b(i);
            this.a = b2;
            this.b = PlatformDependent.Q(b2);
            this.c = sizeClass;
        }

        private int d(int i) {
            int i2 = 0;
            while (i2 < i) {
                C0599b<T> poll = this.b.poll();
                if (poll == null) {
                    break;
                }
                t<T> tVar = poll.b;
                long j = poll.c;
                poll.a();
                tVar.a.i(tVar, j, this.c);
                i2++;
            }
            return i2;
        }

        public final boolean a(t<T> tVar, long j) {
            C0599b<T> j2 = e.j();
            j2.b = tVar;
            j2.c = j;
            boolean offer = this.b.offer(j2);
            if (!offer) {
                j2.a();
            }
            return offer;
        }

        public final boolean b(x<T> xVar, int i) {
            C0599b<T> poll = this.b.poll();
            if (poll == null) {
                return false;
            }
            e(poll.b, poll.c, xVar, i);
            poll.a();
            this.d++;
            return true;
        }

        public final int c() {
            return d(Integer.MAX_VALUE);
        }

        /* access modifiers changed from: protected */
        public abstract void e(t<T> tVar, long j, x<T> xVar, int i);

        public final void f() {
            int i = this.a - this.d;
            this.d = 0;
            if (i > 0) {
                d(i);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final class c<T> extends b<T> {
        c(int i) {
            super(i, PoolArena.SizeClass.Normal);
        }

        /* access modifiers changed from: protected */
        @Override // io.netty.buffer.w.b
        public void e(t<T> tVar, long j, x<T> xVar, int i) {
            tVar.f(xVar, j, i);
        }
    }

    /* access modifiers changed from: private */
    public static final class d<T> extends b<T> {
        d(int i, PoolArena.SizeClass sizeClass) {
            super(i, sizeClass);
        }

        /* access modifiers changed from: protected */
        @Override // io.netty.buffer.w.b
        public void e(t<T> tVar, long j, x<T> xVar, int i) {
            tVar.g(xVar, j, i);
        }
    }

    static {
        int i2 = io.netty.util.internal.logging.c.b;
    }

    w(PoolArena<byte[]> poolArena, PoolArena<ByteBuffer> poolArena2, int i2, int i3, int i4, int i5, int i6) {
        PoolArena.SizeClass sizeClass = PoolArena.SizeClass.Small;
        PoolArena.SizeClass sizeClass2 = PoolArena.SizeClass.Tiny;
        Thread currentThread = Thread.currentThread();
        this.m = currentThread;
        a aVar = new a();
        this.n = aVar;
        if (i5 < 0) {
            throw new IllegalArgumentException(je.q0("maxCachedBufferCapacity: ", i5, " (expected: >= 0)"));
        } else if (i6 >= 1) {
            this.k = i6;
            this.a = poolArena;
            this.b = poolArena2;
            if (poolArena2 != null) {
                this.e = l(i2, 32, sizeClass2);
                this.f = l(i3, poolArena2.g, sizeClass);
                this.i = p(poolArena2.c);
                this.h = k(i4, i5, poolArena2);
                poolArena2.z.getAndIncrement();
            } else {
                this.e = null;
                this.f = null;
                this.h = null;
                this.i = -1;
            }
            if (poolArena != null) {
                this.c = l(i2, 32, sizeClass2);
                this.d = l(i3, poolArena.g, sizeClass);
                this.j = p(poolArena.c);
                this.g = k(i4, i5, poolArena);
                poolArena.z.getAndIncrement();
            } else {
                this.c = null;
                this.d = null;
                this.g = null;
                this.j = -1;
            }
            s.f(currentThread, aVar);
        } else {
            throw new IllegalArgumentException(je.q0("freeSweepAllocationThreshold: ", i6, " (expected: > 0)"));
        }
    }

    private boolean c(b<?> bVar, x xVar, int i2) {
        if (bVar == null) {
            return false;
        }
        boolean b2 = bVar.b(xVar, i2);
        int i3 = this.l + 1;
        this.l = i3;
        if (i3 >= this.k) {
            this.l = 0;
            q(this.e);
            q(this.f);
            q(this.h);
            q(this.c);
            q(this.d);
            q(this.g);
        }
        return b2;
    }

    private static <T> b<T> g(b<T>[] bVarArr, int i2) {
        if (bVarArr == null || i2 > bVarArr.length - 1) {
            return null;
        }
        return bVarArr[i2];
    }

    private b<?> h(PoolArena<?> poolArena, int i2) {
        if (poolArena.j()) {
            return g(this.h, p(i2 >> this.i));
        }
        return g(this.g, p(i2 >> this.j));
    }

    private b<?> i(PoolArena<?> poolArena, int i2) {
        boolean z = PoolArena.A;
        int i3 = i2 >>> 10;
        int i4 = 0;
        while (i3 != 0) {
            i3 >>>= 1;
            i4++;
        }
        if (poolArena.j()) {
            return g(this.f, i4);
        }
        return g(this.d, i4);
    }

    private b<?> j(PoolArena<?> poolArena, int i2) {
        boolean z = PoolArena.A;
        int i3 = i2 >>> 4;
        if (poolArena.j()) {
            return g(this.e, i3);
        }
        return g(this.c, i3);
    }

    private static <T> b<T>[] k(int i2, int i3, PoolArena<T> poolArena) {
        if (i2 <= 0) {
            return null;
        }
        int max = Math.max(1, p(Math.min(poolArena.e, i3) / poolArena.c) + 1);
        b<T>[] bVarArr = new b[max];
        for (int i4 = 0; i4 < max; i4++) {
            bVarArr[i4] = new c(i2);
        }
        return bVarArr;
    }

    private static <T> b<T>[] l(int i2, int i3, PoolArena.SizeClass sizeClass) {
        if (i2 <= 0) {
            return null;
        }
        b<T>[] bVarArr = new b[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bVarArr[i4] = new d(i2, sizeClass);
        }
        return bVarArr;
    }

    private static int m(b<?>[] bVarArr) {
        int i2;
        if (bVarArr == null) {
            return 0;
        }
        int i3 = 0;
        for (b<?> bVar : bVarArr) {
            if (bVar == null) {
                i2 = 0;
            } else {
                i2 = bVar.c();
            }
            i3 += i2;
        }
        return i3;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void o() {
        int m2 = m(this.e) + m(this.f) + m(this.h) + m(this.c) + m(this.d) + m(this.g);
        if (m2 > 0) {
            io.netty.util.internal.logging.b bVar = o;
            if (bVar.c()) {
                bVar.b("Freed {} thread-local buffer(s) from thread: {}", Integer.valueOf(m2), this.m.getName());
            }
        }
        PoolArena<ByteBuffer> poolArena = this.b;
        if (poolArena != null) {
            poolArena.z.getAndDecrement();
        }
        PoolArena<byte[]> poolArena2 = this.a;
        if (poolArena2 != null) {
            poolArena2.z.getAndDecrement();
        }
    }

    private static int p(int i2) {
        int i3 = 0;
        while (i2 > 1) {
            i2 >>= 1;
            i3++;
        }
        return i3;
    }

    private static void q(b<?>[] bVarArr) {
        if (bVarArr != null) {
            for (b<?> bVar : bVarArr) {
                if (bVar != null) {
                    bVar.f();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(PoolArena<?> poolArena, t tVar, long j2, int i2, PoolArena.SizeClass sizeClass) {
        b<?> bVar;
        int ordinal = sizeClass.ordinal();
        if (ordinal == 0) {
            bVar = j(poolArena, i2);
        } else if (ordinal == 1) {
            bVar = i(poolArena, i2);
        } else if (ordinal == 2) {
            bVar = h(poolArena, i2);
        } else {
            throw new Error();
        }
        if (bVar == null) {
            return false;
        }
        return bVar.a(tVar, j2);
    }

    /* access modifiers changed from: package-private */
    public boolean d(PoolArena<?> poolArena, x<?> xVar, int i2, int i3) {
        return c(h(poolArena, i3), xVar, i2);
    }

    /* access modifiers changed from: package-private */
    public boolean e(PoolArena<?> poolArena, x<?> xVar, int i2, int i3) {
        return c(i(poolArena, i3), xVar, i2);
    }

    /* access modifiers changed from: package-private */
    public boolean f(PoolArena<?> poolArena, x<?> xVar, int i2, int i3) {
        return c(j(poolArena, i3), xVar, i2);
    }

    /* access modifiers changed from: package-private */
    public void n() {
        s.e(this.m, this.n);
        o();
    }
}
