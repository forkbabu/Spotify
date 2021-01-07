package com.google.firebase.crashlytics.internal.common;

import java.util.Map;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public class o implements Callable<Void> {
    final /* synthetic */ Map a;
    final /* synthetic */ m b;

    o(m mVar, Map map) {
        this.b = mVar;
        this.a = map;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public Void call() {
        new r0(this.b.I()).e(this.b.F(), this.a);
        return null;
    }
}
