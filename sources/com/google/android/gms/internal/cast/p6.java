package com.google.android.gms.internal.cast;

/* access modifiers changed from: package-private */
public final class p6 implements w6 {
    private w6[] a;

    p6(w6... w6VarArr) {
        this.a = w6VarArr;
    }

    @Override // com.google.android.gms.internal.cast.w6
    public final boolean a(Class<?> cls) {
        for (w6 w6Var : this.a) {
            if (w6Var.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast.w6
    public final x6 b(Class<?> cls) {
        w6[] w6VarArr = this.a;
        for (w6 w6Var : w6VarArr) {
            if (w6Var.a(cls)) {
                return w6Var.b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
