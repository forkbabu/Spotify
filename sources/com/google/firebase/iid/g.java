package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements Executor {
    static final Executor a = new g();

    private g() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
