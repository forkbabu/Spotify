package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.d1;
import com.google.android.gms.internal.measurement.h8;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class ia {
    private String a;
    private boolean b;
    private d1 c;
    private BitSet d;
    private BitSet e;
    private Map<Integer, Long> f;
    private Map<Integer, List<Long>> g;
    private final /* synthetic */ ga h;

    ia(ga gaVar, String str, ja jaVar) {
        this.h = gaVar;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new m1();
        this.g = new m1();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x00ce */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.f4$b, com.google.android.gms.internal.measurement.w0$a] */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.google.android.gms.internal.measurement.d1$a] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.w0 a(int r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.measurement.w0$a r0 = com.google.android.gms.internal.measurement.w0.F()
            r0.t(r8)
            boolean r8 = r7.b
            r0.w(r8)
            com.google.android.gms.internal.measurement.d1 r8 = r7.c
            if (r8 == 0) goto L_0x0013
            r0.v(r8)
        L_0x0013:
            com.google.android.gms.internal.measurement.d1$a r8 = com.google.android.gms.internal.measurement.d1.M()
            java.util.BitSet r1 = r7.d
            java.util.List r1 = com.google.android.gms.measurement.internal.v9.E(r1)
            r8.y(r1)
            java.util.BitSet r1 = r7.e
            java.util.List r1 = com.google.android.gms.measurement.internal.v9.E(r1)
            r8.v(r1)
            java.util.Map<java.lang.Integer, java.lang.Long> r1 = r7.f
            if (r1 != 0) goto L_0x002f
            r1 = 0
            goto L_0x007a
        L_0x002f:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Map<java.lang.Integer, java.lang.Long> r2 = r7.f
            int r2 = r2.size()
            r1.<init>(r2)
            java.util.Map<java.lang.Integer, java.lang.Long> r2 = r7.f
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0044:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x007a
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            com.google.android.gms.internal.measurement.x0$a r4 = com.google.android.gms.internal.measurement.x0.A()
            r4.t(r3)
            java.util.Map<java.lang.Integer, java.lang.Long> r5 = r7.f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r5.get(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            long r5 = r3.longValue()
            r4.u(r5)
            com.google.android.gms.internal.measurement.l5 r3 = r4.s()
            com.google.android.gms.internal.measurement.f4 r3 = (com.google.android.gms.internal.measurement.f4) r3
            com.google.android.gms.internal.measurement.x0 r3 = (com.google.android.gms.internal.measurement.x0) r3
            r1.add(r3)
            goto L_0x0044
        L_0x007a:
            r8.z(r1)
            java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>> r1 = r7.g
            if (r1 != 0) goto L_0x0086
            java.util.List r1 = java.util.Collections.emptyList()
            goto L_0x00ce
        L_0x0086:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>> r2 = r7.g
            int r2 = r2.size()
            r1.<init>(r2)
            java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>> r2 = r7.g
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x009b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00ce
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            com.google.android.gms.internal.measurement.e1$a r4 = com.google.android.gms.internal.measurement.e1.B()
            int r5 = r3.intValue()
            r4.t(r5)
            java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>> r5 = r7.g
            java.lang.Object r3 = r5.get(r3)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x00c2
            java.util.Collections.sort(r3)
            r4.u(r3)
        L_0x00c2:
            com.google.android.gms.internal.measurement.l5 r3 = r4.s()
            com.google.android.gms.internal.measurement.f4 r3 = (com.google.android.gms.internal.measurement.f4) r3
            com.google.android.gms.internal.measurement.e1 r3 = (com.google.android.gms.internal.measurement.e1) r3
            r1.add(r3)
            goto L_0x009b
        L_0x00ce:
            r8.A(r1)
            r0.u(r8)
            com.google.android.gms.internal.measurement.l5 r8 = r0.s()
            com.google.android.gms.internal.measurement.f4 r8 = (com.google.android.gms.internal.measurement.f4) r8
            com.google.android.gms.internal.measurement.w0 r8 = (com.google.android.gms.internal.measurement.w0) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ia.a(int):com.google.android.gms.internal.measurement.w0");
    }

    /* access modifiers changed from: package-private */
    public final void c(na naVar) {
        int a2 = naVar.a();
        Boolean bool = naVar.c;
        if (bool != null) {
            this.e.set(a2, bool.booleanValue());
        }
        Boolean bool2 = naVar.d;
        if (bool2 != null) {
            this.d.set(a2, bool2.booleanValue());
        }
        if (naVar.e != null) {
            Long l = this.f.get(Integer.valueOf(a2));
            long longValue = naVar.e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f.put(Integer.valueOf(a2), Long.valueOf(longValue));
            }
        }
        if (naVar.f != null) {
            List<Long> list = this.g.get(Integer.valueOf(a2));
            if (list == null) {
                list = new ArrayList<>();
                this.g.put(Integer.valueOf(a2), list);
            }
            if (naVar.h()) {
                list.clear();
            }
            if (h8.b() && this.h.j().x(this.a, t.d0) && naVar.i()) {
                list.clear();
            }
            if (!h8.b() || !this.h.j().x(this.a, t.d0)) {
                list.add(Long.valueOf(naVar.f.longValue() / 1000));
                return;
            }
            long longValue2 = naVar.f.longValue() / 1000;
            if (!list.contains(Long.valueOf(longValue2))) {
                list.add(Long.valueOf(longValue2));
            }
        }
    }

    ia(ga gaVar, String str, d1 d1Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, ja jaVar) {
        this.h = gaVar;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = map;
        this.g = new m1();
        for (Integer num : ((m1) map2).keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) ((t1) map2).get(num));
            this.g.put(num, arrayList);
        }
        this.b = false;
        this.c = d1Var;
    }
}
