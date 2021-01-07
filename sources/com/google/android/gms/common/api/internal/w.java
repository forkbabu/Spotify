package com.google.android.gms.common.api.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final /* synthetic */ class w implements Executor {
    private final Handler a;

    private w(Handler handler) {
        this.a = handler;
    }

    static Executor a(Handler handler) {
        return new w(handler);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
