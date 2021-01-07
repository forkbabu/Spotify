package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public class p implements Callable<Void> {
    final /* synthetic */ m a;

    p(m mVar) {
        this.a = mVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public Void call() {
        m.u(this.a);
        return null;
    }
}
