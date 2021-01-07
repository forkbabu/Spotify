package io.netty.buffer;

import io.netty.buffer.PoolArena;
import io.netty.util.concurrent.p;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.logging.b;
import io.netty.util.internal.logging.c;
import io.netty.util.internal.s;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class y extends b {
    private static final b l = c.b(y.class.getName());
    private static final int m;
    private static final int n;
    private static final int o;
    private static final int p;
    private static final int q;
    private static final int r;
    private static final int s;
    private static final int t;
    private static final int u;
    public static final y v = new y(PlatformDependent.i());
    private final PoolArena<byte[]>[] d;
    private final PoolArena<ByteBuffer>[] e;
    private final int f;
    private final int g;
    private final int h;
    private final List<Object> i;
    private final List<Object> j;
    private final a k;

    /* access modifiers changed from: package-private */
    public final class a extends p<w> {
        a() {
        }

        private <T> PoolArena<T> j(PoolArena<T>[] poolArenaArr) {
            if (poolArenaArr == null || poolArenaArr.length == 0) {
                return null;
            }
            PoolArena<T> poolArena = poolArenaArr[0];
            for (int i = 1; i < poolArenaArr.length; i++) {
                PoolArena<T> poolArena2 = poolArenaArr[i];
                if (poolArena2.z.get() < poolArena.z.get()) {
                    poolArena = poolArena2;
                }
            }
            return poolArena;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // io.netty.util.concurrent.p
        public w d() {
            w wVar;
            synchronized (this) {
                wVar = new w(j(y.this.d), j(y.this.e), y.this.f, y.this.g, y.this.h, y.t, y.u);
            }
            return wVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // io.netty.util.concurrent.p
        public void e(w wVar) {
            wVar.n();
        }
    }

    static {
        Object obj;
        int i2 = c.b;
        int c = s.c("io.netty.allocator.pageSize", 8192);
        Object obj2 = null;
        try {
            B(c);
            obj = null;
        } catch (Throwable th) {
            obj = th;
            c = 8192;
        }
        o = c;
        int i3 = 11;
        int c2 = s.c("io.netty.allocator.maxOrder", 11);
        try {
            A(c, c2);
            i3 = c2;
        } catch (Throwable th2) {
            obj2 = th2;
        }
        p = i3;
        Runtime runtime = Runtime.getRuntime();
        int i4 = o;
        long availableProcessors = (long) (runtime.availableProcessors() * 2);
        long j2 = (long) (i4 << i3);
        int max = Math.max(0, s.c("io.netty.allocator.numHeapArenas", (int) Math.min(availableProcessors, ((runtime.maxMemory() / j2) / 2) / 3)));
        m = max;
        int max2 = Math.max(0, s.c("io.netty.allocator.numDirectArenas", (int) Math.min(availableProcessors, ((PlatformDependent.K() / j2) / 2) / 3)));
        n = max2;
        int c3 = s.c("io.netty.allocator.tinyCacheSize", 512);
        q = c3;
        int c4 = s.c("io.netty.allocator.smallCacheSize", 256);
        r = c4;
        int c5 = s.c("io.netty.allocator.normalCacheSize", 64);
        s = c5;
        int c6 = s.c("io.netty.allocator.maxCachedBufferCapacity", 32768);
        t = c6;
        int c7 = s.c("io.netty.allocator.cacheTrimInterval", 8192);
        u = c7;
        b bVar = l;
        if (bVar.c()) {
            bVar.r("-Dio.netty.allocator.numHeapArenas: {}", Integer.valueOf(max));
            bVar.r("-Dio.netty.allocator.numDirectArenas: {}", Integer.valueOf(max2));
            if (obj == null) {
                bVar.r("-Dio.netty.allocator.pageSize: {}", Integer.valueOf(i4));
            } else {
                bVar.b("-Dio.netty.allocator.pageSize: {}", Integer.valueOf(i4), obj);
            }
            if (obj2 == null) {
                bVar.r("-Dio.netty.allocator.maxOrder: {}", Integer.valueOf(i3));
            } else {
                bVar.b("-Dio.netty.allocator.maxOrder: {}", Integer.valueOf(i3), obj2);
            }
            bVar.r("-Dio.netty.allocator.chunkSize: {}", Integer.valueOf(i4 << i3));
            bVar.r("-Dio.netty.allocator.tinyCacheSize: {}", Integer.valueOf(c3));
            bVar.r("-Dio.netty.allocator.smallCacheSize: {}", Integer.valueOf(c4));
            bVar.r("-Dio.netty.allocator.normalCacheSize: {}", Integer.valueOf(c5));
            bVar.r("-Dio.netty.allocator.maxCachedBufferCapacity: {}", Integer.valueOf(c6));
            bVar.r("-Dio.netty.allocator.cacheTrimInterval: {}", Integer.valueOf(c7));
        }
    }

    public y() {
        this(false);
    }

    private static int A(int i2, int i3) {
        if (i3 <= 14) {
            int i4 = i2;
            for (int i5 = i3; i5 > 0; i5--) {
                if (i4 <= 536870912) {
                    i4 <<= 1;
                } else {
                    throw new IllegalArgumentException(String.format("pageSize (%d) << maxOrder (%d) must not exceed %d", Integer.valueOf(i2), Integer.valueOf(i3), 1073741824));
                }
            }
            return i4;
        }
        throw new IllegalArgumentException(je.q0("maxOrder: ", i3, " (expected: 0-14)"));
    }

    private static int B(int i2) {
        if (i2 < 4096) {
            throw new IllegalArgumentException("pageSize: " + i2 + " (expected: 4096)");
        } else if (((i2 - 1) & i2) == 0) {
            return 31 - Integer.numberOfLeadingZeros(i2);
        } else {
            throw new IllegalArgumentException(je.q0("pageSize: ", i2, " (expected: power of 2)"));
        }
    }

    @Override // io.netty.buffer.k
    public boolean g() {
        return this.e != null;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.b
    public j n(int i2, int i3) {
        j jVar;
        j jVar2;
        w wVar = (w) this.k.b();
        PoolArena<ByteBuffer> poolArena = wVar.b;
        if (poolArena != null) {
            jVar = poolArena.a(wVar, i2, i3);
        } else {
            if (PlatformDependent.z()) {
                int i4 = t0.b;
                if (PlatformDependent.h0()) {
                    jVar2 = new r0(this, i2, i3);
                } else {
                    jVar2 = new p0(this, i2, i3);
                }
            } else {
                jVar2 = new l0(this, i2, i3);
            }
            jVar = jVar2;
        }
        return b.p(jVar);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.b
    public j o(int i2, int i3) {
        j jVar;
        w wVar = (w) this.k.b();
        PoolArena<byte[]> poolArena = wVar.a;
        if (poolArena != null) {
            jVar = poolArena.a(wVar, i2, i3);
        } else {
            jVar = new n0(this, i2, i3);
        }
        return b.p(jVar);
    }

    /* access modifiers changed from: package-private */
    public final w z() {
        return (w) this.k.b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(boolean z) {
        super(z);
        int i2 = m;
        int i3 = n;
        int i4 = o;
        int i5 = p;
        int i6 = q;
        int i7 = r;
        int i8 = s;
        this.k = new a();
        this.f = i6;
        this.g = i7;
        this.h = i8;
        int A = A(i4, i5);
        if (i2 < 0) {
            throw new IllegalArgumentException(je.q0("nHeapArena: ", i2, " (expected: >= 0)"));
        } else if (i3 >= 0) {
            int B = B(i4);
            if (i2 > 0) {
                this.d = new PoolArena[i2];
                ArrayList arrayList = new ArrayList(i2);
                for (int i9 = 0; i9 < this.d.length; i9++) {
                    PoolArena.b bVar = new PoolArena.b(this, i4, i5, B, A);
                    this.d[i9] = bVar;
                    arrayList.add(bVar);
                }
                this.i = Collections.unmodifiableList(arrayList);
            } else {
                this.d = null;
                this.i = Collections.emptyList();
            }
            if (i3 > 0) {
                this.e = new PoolArena[i3];
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i10 = 0; i10 < this.e.length; i10++) {
                    PoolArena.a aVar = new PoolArena.a(this, i4, i5, B, A);
                    this.e[i10] = aVar;
                    arrayList2.add(aVar);
                }
                this.j = Collections.unmodifiableList(arrayList2);
                return;
            }
            this.e = null;
            this.j = Collections.emptyList();
        } else {
            throw new IllegalArgumentException(je.q0("nDirectArea: ", i3, " (expected: >= 0)"));
        }
    }
}
