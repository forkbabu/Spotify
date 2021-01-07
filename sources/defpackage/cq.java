package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.f0;
import defpackage.aq;
import defpackage.gq;
import defpackage.iq;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cq  reason: default package */
public class cq extends eq {
    private static final int[] f = new int[0];
    private final gq.b d;
    private final AtomicReference<d> e;

    /* access modifiers changed from: private */
    /* renamed from: cq$b */
    public static final class b {
        public final int a;
        public final int b;
        public final String c;

        public b(int i, int i2, String str) {
            this.a = i;
            this.b = i2;
            this.c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a == bVar.a && this.b == bVar.b && TextUtils.equals(this.c, bVar.c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            String str = this.c;
            return i + (str != null ? str.hashCode() : 0);
        }
    }

    /* renamed from: cq$c */
    protected static final class c implements Comparable<c> {
        public final boolean a;
        private final String b;
        private final d c;
        private final boolean f;
        private final int n;
        private final int o;
        private final int p;
        private final boolean q;
        private final int r;
        private final int s;
        private final int t;

        /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0077: APUT  (r1v1 java.lang.String[]), (0 ??[int, short, byte, char]), (r7v6 java.lang.String) */
        public c(d0 d0Var, d dVar, int i) {
            String str;
            String[] strArr;
            this.c = dVar;
            this.b = cq.q(d0Var.J);
            int i2 = 0;
            this.f = cq.n(i, false);
            this.n = cq.l(d0Var, dVar.a, false);
            this.q = (d0Var.c & 1) != 0;
            int i3 = d0Var.E;
            this.r = i3;
            this.s = d0Var.F;
            int i4 = d0Var.n;
            this.t = i4;
            this.a = (i4 == -1 || i4 <= dVar.A) && (i3 == -1 || i3 <= dVar.z);
            int i5 = f0.a;
            Configuration configuration = Resources.getSystem().getConfiguration();
            int i6 = f0.a;
            if (i6 >= 24) {
                strArr = f0.M(configuration.getLocales().toLanguageTags(), ",");
            } else {
                String[] strArr2 = new String[1];
                Locale locale = configuration.locale;
                if (i6 >= 21) {
                    str = locale.toLanguageTag();
                } else {
                    str = locale.toString();
                }
                strArr2[0] = str;
                strArr = strArr2;
            }
            for (int i7 = 0; i7 < strArr.length; i7++) {
                strArr[i7] = f0.E(strArr[i7]);
            }
            int i8 = Integer.MAX_VALUE;
            int i9 = 0;
            while (true) {
                if (i9 >= strArr.length) {
                    break;
                }
                int l = cq.l(d0Var, strArr[i9], false);
                if (l > 0) {
                    i8 = i9;
                    i2 = l;
                    break;
                }
                i9++;
            }
            this.o = i8;
            this.p = i2;
        }

        /* renamed from: d */
        public int compareTo(c cVar) {
            int h;
            int k;
            boolean z = this.f;
            int i = 1;
            if (z != cVar.f) {
                return z ? 1 : -1;
            }
            int i2 = this.n;
            int i3 = cVar.n;
            if (i2 != i3) {
                return cq.h(i2, i3);
            }
            boolean z2 = this.a;
            if (z2 != cVar.a) {
                if (z2) {
                    return 1;
                }
                return -1;
            } else if (!this.c.F || (k = cq.k(this.t, cVar.t)) == 0) {
                boolean z3 = this.q;
                if (z3 == cVar.q) {
                    int i4 = this.o;
                    int i5 = cVar.o;
                    if (i4 != i5) {
                        return -cq.h(i4, i5);
                    }
                    int i6 = this.p;
                    int i7 = cVar.p;
                    if (i6 != i7) {
                        return cq.h(i6, i7);
                    }
                    if (!this.a || !this.f) {
                        i = -1;
                    }
                    int i8 = this.r;
                    int i9 = cVar.r;
                    if (i8 != i9) {
                        h = cq.h(i8, i9);
                    } else {
                        int i10 = this.s;
                        int i11 = cVar.s;
                        if (i10 != i11) {
                            h = cq.h(i10, i11);
                        } else if (!f0.a(this.b, cVar.b)) {
                            return 0;
                        } else {
                            h = cq.h(this.t, cVar.t);
                        }
                    }
                    return i * h;
                } else if (z3) {
                    return 1;
                } else {
                    return -1;
                }
            } else if (k > 0) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    /* renamed from: cq$f */
    public static final class f implements Parcelable {
        public static final Parcelable.Creator<f> CREATOR = new a();
        public final int a;
        public final int[] b;
        public final int c;
        public final int f;
        public final int n;

        /* renamed from: cq$f$a */
        static class a implements Parcelable.Creator<f> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public f[] newArray(int i) {
                return new f[i];
            }
        }

        f(Parcel parcel) {
            this.a = parcel.readInt();
            int readByte = parcel.readByte();
            this.c = readByte;
            int[] iArr = new int[readByte];
            this.b = iArr;
            parcel.readIntArray(iArr);
            this.f = parcel.readInt();
            this.n = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            if (this.a == fVar.a && Arrays.equals(this.b, fVar.b) && this.f == fVar.f && this.n == fVar.n) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Object
        public int hashCode() {
            return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.f) * 31) + this.n;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b.length);
            parcel.writeIntArray(this.b);
            parcel.writeInt(this.f);
            parcel.writeInt(this.n);
        }
    }

