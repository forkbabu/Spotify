package io.netty.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

public final class i0 implements Executor {
    private final ThreadFactory a;

    public i0(ThreadFactory threadFactory) {
        this.a = threadFactory;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.a.newThread(runnable).start();
    }
}
