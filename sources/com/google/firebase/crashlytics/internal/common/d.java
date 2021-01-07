package com.google.firebase.crashlytics.internal.common;

import android.os.Process;

public abstract class d implements Runnable {
    /* access modifiers changed from: protected */
    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
