package com.google.android.gms.internal.measurement;

final class x4 extends w4 {
    x4(v4 v4Var) {
        super(null);
    }

    private static <E> m4<E> e(Object obj, long j) {
        return (m4) q6.A(obj, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.w4
    public final <E> void b(Object obj, Object obj2, long j) {
        m4<E> e = e(obj, j);
        m4<E> e2 = e(obj2, j);
        int size = e.size();
        int size2 = e2.size();
        m4<E> m4Var = e;
        m4Var = e;
        if (size > 0 && size2 > 0) {
            boolean a = e.a();
            m4<E> m4Var2 = e;
            if (!a) {
                m4Var2 = e.g(size2 + size);
            }
            m4Var2.addAll(e2);
            m4Var = m4Var2;
        }
        if (size > 0) {
            e2 = m4Var;
        }
        q6.i(obj, j, e2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.w4
    public final void d(Object obj, long j) {
        e(obj, j).b2();
    }
}
