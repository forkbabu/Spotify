package androidx.work.impl.utils;

import java.util.concurrent.Executor;

public class j implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
