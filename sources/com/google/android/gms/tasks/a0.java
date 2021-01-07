package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class a0 implements Executor {
    a0() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
