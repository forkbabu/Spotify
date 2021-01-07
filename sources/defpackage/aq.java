package defpackage;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.source.e0;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.i;
import defpackage.gq;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aq  reason: default package */
public class aq extends bq {
    private final b g;
    private final long h;
    private final long i;
    private final long j;
    private final float k;
    private final long l;
    private final i m;
    private float n = 1.0f;
    private int o;
    private int p = 0;
    private long q = -9223372036854775807L;

    /* access modifiers changed from: private */
    /* renamed from: aq$b */
    public interface b {
    }

    /* access modifiers changed from: private */
    /* renamed from: aq$c */
    public static final class c implements b {
        private final f a;
        private final float b;
        private final long c;
        private long[][] d;

        c(f fVar, float f, long j) {
            this.a = fVar;
            this.b = f;
            this.c = j;
        }

        /* access modifiers changed from: package-private */
        public void a(long[][] jArr) {
            g.a(jArr.length >= 2);
            this.d = jArr;
        }

        public long b() {
            long[][] jArr;
            long max = Math.max(0L, ((long) (((float) this.a.d()) * this.b)) - this.c);
            if (this.d == null) {
                return max;
            }
            int i = 1;
            while (true) {
                jArr = this.d;
                if (i >= jArr.length - 1 || jArr[i][0] >= max) {
                    break;
                }
                i++;
            }
            long[] jArr2 = jArr[i - 1];
            long[] jArr3 = jArr[i];
            return jArr2[1] + ((long) ((((float) (max - jArr2[0])) / ((float) (jArr3[0] - jArr2[0]))) * ((float) (jArr3[1] - jArr2[1]))));
        }
    }

    /* renamed from: aq$d */
    public static class d implements gq.b {
        private final i a = i.a;

        @Override // defpackage.gq.b
        public final gq[] a(gq.a[] aVarArr, f fVar) {
            ArrayList arrayList;
            gq[] gqVarArr = new gq[aVarArr.length];
            int i = 0;
            for (int i2 = 0; i2 < aVarArr.length; i2++) {
                gq.a aVar = aVarArr[i2];
                if (aVar != null) {
                    int[] iArr = aVar.b;
                    if (iArr.length == 1) {
                        gqVarArr[i2] = new dq(aVar.a, iArr[0], aVar.c, aVar.d);
                        int i3 = aVar.a.a(aVar.b[0]).n;
                        if (i3 != -1) {
                            i += i3;
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            while (i4 < aVarArr.length) {
                gq.a aVar2 = aVarArr[i4];
                if (aVar2 != null) {
                    int[] iArr2 = aVar2.b;
                    if (iArr2.length > 1) {
                        long j = (long) 25000;
                        aq aqVar = new aq(aVar2.a, iArr2, new c(fVar, 0.7f, (long) i), (long) 10000, j, j, 0.75f, 2000, i.a, null);
                        arrayList = arrayList2;
                        arrayList.add(aqVar);
                        gqVarArr[i4] = aqVar;
                        i4++;
                        arrayList2 = arrayList;
                    }
                }
                arrayList = arrayList2;
                i4++;
                arrayList2 = arrayList;
            }
            if (arrayList2.size() > 1) {
                long[][] jArr = new long[arrayList2.size()][];
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    aq aqVar2 = (aq) arrayList2.get(i5);
                    jArr[i5] = new long[aqVar2.c.length];
                    int i6 = 0;
                    while (true) {
                        int[] iArr3 = aqVar2.c;
                        if (i6 >= iArr3.length) {
                            break;
                        }
                        jArr[i5][i6] = (long) aqVar2.d((iArr3.length - i6) - 1).n;
                        i6++;
                    }
                }
                long[][][] s = aq.s(jArr);
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    ((aq) arrayList2.get(i7)).u(s[i7]);
                }
            }
            return gqVarArr;
        }
    }

    aq(e0 e0Var, int[] iArr, b bVar, long j2, long j3, long j4, float f, long j5, i iVar, a aVar) {
        super(e0Var, iArr);
        this.g = bVar;
        this.h = j2 * 1000;
        this.i = j3 * 1000;
        this.j = j4 * 1000;
        this.k = f;
        this.l = j5;
        this.m = iVar;
    }

    static long[][][] s(long[][] jArr) {
        int i2;
        int length = jArr.length;
        double[][] dArr = new double[length][];
        for (int i3 = 0; i3 < jArr.length; i3++) {
            dArr[i3] = new double[jArr[i3].length];
            for (int i4 = 0; i4 < jArr[i3].length; i4++) {
                dArr[i3][i4] = jArr[i3][i4] == -1 ? 0.0d : Math.log((double) jArr[i3][i4]);
            }
        }
        double[][] dArr2 = new double[length][];
        for (int i5 = 0; i5 < length; i5++) {
            dArr2[i5] = new double[(dArr[i5].length - 1)];
            if (dArr2[i5].length != 0) {
                double d2 = dArr[i5][dArr[i5].length - 1] - dArr[i5][0];
                int i6 = 0;
                while (i6 < dArr[i5].length - 1) {
                    int i7 = i6 + 1;
                    dArr2[i5][i6] = d2 == 0.0d ? 1.0d : (((dArr[i5][i6] + dArr[i5][i7]) * 0.5d) - dArr[i5][0]) / d2;
                    i6 = i7;
                }
            }
        }
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            i8 += dArr2[i9].length;
        }
        int i10 = i8 + 3;
        int[] iArr = new int[3];
        int i11 = 2;
        iArr[2] = 2;
        iArr[1] = i10;
        iArr[0] = length;
        long[][][] jArr2 = (long[][][]) Array.newInstance(long.class, iArr);
        int[] iArr2 = new int[length];
        v(jArr2, 1, jArr, iArr2);
        while (true) {
            i2 = i10 - 1;
            if (i11 >= i2) {
                break;
            }
            double d3 = Double.MAX_VALUE;
            int i12 = 0;
            for (int i13 = 0; i13 < length; i13++) {
                if (iArr2[i13] + 1 != dArr[i13].length) {
                    double d4 = dArr2[i13][iArr2[i13]];
                    if (d4 < d3) {
                        i12 = i13;
                        d3 = d4;
                    }
                }
            }
            iArr2[i12] = iArr2[i12] + 1;
            v(jArr2, i11, jArr, iArr2);
            i11++;
        }
        for (long[][] jArr3 : jArr2) {
            int i14 = i10 - 2;
            jArr3[i2][0] = jArr3[i14][0] * 2;
            jArr3[i2][1] = jArr3[i14][1] * 2;
        }
        return jArr2;
    }

