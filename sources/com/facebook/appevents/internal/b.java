package com.facebook.appevents.internal;

/* access modifiers changed from: package-private */
public final class b implements Runnable {
    b() {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!uf.c(this)) {
            try {
                if (a.f == null) {
                    l unused = a.f = l.h();
                }
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }
}
