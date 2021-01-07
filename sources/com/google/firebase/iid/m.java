package com.google.firebase.iid;

import com.google.android.gms.tasks.c;
import com.google.android.gms.tasks.g;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;

final /* synthetic */ class m implements c {
    private final CountDownLatch a;

    m(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    @Override // com.google.android.gms.tasks.c
    public final void a(g gVar) {
        CountDownLatch countDownLatch = this.a;
        ScheduledExecutorService scheduledExecutorService = FirebaseInstanceId.l;
        countDownLatch.countDown();
    }
}
