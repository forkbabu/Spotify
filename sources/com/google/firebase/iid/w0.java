package com.google.firebase.iid;

import com.google.android.gms.tasks.c;
import com.google.android.gms.tasks.g;
import java.util.concurrent.ScheduledFuture;

/* access modifiers changed from: package-private */
public final /* synthetic */ class w0 implements c {
    private final ScheduledFuture a;

    w0(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // com.google.android.gms.tasks.c
    public final void a(g gVar) {
        this.a.cancel(false);
    }
}
