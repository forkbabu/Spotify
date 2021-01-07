package com.facebook.internal;

/* access modifiers changed from: package-private */
public class p implements Runnable {
    final /* synthetic */ o a;

    p(o oVar) {
        this.a = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!uf.c(this)) {
            try {
                o.c(this.a);
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }
}
