package com.facebook.share.internal;

import com.facebook.FacebookException;
import com.facebook.share.internal.e;

/* access modifiers changed from: package-private */
public final class h implements Runnable {
    final /* synthetic */ e.AbstractC0076e a;
    final /* synthetic */ e b;
    final /* synthetic */ FacebookException c;

    h(e.AbstractC0076e eVar, e eVar2, FacebookException facebookException) {
        this.a = eVar;
        this.b = eVar2;
        this.c = facebookException;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!uf.c(this)) {
            try {
                this.a.a(this.b, this.c);
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }
}
