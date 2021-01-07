package com.facebook.internal;

import com.facebook.internal.m0;

/* access modifiers changed from: package-private */
public class l0 implements Runnable {
    final /* synthetic */ m0.b a;
    final /* synthetic */ m0 b;

    l0(m0 m0Var, m0.b bVar) {
        this.b = m0Var;
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!uf.c(this)) {
            try {
                this.a.c().run();
                this.b.f(this.a);
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }
}
