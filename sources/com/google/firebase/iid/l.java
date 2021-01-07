package com.google.firebase.iid;

import java.util.concurrent.Executor;

final /* synthetic */ class l implements Executor {
    static final Executor a = new l();

    private l() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
