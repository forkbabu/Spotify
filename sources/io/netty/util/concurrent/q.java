package io.netty.util.concurrent;

import io.netty.util.internal.e;

public class q extends Thread {
    private e a;

    public q() {
    }

    public final void a(e eVar) {
        this.a = eVar;
    }

    public final e b() {
        return this.a;
    }

    public q(ThreadGroup threadGroup, Runnable runnable, String str) {
        super(threadGroup, runnable, str);
    }
}
