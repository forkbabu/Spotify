package io.netty.buffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class p extends e implements Iterable<j> {
    private static final ByteBuffer y = j0.b.O0();
    private static final Iterator<j> z = Collections.emptyList().iterator();
    private final k t;
    private final boolean u;
    private final List<b> v;
    private final int w;
    private boolean x;

    /* access modifiers changed from: private */
    public static final class b {
        final j a;
        final int b;
        int c;
        int d;

        b(j jVar) {
            this.a = jVar;
            this.b = jVar.m1();
        }
    }

    private final class c implements Iterator<j> {
        private final int a;
        private int b;

        c(a aVar) {
            this.a = p.this.v.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a > this.b;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public j next() {
            if (this.a != p.this.v.size()) {
                throw new ConcurrentModificationException();
            } else if (hasNext()) {
                try {
                    List list = p.this.v;
                    int i = this.b;
                    this.b = i + 1;
                    return ((b) list.get(i)).a;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ConcurrentModificationException();
                }
            } else {
                throw new NoSuchElementException();
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-Only");
        }
    }

    public p(k kVar, boolean z2, int i) {
        super(Integer.MAX_VALUE);
        this.t = kVar;
        this.u = z2;
        this.w = i;
        this.v = new ArrayList(Math.min(16, i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int E2(boolean r6, int r7, io.netty.buffer.j r8) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r5.H2(r7)     // Catch:{ all -> 0x005e }
            int r2 = r8.m1()     // Catch:{ all -> 0x005e }
            io.netty.buffer.p$b r3 = new io.netty.buffer.p$b     // Catch:{ all -> 0x005e }
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ all -> 0x005e }
            io.netty.buffer.j r4 = r8.Z0(r4)     // Catch:{ all -> 0x005e }
            io.netty.buffer.j r4 = r4.J1()     // Catch:{ all -> 0x005e }
            r3.<init>(r4)     // Catch:{ all -> 0x005e }
            java.util.List<io.netty.buffer.p$b> r4 = r5.v     // Catch:{ all -> 0x005e }
            int r4 = r4.size()     // Catch:{ all -> 0x005e }
            if (r7 != r4) goto L_0x003d
            java.util.List<io.netty.buffer.p$b> r0 = r5.v     // Catch:{ all -> 0x005e }
            boolean r0 = r0.add(r3)     // Catch:{ all -> 0x005e }
            if (r7 != 0) goto L_0x002b
            r3.d = r2     // Catch:{ all -> 0x0048 }
            goto L_0x004a
        L_0x002b:
            java.util.List<io.netty.buffer.p$b> r1 = r5.v     // Catch:{ all -> 0x0048 }
            int r4 = r7 + -1
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0048 }
            io.netty.buffer.p$b r1 = (io.netty.buffer.p.b) r1     // Catch:{ all -> 0x0048 }
            int r1 = r1.d     // Catch:{ all -> 0x0048 }
            r3.c = r1     // Catch:{ all -> 0x0048 }
            int r1 = r1 + r2
            r3.d = r1     // Catch:{ all -> 0x0048 }
            goto L_0x004a
        L_0x003d:
            java.util.List<io.netty.buffer.p$b> r4 = r5.v
            r4.add(r7, r3)
            if (r2 == 0) goto L_0x004a
            r5.h3(r7)
            goto L_0x004a
        L_0x0048:
            r6 = move-exception
            goto L_0x0060
        L_0x004a:
            if (r6 == 0) goto L_0x0058
            int r6 = r5.Z1()
            int r1 = r8.m1()
            int r6 = r6 + r1
            r5.a2(r6)
        L_0x0058:
            if (r0 != 0) goto L_0x005d
            r8.d()
        L_0x005d:
            return r7
        L_0x005e:
            r6 = move-exception
            r0 = 0
        L_0x0060:
            if (r0 != 0) goto L_0x0065
            r8.d()
        L_0x0065:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.buffer.p.E2(boolean, int, io.netty.buffer.j):int");
    }

    private j F2(int i) {
        return this.u ? t().h(i) : t().d(i);
    }

    private void H2(int i) {
        t2();
        if (i < 0 || i > this.v.size()) {
            throw new IndexOutOfBoundsException(String.format("cIndex: %d (expected: >= 0 && <= numComponents(%d))", Integer.valueOf(i), Integer.valueOf(this.v.size())));
        }
    }

    private void I2() {
        int size = this.v.size();
        if (size > this.w) {
            j F2 = F2(this.v.get(size - 1).d);
            for (int i = 0; i < size; i++) {
                b bVar = this.v.get(i);
                F2.R1(bVar.a);
                bVar.a.d();
            }
            b bVar2 = new b(F2);
            bVar2.d = bVar2.b;
            this.v.clear();
            this.v.add(bVar2);
        }
    }

    private b M2(int i) {
        t2();
        o2(i, 1);
        int i2 = 0;
        int size = this.v.size();
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            b bVar = this.v.get(i3);
            if (i >= bVar.d) {
                i2 = i3 + 1;
            } else if (i >= bVar.c) {
                return bVar;
            } else {
                size = i3 - 1;
            }
        }
        throw new Error("should not reach here");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h3(int r5) {
        /*
            r4 = this;
            java.util.List<io.netty.buffer.p$b> r0 = r4.v
            int r0 = r0.size()
            if (r0 > r5) goto L_0x0009
            return
        L_0x0009:
            java.util.List<io.netty.buffer.p$b> r1 = r4.v
            java.lang.Object r1 = r1.get(r5)
            io.netty.buffer.p$b r1 = (io.netty.buffer.p.b) r1
            if (r5 != 0) goto L_0x001b
            r2 = 0
            r1.c = r2
            int r2 = r1.b
            r1.d = r2
            goto L_0x0038
        L_0x001b:
            if (r5 >= r0) goto L_0x003b
            java.util.List<io.netty.buffer.p$b> r1 = r4.v
            int r2 = r5 + -1
            java.lang.Object r1 = r1.get(r2)
            io.netty.buffer.p$b r1 = (io.netty.buffer.p.b) r1
            java.util.List<io.netty.buffer.p$b> r2 = r4.v
            java.lang.Object r2 = r2.get(r5)
            io.netty.buffer.p$b r2 = (io.netty.buffer.p.b) r2
            int r1 = r1.d
            r2.c = r1
            int r3 = r2.b
            int r1 = r1 + r3
            r2.d = r1
        L_0x0038:
            int r5 = r5 + 1
            goto L_0x001b
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.buffer.p.h3(int):void");
    }

    @Override // io.netty.buffer.j
    public byte[] A() {
        int size = this.v.size();
        if (size == 0) {
            return io.netty.util.internal.c.a;
        }
        if (size == 1) {
            return this.v.get(0).a.A();
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.e
    public void A2() {
        if (!this.x) {
            this.x = true;
            int size = this.v.size();
            for (int i = 0; i < size; i++) {
                this.v.get(i).a.d();
            }
        }
    }

    public p D2(boolean z2, j jVar) {
        if (jVar != null) {
            E2(z2, this.v.size(), jVar);
            I2();
            return this;
        }
        throw new NullPointerException("buffer");
    }

    @Override // io.netty.buffer.j
    public boolean E0() {
        int size = this.v.size();
        if (size == 0) {
            return true;
        }
        if (size != 1) {
            return false;
        }
        return this.v.get(0).a.E0();
    }

    @Override // io.netty.buffer.j
    public boolean F0() {
        int size = this.v.size();
        if (size == 0) {
            return j0.b.F0();
        }
        if (size != 1) {
            return false;
        }
        return this.v.get(0).a.F0();
    }

    @Override // io.netty.buffer.j
    public ByteBuffer G0(int i, int i2) {
        int size = this.v.size();
        if (size == 0) {
            return y;
        }
        if (size == 1) {
            return this.v.get(0).a.G0(i, i2);
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: G2 */
    public p L(int i) {
        t2();
        if (i < 0 || i > M0()) {
            throw new IllegalArgumentException(je.p0("newCapacity: ", i));
        }
        int J = J();
        if (i > J) {
            int i2 = i - J;
            if (this.v.size() < this.w) {
                j F2 = F2(i2);
                F2.C1(0, i2);
                E2(false, this.v.size(), F2);
            } else {
                j F22 = F2(i2);
                F22.C1(0, i2);
                E2(false, this.v.size(), F22);
                I2();
            }
        } else if (i < J) {
            int i3 = J - i;
            List<b> list = this.v;
            ListIterator<b> listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    b previous = listIterator.previous();
                    int i4 = previous.b;
                    if (i3 < i4) {
                        b bVar = new b(previous.a.K1(0, i4 - i3));
                        int i5 = previous.c;
                        bVar.c = i5;
                        bVar.d = i5 + bVar.b;
                        listIterator.set(bVar);
                        break;
                    }
                    i3 -= i4;
                    listIterator.remove();
                } else {
                    break;
                }
            }
            if (n1() > i) {
                C1(i, i);
            } else if (Z1() > i) {
                a2(i);
            }
        }
        return this;
    }

    @Override // io.netty.buffer.j
    public int I() {
        int size = this.v.size();
        if (size == 0) {
            return 0;
        }
        if (size == 1) {
            return this.v.get(0).a.I();
        }
        throw new UnsupportedOperationException();
    }

    @Override // io.netty.buffer.j
    public boolean I0() {
        int size = this.v.size();
        if (size == 0) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!this.v.get(i).a.I0()) {
                return false;
            }
        }
        return true;
    }

    @Override // io.netty.buffer.j
    public int J() {
        int size = this.v.size();
        if (size == 0) {
            return 0;
        }
        return this.v.get(size - 1).d;
    }

    public p J2() {
        t2();
        int n1 = n1();
        if (n1 == 0) {
            return this;
        }
        int Z1 = Z1();
        if (n1 == Z1 && Z1 == J()) {
            for (b bVar : this.v) {
                bVar.a.d();
            }
            this.v.clear();
            C1(0, 0);
            m2(n1);
            return this;
        }
        int f3 = f3(n1);
        for (int i = 0; i < f3; i++) {
            this.v.get(i).a.d();
        }
        this.v.subList(0, f3).clear();
        int i2 = this.v.get(0).c;
        h3(0);
        C1(n1 - i2, Z1 - i2);
        m2(i2);
        return this;
    }

    /* renamed from: K2 */
    public p N() {
        return J2();
    }

    /* renamed from: L2 */
    public p P(int i) {
        super.P(i);
        return this;
    }

    @Override // io.netty.buffer.j
    public long N0() {
        int size = this.v.size();
        if (size == 0) {
            return j0.b.N0();
        }
        if (size == 1) {
            return this.v.get(0).a.N0();
        }
        throw new UnsupportedOperationException();
    }

    @Override // io.netty.buffer.j
    public j N1() {
        return null;
    }

    /* renamed from: N2 */
    public p d0(int i, j jVar, int i2, int i3) {
        n2(i, i3, i2, jVar.J());
        if (i3 == 0) {
            return this;
        }
        int f3 = f3(i);
        while (i3 > 0) {
            b bVar = this.v.get(f3);
            j jVar2 = bVar.a;
            int i4 = i - bVar.c;
            int min = Math.min(i3, jVar2.J() - i4);
            jVar2.d0(i4, jVar, i2, min);
            i += min;
            i2 += min;
            i3 -= min;
            f3++;
        }
        return this;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: O2 */
    public p h0(int i, ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int remaining = byteBuffer.remaining();
        t2();
        o2(i, remaining);
        if (remaining == 0) {
            return this;
        }
        int f3 = f3(i);
        while (remaining > 0) {
            try {
                b bVar = this.v.get(f3);
                j jVar = bVar.a;
                int i2 = i - bVar.c;
                int min = Math.min(remaining, jVar.J() - i2);
                byteBuffer.limit(byteBuffer.position() + min);
                jVar.h0(i2, byteBuffer);
                i += min;
                remaining -= min;
                f3++;
            } catch (Throwable th) {
                byteBuffer.limit(limit);
                throw th;
            }
        }
        byteBuffer.limit(limit);
        return this;
    }

    @Override // io.netty.buffer.j
    public ByteBuffer P0(int i, int i2) {
        t2();
        o2(i, i2);
        int size = this.v.size();
        if (size == 0) {
            return y;
        }
        if (size == 1 && this.v.get(0).a.Q0() == 1) {
            return this.v.get(0).a.P0(i, i2);
        }
        ByteBuffer order = ByteBuffer.allocate(i2).order(a1());
        for (ByteBuffer byteBuffer : W0(i, i2)) {
            order.put(byteBuffer);
        }
        order.flip();
        return order;
    }

    /* renamed from: P2 */
    public p k0(int i, byte[] bArr, int i2, int i3) {
        n2(i, i3, i2, bArr.length);
        if (i3 == 0) {
            return this;
        }
        int f3 = f3(i);
        while (i3 > 0) {
            b bVar = this.v.get(f3);
            j jVar = bVar.a;
            int i4 = i - bVar.c;
            int min = Math.min(i3, jVar.J() - i4);
            jVar.k0(i4, bArr, i2, min);
            i += min;
            i2 += min;
            i3 -= min;
            f3++;
        }
        return this;
    }

    @Override // io.netty.buffer.j
    public int Q0() {
        int size = this.v.size();
        if (size == 0) {
            return 1;
        }
        if (size == 1) {
            return this.v.get(0).a.Q0();
        }
        int size2 = this.v.size();
        int i = 0;
        for (int i2 = 0; i2 < size2; i2++) {
            i += this.v.get(i2).a.Q0();
        }
        return i;
    }

    /* renamed from: Q2 */
    public p L0() {
        super.L0();
        return this;
    }

    /* renamed from: R2 */
    public p f1(byte[] bArr, int i, int i2) {
        p2(i2);
        k0(this.a, bArr, i, i2);
        this.a += i2;
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public byte S(int i) {
        return c2(i);
    }

    /* renamed from: S2 */
    public p p1(int i) {
        super.p1(i);
        return this;
    }

    @Override // io.netty.buffer.j
    public int T(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        if (Q0() == 1) {
            return gatheringByteChannel.write(G0(i, i2));
        }
        long write = gatheringByteChannel.write(W0(i, i2));
        if (write > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) write;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public ByteBuffer[] T0() {
        return W0(n1(), m1());
    }

    /* renamed from: T2 */
    public p r1() {
        super.r1();
        return this;
    }

    /* renamed from: U2 */
    public p t1() {
        super.t1();
        return this;
    }

    /* renamed from: V2 */
    public p w1(int i, int i2) {
        b M2 = M2(i);
        M2.a.w1(i - M2.c, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public ByteBuffer[] W0(int i, int i2) {
        t2();
        o2(i, i2);
        if (i2 == 0) {
            return new ByteBuffer[]{y};
        }
        ArrayList arrayList = new ArrayList(this.v.size());
        int f3 = f3(i);
        while (i2 > 0) {
            b bVar = this.v.get(f3);
            j jVar = bVar.a;
            int i3 = i - bVar.c;
            int min = Math.min(i2, jVar.J() - i3);
            int Q0 = jVar.Q0();
            if (Q0 != 0) {
                if (Q0 != 1) {
                    Collections.addAll(arrayList, jVar.W0(i3, min));
                } else {
                    arrayList.add(jVar.P0(i3, min));
                }
                i += min;
                i2 -= min;
                f3++;
            } else {
                throw new UnsupportedOperationException();
            }
        }
        return (ByteBuffer[]) arrayList.toArray(new ByteBuffer[arrayList.size()]);
    }

    /* renamed from: W2 */
    public p y1(int i, j jVar, int i2, int i3) {
        r2(i, i3, i2, jVar.J());
        if (i3 == 0) {
            return this;
        }
        int f3 = f3(i);
        while (i3 > 0) {
            b bVar = this.v.get(f3);
            j jVar2 = bVar.a;
            int i4 = i - bVar.c;
            int min = Math.min(i3, jVar2.J() - i4);
            jVar2.y1(i4, jVar, i2, min);
            i += min;
            i2 += min;
            i3 -= min;
            f3++;
        }
        return this;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: X2 */
    public p z1(int i, ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int remaining = byteBuffer.remaining();
        t2();
        o2(i, remaining);
        if (remaining == 0) {
            return this;
        }
        int f3 = f3(i);
        while (remaining > 0) {
            try {
                b bVar = this.v.get(f3);
                j jVar = bVar.a;
                int i2 = i - bVar.c;
                int min = Math.min(remaining, jVar.J() - i2);
                byteBuffer.limit(byteBuffer.position() + min);
                jVar.z1(i2, byteBuffer);
                i += min;
                remaining -= min;
                f3++;
            } catch (Throwable th) {
                byteBuffer.limit(limit);
                throw th;
            }
        }
        byteBuffer.limit(limit);
        return this;
    }

    /* renamed from: Y2 */
    public p B1(int i, byte[] bArr, int i2, int i3) {
        r2(i, i3, i2, bArr.length);
        if (i3 == 0) {
            return this;
        }
        int f3 = f3(i);
        while (i3 > 0) {
            b bVar = this.v.get(f3);
            j jVar = bVar.a;
            int i4 = i - bVar.c;
            int min = Math.min(i3, jVar.J() - i4);
            jVar.B1(i4, bArr, i2, min);
            i += min;
            i2 += min;
            i3 -= min;
            f3++;
        }
        return this;
    }

    /* renamed from: Z2 */
    public p C1(int i, int i2) {
        super.C1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public ByteOrder a1() {
        return ByteOrder.BIG_ENDIAN;
    }

    /* renamed from: a3 */
    public p D1(int i, int i2) {
        return (p) super.D1(i, i2);
    }

    /* renamed from: b3 */
    public p E1(int i, long j) {
        return (p) super.E1(i, j);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public byte c2(int i) {
        b M2 = M2(i);
        return M2.a.S(i - M2.c);
    }

    /* renamed from: c3 */
    public p F1(int i, int i2) {
        return (p) super.F1(i, i2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.netty.buffer.a, io.netty.buffer.j, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(j jVar) {
        return compareTo(jVar);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public int d2(int i) {
        b M2 = M2(i);
        if (i + 4 <= M2.d) {
            return M2.a.T1(i - M2.c);
        }
        if (a1() == ByteOrder.BIG_ENDIAN) {
            return (g2(i + 2) & 65535) | ((g2(i) & 65535) << 16);
        }
        return ((g2(i + 2) & 65535) << 16) | (g2(i) & 65535);
    }

    /* renamed from: d3 */
    public p G1(int i, int i2) {
        super.G1(i, i2);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public int e2(int i) {
        b M2 = M2(i);
        if (i + 4 <= M2.d) {
            return M2.a.m0(i - M2.c);
        }
        if (a1() == ByteOrder.BIG_ENDIAN) {
            return ((h2(i + 2) & 65535) << 16) | (h2(i) & 65535);
        }
        return (h2(i + 2) & 65535) | ((h2(i) & 65535) << 16);
    }

    /* renamed from: e3 */
    public p I1(int i) {
        p2(i);
        this.a += i;
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public long f2(int i) {
        b M2 = M2(i);
        if (i + 8 <= M2.d) {
            return M2.a.o0(i - M2.c);
        }
        if (a1() == ByteOrder.BIG_ENDIAN) {
            return ((((long) d2(i)) & 4294967295L) << 32) | (4294967295L & ((long) d2(i + 4)));
        }
        return (((long) d2(i)) & 4294967295L) | ((4294967295L & ((long) d2(i + 4))) << 32);
    }

    public int f3(int i) {
        t2();
        o2(i, 1);
        int i2 = 0;
        int size = this.v.size();
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            b bVar = this.v.get(i3);
            if (i >= bVar.d) {
                i2 = i3 + 1;
            } else if (i >= bVar.c) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        throw new Error("should not reach here");
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public short g2(int i) {
        b M2 = M2(i);
        if (i + 2 <= M2.d) {
            return M2.a.q0(i - M2.c);
        }
        if (a1() == ByteOrder.BIG_ENDIAN) {
            return (short) ((c2(i + 1) & 255) | ((c2(i) & 255) << 8));
        }
        return (short) (((c2(i + 1) & 255) << 8) | (c2(i) & 255));
    }

    /* renamed from: g3 */
    public p z(Object obj) {
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public short h2(int i) {
        b M2 = M2(i);
        if (i + 2 <= M2.d) {
            return M2.a.s0(i - M2.c);
        }
        if (a1() == ByteOrder.BIG_ENDIAN) {
            return (short) (((c2(i + 1) & 255) << 8) | (c2(i) & 255));
        }
        return (short) ((c2(i + 1) & 255) | ((c2(i) & 255) << 8));
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void i2(int i, int i2) {
        w1(i, i2);
    }

    /* renamed from: i3 */
    public p P1(int i) {
        super.P1(i);
        return this;
    }

    @Override // java.lang.Iterable
    public Iterator<j> iterator() {
        t2();
        if (this.v.isEmpty()) {
            return z;
        }
        return new c(null);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void j2(int i, int i2) {
        b M2 = M2(i);
        if (i + 4 <= M2.d) {
            M2.a.D1(i - M2.c, i2);
        } else if (a1() == ByteOrder.BIG_ENDIAN) {
            l2(i, (short) (i2 >>> 16));
            l2(i + 2, (short) i2);
        } else {
            l2(i, (short) i2);
            l2(i + 2, (short) (i2 >>> 16));
        }
    }

    /* renamed from: j3 */
    public p R1(j jVar) {
        return (p) super.R1(jVar);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void k2(int i, long j) {
        b M2 = M2(i);
        if (i + 8 <= M2.d) {
            M2.a.E1(i - M2.c, j);
        } else if (a1() == ByteOrder.BIG_ENDIAN) {
            j2(i, (int) (j >>> 32));
            j2(i + 4, (int) j);
        } else {
            j2(i, (int) j);
            j2(i + 4, (int) (j >>> 32));
        }
    }

    /* renamed from: k3 */
    public p z2(j jVar, int i) {
        super.z2(jVar, i);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void l2(int i, int i2) {
        b M2 = M2(i);
        if (i + 2 <= M2.d) {
            M2.a.F1(i - M2.c, i2);
        } else if (a1() == ByteOrder.BIG_ENDIAN) {
            i2(i, (byte) (i2 >>> 8));
            i2(i + 1, (byte) i2);
        } else {
            i2(i, (byte) i2);
            i2(i + 1, (byte) (i2 >>> 8));
        }
    }

    /* renamed from: l3 */
    public p S1(j jVar, int i, int i2) {
        super.S1(jVar, i, i2);
        return this;
    }

    /* renamed from: m3 */
    public p U1(byte[] bArr) {
        super.U1(bArr);
        return this;
    }

    /* renamed from: n3 */
    public p V1(byte[] bArr, int i, int i2) {
        super.V1(bArr, i, i2);
        return this;
    }

    /* renamed from: o3 */
    public p W1(int i) {
        super.W1(i);
        return this;
    }

    /* renamed from: p3 */
    public p X1(long j) {
        super.X1(j);
        return this;
    }

    /* renamed from: q3 */
    public p Y1(int i) {
        super.Y1(i);
        return this;
    }

    /* renamed from: r3 */
    public p a2(int i) {
        super.a2(i);
        return this;
    }

    @Override // io.netty.buffer.j
    public k t() {
        return this.t;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j, java.lang.Object
    public String toString() {
        String aVar = super.toString();
        StringBuilder Z0 = je.Z0(aVar.substring(0, aVar.length() - 1), ", components=");
        Z0.append(this.v.size());
        Z0.append(')');
        return Z0.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048 A[EDGE_INSN: B:19:0x0048->B:17:0x0048 ?: BREAK  , SYNTHETIC] */
    @Override // io.netty.buffer.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int x1(int r6, java.nio.channels.ScatteringByteChannel r7, int r8) {
        /*
            r5 = this;
            r5.t2()
            r5.o2(r6, r8)
            if (r8 != 0) goto L_0x000f
            java.nio.ByteBuffer r6 = io.netty.buffer.p.y
            int r6 = r7.read(r6)
            return r6
        L_0x000f:
            int r0 = r5.f3(r6)
            r1 = 0
        L_0x0014:
            java.util.List<io.netty.buffer.p$b> r2 = r5.v
            java.lang.Object r2 = r2.get(r0)
            io.netty.buffer.p$b r2 = (io.netty.buffer.p.b) r2
            io.netty.buffer.j r3 = r2.a
            int r2 = r2.c
            int r4 = r3.J()
            int r2 = r6 - r2
            int r4 = r4 - r2
            int r4 = java.lang.Math.min(r8, r4)
            if (r4 != 0) goto L_0x0030
        L_0x002d:
            int r0 = r0 + 1
            goto L_0x0046
        L_0x0030:
            int r2 = r3.x1(r2, r7, r4)
            if (r2 != 0) goto L_0x0037
            goto L_0x0048
        L_0x0037:
            if (r2 >= 0) goto L_0x003d
            if (r1 != 0) goto L_0x0048
            r6 = -1
            return r6
        L_0x003d:
            if (r2 != r4) goto L_0x0043
            int r6 = r6 + r4
            int r8 = r8 - r4
            int r1 = r1 + r4
            goto L_0x002d
        L_0x0043:
            int r6 = r6 + r2
            int r8 = r8 - r2
            int r1 = r1 + r2
        L_0x0046:
            if (r8 > 0) goto L_0x0014
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.buffer.p.x1(int, java.nio.channels.ScatteringByteChannel, int):int");
    }

    p(k kVar) {
        super(Integer.MAX_VALUE);
        this.t = kVar;
        this.u = false;
        this.w = 0;
        this.v = Collections.emptyList();
    }
}
