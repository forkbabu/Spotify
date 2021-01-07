package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class y4 extends w4 {
    private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    y4(v4 v4Var) {
        super(null);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.w4
    public final <E> void b(Object obj, Object obj2, long j) {
        ArrayList arrayList;
        List list = (List) q6.A(obj2, j);
        int size = list.size();
        List list2 = (List) q6.A(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof t4) {
                list2 = new u4(size);
            } else if (!(list2 instanceof v5) || !(list2 instanceof m4)) {
                list2 = new ArrayList(size);
            } else {
                list2 = ((m4) list2).g(size);
            }
            q6.i(obj, j, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList2 = new ArrayList(list2.size() + size);
                arrayList2.addAll(list2);
                q6.i(obj, j, arrayList2);
                arrayList = arrayList2;
            } else if (list2 instanceof p6) {
                u4 u4Var = new u4(list2.size() + size);
                u4Var.addAll(u4Var.size(), (p6) list2);
                q6.i(obj, j, u4Var);
                arrayList = u4Var;
            } else if ((list2 instanceof v5) && (list2 instanceof m4)) {
                m4 m4Var = (m4) list2;
                if (!m4Var.a()) {
                    list2 = m4Var.g(list2.size() + size);
                    q6.i(obj, j, list2);
                }
            }
            list2 = arrayList;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        q6.i(obj, j, list);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.w4
    public final void d(Object obj, long j) {
        Object obj2;
        List list = (List) q6.A(obj, j);
        if (list instanceof t4) {
            obj2 = ((t4) list).F();
        } else if (!c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof v5) || !(list instanceof m4)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                m4 m4Var = (m4) list;
                if (m4Var.a()) {
                    m4Var.b2();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        q6.i(obj, j, obj2);
    }
}
