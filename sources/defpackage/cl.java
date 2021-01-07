package defpackage;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.n;
import com.google.android.exoplayer2.util.v;
import defpackage.il;
import defpackage.xj;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: cl  reason: default package */
final class cl extends il {
    private n n;
    private a o;

    /* renamed from: cl$a */
    private class a implements gl, xj {
        private long[] a;
        private long[] b;
        private long c = -1;
        private long d = -1;

        public a() {
        }

        @Override // defpackage.gl
        public long a(nj njVar) {
            long j = this.d;
            if (j < 0) {
                return -1;
            }
            long j2 = -(j + 2);
            this.d = -1;
            return j2;
        }

        @Override // defpackage.gl
        public xj b() {
            return this;
        }

        @Override // defpackage.gl
        public void c(long j) {
            this.d = this.a[f0.d(this.a, j, true, true)];
        }

        public void d(v vVar) {
            vVar.L(1);
            int A = vVar.A() / 18;
            this.a = new long[A];
            this.b = new long[A];
            for (int i = 0; i < A; i++) {
                this.a[i] = vVar.q();
                this.b[i] = vVar.q();
                vVar.L(2);
            }
        }

        @Override // defpackage.xj
        public xj.a e(long j) {
            int d2 = f0.d(this.a, cl.this.b(j), true, true);
            long a2 = cl.this.a(this.a[d2]);
            yj yjVar = new yj(a2, this.c + this.b[d2]);
            if (a2 < j) {
                long[] jArr = this.a;
                if (d2 != jArr.length - 1) {
                    int i = d2 + 1;
                    return new xj.a(yjVar, new yj(cl.this.a(jArr[i]), this.c + this.b[i]));
                }
            }
            return new xj.a(yjVar);
        }

        public void f(long j) {
            this.c = j;
        }

        @Override // defpackage.xj
        public boolean h() {
            return true;
        }

        @Override // defpackage.xj
        public long j() {
            n nVar = cl.this.n;
            return (nVar.e * 1000000) / ((long) nVar.b);
        }
    }

    cl() {
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.il
    public long e(v vVar) {
        int i;
        int i2;
        byte[] bArr = vVar.a;
        int i3 = -1;
        if (!(bArr[0] == -1)) {
            return -1;
        }
        int i4 = (bArr[2] & 255) >> 4;
        switch (i4) {
            case 1:
                i3 = 192;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                i = 576;
                i2 = i4 - 2;
                i3 = i << i2;
                break;
            case 6:
            case 7:
                vVar.L(4);
                vVar.E();
                int x = i4 == 6 ? vVar.x() : vVar.D();
                vVar.K(0);
                i3 = x + 1;
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i = 256;
                i2 = i4 - 8;
                i3 = i << i2;
                break;
        }
        return (long) i3;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.il
    public boolean g(v vVar, long j, il.b bVar) {
        byte[] bArr = vVar.a;
        if (this.n == null) {
            n nVar = new n(bArr, 17);
            this.n = nVar;
            int i = nVar.a;
            int i2 = i == 0 ? -1 : i;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, vVar.c());
            copyOfRange[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            n nVar2 = this.n;
            int i3 = nVar2.d;
            int i4 = nVar2.b;
            int i5 = nVar2.c;
            bVar.a = d0.o(null, "audio/flac", null, i3 * i4 * i5, i2, i5, i4, singletonList, null, 0, null);
        } else if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            a aVar = new a();
            this.o = aVar;
            aVar.d(vVar);
        } else {
            if (bArr[0] == -1) {
                a aVar2 = this.o;
                if (aVar2 != null) {
                    aVar2.f(j);
                    bVar.b = this.o;
                }
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.il
    public void h(boolean z) {
        super.h(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