    /* renamed from: cq$g */
    protected static final class g implements Comparable<g> {
        public final boolean a;
        private final boolean b;
        private final boolean c;
        private final boolean f;
        private final int n;
        private final int o;
        private final int p;
        private final boolean q;

        public g(d0 d0Var, d dVar, int i, String str) {
            boolean z = false;
            this.b = cq.n(i, false);
            int i2 = d0Var.c & (dVar.n ^ -1);
            boolean z2 = (i2 & 1) != 0;
            this.c = z2;
            boolean z3 = (i2 & 2) != 0;
            int l = cq.l(d0Var, dVar.b, dVar.f);
            this.n = l;
            int bitCount = Integer.bitCount(d0Var.f & dVar.c);
            this.o = bitCount;
            this.q = (d0Var.f & 1088) != 0;
            this.f = (l > 0 && !z3) || (l == 0 && z3);
            int l2 = cq.l(d0Var, str, cq.q(str) == null);
            this.p = l2;
            if (l > 0 || ((dVar.b == null && bitCount > 0) || z2 || (z3 && l2 > 0))) {
                z = true;
            }
            this.a = z;
        }

        /* renamed from: d */
        public int compareTo(g gVar) {
            boolean z;
            boolean z2 = this.b;
            if (z2 != gVar.b) {
                return z2 ? 1 : -1;
            }
            int i = this.n;
            int i2 = gVar.n;
            if (i != i2) {
                return cq.h(i, i2);
            }
            int i3 = this.o;
            int i4 = gVar.o;
            if (i3 != i4) {
                return cq.h(i3, i4);
            }
            boolean z3 = this.c;
            if (z3 == gVar.c) {
                boolean z4 = this.f;
                if (z4 == gVar.f) {
                    int i5 = this.p;
                    int i6 = gVar.p;
                    if (i5 != i6) {
                        return cq.h(i5, i6);
                    }
                    if (i3 != 0 || (z = this.q) == gVar.q) {
                        return 0;
                    }
                    if (z) {
                        return -1;
                    }
                    return 1;
                } else if (z4) {
                    return 1;
                } else {
                    return -1;
                }
            } else if (z3) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    public cq(Context context) {
        aq.d dVar = new aq.d();
        d dVar2 = d.L;
        d b2 = new e(context).b();
        this.d = dVar;
        this.e = new AtomicReference<>(b2);
    }

    static int h(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    /* access modifiers changed from: private */
    public static int k(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    protected static int l(d0 d0Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(d0Var.J)) {
            return 4;
        }
        String q = q(str);
        String q2 = q(d0Var.J);
        if (q2 == null || q == null) {
            if (!z || q2 != null) {
                return 0;
            }
            return 1;
        } else if (q2.startsWith(q) || q.startsWith(q2)) {
            return 3;
        } else {
            int i = f0.a;
            if (q2.split("-", 2)[0].equals(q.split("-", 2)[0])) {
                return 2;
            }
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<java.lang.Integer> m(com.google.android.exoplayer2.source.e0 r12, int r13, int r14, boolean r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.a
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L_0x0009:
            int r3 = r12.a
            if (r2 >= r3) goto L_0x0017
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0017:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r2) goto L_0x00a6
            if (r14 != r2) goto L_0x0020
            goto L_0x00a6
        L_0x0020:
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x0024:
            int r5 = r12.a
            r6 = 1
            if (r3 >= r5) goto L_0x0080
            com.google.android.exoplayer2.d0 r5 = r12.a(r3)
            int r7 = r5.w
            if (r7 <= 0) goto L_0x007d
            int r8 = r5.x
            if (r8 <= 0) goto L_0x007d
            if (r15 == 0) goto L_0x0045
            if (r7 <= r8) goto L_0x003b
            r9 = 1
            goto L_0x003c
        L_0x003b:
            r9 = 0
        L_0x003c:
            if (r13 <= r14) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r6 = 0
        L_0x0040:
            if (r9 == r6) goto L_0x0045
            r6 = r13
            r9 = r14
            goto L_0x0047
        L_0x0045:
            r9 = r13
            r6 = r14
        L_0x0047:
            int r10 = r7 * r6
            int r11 = r8 * r9
            if (r10 < r11) goto L_0x0057
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = com.google.android.exoplayer2.util.f0.e(r11, r7)
            r6.<init>(r9, r7)
            goto L_0x0061
        L_0x0057:
            android.graphics.Point r7 = new android.graphics.Point
            int r8 = com.google.android.exoplayer2.util.f0.e(r10, r8)
            r7.<init>(r8, r6)
            r6 = r7
        L_0x0061:
            int r7 = r5.w
            int r5 = r5.x
            int r8 = r7 * r5
            int r9 = r6.x
            float r9 = (float) r9
            r10 = 1065017672(0x3f7ae148, float:0.98)
            float r9 = r9 * r10
            int r9 = (int) r9
            if (r7 < r9) goto L_0x007d
            int r6 = r6.y
            float r6 = (float) r6
            float r6 = r6 * r10
            int r6 = (int) r6
            if (r5 < r6) goto L_0x007d
            if (r8 >= r4) goto L_0x007d
            r4 = r8
        L_0x007d:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x0080:
            if (r4 == r2) goto L_0x00a6
            int r13 = r0.size()
            int r13 = r13 - r6
        L_0x0087:
            if (r13 < 0) goto L_0x00a6
            java.lang.Object r14 = r0.get(r13)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            com.google.android.exoplayer2.d0 r14 = r12.a(r14)
            int r14 = r14.B()
            r15 = -1
            if (r14 == r15) goto L_0x00a0
            if (r14 <= r4) goto L_0x00a3
        L_0x00a0:
            r0.remove(r13)
        L_0x00a3:
            int r13 = r13 + -1
            goto L_0x0087
        L_0x00a6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq.m(com.google.android.exoplayer2.source.e0, int, int, boolean):java.util.List");
    }

    protected static boolean n(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    private static boolean o(d0 d0Var, int i, b bVar, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        String str;
        int i4;
        if (!n(i, false)) {
            return false;
        }
        int i5 = d0Var.n;
        if (i5 != -1 && i5 > i2) {
            return false;
        }
        if (!z3 && ((i4 = d0Var.E) == -1 || i4 != bVar.a)) {
            return false;
        }
        if (!z && ((str = d0Var.r) == null || !TextUtils.equals(str, bVar.c))) {
            return false;
        }
        if (z2 || ((i3 = d0Var.F) != -1 && i3 == bVar.b)) {
            return true;
        }
        return false;
    }

    private static boolean p(d0 d0Var, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        if (!n(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !f0.a(d0Var.r, str)) {
            return false;
        }
        int i7 = d0Var.w;
        if (i7 != -1 && i7 > i3) {
            return false;
        }
        int i8 = d0Var.x;
        if (i8 != -1 && i8 > i4) {
            return false;
        }
        float f2 = d0Var.y;
        if (f2 != -1.0f && f2 > ((float) i5)) {
            return false;
        }
        int i9 = d0Var.n;
        if (i9 == -1 || i9 <= i6) {
            return true;
        }
        return false;
    }

    protected static String q(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0216, code lost:
        if (r0 < 0) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x063d, code lost:
        if (r9 == 2) goto L_0x0644;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0404  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x014b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0151 A[LOOP:1: B:21:0x004d->B:60:0x0151, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ff  */
    @Override // defpackage.eq
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<com.google.android.exoplayer2.r0[], defpackage.gq[]> g(defpackage.eq.a r40, int[][][] r41, int[] r42) {
        /*
        // Method dump skipped, instructions count: 1698
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq.g(eq$a, int[][][], int[]):android.util.Pair");
    }

    public e j() {
        return this.e.get().c();
    }

    public void r(d dVar) {
        dVar.getClass();
        if (!this.e.getAndSet(dVar).equals(dVar)) {
            c();
        }
    }

    public cq(d dVar, gq.b bVar) {
        this.d = bVar;
        this.e = new AtomicReference<>(dVar);
    }

    /* renamed from: cq$e */
    public static final class e extends iq.b {
        private final SparseBooleanArray A;
        private int f;
        private int g;
        private int h;
        private int i;
        private boolean j;
        private boolean k;
        private boolean l;
        private int m;
        private int n;
        private boolean o;
        private int p;
        private int q;
        private boolean r;
        private boolean s;
        private boolean t;
        private boolean u;
        private boolean v;
        private boolean w;
        private boolean x;
        private int y;
        private final SparseArray<Map<com.google.android.exoplayer2.source.f0, f>> z;

        public e(Context context) {
            a(context);
            d();
            this.z = new SparseArray<>();
            this.A = new SparseBooleanArray();
            Point u2 = f0.u(context);
            int i2 = u2.x;
            int i3 = u2.y;
            this.m = i2;
            this.n = i3;
            this.o = true;
        }

        private void d() {
            this.f = Integer.MAX_VALUE;
            this.g = Integer.MAX_VALUE;
            this.h = Integer.MAX_VALUE;
            this.i = Integer.MAX_VALUE;
            this.j = true;
            this.k = false;
            this.l = true;
            this.m = Integer.MAX_VALUE;
            this.n = Integer.MAX_VALUE;
            this.o = true;
            this.p = Integer.MAX_VALUE;
            this.q = Integer.MAX_VALUE;
            this.r = true;
            this.s = false;
            this.t = false;
            this.u = false;
            this.v = false;
            this.w = false;
            this.x = true;
            this.y = 0;
        }

        @Override // defpackage.iq.b
        public iq.b a(Context context) {
            super.a(context);
            return this;
        }

        public d b() {
            return new d(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.a, this.p, this.q, this.r, this.s, this.t, this.u, this.b, this.c, this.d, this.e, this.v, this.w, this.x, this.y, this.z, this.A);
        }

        public e c(boolean z2) {
            this.w = z2;
            return this;
        }

        public e e(int i2) {
            this.i = i2;
            return this;
        }

        public e f(String str) {
            this.b = str;
            return this;
        }

        public final e g(int i2, boolean z2) {
            if (this.A.get(i2) == z2) {
                return this;
            }
            if (z2) {
                this.A.put(i2, true);
            } else {
                this.A.delete(i2);
            }
            return this;
        }

        public e h(boolean z2) {
            this.d = z2;
            return this;
        }

        @Deprecated
        public e() {
            d();
            this.z = new SparseArray<>();
            this.A = new SparseBooleanArray();
        }

        e(d dVar, a aVar) {
            super(dVar);
            this.f = dVar.p;
            this.g = dVar.q;
            this.h = dVar.r;
            this.i = dVar.s;
            this.j = dVar.t;
            this.k = dVar.u;
            this.l = dVar.v;
            this.m = dVar.w;
            this.n = dVar.x;
            this.o = dVar.y;
            this.p = dVar.z;
            this.q = dVar.A;
            this.r = dVar.B;
            this.s = dVar.C;
            this.t = dVar.D;
            this.u = dVar.E;
            this.v = dVar.F;
            this.w = dVar.G;
            this.x = dVar.H;
            this.y = dVar.I;
            SparseArray sparseArray = dVar.J;
            SparseArray<Map<com.google.android.exoplayer2.source.f0, f>> sparseArray2 = new SparseArray<>();
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                sparseArray2.put(sparseArray.keyAt(i2), new HashMap((Map) sparseArray.valueAt(i2)));
            }
            this.z = sparseArray2;
            this.A = dVar.K.clone();
        }
    }

    /* renamed from: cq$d */
    public static final class d extends iq {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public static final d L = new e().b();
        public final int A;
        public final boolean B;
        public final boolean C;
        public final boolean D;
        public final boolean E;
        public final boolean F;
        public final boolean G;
        public final boolean H;
        public final int I;
        private final SparseArray<Map<com.google.android.exoplayer2.source.f0, f>> J;
        private final SparseBooleanArray K;
        public final int p;
        public final int q;
        public final int r;
        public final int s;
        public final boolean t;
        public final boolean u;
        public final boolean v;
        public final int w;
        public final int x;
        public final boolean y;
        public final int z;

        /* renamed from: cq$d$a */
        static class a implements Parcelable.Creator<d> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        d(int i, int i2, int i3, int i4, boolean z2, boolean z3, boolean z4, int i5, int i6, boolean z5, String str, int i7, int i8, boolean z6, boolean z7, boolean z8, boolean z9, String str2, int i9, boolean z10, int i10, boolean z11, boolean z12, boolean z13, int i11, SparseArray<Map<com.google.android.exoplayer2.source.f0, f>> sparseArray, SparseBooleanArray sparseBooleanArray) {
            super(str, str2, i9, z10, i10);
            this.p = i;
            this.q = i2;
            this.r = i3;
            this.s = i4;
            this.t = z2;
            this.u = z3;
            this.v = z4;
            this.w = i5;
            this.x = i6;
            this.y = z5;
            this.z = i7;
            this.A = i8;
            this.B = z6;
            this.C = z7;
            this.D = z8;
            this.E = z9;
            this.F = z11;
            this.G = z12;
            this.H = z13;
            this.I = i11;
            this.J = sparseArray;
            this.K = sparseBooleanArray;
        }

        public e c() {
            return new e(this, null);
        }

        @Override // defpackage.iq, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean e(int i) {
            return this.K.get(i);
        }

        @Override // defpackage.iq, java.lang.Object
        public boolean equals(Object obj) {
            boolean z2;
            boolean z3;
            boolean z4;
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (super.equals(obj) && this.p == dVar.p && this.q == dVar.q && this.r == dVar.r && this.s == dVar.s && this.t == dVar.t && this.u == dVar.u && this.v == dVar.v && this.y == dVar.y && this.w == dVar.w && this.x == dVar.x && this.z == dVar.z && this.A == dVar.A && this.B == dVar.B && this.C == dVar.C && this.D == dVar.D && this.E == dVar.E && this.F == dVar.F && this.G == dVar.G && this.H == dVar.H && this.I == dVar.I) {
                SparseBooleanArray sparseBooleanArray = this.K;
                SparseBooleanArray sparseBooleanArray2 = dVar.K;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            z2 = true;
                            break;
                        } else if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                z2 = false;
                if (z2) {
                    SparseArray<Map<com.google.android.exoplayer2.source.f0, f>> sparseArray = this.J;
                    SparseArray<Map<com.google.android.exoplayer2.source.f0, f>> sparseArray2 = dVar.J;
                    int size2 = sparseArray.size();
                    if (sparseArray2.size() == size2) {
                        int i2 = 0;
                        while (true) {
                            if (i2 < size2) {
                                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                if (indexOfKey < 0) {
                                    break;
                                }
                                Map<com.google.android.exoplayer2.source.f0, f> valueAt = sparseArray.valueAt(i2);
                                Map<com.google.android.exoplayer2.source.f0, f> valueAt2 = sparseArray2.valueAt(indexOfKey);
                                if (valueAt2.size() == valueAt.size()) {
                                    Iterator<Map.Entry<com.google.android.exoplayer2.source.f0, f>> it = valueAt.entrySet().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z4 = true;
                                            break;
                                        }
                                        Map.Entry<com.google.android.exoplayer2.source.f0, f> next = it.next();
                                        com.google.android.exoplayer2.source.f0 key = next.getKey();
                                        if (valueAt2.containsKey(key)) {
                                            if (!f0.a(next.getValue(), valueAt2.get(key))) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                z4 = false;
                                if (!z4) {
                                    break;
                                }
                                i2++;
                            } else {
                                z3 = true;
                                break;
                            }
                        }
                    }
                    z3 = false;
                    if (z3) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final f f(int i, com.google.android.exoplayer2.source.f0 f0Var) {
            Map<com.google.android.exoplayer2.source.f0, f> map = this.J.get(i);
            if (map != null) {
                return map.get(f0Var);
            }
            return null;
        }

        public final boolean g(int i, com.google.android.exoplayer2.source.f0 f0Var) {
            Map<com.google.android.exoplayer2.source.f0, f> map = this.J.get(i);
            return map != null && map.containsKey(f0Var);
        }

        @Override // defpackage.iq, java.lang.Object
        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.p) * 31) + this.q) * 31) + this.r) * 31) + this.s) * 31) + (this.t ? 1 : 0)) * 31) + (this.u ? 1 : 0)) * 31) + (this.v ? 1 : 0)) * 31) + (this.y ? 1 : 0)) * 31) + this.w) * 31) + this.x) * 31) + this.z) * 31) + this.A) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + this.I;
        }

        @Override // defpackage.iq, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.p);
            parcel.writeInt(this.q);
            parcel.writeInt(this.r);
            parcel.writeInt(this.s);
            parcel.writeInt(this.t ? 1 : 0);
            parcel.writeInt(this.u ? 1 : 0);
            parcel.writeInt(this.v ? 1 : 0);
            parcel.writeInt(this.w);
            parcel.writeInt(this.x);
            parcel.writeInt(this.y ? 1 : 0);
            parcel.writeInt(this.z);
            parcel.writeInt(this.A);
            parcel.writeInt(this.B ? 1 : 0);
            parcel.writeInt(this.C ? 1 : 0);
            parcel.writeInt(this.D ? 1 : 0);
            parcel.writeInt(this.E ? 1 : 0);
            parcel.writeInt(this.F ? 1 : 0);
            parcel.writeInt(this.G ? 1 : 0);
            parcel.writeInt(this.H ? 1 : 0);
            parcel.writeInt(this.I);
            SparseArray<Map<com.google.android.exoplayer2.source.f0, f>> sparseArray = this.J;
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = sparseArray.keyAt(i2);
                Map<com.google.android.exoplayer2.source.f0, f> valueAt = sparseArray.valueAt(i2);
                int size2 = valueAt.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Map.Entry<com.google.android.exoplayer2.source.f0, f> entry : valueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
            parcel.writeSparseBooleanArray(this.K);
        }

        d(Parcel parcel) {
            super(parcel);
            this.p = parcel.readInt();
            this.q = parcel.readInt();
            this.r = parcel.readInt();
            this.s = parcel.readInt();
            boolean z2 = true;
            this.t = parcel.readInt() != 0;
            this.u = parcel.readInt() != 0;
            this.v = parcel.readInt() != 0;
            this.w = parcel.readInt();
            this.x = parcel.readInt();
            this.y = parcel.readInt() != 0;
            this.z = parcel.readInt();
            this.A = parcel.readInt();
            this.B = parcel.readInt() != 0;
            this.C = parcel.readInt() != 0;
            this.D = parcel.readInt() != 0;
            this.E = parcel.readInt() != 0;
            this.F = parcel.readInt() != 0;
            this.G = parcel.readInt() != 0;
            this.H = parcel.readInt() == 0 ? false : z2;
            this.I = parcel.readInt();
            int readInt = parcel.readInt();
            SparseArray<Map<com.google.android.exoplayer2.source.f0, f>> sparseArray = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i2 = 0; i2 < readInt3; i2++) {
                    Parcelable readParcelable = parcel.readParcelable(com.google.android.exoplayer2.source.f0.class.getClassLoader());
                    readParcelable.getClass();
                    hashMap.put((com.google.android.exoplayer2.source.f0) readParcelable, (f) parcel.readParcelable(f.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            this.J = sparseArray;
            this.K = parcel.readSparseBooleanArray();
        }
    }
}
