package com.google.firebase.messaging;

import java.util.concurrent.Executor;

final /* synthetic */ class e implements Executor {
    static final Executor a = new e();

    private e() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
