package defpackage;

import com.google.android.exoplayer2.util.t;
import com.google.android.exoplayer2.util.v;
import defpackage.ok;
import defpackage.xj;
import java.util.ArrayDeque;

/* renamed from: uk  reason: default package */
public final class uk implements qj, xj {
    private final v a = new v(t.a);
    private final v b = new v(4);
    private final v c = new v();
    private final v d = new v(16);
    private final ArrayDeque<ok.a> e = new ArrayDeque<>();
    private int f;
    private int g;
    private long h;
    private int i;
    private v j;
    private int k = -1;
    private int l;
    private int m;
    private boolean n;
    private rj o;
    private a[] p;
    private long[][] q;
    private int r;
    private long s;
    private boolean t;

    /* access modifiers changed from: private */
    /* renamed from: uk$a */
    public static final class a {
        public final xk a;
        public final al b;
        public final zj c;
        public int d;

        public a(xk xkVar, al alVar, zj zjVar) {
            this.a = xkVar;
            this.b = alVar;
            this.c = zjVar;
        }
    }

    public uk(int i2) {
    }

    private void k() {
        this.f = 0;
        this.i = 0;
    }

    private static long l(al alVar, long j2, long j3) {
        int a2 = alVar.a(j2);
        if (a2 == -1) {
            a2 = alVar.b(j2);
        }
        if (a2 == -1) {
            return j3;
        }
        return Math.min(alVar.c[a2], j3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03e7  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0497  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0726 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m(long r49) {
        /*
        // Method dump skipped, instructions count: 2312
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uk.m(long):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r31v0, resolved type: nj */
    /* JADX DEBUG: Multi-variable search result rejected for r8v13, resolved type: zj */
    /* JADX DEBUG: Multi-variable search result rejected for r6v31, resolved type: com.google.android.exoplayer2.util.v */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0227 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x03bd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // defpackage.qj
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(defpackage.nj r31, defpackage.wj r32) {
        /*
        // Method dump skipped, instructions count: 969
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uk.a(nj, wj):int");
    }

    @Override // defpackage.qj
    public void b(rj rjVar) {
        this.o = rjVar;
    }

    @Override // defpackage.qj
    public void c(long j2, long j3) {
        this.e.clear();
        this.i = 0;
        this.k = -1;
        this.l = 0;
        this.m = 0;
        this.n = false;
        if (j2 == 0) {
            k();
            return;
        }
        a[] aVarArr = this.p;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                al alVar = aVar.b;
                int a2 = alVar.a(j3);
                if (a2 == -1) {
                    a2 = alVar.b(j3);
                }
                aVar.d = a2;
            }
        }
    }

    @Override // defpackage.qj
    public void d() {
    }

    @Override // defpackage.xj
    public xj.a e(long j2) {
        long j3;
        long j4;
        long j5;
        int b2;
        long j6 = j2;
        yj yjVar = yj.c;
        a[] aVarArr = this.p;
        if (aVarArr.length == 0) {
            return new xj.a(yjVar);
        }
        long j7 = -1;
        int i2 = this.r;
        if (i2 != -1) {
            al alVar = aVarArr[i2].b;
            int a2 = alVar.a(j6);
            if (a2 == -1) {
                a2 = alVar.b(j6);
            }
            if (a2 == -1) {
                return new xj.a(yjVar);
            }
            long j8 = alVar.f[a2];
            j3 = alVar.c[a2];
            if (j8 >= j6 || a2 >= alVar.b - 1 || (b2 = alVar.b(j6)) == -1 || b2 == a2) {
                j5 = -9223372036854775807L;
            } else {
                long j9 = alVar.f[b2];
                long j10 = alVar.c[b2];
                j5 = j9;
                j7 = j10;
            }
            j4 = j5;
            j6 = j8;
        } else {
            j3 = Long.MAX_VALUE;
            j4 = -9223372036854775807L;
        }
        int i3 = 0;
        while (true) {
            a[] aVarArr2 = this.p;
            if (i3 >= aVarArr2.length) {
                break;
            }
            if (i3 != this.r) {
                al alVar2 = aVarArr2[i3].b;
                long l2 = l(alVar2, j6, j3);
                if (j4 != -9223372036854775807L) {
                    j7 = l(alVar2, j4, j7);
                }
                j3 = l2;
            }
            i3++;
        }
        yj yjVar2 = new yj(j6, j3);
        if (j4 == -9223372036854775807L) {
            return new xj.a(yjVar2);
        }
        return new xj.a(yjVar2, new yj(j4, j7));
    }

    @Override // defpackage.qj
    public boolean f(nj njVar) {
        return wk.c(njVar);
    }

    @Override // defpackage.xj
    public boolean h() {
        return true;
    }

    @Override // defpackage.xj
    public long j() {
        return this.s;
    }
}
