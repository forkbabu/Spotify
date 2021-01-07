package com.google.android.gms.internal.recaptcha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class t0 extends r0 {
    private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    t0(q0 q0Var) {
        super(null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: java.util.ArrayList */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.recaptcha.r0
    public final <E> void b(Object obj, Object obj2, long j) {
        p0 p0Var;
        List list = (List) k2.v(obj2, j);
        int size = list.size();
        List list2 = (List) k2.v(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof o0) {
                list2 = new p0(size);
            } else {
                list2 = new ArrayList(size);
            }
            k2.h(obj, j, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                k2.h(obj, j, arrayList);
                p0Var = arrayList;
            } else if (list2 instanceof f2) {
                p0 p0Var2 = new p0(list2.size() + size);
                p0Var2.addAll(p0Var2.size(), (f2) list2);
                k2.h(obj, j, p0Var2);
                p0Var = p0Var2;
            }
            list2 = p0Var;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        k2.h(obj, j, list);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.recaptcha.r0
    public final void d(Object obj, long j) {
        Object obj2;
        List list = (List) k2.v(obj, j);
        if (list instanceof o0) {
            obj2 = ((o0) list).z0();
        } else if (!c.isAssignableFrom(list.getClass())) {
            obj2 = Collections.unmodifiableList(list);
        } else {
            return;
        }
        k2.h(obj, j, obj2);
    }
}
