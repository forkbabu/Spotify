package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* access modifiers changed from: package-private */
public final /* synthetic */ class n implements Runnable {
    private final p a;

    private n(p pVar) {
        this.a = pVar;
    }

    public static Runnable a(p pVar) {
        return new n(pVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        p pVar;
        pVar.d.a(o.a(this.a));
    }
}
