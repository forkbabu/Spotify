package com.google.android.play.core.tasks;

import java.util.concurrent.CountDownLatch;

/* access modifiers changed from: package-private */
public final class q implements b, a {
    private final CountDownLatch a = new CountDownLatch(1);

    /* synthetic */ q(byte[] bArr) {
    }

    public final void a() {
        this.a.await();
    }

    @Override // com.google.android.play.core.tasks.a
    public final void b(Exception exc) {
        this.a.countDown();
    }

    @Override // com.google.android.play.core.tasks.b
    public final void onSuccess(Object obj) {
        this.a.countDown();
    }
}
