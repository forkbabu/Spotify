package com.google.android.exoplayer2;

public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ b0 a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ o(b0 b0Var, n0 n0Var) {
        this.a = b0Var;
        this.b = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.x(this.b);
    }
}
