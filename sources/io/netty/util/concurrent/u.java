package io.netty.util.concurrent;

import java.util.concurrent.Executor;

public final class u implements Executor {
    public static final u a = new u();

    private u() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
            return;
        }
        throw new NullPointerException("command");
    }
}
