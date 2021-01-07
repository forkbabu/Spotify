package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public final class s5 implements Runnable {
    private final /* synthetic */ r a;
    private final /* synthetic */ String b;
    private final /* synthetic */ g5 c;

    s5(g5 g5Var, r rVar, String str) {
        this.c = g5Var;
        this.a = rVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g5.D3(this.c).d0();
        g5.D3(this.c).n(this.a, this.b);
    }
}
