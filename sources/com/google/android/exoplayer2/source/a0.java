package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.source.z;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.n;
import com.google.android.exoplayer2.util.v;
import defpackage.zj;
import java.io.EOFException;
import java.nio.ByteBuffer;

public class a0 implements zj {
    private final n a;
    private final int b;
    private final z c;
    private final z.a d = new z.a();
    private final v e = new v(32);
    private a f;
    private a g;
    private a h;
    private boolean i;
    private d0 j;
    private long k;
    private long l;
    private boolean m;
    private b n;

    /* access modifiers changed from: private */
    public static final class a {
        public final long a;
        public final long b;
        public boolean c;
        public e d;
        public a e;

        public a(long j, int i) {
            this.a = j;
            this.b = j + ((long) i);
        }

        public int a(long j) {
            return ((int) (j - this.a)) + this.d.b;
        }
    }

    public interface b {
        void d(d0 d0Var);
    }

    public a0(n nVar, com.google.android.exoplayer2.drm.n<?> nVar2) {
        this.a = nVar;
        int b2 = nVar.b();
        this.b = b2;
        this.c = new z(nVar2);
        a aVar = new a(0, b2);
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
    }

    private void A(long j2, byte[] bArr, int i2) {
        while (true) {
            a aVar = this.g;
            if (j2 < aVar.b) {
                break;
            }
            this.g = aVar.e;
        }
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(i3, (int) (this.g.b - j2));
            a aVar2 = this.g;
            System.arraycopy(aVar2.d.a, aVar2.a(j2), bArr, i2 - i3, min);
            i3 -= min;
            j2 += (long) min;
            a aVar3 = this.g;
            if (j2 == aVar3.b) {
                this.g = aVar3.e;
            }
        }
    }

    private void g(a aVar) {
        if (aVar.c) {
            a aVar2 = this.h;
            int i2 = (((int) (aVar2.a - aVar.a)) / this.b) + (aVar2.c ? 1 : 0);
            e[] eVarArr = new e[i2];
            int i3 = 0;
            while (i3 < i2) {
                eVarArr[i3] = aVar.d;
                aVar.d = null;
                a aVar3 = aVar.e;
                aVar.e = null;
                i3++;
                aVar = aVar3;
            }
            this.a.e(eVarArr);
        }
    }

    private void h(long j2) {
        a aVar;
        if (j2 != -1) {
            while (true) {
                aVar = this.f;
                if (j2 < aVar.b) {
                    break;
                }
                this.a.d(aVar.d);
                a aVar2 = this.f;
                aVar2.d = null;
                a aVar3 = aVar2.e;
                aVar2.e = null;
                this.f = aVar3;
            }
            if (this.g.a < aVar.a) {
                this.g = aVar;
            }
        }
    }

    private void v(int i2) {
        long j2 = this.l + ((long) i2);
        this.l = j2;
        a aVar = this.h;
        if (j2 == aVar.b) {
            this.h = aVar.e;
        }
    }

    private int w(int i2) {
        a aVar = this.h;
        if (!aVar.c) {
            e a2 = this.a.a();
            a aVar2 = new a(this.h.b, this.b);
            aVar.d = a2;
            aVar.e = aVar2;
            aVar.c = true;
        }
        return Math.min(i2, (int) (this.h.b - this.l));
    }

    private void z(long j2, ByteBuffer byteBuffer, int i2) {
        while (true) {
            a aVar = this.g;
            if (j2 < aVar.b) {
                break;
            }
            this.g = aVar.e;
        }
        while (i2 > 0) {
            int min = Math.min(i2, (int) (this.g.b - j2));
            a aVar2 = this.g;
            byteBuffer.put(aVar2.d.a, aVar2.a(j2), min);
            i2 -= min;
            j2 += (long) min;
            a aVar3 = this.g;
            if (j2 == aVar3.b) {
                this.g = aVar3.e;
            }
        }
    }

    public void B() {
        C(false);
        this.c.A();
    }

    public void C(boolean z) {
        this.c.B(z);
        g(this.f);
        a aVar = new a(0, this.b);
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        this.l = 0;
        this.a.h();
    }

    public void D() {
        this.c.C();
        this.g = this.f;
    }

    public boolean E(int i2) {
        return this.c.D(i2);
    }

    public void F(long j2) {
        if (this.k != j2) {
            this.k = j2;
            this.i = true;
        }
    }

    public void G(b bVar) {
        this.n = bVar;
    }

    public void H(int i2) {
        this.c.E(i2);
    }

    public void I() {
        this.m = true;
    }

    @Override // defpackage.zj
    public int a(nj njVar, int i2, boolean z) {
        int w = w(i2);
        a aVar = this.h;
        int g2 = njVar.g(aVar.d.a, aVar.a(this.l), w);
        if (g2 != -1) {
            v(g2);
            return g2;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    @Override // defpackage.zj
    public void b(v vVar, int i2) {
        while (i2 > 0) {
            int w = w(i2);
            a aVar = this.h;
            vVar.g(aVar.d.a, aVar.a(this.l), w);
            i2 -= w;
            v(w);
        }
    }

    @Override // defpackage.zj
    public void c(d0 d0Var) {
        d0 d0Var2;
        long j2 = this.k;
        if (d0Var == null) {
            d0Var2 = null;
        } else {
            if (j2 != 0) {
                long j3 = d0Var.v;
                if (j3 != Long.MAX_VALUE) {
                    d0Var2 = d0Var.j(j3 + j2);
                }
            }
            d0Var2 = d0Var;
        }
        boolean j4 = this.c.j(d0Var2);
        this.j = d0Var;
        this.i = false;
        b bVar = this.n;
        if (bVar != null && j4) {
            bVar.d(d0Var2);
        }
    }

    @Override // defpackage.zj
    public void d(long j2, int i2, int i3, int i4, zj.a aVar) {
        if (this.i) {
            c(this.j);
        }
        long j3 = j2 + this.k;
        if (this.m) {
            if ((i2 & 1) != 0 && this.c.c(j3)) {
                this.m = false;
            } else {
                return;
            }
        }
        this.c.d(j3, i2, (this.l - ((long) i3)) - ((long) i4), i3, aVar);
    }

    public int e(long j2, boolean z, boolean z2) {
        return this.c.a(j2, z, z2);
    }

    public int f() {
        return this.c.b();
    }

    public void i(long j2, boolean z, boolean z2) {
        h(this.c.f(j2, z, z2));
    }

    public void j() {
        h(this.c.g());
    }

    public void k(int i2) {
        long h2 = this.c.h(i2);
        this.l = h2;
        if (h2 != 0) {
            a aVar = this.f;
            if (h2 != aVar.a) {
                while (this.l > aVar.b) {
                    aVar = aVar.e;
                }
                a aVar2 = aVar.e;
                g(aVar2);
                a aVar3 = new a(aVar.b, this.b);
                aVar.e = aVar3;
                if (this.l == aVar.b) {
                    aVar = aVar3;
                }
                this.h = aVar;
                if (this.g == aVar2) {
                    this.g = aVar3;
                    return;
                }
                return;
            }
        }
        g(this.f);
        a aVar4 = new a(this.l, this.b);
        this.f = aVar4;
        this.g = aVar4;
        this.h = aVar4;
    }

    public int l() {
        return this.c.k();
    }

    public long m() {
        return this.c.l();
    }

    public long n() {
        return this.c.m();
    }

    public int o() {
        return this.c.o();
    }

    public d0 p() {
        return this.c.q();
    }

    public int q() {
        return this.c.r();
    }

    public boolean r() {
        return this.c.t();
    }

    public boolean s(boolean z) {
        return this.c.u(z);
    }

    public void t() {
        this.c.w();
    }

    public int u() {
        return this.c.y();
    }

    public void x() {
        j();
        this.c.A();
    }

    public int y(e0 e0Var, fj fjVar, boolean z, boolean z2, long j2) {
        int i2;
        int z3 = this.c.z(e0Var, fjVar, z, z2, this.d);
        if (z3 == -4 && !fjVar.isEndOfStream()) {
            if (fjVar.c < j2) {
                fjVar.addFlag(Integer.MIN_VALUE);
            }
            if (!fjVar.p()) {
                z.a aVar = this.d;
                if (fjVar.n()) {
                    long j3 = aVar.b;
                    this.e.G(1);
                    A(j3, this.e.a, 1);
                    long j4 = j3 + 1;
                    byte b2 = this.e.a[0];
                    boolean z4 = (b2 & 128) != 0;
                    int i3 = b2 & Byte.MAX_VALUE;
                    cj cjVar = fjVar.a;
                    if (cjVar.a == null) {
                        cjVar.a = new byte[16];
                    }
                    A(j4, cjVar.a, i3);
                    long j5 = j4 + ((long) i3);
                    if (z4) {
                        this.e.G(2);
                        A(j5, this.e.a, 2);
                        j5 += 2;
                        i2 = this.e.D();
                    } else {
                        i2 = 1;
                    }
                    cj cjVar2 = fjVar.a;
                    int[] iArr = cjVar2.b;
                    if (iArr == null || iArr.length < i2) {
                        iArr = new int[i2];
                    }
                    int[] iArr2 = cjVar2.c;
                    if (iArr2 == null || iArr2.length < i2) {
                        iArr2 = new int[i2];
                    }
                    if (z4) {
                        int i4 = i2 * 6;
                        this.e.G(i4);
                        A(j5, this.e.a, i4);
                        j5 += (long) i4;
                        this.e.K(0);
                        for (int i5 = 0; i5 < i2; i5++) {
                            iArr[i5] = this.e.D();
                            iArr2[i5] = this.e.B();
                        }
                    } else {
                        iArr[0] = 0;
                        iArr2[0] = aVar.a - ((int) (j5 - aVar.b));
                    }
                    zj.a aVar2 = aVar.c;
                    cj cjVar3 = fjVar.a;
                    cjVar3.b(i2, iArr, iArr2, aVar2.b, cjVar3.a, aVar2.a, aVar2.c, aVar2.d);
                    long j6 = aVar.b;
                    int i6 = (int) (j5 - j6);
                    aVar.b = j6 + ((long) i6);
                    aVar.a -= i6;
                }
                if (fjVar.hasSupplementalData()) {
                    this.e.G(4);
                    A(aVar.b, this.e.a, 4);
                    int B = this.e.B();
                    aVar.b += 4;
                    aVar.a -= 4;
                    fjVar.l(B);
                    z(aVar.b, fjVar.b, B);
                    aVar.b += (long) B;
                    int i7 = aVar.a - B;
                    aVar.a = i7;
                    ByteBuffer byteBuffer = fjVar.f;
                    if (byteBuffer == null || byteBuffer.capacity() < i7) {
                        fjVar.f = ByteBuffer.allocate(i7);
                    } else {
                        fjVar.f.clear();
                    }
                    z(aVar.b, fjVar.f, aVar.a);
                } else {
                    fjVar.l(aVar.a);
                    z(aVar.b, fjVar.b, aVar.a);
                }
            }
        }
        return z3;
    }
}
