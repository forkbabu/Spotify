package com.google.firebase.crashlytics.internal.common;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public class v implements Callable<Void> {
    final /* synthetic */ long a;
    final /* synthetic */ m b;

    v(m mVar, long j) {
        this.b = mVar;
        this.a = j;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public Void call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.a);
        this.b.s.a("_ae", bundle);
        return null;
    }
}
