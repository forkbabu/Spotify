package com.google.android.play.core.assetpacks;

final /* synthetic */ class n1 implements Runnable {
    private final q1 a;
    private final int b;
    private final String c;

    n1(q1 q1Var, int i, String str) {
        this.a = q1Var;
        this.b = i;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.f(this.b, this.c);
    }
}
