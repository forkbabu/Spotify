package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.f0;
import defpackage.xj;
import java.io.EOFException;
import java.util.Arrays;

/* renamed from: ak  reason: default package */
public final class ak implements qj {
    private static final int[] o = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] p;
    private static final byte[] q = f0.z("#!AMR\n");
    private static final byte[] r = f0.z("#!AMR-WB\n");
    private static final int s;
    private final byte[] a = new byte[1];
    private boolean b;
    private long c;
    private int d;
    private int e;
    private boolean f;
    private long g;
    private int h = -1;
    private int i;
    private long j;
    private rj k;
    private zj l;
    private xj m;
    private boolean n;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        p = iArr;
        s = iArr[8];
    }

    public ak(int i2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        if ((!r0 && (r4 < 12 || r4 > 14)) != false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int e(defpackage.nj r4) {
        /*
            r3 = this;
            r4.j()
            byte[] r0 = r3.a
            r1 = 0
            r2 = 1
            r4.f(r0, r1, r2, r1)
            byte[] r4 = r3.a
            byte r4 = r4[r1]
            r0 = r4 & 131(0x83, float:1.84E-43)
            if (r0 > 0) goto L_0x0070
            int r4 = r4 >> 3
            r0 = 15
            r4 = r4 & r0
            if (r4 < 0) goto L_0x003c
            if (r4 > r0) goto L_0x003c
            boolean r0 = r3.b
            if (r0 == 0) goto L_0x0029
            r2 = 10
            if (r4 < r2) goto L_0x0027
            r2 = 13
            if (r4 <= r2) goto L_0x0029
        L_0x0027:
            r2 = 1
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            if (r2 != 0) goto L_0x003b
            if (r0 != 0) goto L_0x0038
            r0 = 12
            if (r4 < r0) goto L_0x0036
            r0 = 14
            if (r4 <= r0) goto L_0x0038
        L_0x0036:
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x003c
        L_0x003b:
            r1 = 1
        L_0x003c:
            if (r1 != 0) goto L_0x0062
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Illegal AMR "
            java.lang.StringBuilder r1 = defpackage.je.V0(r1)
            boolean r2 = r3.b
            if (r2 == 0) goto L_0x004d
            java.lang.String r2 = "WB"
            goto L_0x004f
        L_0x004d:
            java.lang.String r2 = "NB"
        L_0x004f:
            r1.append(r2)
            java.lang.String r2 = " frame type "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x0062:
            boolean r0 = r3.b
            if (r0 == 0) goto L_0x006b
            int[] r0 = defpackage.ak.p
            r4 = r0[r4]
            goto L_0x006f
        L_0x006b:
            int[] r0 = defpackage.ak.o
            r4 = r0[r4]
        L_0x006f:
            return r4
        L_0x0070:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Invalid padding bits for frame header "
            java.lang.String r4 = defpackage.je.p0(r1, r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak.e(nj):int");
    }

    private boolean g(nj njVar) {
        byte[] bArr = q;
        njVar.j();
        byte[] bArr2 = new byte[bArr.length];
        njVar.f(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.b = false;
            njVar.l(bArr.length);
            return true;
        }
        byte[] bArr3 = r;
        njVar.j();
        byte[] bArr4 = new byte[bArr3.length];
        njVar.f(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.b = true;
        njVar.l(bArr3.length);
        return true;
    }

    @Override // defpackage.qj
    public int a(nj njVar, wj wjVar) {
        if (njVar.e() != 0 || g(njVar)) {
            if (!this.n) {
                this.n = true;
                boolean z = this.b;
                this.l.c(d0.n(null, z ? "audio/amr-wb" : "audio/3gpp", null, -1, s, 1, z ? 16000 : 8000, -1, null, null, 0, null));
            }
            int i2 = -1;
            if (this.e == 0) {
                try {
                    int e2 = e(njVar);
                    this.d = e2;
                    this.e = e2;
                    if (this.h == -1) {
                        this.g = njVar.e();
                        this.h = this.d;
                    }
                    if (this.h == this.d) {
                        this.i++;
                    }
                } catch (EOFException unused) {
                }
            }
            int a2 = this.l.a(njVar, this.e, true);
            if (a2 != -1) {
                int i3 = this.e - a2;
                this.e = i3;
                if (i3 <= 0) {
                    this.l.d(this.j + this.c, 1, this.d, 0, null);
                    this.c += 20000;
                }
                i2 = 0;
            }
            if (!this.f) {
                xj.b bVar = new xj.b(-9223372036854775807L, 0);
                this.m = bVar;
                this.k.j(bVar);
                this.f = true;
            }
            return i2;
        }
        throw new ParserException("Could not find AMR header.");
    }

    @Override // defpackage.qj
    public void b(rj rjVar) {
        this.k = rjVar;
        this.l = rjVar.s(0, 1);
        rjVar.q();
    }

    @Override // defpackage.qj
    public void c(long j2, long j3) {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        if (j2 != 0) {
            xj xjVar = this.m;
            if (xjVar instanceof mj) {
                this.j = ((mj) xjVar).a(j2);
                return;
            }
        }
        this.j = 0;
    }

    @Override // defpackage.qj
    public void d() {
    }

    @Override // defpackage.qj
    public boolean f(nj njVar) {
        return g(njVar);
    }
}
