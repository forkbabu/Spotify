package io.netty.buffer;

import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.g;
import io.netty.util.internal.r;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
public abstract class PoolArena<T> {
    static final boolean A = PlatformDependent.z();
    final y a;
    private final int b;
    final int c;
    final int d;
    final int e;
    final int f;
    final int g;
    private final v<T>[] h;
    private final v<T>[] i;
    private final u<T> j;
    private final u<T> k;
    private final u<T> l;
    private final u<T> m;
    private final u<T> n;
    private final u<T> o;
    private final List<Object> p;
    private long q;
    private final g r = PlatformDependent.R();
    private final g s = PlatformDependent.R();
    private final g t = PlatformDependent.R();
    private final g u = PlatformDependent.R();
    private long v;
    private long w;
    private long x;
    private final g y = PlatformDependent.R();
    final AtomicInteger z = new AtomicInteger();

    /* access modifiers changed from: package-private */
    public enum SizeClass {
        Tiny,
        Small,
        Normal
    }

    /* access modifiers changed from: package-private */
    public static final class a extends PoolArena<ByteBuffer> {
        a(y yVar, int i, int i2, int i3, int i4) {
            super(yVar, i, i2, i3, i4);
        }

        /* access modifiers changed from: protected */
        @Override // io.netty.buffer.PoolArena
        public void e(t<ByteBuffer> tVar) {
            if (PlatformDependent.h0()) {
                PlatformDependent.l(tVar.b);
            } else {
                PlatformDependent.k(tVar.b);
            }
        }

        /* access modifiers changed from: package-private */
        @Override // io.netty.buffer.PoolArena
        public boolean j() {
            return true;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, java.lang.Object, int, int] */
        /* access modifiers changed from: protected */
        @Override // io.netty.buffer.PoolArena
        public void l(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3) {
            ByteBuffer byteBuffer3 = byteBuffer;
            ByteBuffer byteBuffer4 = byteBuffer2;
            if (i3 != 0) {
                if (PoolArena.A) {
                    PlatformDependent.d(PlatformDependent.h(byteBuffer3) + ((long) i), PlatformDependent.h(byteBuffer4) + ((long) i2), (long) i3);
                    return;
                }
                ByteBuffer duplicate = byteBuffer3.duplicate();
                ByteBuffer duplicate2 = byteBuffer4.duplicate();
                duplicate.position(i).limit(i + i3);
                duplicate2.position(i2);
                duplicate2.put(duplicate);
            }
        }

        /* access modifiers changed from: protected */
        @Override // io.netty.buffer.PoolArena
        public x<ByteBuffer> m(int i) {
            if (PoolArena.A) {
                return c0.I2(i);
            }
            return z.J2(i);
        }

        /* access modifiers changed from: protected */
        @Override // io.netty.buffer.PoolArena
        public t<ByteBuffer> n(int i, int i2, int i3, int i4) {
            return new t<>(this, PlatformDependent.h0() ? PlatformDependent.b(i4) : ByteBuffer.allocateDirect(i4), i, i2, i3, i4);
        }

