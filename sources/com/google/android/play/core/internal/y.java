package com.google.android.play.core.internal;

public final class y<T> implements a0<T> {
    private a0<T> a;

    public static <T> void a(a0<T> a0Var, a0<T> a0Var2) {
        y yVar = (y) a0Var;
        if (yVar.a == null) {
            yVar.a = a0Var2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.play.core.internal.a0
    public final T e() {
        a0<T> a0Var = this.a;
        if (a0Var != null) {
            return a0Var.e();
        }
        throw new IllegalStateException();
    }
}
