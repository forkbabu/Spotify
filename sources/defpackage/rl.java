package defpackage;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;
import defpackage.om;
import java.util.Arrays;

/* renamed from: rl  reason: default package */
public final class rl implements vl {
    private static final byte[] v = {73, 68, 51};
    private final boolean a;
    private final u b = new u(new byte[7]);
    private final v c = new v(Arrays.copyOf(v, 10));
    private final String d;
    private String e;
    private zj f;
    private zj g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;
    private int r;
    private long s;
    private zj t;
    private long u;

    public rl(boolean z, String str) {
        h();
        this.m = -1;
        this.n = -1;
        this.q = -9223372036854775807L;
        this.a = z;
        this.d = str;
    }

    private boolean a(v vVar, byte[] bArr, int i2) {
        int min = Math.min(vVar.a(), i2 - this.i);
        vVar.g(bArr, this.i, min);
        int i3 = this.i + min;
        this.i = i3;
        return i3 == i2;
    }

    public static boolean g(int i2) {
        return (i2 & 65526) == 65520;
    }

    private void h() {
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }

    private boolean i(v vVar, byte[] bArr, int i2) {
        if (vVar.a() < i2) {
            return false;
        }
        vVar.g(bArr, 0, i2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0231, code lost:
        if (((r26.a[r7] & 8) >> 3) == r15) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0238, code lost:
        r25.o = (r11 & 8) >> 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x023f, code lost:
        if ((r11 & 1) != 0) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0241, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0243, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0244, code lost:
        r25.k = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0248, code lost:
        if (r25.l != false) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x024a, code lost:
        r25.h = 1;
        r25.i = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0250, code lost:
        r25.h = 3;
        r25.i = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0255, code lost:
        r26.K(r13);
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0238 A[EDGE_INSN: B:126:0x0238->B:80:0x0238 ?: BREAK  , SYNTHETIC] */
    @Override // defpackage.vl
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.google.android.exoplayer2.util.v r26) {
        /*
        // Method dump skipped, instructions count: 689
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rl.b(com.google.android.exoplayer2.util.v):void");
    }

    @Override // defpackage.vl
    public void c() {
        this.l = false;
        h();
    }

    @Override // defpackage.vl
    public void d(rj rjVar, om.d dVar) {
        dVar.a();
        this.e = dVar.b();
        this.f = rjVar.s(dVar.c(), 1);
        if (this.a) {
            dVar.a();
            zj s2 = rjVar.s(dVar.c(), 4);
            this.g = s2;
            s2.c(d0.s(dVar.b(), "application/id3", null, -1, null));
            return;
        }
        this.g = new pj();
    }

    @Override // defpackage.vl
    public void e() {
    }

    @Override // defpackage.vl
    public void f(long j2, int i2) {
        this.s = j2;
    }
}
