package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;

final class n implements Executor {
    n() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
