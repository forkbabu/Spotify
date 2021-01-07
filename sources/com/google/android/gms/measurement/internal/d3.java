package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public final class d3 implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ a b;

    d3(a aVar, long j) {
        this.b = aVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.B(this.a);
    }
}
