package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.f4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class a4<T extends b4<T>> {
    private static final a4 d = new a4(true);
    final c6<T, Object> a = new b6(16);
    private boolean b;
    private boolean c;

    private a4(boolean z) {
        int i = c6.p;
        j();
        j();
    }

    public static int a(b4<?> b4Var, Object obj) {
        zzle b2 = b4Var.b();
        int a2 = b4Var.a();
        if (!b4Var.e()) {
            return b(b2, a2, obj);
        }
        int i = 0;
        if (b4Var.f()) {
            for (Object obj2 : (List) obj) {
                i += i(b2, obj2);
            }
            return zzhf.K(a2) + i + zzhf.S(i);
        }
        for (Object obj3 : (List) obj) {
            i += b(b2, a2, obj3);
        }
        return i;
    }

    static int b(zzle zzle, int i, Object obj) {
        int K = zzhf.K(i);
        if (zzle == zzle.GROUP) {
            l5 l5Var = (l5) obj;
            if (l5Var instanceof a3) {
                a3 a3Var = (a3) l5Var;
            }
            K <<= 1;
        }
        return K + i(zzle, obj);
    }

    public static <T extends b4<T>> a4<T> c() {
        return d;
    }

    private final Object d(T t) {
        Object obj = this.a.get(t);
        if (!(obj instanceof o4)) {
            return obj;
        }
        o4 o4Var = (o4) obj;
        int i = o4.c;
        throw new NoSuchMethodError();
    }

    private static Object e(Object obj) {
        if (obj instanceof o5) {
            return ((o5) obj).a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.j4) == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.o4) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void g(com.google.android.gms.internal.measurement.zzle r2, java.lang.Object r3) {
        /*
            java.nio.charset.Charset r0 = com.google.android.gms.internal.measurement.h4.a
            r3.getClass()
            int[] r0 = com.google.android.gms.internal.measurement.z3.a
            com.google.android.gms.internal.measurement.zzlh r2 = r2.d()
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
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.l5
            if (r2 != 0) goto L_0x0044
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.o4
            if (r2 == 0) goto L_0x0016
            goto L_0x0044
        L_0x0021:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0044
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.j4
            if (r2 == 0) goto L_0x0016
            goto L_0x0044
        L_0x002a:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzgm
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.a4.g(com.google.android.gms.internal.measurement.zzle, java.lang.Object):void");
    }

    private static <T extends b4<T>> boolean h(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.c() == zzlh.MESSAGE) {
            if (key.e()) {
                for (l5 l5Var : (List) entry.getValue()) {
                    if (!l5Var.d()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof l5) {
                    if (!((l5) value).d()) {
                        return false;
                    }
                } else if (value instanceof o4) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private static int i(zzle zzle, Object obj) {
        int c2;
        int S;
        switch (z3.b[zzle.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                int i = zzhf.d;
                return 8;
            case 2:
                ((Float) obj).floatValue();
                int i2 = zzhf.d;
                return 4;
            case 3:
                return zzhf.M(((Long) obj).longValue());
            case 4:
                return zzhf.M(((Long) obj).longValue());
            case 5:
                return zzhf.O(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                int i3 = zzhf.d;
                return 8;
            case 7:
                ((Integer) obj).intValue();
                int i4 = zzhf.d;
                return 4;
            case 8:
                ((Boolean) obj).booleanValue();
                int i5 = zzhf.d;
                return 1;
            case 9:
                int i6 = zzhf.d;
                return ((l5) obj).c();
            case 10:
                if (!(obj instanceof o4)) {
                    int i7 = zzhf.d;
                    c2 = ((l5) obj).c();
                    S = zzhf.S(c2);
                    break;
                } else {
                    int i8 = zzhf.d;
                    c2 = ((o4) obj).b();
                    S = zzhf.S(c2);
                    break;
                }
            case 11:
                if (obj instanceof zzgm) {
                    return zzhf.r((zzgm) obj);
                }
                return zzhf.s((String) obj);
            case 12:
                if (!(obj instanceof zzgm)) {
                    int i9 = zzhf.d;
                    c2 = ((byte[]) obj).length;
                    S = zzhf.S(c2);
                    break;
                } else {
                    return zzhf.r((zzgm) obj);
                }
            case 13:
                return zzhf.S(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                int i10 = zzhf.d;
                return 4;
            case 15:
                ((Long) obj).longValue();
                int i11 = zzhf.d;
                return 8;
            case 16:
                return zzhf.V(((Integer) obj).intValue());
            case 17:
                return zzhf.R(((Long) obj).longValue());
            case 18:
                if (obj instanceof j4) {
                    return zzhf.O(((j4) obj).a());
                }
                return zzhf.O(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return S + c2;
    }

    private final void k(T t, Object obj) {
        if (!t.e()) {
            g(t.b(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                g(t.b(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof o4) {
            this.c = true;
        }
        this.a.put(t, obj);
    }

    private final void l(Map.Entry<T, Object> entry) {
        l5 l5Var;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof o4) {
            o4 o4Var = (o4) value;
            int i = o4.c;
            throw new NoSuchMethodError();
        } else if (key.e()) {
            Object d2 = d(key);
            if (d2 == null) {
                d2 = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) d2).add(e(obj));
            }
            this.a.put(key, d2);
        } else if (key.c() == zzlh.MESSAGE) {
            Object d3 = d(key);
            if (d3 == null) {
                this.a.put(key, e(value));
                return;
            }
            if (d3 instanceof o5) {
                l5Var = key.K((o5) d3, (o5) value);
            } else {
                l5Var = ((f4.b) key.i0(((l5) d3).e(), (l5) value)).s();
            }
            this.a.put(key, l5Var);
        } else {
            this.a.put(key, e(value));
        }
    }

    private static int m(Map.Entry<T, Object> entry) {
        int T;
        int S;
        int c2;
        int S2;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.c() != zzlh.MESSAGE || key.e() || key.f()) {
            return a(key, value);
        }
        if (value instanceof o4) {
            T = zzhf.T(2, entry.getKey().a()) + (zzhf.S(8) << 1);
            S = zzhf.S(24);
            c2 = ((o4) value).b();
            S2 = zzhf.S(c2);
        } else {
            T = zzhf.T(2, entry.getKey().a()) + (zzhf.S(8) << 1);
            S = zzhf.S(24);
            c2 = ((l5) value).c();
            S2 = zzhf.S(c2);
        }
        return S2 + c2 + S + T;
    }

    public final /* synthetic */ Object clone() {
        a4 a4Var = new a4();
        for (int i = 0; i < this.a.j(); i++) {
            Map.Entry<T, Object> h = this.a.h(i);
            a4Var.k(h.getKey(), h.getValue());
        }
        for (Map.Entry<T, Object> entry : this.a.m()) {
            a4Var.k(entry.getKey(), entry.getValue());
        }
        a4Var.c = this.c;
        return a4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4)) {
            return false;
        }
        return this.a.equals(((a4) obj).a);
    }

    public final void f(a4<T> a4Var) {
        for (int i = 0; i < a4Var.a.j(); i++) {
            l(a4Var.a.h(i));
        }
        for (Map.Entry<T, Object> entry : a4Var.a.m()) {
            l(entry);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void j() {
        if (!this.b) {
            this.a.e();
            this.b = true;
        }
    }

    public final boolean n() {
        return this.b;
    }

    public final Iterator<Map.Entry<T, Object>> o() {
        if (this.c) {
            return new s4(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public final boolean p() {
        for (int i = 0; i < this.a.j(); i++) {
            if (!h(this.a.h(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.a.m()) {
            if (!h(entry)) {
                return false;
            }
        }
        return true;
    }

    public final int q() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.j(); i2++) {
            i += m(this.a.h(i2));
        }
        for (Map.Entry<T, Object> entry : this.a.m()) {
            i += m(entry);
        }
        return i;
    }

    private a4() {
        int i = c6.p;
    }
}
