package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public final class b1 implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ long b;
    private final /* synthetic */ a c;

    b1(a aVar, String str, long j) {
        this.c = aVar;
        this.a = str;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.y(this.c, this.a, this.b);
    }
}
