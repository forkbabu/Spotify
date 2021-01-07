package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.internal.recaptcha.e0;
import com.google.android.gms.internal.recaptcha.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class c0<T extends e0<T>> {
    private static final c0 d = new c0(true);
    final u1<T, Object> a = new t1(16);
    private boolean b;
    private boolean c;

    private c0(boolean z) {
        int i = u1.p;
        g();
        g();
    }

    public static <T extends e0<T>> c0<T> a() {
        return d;
    }

    private final Object b(T t) {
        Object obj = this.a.get(t);
        if (!(obj instanceof k0)) {
            return obj;
        }
        k0 k0Var = (k0) obj;
        int i = k0.b;
        throw new NoSuchMethodError();
    }

    private static Object c(Object obj) {
        if (obj instanceof k1) {
            return ((k1) obj).a();
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
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if ((r3 instanceof com.google.android.gms.internal.recaptcha.k0) == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if ((r3 instanceof java.lang.Integer) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void e(com.google.android.gms.internal.recaptcha.zzhk r2, java.lang.Object r3) {
        /*
            java.nio.charset.Charset r0 = com.google.android.gms.internal.recaptcha.i0.a
            r3.getClass()
            int[] r0 = com.google.android.gms.internal.recaptcha.f0.a
            com.google.android.gms.internal.recaptcha.zzhr r2 = r2.d()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x003e;
                case 2: goto L_0x003b;
                case 3: goto L_0x0038;
                case 4: goto L_0x0035;
                case 5: goto L_0x0032;
                case 6: goto L_0x002f;
                case 7: goto L_0x0026;
                case 8: goto L_0x0021;
                case 9: goto L_0x0018;
                default: goto L_0x0016;
            }
        L_0x0016:
            r0 = 0
            goto L_0x0040
        L_0x0018:
            boolean r2 = r3 instanceof com.google.android.gms.internal.recaptcha.f1
            if (r2 != 0) goto L_0x0040
            boolean r2 = r3 instanceof com.google.android.gms.internal.recaptcha.k0
            if (r2 == 0) goto L_0x0016
            goto L_0x0040
        L_0x0021:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0040
            goto L_0x0016
        L_0x0026:
            boolean r2 = r3 instanceof com.google.android.gms.internal.recaptcha.zzct
            if (r2 != 0) goto L_0x0040
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0016
            goto L_0x0040
        L_0x002f:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0040
        L_0x0032:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0040
        L_0x0035:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0040
        L_0x0038:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0040
        L_0x003b:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0040
        L_0x003e:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0040:
            if (r0 == 0) goto L_0x0043
            return
        L_0x0043:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            goto L_0x004c
        L_0x004b:
            throw r2
        L_0x004c:
            goto L_0x004b
            switch-data {1->0x003e, 2->0x003b, 3->0x0038, 4->0x0035, 5->0x0032, 6->0x002f, 7->0x0026, 8->0x0021, 9->0x0018, }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.recaptcha.c0.e(com.google.android.gms.internal.recaptcha.zzhk, java.lang.Object):void");
    }

    private static <T extends e0<T>> boolean f(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.c() == zzhr.MESSAGE) {
            if (key.e()) {
                for (f1 f1Var : (List) entry.getValue()) {
                    if (!f1Var.j()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof f1) {
                    if (!((f1) value).j()) {
                        return false;
                    }
                } else if (value instanceof k0) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private final void h(T t, Object obj) {
        if (!t.e()) {
            e(t.b(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                e(t.b(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof k0) {
            this.c = true;
        }
        this.a.put(t, obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v11, resolved type: com.google.android.gms.internal.recaptcha.g0 */
    /* JADX WARN: Multi-variable type inference failed */
    private final void i(Map.Entry<T, Object> entry) {
        k1 k1Var;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof k0) {
            k0 k0Var = (k0) value;
            int i = k0.b;
            throw new NoSuchMethodError();
        } else if (key.e()) {
            Object b2 = b(key);
            if (b2 == null) {
                b2 = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) b2).add(c(obj));
            }
            this.a.put(key, b2);
        } else if (key.c() == zzhr.MESSAGE) {
            Object b3 = b(key);
            if (b3 == null) {
                this.a.put(key, c(value));
                return;
            }
            if (b3 instanceof k1) {
                k1Var = key.R((k1) b3, (k1) value);
            } else {
                g0 g0Var = (g0) ((g0.b) key.E(((f1) b3).d(), (f1) value)).e();
                boolean j = g0Var.j();
                k1Var = g0Var;
                if (!j) {
                    throw new zzgv();
                }
            }
            this.a.put(key, k1Var == 1 ? 1 : 0);
        } else {
            this.a.put(key, c(value));
        }
    }

    public final /* synthetic */ Object clone() {
        c0 c0Var = new c0();
        for (int i = 0; i < this.a.j(); i++) {
            Map.Entry<T, Object> h = this.a.h(i);
            c0Var.h(h.getKey(), h.getValue());
        }
        for (Map.Entry<T, Object> entry : this.a.m()) {
            c0Var.h(entry.getKey(), entry.getValue());
        }
        c0Var.c = this.c;
        return c0Var;
    }

    public final void d(c0<T> c0Var) {
        for (int i = 0; i < c0Var.a.j(); i++) {
            i(c0Var.a.h(i));
        }
        for (Map.Entry<T, Object> entry : c0Var.a.m()) {
            i(entry);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        return this.a.equals(((c0) obj).a);
    }

    public final void g() {
        if (!this.b) {
            this.a.e();
            this.b = true;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean j() {
        return this.b;
    }

    public final Iterator<Map.Entry<T, Object>> k() {
        if (this.c) {
            return new n0(((z1) this.a.entrySet()).iterator());
        }
        return ((z1) this.a.entrySet()).iterator();
    }

    public final boolean l() {
        for (int i = 0; i < this.a.j(); i++) {
            if (!f(this.a.h(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.a.m()) {
            if (!f(entry)) {
                return false;
            }
        }
        return true;
    }

    private c0() {
        int i = u1.p;
    }
}
