package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public class i implements Callable<Void> {
    final /* synthetic */ Runnable a;

    i(h hVar, Runnable runnable) {
        this.a = runnable;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public Void call() {
        this.a.run();
        return null;
    }
}
