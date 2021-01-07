package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.a;
import com.google.android.gms.tasks.g;
import java.util.concurrent.CountDownLatch;

/* access modifiers changed from: package-private */
public final /* synthetic */ class y0 implements a {
    private final CountDownLatch a;

    private y0(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public static a b(CountDownLatch countDownLatch) {
        return new y0(countDownLatch);
    }

    @Override // com.google.android.gms.tasks.a
    public Object a(g gVar) {
        CountDownLatch countDownLatch = this.a;
        int i = z0.c;
        countDownLatch.countDown();
        return null;
    }
}
