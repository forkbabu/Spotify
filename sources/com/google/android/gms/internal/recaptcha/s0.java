package com.google.android.gms.internal.recaptcha;

final class s0 extends r0 {
    s0(q0 q0Var) {
        super(null);
    }

    private static <E> j0<E> e(Object obj, long j) {
        return (j0) k2.v(obj, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.recaptcha.r0
    public final <E> void b(Object obj, Object obj2, long j) {
        j0<E> e = e(obj, j);
        j0<E> e2 = e(obj2, j);
        int size = e.size();
        int size2 = e2.size();
        j0<E> j0Var = e;
        j0Var = e;
        if (size > 0 && size2 > 0) {
            boolean a = e.a();
            j0<E> j0Var2 = e;
            if (!a) {
                j0Var2 = e.g(size2 + size);
            }
            j0Var2.addAll(e2);
            j0Var = j0Var2;
        }
        if (size > 0) {
            e2 = j0Var;
        }
        k2.h(obj, j, e2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.recaptcha.r0
    public final void d(Object obj, long j) {
        e(obj, j).U();
    }
}
