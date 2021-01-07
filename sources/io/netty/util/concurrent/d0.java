package io.netty.util.concurrent;

import java.util.concurrent.RejectedExecutionException;

public final class d0 {
    private static final c0 a = new a();

    static class a implements c0 {
        a() {
        }

        @Override // io.netty.util.concurrent.c0
        public void a(Runnable runnable, g0 g0Var) {
            throw new RejectedExecutionException();
        }
    }

    public static c0 a() {
        return a;
    }
}
