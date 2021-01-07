package defpackage;

import com.google.android.exoplayer2.util.v;
import defpackage.om;
import defpackage.xj;

/* renamed from: ol  reason: default package */
public final class ol implements qj {
    private final pl a = new pl(null);
    private final v b = new v(16384);
    private boolean c;

    @Override // defpackage.qj
    public int a(nj njVar, wj wjVar) {
        int g = njVar.g(this.b.a, 0, 16384);
        if (g == -1) {
            return -1;
        }
        this.b.K(0);
        this.b.J(g);
        if (!this.c) {
            this.a.f(0, 4);
            this.c = true;
        }
        this.a.b(this.b);
        return 0;
    }

    @Override // defpackage.qj
    public void b(rj rjVar) {
        this.a.d(rjVar, new om.d(Integer.MIN_VALUE, 0, 1));
        rjVar.q();
        rjVar.j(new xj.b(-9223372036854775807L, 0));
    }

    @Override // defpackage.qj
    public void c(long j, long j2) {
        this.c = false;
        this.a.c();
    }

    @Override // defpackage.qj
    public void d() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        r15.j();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        if ((r4 - r3) < 8192) goto L_0x0046;
     */
    @Override // defpackage.qj
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean f(defpackage.nj r15) {
        /*
            r14 = this;
            com.google.android.exoplayer2.util.v r0 = new com.google.android.exoplayer2.util.v
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.a
            r15.f(r4, r2, r1, r2)
            r0.K(r2)
            int r4 = r0.A()
            r5 = 4801587(0x494433, float:6.728456E-39)
            r6 = 3
            if (r4 == r5) goto L_0x008e
            r15.j()
            r15.a(r3, r2)
            r4 = r3
        L_0x0022:
            r1 = 0
        L_0x0023:
            byte[] r5 = r0.a
            r7 = 7
            r15.f(r5, r2, r7, r2)
            r0.K(r2)
            int r5 = r0.D()
            r8 = 44096(0xac40, float:6.1792E-41)
            r9 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r8) goto L_0x004a
            if (r5 == r9) goto L_0x004a
            r15.j()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x0046
            return r2
        L_0x0046:
            r15.a(r4, r2)
            goto L_0x0022
        L_0x004a:
            r8 = 1
            int r1 = r1 + r8
            r10 = 4
            if (r1 < r10) goto L_0x0050
            return r8
        L_0x0050:
            byte[] r8 = r0.a
            int r11 = r8.length
            r12 = -1
            if (r11 >= r7) goto L_0x0058
            r11 = -1
            goto L_0x0085
        L_0x0058:
            r11 = 2
            byte r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            byte r13 = r8[r6]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r13) goto L_0x007f
            byte r10 = r8[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r11 = 5
            byte r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r10 = r10 | r11
            r11 = 6
            byte r8 = r8[r11]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r11 = r10 | r8
            goto L_0x0080
        L_0x007f:
            r7 = 4
        L_0x0080:
            if (r5 != r9) goto L_0x0084
            int r7 = r7 + 2
        L_0x0084:
            int r11 = r11 + r7
        L_0x0085:
            if (r11 != r12) goto L_0x0088
            return r2
        L_0x0088:
            int r11 = r11 + -7
            r15.a(r11, r2)
            goto L_0x0023
        L_0x008e:
            r0.L(r6)
            int r4 = r0.w()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r15.a(r4, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ol.f(nj):boolean");
    }
}
