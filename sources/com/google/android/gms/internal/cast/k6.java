package com.google.android.gms.internal.cast;

final class k6 extends j6 {
    k6(i6 i6Var) {
        super(null);
    }

    private static <E> z5<E> e(Object obj, long j) {
        return (z5) f8.B(obj, j);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.j6
    public final void a(Object obj, long j) {
        e(obj, j).B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.j6
    public final <E> void b(Object obj, Object obj2, long j) {
        z5<E> e = e(obj, j);
        z5<E> e2 = e(obj2, j);
        int size = e.size();
        int size2 = e2.size();
        z5<E> z5Var = e;
        z5Var = e;
        if (size > 0 && size2 > 0) {
            boolean f0 = e.f0();
            z5<E> z5Var2 = e;
            if (!f0) {
                z5Var2 = e.H0(size2 + size);
            }
            z5Var2.addAll(e2);
            z5Var = z5Var2;
        }
        if (size > 0) {
            e2 = z5Var;
        }
        f8.g(obj, j, e2);
    }
}
