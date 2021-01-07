package defpackage;

import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;
import defpackage.om;
import defpackage.xj;

/* renamed from: ql  reason: default package */
public final class ql implements qj {
    private final rl a = new rl(true, null);
    private final v b = new v(2048);
    private final v c;
    private final u d;
    private rj e;
    private long f;
    private long g = -1;
    private int h = -1;
    private boolean i;
    private boolean j;

    public ql(int i2) {
        v vVar = new v(10);
        this.c = vVar;
        this.d = new u(vVar.a);
    }

    private int e(nj njVar) {
        int i2 = 0;
        while (true) {
            njVar.f(this.c.a, 0, 10, false);
            this.c.K(0);
            if (this.c.A() != 4801587) {
                break;
            }
            this.c.L(3);
            int w = this.c.w();
            i2 += w + 10;
            njVar.a(w, false);
        }
        njVar.j();
        njVar.a(i2, false);
        if (this.g == -1) {
            this.g = (long) i2;
        }
        return i2;
    }

    @Override // defpackage.qj
    public int a(nj njVar, wj wjVar) {
        njVar.c();
        int g2 = njVar.g(this.b.a, 0, 2048);
        boolean z = g2 == -1;
        if (!this.j) {
            rj rjVar = this.e;
            rjVar.getClass();
            rjVar.j(new xj.b(-9223372036854775807L, 0));
            this.j = true;
        }
        if (z) {
            return -1;
        }
        this.b.K(0);
        this.b.J(g2);
        if (!this.i) {
            this.a.f(this.f, 4);
            this.i = true;
        }
        this.a.b(this.b);
        return 0;
    }

    @Override // defpackage.qj
    public void b(rj rjVar) {
        this.e = rjVar;
        this.a.d(rjVar, new om.d(Integer.MIN_VALUE, 0, 1));
        rjVar.q();
    }

    @Override // defpackage.qj
    public void c(long j2, long j3) {
        this.i = false;
        this.a.c();
        this.f = j3;
    }

    @Override // defpackage.qj
    public void d() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
        r9.j();
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if ((r3 - r0) < 8192) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        return false;
     */
    @Override // defpackage.qj
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean f(defpackage.nj r9) {
        /*
            r8 = this;
            int r0 = r8.e(r9)
            r1 = 0
            r3 = r0
        L_0x0006:
            r2 = 0
            r4 = 0
        L_0x0008:
            com.google.android.exoplayer2.util.v r5 = r8.c
            byte[] r5 = r5.a
            r6 = 2
            r9.f(r5, r1, r6, r1)
            com.google.android.exoplayer2.util.v r5 = r8.c
            r5.K(r1)
            com.google.android.exoplayer2.util.v r5 = r8.c
            int r5 = r5.D()
            boolean r5 = defpackage.rl.g(r5)
            if (r5 != 0) goto L_0x0031
            r9.j()
            int r3 = r3 + 1
            int r2 = r3 - r0
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r2 < r4) goto L_0x002d
            return r1
        L_0x002d:
            r9.a(r3, r1)
            goto L_0x0006
        L_0x0031:
            r5 = 1
            int r2 = r2 + r5
            r6 = 4
            if (r2 < r6) goto L_0x003b
            r7 = 188(0xbc, float:2.63E-43)
            if (r4 <= r7) goto L_0x003b
            return r5
        L_0x003b:
            com.google.android.exoplayer2.util.v r5 = r8.c
            byte[] r5 = r5.a
            r9.f(r5, r1, r6, r1)
            com.google.android.exoplayer2.util.u r5 = r8.d
            r6 = 14
            r5.m(r6)
            com.google.android.exoplayer2.util.u r5 = r8.d
            r6 = 13
            int r5 = r5.h(r6)
            r6 = 6
            if (r5 > r6) goto L_0x0055
            return r1
        L_0x0055:
            int r6 = r5 + -6
            r9.a(r6, r1)
            int r4 = r4 + r5
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ql.f(nj):boolean");
    }
}
