package com.google.firebase.messaging;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements Callable {
    private final m a;

    l(m mVar) {
        this.a = mVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.a();
    }
}
