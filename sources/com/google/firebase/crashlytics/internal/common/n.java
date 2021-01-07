package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public class n implements Callable<Void> {
    final /* synthetic */ x0 a;
    final /* synthetic */ m b;

    n(m mVar, x0 x0Var) {
        this.b = mVar;
        this.a = x0Var;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public Void call() {
        this.b.t.i();
        new r0(this.b.I()).f(this.b.F(), this.a);
        return null;
    }
}
