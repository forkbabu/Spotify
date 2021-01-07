package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements Runnable {
    private final l a;
    private final tg b;
    private final int c;
    private final Runnable f;

    private g(l lVar, tg tgVar, int i, Runnable runnable) {
        this.a = lVar;
        this.b = tgVar;
        this.c = i;
        this.f = runnable;
    }

    public static Runnable a(l lVar, tg tgVar, int i, Runnable runnable) {
        return new g(lVar, tgVar, i, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        l.d(this.a, this.b, this.c, this.f);
    }
}
