package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public class d0 implements Callable<Boolean> {
    final /* synthetic */ c0 a;

    d0(c0 c0Var) {
        this.a = c0Var;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public Boolean call() {
        return Boolean.valueOf(this.a.h.z());
    }
}
