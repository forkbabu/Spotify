package defpackage;

import com.google.android.exoplayer2.util.v;
import defpackage.om;
import defpackage.xj;

/* renamed from: ml  reason: default package */
public final class ml implements qj {
    private final nl a = new nl(null);
    private final v b = new v(2786);
    private boolean c;

    @Override // defpackage.qj
    public int a(nj njVar, wj wjVar) {
        int g = njVar.g(this.b.a, 0, 2786);
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

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        r8.j();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        if ((r4 - r3) < 8192) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        return false;
     */
    @Override // defpackage.qj
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean f(defpackage.nj r8) {
        /*
            r7 = this;
            com.google.android.exoplayer2.util.v r0 = new com.google.android.exoplayer2.util.v
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.a
            r8.f(r4, r2, r1, r2)
            r0.K(r2)
            int r4 = r0.A()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L_0x0059
            r8.j()
            r8.a(r3, r2)
            r4 = r3
        L_0x0021:
            r1 = 0
        L_0x0022:
            byte[] r5 = r0.a
            r6 = 6
            r8.f(r5, r2, r6, r2)
            r0.K(r2)
            int r5 = r0.D()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L_0x0043
            r8.j()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x003f
            return r2
        L_0x003f:
            r8.a(r4, r2)
            goto L_0x0021
        L_0x0043:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L_0x0049
            return r5
        L_0x0049:
            byte[] r5 = r0.a
            int r5 = com.google.android.exoplayer2.audio.g.d(r5)
            r6 = -1
            if (r5 != r6) goto L_0x0053
            return r2
        L_0x0053:
            int r5 = r5 + -6
            r8.a(r5, r2)
            goto L_0x0022
        L_0x0059:
            r4 = 3
            r0.L(r4)
            int r4 = r0.w()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.a(r4, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ml.f(nj):boolean");
    }
}
