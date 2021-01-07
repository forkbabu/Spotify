package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class i {
    public static final Executor a = new a();
    static final Executor b = new a0();

    private static final class a implements Executor {
        private final Handler a = new vu(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.a.post(runnable);
        }
    }
}
