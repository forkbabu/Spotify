package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public final class z5 implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ long f;
    private final /* synthetic */ g5 n;

    z5(g5 g5Var, String str, String str2, String str3, long j) {
        this.n = g5Var;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.a;
        if (str == null) {
            g5.D3(this.n).f0().N().P(this.b, null);
            return;
        }
        g5.D3(this.n).f0().N().P(this.b, new p7(this.c, str, this.f));
    }
}
