package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.o5;
import com.google.android.gms.internal.cast.r5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class n5<T extends o5<T>> {
    private static final n5 d = new n5(true);
    final r7<T, Object> a = new q7(16);
    private boolean b;
    private boolean c;

    private n5(boolean z) {
        int i = r7.p;
        o();
        o();
    }

    static int d(zzph zzph, int i, Object obj) {
        int m = zzlo.m(i);
        if (zzph == zzph.GROUP) {
            z6 z6Var = (z6) obj;
            if (z6Var instanceof r4) {
                r4 r4Var = (r4) z6Var;
            }
            m <<= 1;
        }
        return m + j(zzph, obj);
    }

    private final Object e(T t) {
        Object obj = this.a.get(t);
        if (!(obj instanceof b6)) {
            return obj;
        }
        b6 b6Var = (b6) obj;
        int i = b6.c;
        throw new NoSuchMethodError();
    }

    private final void g(T t, Object obj) {
        if (!t.p0()) {
            h(t.Y(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                h(t.Y(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof b6) {
            this.c = true;
        }
        this.a.put(t, obj);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if ((r3 instanceof com.google.android.gms.internal.cast.u5) == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if ((r3 instanceof com.google.android.gms.internal.cast.b6) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void h(com.google.android.gms.internal.cast.zzph r2, java.lang.Object r3) {
        /*
            java.nio.charset.Charset r0 = com.google.android.gms.internal.cast.v5.a
            r3.getClass()
            int[] r0 = com.google.android.gms.internal.cast.m5.a
            com.google.android.gms.internal.cast.zzpo r2 = r2.d()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0042;
                case 2: goto L_0x003f;
                case 3: goto L_0x003c;
                case 4: goto L_0x0039;
                case 5: goto L_0x0036;
                case 6: goto L_0x0033;
                case 7: goto L_0x002a;
                case 8: goto L_0x0021;
                case 9: goto L_0x0018;
                default: goto L_0x0016;
            }
        L_0x0016:
            r0 = 0
            goto L_0x0044
        L_0x0018:
            boolean r2 = r3 instanceof com.google.android.gms.internal.cast.z6
            if (r2 != 0) goto L_0x0044
            boolean r2 = r3 instanceof com.google.android.gms.internal.cast.b6
            if (r2 == 0) goto L_0x0016
            goto L_0x0044
        L_0x0021:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0044
            boolean r2 = r3 instanceof com.google.android.gms.internal.cast.u5
            if (r2 == 0) goto L_0x0016
            goto L_0x0044
        L_0x002a:
            boolean r2 = r3 instanceof com.google.android.gms.internal.cast.zzlb
            if (r2 != 0) goto L_0x0044
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0016
            goto L_0x0044
        L_0x0033:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0044
        L_0x0036:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0044
        L_0x0039:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0044
        L_0x003c:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0044
        L_0x003f:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0044
        L_0x0042:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0044:
            if (r0 == 0) goto L_0x0047
            return
        L_0x0047:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            goto L_0x0050
        L_0x004f:
            throw r2
        L_0x0050:
            goto L_0x004f
            switch-data {1->0x0042, 2->0x003f, 3->0x003c, 4->0x0039, 5->0x0036, 6->0x0033, 7->0x002a, 8->0x0021, 9->0x0018, }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.n5.h(com.google.android.gms.internal.cast.zzph, java.lang.Object):void");
    }

    public static int i(o5<?> o5Var, Object obj) {
        zzph Y = o5Var.Y();
        int j = o5Var.j();
        if (!o5Var.p0()) {
            return d(Y, j, obj);
        }
        int i = 0;
        if (o5Var.y0()) {
            for (Object obj2 : (List) obj) {
                i += j(Y, obj2);
            }
            return zzlo.m(j) + i + zzlo.p(i);
        }
        for (Object obj3 : (List) obj) {
            i += d(Y, j, obj3);
        }
        return i;
    }

    private static int j(zzph zzph, Object obj) {
        int e;
        int p;
        switch (m5.b[zzph.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                int i = zzlo.d;
                return 8;
            case 2:
                ((Float) obj).floatValue();
                int i2 = zzlo.d;
                return 4;
            case 3:
                return zzlo.Z(((Long) obj).longValue());
            case 4:
                return zzlo.Z(((Long) obj).longValue());
            case 5:
                return zzlo.o(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                int i3 = zzlo.d;
                return 8;
            case 7:
                ((Integer) obj).intValue();
                int i4 = zzlo.d;
                return 4;
            case 8:
                ((Boolean) obj).booleanValue();
                int i5 = zzlo.d;
                return 1;
            case 9:
                int i6 = zzlo.d;
                return ((z6) obj).e();
            case 10:
                if (!(obj instanceof b6)) {
                    int i7 = zzlo.d;
                    e = ((z6) obj).e();
                    p = zzlo.p(e);
                    break;
                } else {
                    int i8 = zzlo.d;
                    e = ((b6) obj).d();
                    p = zzlo.p(e);
                    break;
                }
            case 11:
                if (obj instanceof zzlb) {
                    return zzlo.s((zzlb) obj);
                }
                return zzlo.n((String) obj);
            case 12:
                if (!(obj instanceof zzlb)) {
                    int i9 = zzlo.d;
                    e = ((byte[]) obj).length;
                    p = zzlo.p(e);
                    break;
                } else {
                    return zzlo.s((zzlb) obj);
                }
            case 13:
                return zzlo.p(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                int i10 = zzlo.d;
                return 4;
            case 15:
                ((Long) obj).longValue();
                int i11 = zzlo.d;
                return 8;
            case 16:
                return zzlo.q(((Integer) obj).intValue());
            case 17:
                return zzlo.a0(((Long) obj).longValue());
            case 18:
                if (obj instanceof u5) {
                    return zzlo.o(((u5) obj).j());
                }
                return zzlo.o(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return p + e;
    }

    private static <T extends o5<T>> boolean k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.e0() == zzpo.MESSAGE) {
            if (key.p0()) {
                for (z6 z6Var : (List) entry.getValue()) {
                    if (!z6Var.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof z6) {
                    if (!((z6) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof b6) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private final void l(Map.Entry<T, Object> entry) {
        z6 z6Var;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof b6) {
            b6 b6Var = (b6) value;
            int i = b6.c;
            throw new NoSuchMethodError();
        } else if (key.p0()) {
            Object e = e(key);
            if (e == null) {
                e = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) e).add(n(obj));
            }
            this.a.put(key, e);
        } else if (key.e0() == zzpo.MESSAGE) {
            Object e2 = e(key);
            if (e2 == null) {
                this.a.put(key, n(value));
                return;
            }
            if (e2 instanceof e7) {
                z6Var = key.y((e7) e2, (e7) value);
            } else {
                z6Var = ((r5.b) key.B0(((z6) e2).b(), (z6) value)).n();
            }
            this.a.put(key, z6Var);
        } else {
            this.a.put(key, n(value));
        }
    }

    private static int m(Map.Entry<T, Object> entry) {
        int R;
        int p;
        int e;
        int p2;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.e0() != zzpo.MESSAGE || key.p0() || key.y0()) {
            return i(key, value);
        }
        if (value instanceof b6) {
            R = zzlo.R(2, entry.getKey().j()) + (zzlo.p(8) << 1);
            p = zzlo.p(24);
            e = ((b6) value).d();
            p2 = zzlo.p(e);
        } else {
            R = zzlo.R(2, entry.getKey().j()) + (zzlo.p(8) << 1);
            p = zzlo.p(24);
            e = ((z6) value).e();
            p2 = zzlo.p(e);
        }
        return p2 + e + p + R;
    }

    private static Object n(Object obj) {
        if (obj instanceof e7) {
            return ((e7) obj).Q1();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static <T extends o5<T>> n5<T> p() {
        return d;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        for (int i = 0; i < this.a.l(); i++) {
            if (!k(this.a.h(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.a.m()) {
            if (!k(entry)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<T, Object>> c() {
        if (this.c) {
            return new f6(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public final /* synthetic */ Object clone() {
        n5 n5Var = new n5();
        for (int i = 0; i < this.a.l(); i++) {
            Map.Entry<T, Object> h = this.a.h(i);
            n5Var.g(h.getKey(), h.getValue());
        }
        for (Map.Entry<T, Object> entry : this.a.m()) {
            n5Var.g(entry.getKey(), entry.getValue());
        }
        n5Var.c = this.c;
        return n5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5)) {
            return false;
        }
        return this.a.equals(((n5) obj).a);
    }

    public final void f(n5<T> n5Var) {
        for (int i = 0; i < n5Var.a.l(); i++) {
            l(n5Var.a.h(i));
        }
        for (Map.Entry<T, Object> entry : n5Var.a.m()) {
            l(entry);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void o() {
        if (!this.b) {
            this.a.k();
            this.b = true;
        }
    }

    public final int q() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.l(); i2++) {
            i += m(this.a.h(i2));
        }
        for (Map.Entry<T, Object> entry : this.a.m()) {
            i += m(entry);
        }
        return i;
    }

    private n5() {
        int i = r7.p;
    }
}
