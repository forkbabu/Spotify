package com.google.android.gms.internal.cast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class m6 extends j6 {
    private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    m6(i6 i6Var) {
        super(null);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.j6
    public final void a(Object obj, long j) {
        Object obj2;
        List list = (List) f8.B(obj, j);
        if (list instanceof g6) {
            obj2 = ((g6) list).t0();
        } else if (!c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof h7) || !(list instanceof z5)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                z5 z5Var = (z5) list;
                if (z5Var.f0()) {
                    z5Var.B();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        f8.g(obj, j, obj2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.j6
    public final <E> void b(Object obj, Object obj2, long j) {
        ArrayList arrayList;
        List list = (List) f8.B(obj2, j);
        int size = list.size();
        List list2 = (List) f8.B(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof g6) {
                list2 = new h6(size);
            } else if (!(list2 instanceof h7) || !(list2 instanceof z5)) {
                list2 = new ArrayList(size);
            } else {
                list2 = ((z5) list2).H0(size);
            }
            f8.g(obj, j, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList2 = new ArrayList(list2.size() + size);
                arrayList2.addAll(list2);
                f8.g(obj, j, arrayList2);
                arrayList = arrayList2;
            } else if (list2 instanceof e8) {
                h6 h6Var = new h6(list2.size() + size);
                h6Var.addAll(h6Var.size(), (e8) list2);
                f8.g(obj, j, h6Var);
                arrayList = h6Var;
            } else if ((list2 instanceof h7) && (list2 instanceof z5)) {
                z5 z5Var = (z5) list2;
                if (!z5Var.f0()) {
                    list2 = z5Var.H0(list2.size() + size);
                    f8.g(obj, j, list2);
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
        f8.g(obj, j, list);
    }
}
