package com.google.android.gms.internal.recaptcha;

/* access modifiers changed from: package-private */
public final class v0 implements c1 {
    private c1[] a;

    v0(c1... c1VarArr) {
        this.a = c1VarArr;
    }

    @Override // com.google.android.gms.internal.recaptcha.c1
    public final d1 a(Class<?> cls) {
        c1[] c1VarArr = this.a;
        for (c1 c1Var : c1VarArr) {
            if (c1Var.b(cls)) {
                return c1Var.a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.recaptcha.c1
    public final boolean b(Class<?> cls) {
        for (c1 c1Var : this.a) {
            if (c1Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
