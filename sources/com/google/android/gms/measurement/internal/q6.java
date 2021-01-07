package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public final class q6 implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ long f;
    private final /* synthetic */ i6 n;

    q6(i6 i6Var, String str, String str2, Object obj, long j) {
        this.n = i6Var;
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.f = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.n.Z(this.a, this.b, this.c, this.f);
    }
}