    private int t(long j2) {
        long b2 = ((c) this.g).b();
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j2 == Long.MIN_VALUE || !r(i3, j2)) {
                if (((long) Math.round(((float) d(i3).n) * this.n)) <= b2) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    private static void v(long[][][] jArr, int i2, long[][] jArr2, int[] iArr) {
        long j2 = 0;
        for (int i3 = 0; i3 < jArr.length; i3++) {
            jArr[i3][i2][1] = jArr2[i3][iArr[i3]];
            j2 += jArr[i3][i2][1];
        }
        for (long[][] jArr3 : jArr) {
            jArr3[i2][0] = j2;
        }
    }

    @Override // defpackage.gq
    public int b() {
        return this.o;
    }

    @Override // defpackage.bq, defpackage.gq
    public void f(float f) {
        this.n = f;
    }

    @Override // defpackage.gq
    public Object g() {
        return null;
    }

    @Override // defpackage.bq, defpackage.gq
    public void k() {
        this.q = -9223372036854775807L;
    }

    @Override // defpackage.bq, defpackage.gq
    public int l(long j2, List<? extends po> list) {
        int i2;
        int i3;
        long b2 = this.m.b();
        long j3 = this.q;
        if (!(j3 == -9223372036854775807L || b2 - j3 >= this.l)) {
            return list.size();
        }
        this.q = b2;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long v = f0.v(((po) list.get(size - 1)).f - j2, this.n);
        long j4 = this.j;
        if (v < j4) {
            return size;
        }
        d0 d2 = d(t(b2));
        for (int i4 = 0; i4 < size; i4++) {
            po poVar = (po) list.get(i4);
            d0 d0Var = poVar.c;
            if (f0.v(poVar.f - j2, this.n) >= j4 && d0Var.n < d2.n && (i2 = d0Var.x) != -1 && i2 < 720 && (i3 = d0Var.w) != -1 && i3 < 1280 && i2 < d2.x) {
                return i4;
            }
        }
        return size;
    }

    @Override // defpackage.gq
    public void m(long j2, long j3, long j4, List<? extends po> list, qo[] qoVarArr) {
        long b2 = this.m.b();
        boolean z = true;
        if (this.p == 0) {
            this.p = 1;
            this.o = t(b2);
            return;
        }
        int i2 = this.o;
        int t = t(b2);
        this.o = t;
        if (t != i2) {
            if (!r(i2, b2)) {
                d0 d2 = d(i2);
                int i3 = d(this.o).n;
                int i4 = d2.n;
                if (i3 > i4) {
                    if (j4 == -9223372036854775807L || j4 > this.h) {
                        z = false;
                    }
                    if (j3 < (z ? (long) (((float) j4) * this.k) : this.h)) {
                        this.o = i2;
                    }
                }
                if (i3 < i4 && j3 >= this.i) {
                    this.o = i2;
                }
            }
            if (this.o != i2) {
                this.p = 3;
            }
        }
    }

    @Override // defpackage.gq
    public int p() {
        return this.p;
    }

    public void u(long[][] jArr) {
        ((c) this.g).a(jArr);
    }
}
