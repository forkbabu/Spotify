package io.reactivex.disposables;

import io.reactivex.functions.a;
import io.reactivex.internal.functions.Functions;

public final class c {
    public static b a() {
        return c(Functions.b);
    }

    public static b b(a aVar) {
        return new ActionDisposable(aVar);
    }

    public static b c(Runnable runnable) {
        return new RunnableDisposable(runnable);
    }
}