        /* access modifiers changed from: protected */
        @Override // io.netty.buffer.PoolArena
        public t<ByteBuffer> o(int i) {
            return new t<>(this, PlatformDependent.h0() ? PlatformDependent.b(i) : ByteBuffer.allocateDirect(i), i);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends PoolArena<byte[]> {
        b(y yVar, int i, int i2, int i3, int i4) {
            super(yVar, i, i2, i3, i4);
        }

        /* access modifiers changed from: protected */
        @Override // io.netty.buffer.PoolArena
        public void e(t<byte[]> tVar) {
        }

        /* access modifiers changed from: package-private */
        @Override // io.netty.buffer.PoolArena
        public boolean j() {
            return false;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, java.lang.Object, int, int] */
        /* access modifiers changed from: protected */
        @Override // io.netty.buffer.PoolArena
        public void l(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            if (i3 != 0) {
                System.arraycopy(bArr3, i, bArr4, i2, i3);
            }
        }

        /* access modifiers changed from: protected */
        @Override // io.netty.buffer.PoolArena
        public x<byte[]> m(int i) {
            return PoolArena.A ? d0.J2(i) : a0.I2(i);
        }

        /* access modifiers changed from: protected */
        @Override // io.netty.buffer.PoolArena
        public t<byte[]> n(int i, int i2, int i3, int i4) {
            return new t<>(this, new byte[i4], i, i2, i3, i4);
        }

        /* access modifiers changed from: protected */
        @Override // io.netty.buffer.PoolArena
        public t<byte[]> o(int i) {
            return new t<>(this, new byte[i], i);
        }
    }

    protected PoolArena(y yVar, int i2, int i3, int i4, int i5) {
        this.a = yVar;
        this.c = i2;
        this.b = i3;
        this.d = i4;
        this.e = i5;
        this.f = (i2 - 1) ^ -1;
        this.h = new v[32];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            v<T>[] vVarArr = this.h;
            if (i7 >= vVarArr.length) {
                break;
            }
            v<T> vVar = new v<>(i2);
            vVar.f = vVar;
            vVar.g = vVar;
            vVarArr[i7] = vVar;
            i7++;
        }
        int i8 = i4 - 9;
        this.g = i8;
        this.i = new v[i8];
        while (true) {
            v<T>[] vVarArr2 = this.i;
            if (i6 < vVarArr2.length) {
                v<T> vVar2 = new v<>(i2);
                vVar2.f = vVar2;
                vVar2.g = vVar2;
                vVarArr2[i6] = vVar2;
                i6++;
            } else {
                u<T> uVar = new u<>(null, 100, Integer.MAX_VALUE, i5);
                this.o = uVar;
                u<T> uVar2 = new u<>(uVar, 75, 100, i5);
                this.n = uVar2;
                u<T> uVar3 = new u<>(uVar2, 50, 100, i5);
                this.j = uVar3;
                u<T> uVar4 = new u<>(uVar3, 25, 75, i5);
                this.k = uVar4;
                u<T> uVar5 = new u<>(uVar4, 1, 50, i5);
                this.l = uVar5;
                u<T> uVar6 = new u<>(uVar5, Integer.MIN_VALUE, 25, i5);
                this.m = uVar6;
                uVar.j(uVar2);
                uVar2.j(uVar3);
                uVar3.j(uVar4);
                uVar4.j(uVar5);
                uVar5.j(null);
                uVar6.j(uVar6);
                ArrayList arrayList = new ArrayList(6);
                arrayList.add(uVar6);
                arrayList.add(uVar5);
                arrayList.add(uVar4);
                arrayList.add(uVar3);
                arrayList.add(uVar2);
                arrayList.add(uVar);
                this.p = Collections.unmodifiableList(arrayList);
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(io.netty.buffer.w r6, io.netty.buffer.x<T> r7, int r8) {
        /*
            r5 = this;
            if (r8 < 0) goto L_0x00ab
            int r0 = r5.e
            r1 = 1
            if (r8 < r0) goto L_0x0008
            goto L_0x0029
        L_0x0008:
            boolean r0 = k(r8)
            if (r0 != 0) goto L_0x0025
            int r0 = r8 + -1
            int r2 = r0 >>> 1
            r0 = r0 | r2
            int r2 = r0 >>> 2
            r0 = r0 | r2
            int r2 = r0 >>> 4
            r0 = r0 | r2
            int r2 = r0 >>> 8
            r0 = r0 | r2
            int r2 = r0 >>> 16
            r0 = r0 | r2
            int r0 = r0 + r1
            if (r0 >= 0) goto L_0x002f
            int r0 = r0 >>> 1
            goto L_0x002f
        L_0x0025:
            r0 = r8 & 15
            if (r0 != 0) goto L_0x002b
        L_0x0029:
            r0 = r8
            goto L_0x002f
        L_0x002b:
            r0 = r8 & -16
            int r0 = r0 + 16
        L_0x002f:
            int r2 = r5.f
            r2 = r2 & r0
            r3 = 0
            if (r2 != 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            if (r1 == 0) goto L_0x0085
            boolean r1 = k(r0)
            if (r1 == 0) goto L_0x004b
            boolean r6 = r6.f(r5, r7, r8, r0)
            if (r6 == 0) goto L_0x0046
            return
        L_0x0046:
            int r6 = r0 >>> 4
            io.netty.buffer.v<T>[] r2 = r5.h
            goto L_0x005e
        L_0x004b:
            boolean r6 = r6.e(r5, r7, r8, r0)
            if (r6 == 0) goto L_0x0052
            return
        L_0x0052:
            int r6 = r0 >>> 10
        L_0x0054:
            if (r6 == 0) goto L_0x005b
            int r6 = r6 >>> 1
            int r3 = r3 + 1
            goto L_0x0054
        L_0x005b:
            io.netty.buffer.v<T>[] r2 = r5.i
            r6 = r3
        L_0x005e:
            r2 = r2[r6]
            monitor-enter(r2)
            io.netty.buffer.v<T> r6 = r2.g     // Catch:{ all -> 0x0082 }
            if (r6 == r2) goto L_0x007d
            long r3 = r6.a()     // Catch:{ all -> 0x0082 }
            io.netty.buffer.t<T> r6 = r6.a     // Catch:{ all -> 0x0082 }
            r6.g(r7, r3, r8)     // Catch:{ all -> 0x0082 }
            if (r1 == 0) goto L_0x0076
            io.netty.util.internal.g r6 = r5.r     // Catch:{ all -> 0x0082 }
            r6.a()     // Catch:{ all -> 0x0082 }
            goto L_0x007b
        L_0x0076:
            io.netty.util.internal.g r6 = r5.s     // Catch:{ all -> 0x0082 }
            r6.a()     // Catch:{ all -> 0x0082 }
        L_0x007b:
            monitor-exit(r2)     // Catch:{ all -> 0x0082 }
            return
        L_0x007d:
            monitor-exit(r2)     // Catch:{ all -> 0x0082 }
            r5.c(r7, r8, r0)
            return
        L_0x0082:
            r6 = move-exception
            monitor-exit(r2)
            throw r6
        L_0x0085:
            int r1 = r5.e
            if (r0 > r1) goto L_0x0094
            boolean r6 = r6.d(r5, r7, r8, r0)
            if (r6 == 0) goto L_0x0090
            return
        L_0x0090:
            r5.c(r7, r8, r0)
            goto L_0x00aa
        L_0x0094:
            io.netty.buffer.t r6 = r5.o(r8)
            io.netty.util.internal.g r0 = r5.u
            int r1 = r6.d()
            long r1 = (long) r1
            r0.b(r1)
            r7.D2(r6, r8)
            io.netty.util.internal.g r6 = r5.t
            r6.a()
        L_0x00aa:
            return
        L_0x00ab:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "capacity: "
            java.lang.String r0 = " (expected: 0+)"
            java.lang.String r7 = defpackage.je.q0(r7, r8, r0)
            r6.<init>(r7)
            goto L_0x00ba
        L_0x00b9:
            throw r6
        L_0x00ba:
            goto L_0x00b9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.buffer.PoolArena.b(io.netty.buffer.w, io.netty.buffer.x, int):void");
    }

    private synchronized void c(x<T> xVar, int i2, int i3) {
        if (!this.j.e(xVar, i2, i3) && !this.k.e(xVar, i2, i3) && !this.l.e(xVar, i2, i3) && !this.m.e(xVar, i2, i3)) {
            if (!this.n.e(xVar, i2, i3)) {
                t<T> n2 = n(this.c, this.b, this.d, this.e);
                long a2 = n2.a(i3);
                this.q++;
                n2.f(xVar, a2, i2);
                this.m.c(n2);
                return;
            }
        }
        this.q++;
    }

    private static void d(StringBuilder sb, v<?>[] vVarArr) {
        for (int i2 = 0; i2 < vVarArr.length; i2++) {
            v<?> vVar = vVarArr[i2];
            if (vVar.g != vVar) {
                sb.append(r.a);
                sb.append(i2);
                sb.append(": ");
                v<T> vVar2 = vVar.g;
                do {
                    sb.append(vVar2);
                    vVar2 = vVar2.g;
                } while (vVar2 != vVar);
            }
        }
    }

    private static void f(v<?>[] vVarArr) {
        for (v<?> vVar : vVarArr) {
            t<T> tVar = vVar.a;
            if (tVar != null) {
                tVar.a.e(tVar);
            }
        }
    }

    static boolean k(int i2) {
        return (i2 & -512) == 0;
    }

    /* access modifiers changed from: package-private */
    public x<T> a(w wVar, int i2, int i3) {
        x<T> m2 = m(i3);
        b(wVar, m2, i2);
        return m2;
    }

    /* access modifiers changed from: protected */
    public abstract void e(t<T> tVar);

    /* access modifiers changed from: protected */
    public final void finalize() {
        int i2 = 0;
        try {
            super.finalize();
            f(this.i);
            f(this.h);
            u[] uVarArr = {this.m, this.l, this.k, this.j, this.n, this.o};
            while (i2 < 6) {
                uVarArr[i2].f(this);
                i2++;
            }
        } catch (Throwable th) {
            f(this.i);
            f(this.h);
            u[] uVarArr2 = {this.m, this.l, this.k, this.j, this.n, this.o};
            while (i2 < 6) {
                uVarArr2[i2].f(this);
                i2++;
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public v<T> g(int i2) {
        int i3;
        v<T>[] vVarArr;
        if (k(i2)) {
            i3 = i2 >>> 4;
            vVarArr = this.h;
        } else {
            int i4 = 0;
            int i5 = i2 >>> 10;
            while (i5 != 0) {
                i5 >>>= 1;
                i4++;
            }
            vVarArr = this.i;
            i3 = i4;
        }
        return vVarArr[i3];
    }

    /* access modifiers changed from: package-private */
    public void h(t<T> tVar, long j2, int i2, w wVar) {
        SizeClass sizeClass;
        if (tVar.c) {
            int d2 = tVar.d();
            e(tVar);
            this.u.b((long) (-d2));
            this.y.a();
            return;
        }
        if (!((this.f & i2) == 0)) {
            sizeClass = SizeClass.Normal;
        } else {
            sizeClass = k(i2) ? SizeClass.Tiny : SizeClass.Small;
        }
        if (wVar == null || !wVar.b(this, tVar, j2, i2, sizeClass)) {
            i(tVar, j2, sizeClass);
        }
    }

    /* access modifiers changed from: package-private */
    public void i(t<T> tVar, long j2, SizeClass sizeClass) {
        boolean z2;
        synchronized (this) {
            int ordinal = sizeClass.ordinal();
            z2 = true;
            if (ordinal == 0) {
                this.v++;
            } else if (ordinal == 1) {
                this.w++;
            } else if (ordinal == 2) {
                this.x++;
            } else {
                throw new Error();
            }
            if (tVar.p.h(tVar, j2)) {
                z2 = false;
            }
        }
        if (z2) {
            e(tVar);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract boolean j();

    /* access modifiers changed from: protected */
    public abstract void l(T t2, int i2, T t3, int i3, int i4);

    /* access modifiers changed from: protected */
    public abstract x<T> m(int i2);

    /* access modifiers changed from: protected */
    public abstract t<T> n(int i2, int i3, int i4, int i5);

    /* access modifiers changed from: protected */
    public abstract t<T> o(int i2);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p(io.netty.buffer.x<T> r13, int r14, boolean r15) {
        /*
            r12 = this;
            if (r14 < 0) goto L_0x005e
            int r0 = r13.M0()
            if (r14 > r0) goto L_0x005e
            int r6 = r13.y
            if (r6 != r14) goto L_0x000d
            return
        L_0x000d:
            io.netty.buffer.t<T> r7 = r13.u
            long r8 = r13.v
            T r2 = r13.w
            int r3 = r13.x
            int r10 = r13.z
            int r11 = r13.a
            int r0 = r13.b
            io.netty.buffer.y r1 = r12.a
            io.netty.buffer.w r1 = r1.z()
            r12.b(r1, r13, r14)
            if (r14 <= r6) goto L_0x002f
            T r4 = r13.w
            int r5 = r13.x
            r1 = r12
            r1.l(r2, r3, r4, r5, r6)
            goto L_0x004c
        L_0x002f:
            if (r14 >= r6) goto L_0x004c
            if (r11 >= r14) goto L_0x004a
            if (r0 <= r14) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r14 = r0
        L_0x0037:
            int r3 = r3 + r11
            T r4 = r13.w
            int r0 = r13.x
            int r5 = r0 + r11
            int r6 = r14 - r11
            r0 = r12
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r0.l(r1, r2, r3, r4, r5)
            goto L_0x004d
        L_0x004a:
            r0 = r14
            goto L_0x004f
        L_0x004c:
            r14 = r0
        L_0x004d:
            r0 = r14
            r14 = r11
        L_0x004f:
            r13.C1(r14, r0)
            if (r15 == 0) goto L_0x005d
            io.netty.buffer.w r5 = r13.A
            r0 = r12
            r1 = r7
            r2 = r8
            r4 = r10
            r0.h(r1, r2, r4, r5)
        L_0x005d:
            return
        L_0x005e:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r15 = "newCapacity: "
            java.lang.String r14 = defpackage.je.p0(r15, r14)
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.buffer.PoolArena.p(io.netty.buffer.x, int, boolean):void");
    }

    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("Chunk(s) at 0~25%:");
        String str = r.a;
        sb.append(str);
        sb.append(this.m);
        sb.append(str);
        sb.append("Chunk(s) at 0~50%:");
        sb.append(str);
        sb.append(this.l);
        sb.append(str);
        sb.append("Chunk(s) at 25~75%:");
        sb.append(str);
        sb.append(this.k);
        sb.append(str);
        sb.append("Chunk(s) at 50~100%:");
        sb.append(str);
        sb.append(this.j);
        sb.append(str);
        sb.append("Chunk(s) at 75~100%:");
        sb.append(str);
        sb.append(this.n);
        sb.append(str);
        sb.append("Chunk(s) at 100%:");
        sb.append(str);
        sb.append(this.o);
        sb.append(str);
        sb.append("tiny subpages:");
        d(sb, this.h);
        sb.append(str);
        sb.append("small subpages:");
        d(sb, this.i);
        sb.append(str);
        return sb.toString();
    }
}
