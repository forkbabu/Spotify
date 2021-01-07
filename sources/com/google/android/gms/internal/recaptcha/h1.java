package com.google.android.gms.internal.recaptcha;

/* access modifiers changed from: package-private */
public final class h1<T> implements q1<T> {
    private final f1 a;
    private final e2<?, ?> b;
    private final boolean c;
    private final b0<?> d;

    private h1(e2<?, ?> e2Var, b0<?> b0Var, f1 f1Var) {
        this.b = e2Var;
        this.c = b0Var.b(f1Var);
        this.d = b0Var;
        this.a = f1Var;
    }

    static <T> h1<T> a(e2<?, ?> e2Var, b0<?> b0Var, f1 f1Var) {
        return new h1<>(e2Var, b0Var, f1Var);
    }

    @Override // com.google.android.gms.internal.recaptcha.q1
    public final int b(T t) {
        int hashCode = this.b.b(t).hashCode();
        return this.c ? (hashCode * 53) + this.d.a(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.recaptcha.q1
    public final void c(T t) {
        this.b.d(t);
        this.d.d(t);
    }

    @Override // com.google.android.gms.internal.recaptcha.q1
    public final boolean d(T t, T t2) {
        if (!this.b.b(t).equals(this.b.b(t2))) {
            return false;
        }
        if (this.c) {
            return this.d.a(t).equals(this.d.a(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.recaptcha.q1
    public final boolean f(T t) {
        return this.d.a(t).l();
    }

    @Override // com.google.android.gms.internal.recaptcha.q1
    public final void g(T t, T t2) {
        e2<?, ?> e2Var = this.b;
        int i = r1.e;
        e2Var.a(t, e2Var.c(e2Var.b(t), e2Var.b(t2)));
        if (this.c) {
            b0<?> b0Var = this.d;
            c0<?> a2 = b0Var.a(t2);
            if (!a2.a.isEmpty()) {
                b0Var.c(t).d(a2);
            }
        }
    }
}
