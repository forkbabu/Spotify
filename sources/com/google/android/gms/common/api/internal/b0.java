package com.google.android.gms.common.api.internal;

final class b0 implements Runnable {
    private final /* synthetic */ a0 a;

    b0(a0 a0Var) {
        this.a = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.b.a(this.a.a.b.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
