package com.google.android.gms.internal.measurement;

final class b5 implements i5 {
    private i5[] a;

    b5(i5... i5VarArr) {
        this.a = i5VarArr;
    }

    @Override // com.google.android.gms.internal.measurement.i5
    public final j5 a(Class<?> cls) {
        i5[] i5VarArr = this.a;
        for (i5 i5Var : i5VarArr) {
            if (i5Var.b(cls)) {
                return i5Var.a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.measurement.i5
    public final boolean b(Class<?> cls) {
        for (i5 i5Var : this.a) {
            if (i5Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
