package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* access modifiers changed from: package-private */
public class j0 implements ThreadFactory {
    final /* synthetic */ String a;
    final /* synthetic */ AtomicLong b;

    class a extends d {
        final /* synthetic */ Runnable a;

        a(j0 j0Var, Runnable runnable) {
            this.a = runnable;
        }

        @Override // com.google.firebase.crashlytics.internal.common.d
        public void a() {
            this.a.run();
        }
    }

    j0(String str, AtomicLong atomicLong) {
        this.a = str;
        this.b = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(new a(this, runnable));
        newThread.setName(this.a + this.b.getAndIncrement());
        return newThread;
    }
}
