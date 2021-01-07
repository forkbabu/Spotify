package com.facebook;

import com.facebook.a;

/* access modifiers changed from: package-private */
public class c implements Runnable {
    final /* synthetic */ a.b a;
    final /* synthetic */ d b;

    c(d dVar, a.b bVar) {
        this.b = dVar;
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!uf.c(this)) {
            try {
                this.b.h(this.a);
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }
}
