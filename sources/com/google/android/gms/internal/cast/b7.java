package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;

final class b7<T> implements m7<T> {
    private final z6 a;
    private final a8<?, ?> b;
    private final boolean c;
    private final i5<?> d;

    private b7(a8<?, ?> a8Var, i5<?> i5Var, z6 z6Var) {
        this.b = a8Var;
        this.c = i5Var.d(z6Var);
        this.d = i5Var;
        this.a = z6Var;
    }

    static <T> b7<T> h(a8<?, ?> a8Var, i5<?> i5Var, z6 z6Var) {
        return new b7<>(a8Var, i5Var, z6Var);
    }

    @Override // com.google.android.gms.internal.cast.m7
    public final int a(T t) {
        int hashCode = this.b.g(t).hashCode();
        return this.c ? (hashCode * 53) + this.d.c(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.cast.m7
    public final boolean b(T t, T t2) {
        if (!this.b.g(t).equals(this.b.g(t2))) {
            return false;
        }
        if (this.c) {
            return this.d.c(t).equals(this.d.c(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.cast.m7
    public final int c(T t) {
        a8<?, ?> a8Var = this.b;
        int h = a8Var.h(a8Var.g(t)) + 0;
        return this.c ? h + this.d.c(t).q() : h;
    }

    @Override // com.google.android.gms.internal.cast.m7
    public final boolean d(T t) {
        return this.d.c(t).b();
    }

    @Override // com.google.android.gms.internal.cast.m7
    public final void e(T t, T t2) {
        a8<?, ?> a8Var = this.b;
        int i = o7.e;
        a8Var.c(t, a8Var.d(a8Var.g(t), a8Var.g(t2)));
        if (this.c) {
            i5<?> i5Var = this.d;
            n5<?> c2 = i5Var.c(t2);
            if (!c2.a.isEmpty()) {
                i5Var.e(t).f(c2);
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.m7
    public final void f(T t, o8 o8Var) {
        Iterator<Map.Entry<?, Object>> c2 = this.d.c(t).c();
        while (c2.hasNext()) {
            Map.Entry<?, Object> next = c2.next();
            o5 o5Var = (o5) next.getKey();
            if (o5Var.e0() != zzpo.MESSAGE || o5Var.p0() || o5Var.y0()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof c6) {
                ((h5) o8Var).l(o5Var.j(), ((c6) next).a().c());
            } else {
                ((h5) o8Var).l(o5Var.j(), next.getValue());
            }
        }
        a8<?, ?> a8Var = this.b;
        a8Var.b(a8Var.g(t), o8Var);
    }

    @Override // com.google.android.gms.internal.cast.m7
    public final void g(T t) {
        this.b.e(t);
        this.d.f(t);
    }
}
