package com.facebook.share.internal;

/* access modifiers changed from: package-private */
public final class f implements Runnable {
    final /* synthetic */ e a;

    f(e eVar) {
        this.a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!uf.c(this)) {
            try {
                e.o(this.a);
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }
}
