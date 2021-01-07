package com.google.android.gms.measurement.internal;

import java.lang.Thread;

/* access modifiers changed from: package-private */
public final class a5 implements Thread.UncaughtExceptionHandler {
    private final String a;
    private final /* synthetic */ y4 b;

    public a5(y4 y4Var, String str) {
        this.b = y4Var;
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.b.l().E().b(this.a, th);
    }
}
