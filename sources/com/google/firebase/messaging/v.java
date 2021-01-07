package com.google.firebase.messaging;

import android.content.Context;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.e0;
import com.google.firebase.iid.s;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

final /* synthetic */ class v implements Callable {
    private final Context a;
    private final ScheduledExecutorService b;
    private final FirebaseInstanceId c;
    private final e0 f;
    private final s n;

    v(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseInstanceId firebaseInstanceId, e0 e0Var, s sVar) {
        this.a = context;
        this.b = scheduledExecutorService;
        this.c = firebaseInstanceId;
        this.f = e0Var;
        this.n = sVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return w.c(this.a, this.b, this.c, this.f, this.n);
    }
}
