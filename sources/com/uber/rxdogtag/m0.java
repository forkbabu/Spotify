package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.lang.Thread;

public final /* synthetic */ class m0 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ Thread.UncaughtExceptionHandler a;
    public final /* synthetic */ RxDogTag.NonCheckingConsumer b;

    public /* synthetic */ m0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, RxDogTag.NonCheckingConsumer nonCheckingConsumer) {
        this.a = uncaughtExceptionHandler;
        this.b = nonCheckingConsumer;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        RxDogTag.NonCheckingConsumer nonCheckingConsumer = this.b;
        Thread.currentThread().setUncaughtExceptionHandler(uncaughtExceptionHandler);
        if (th instanceof OnErrorNotImplementedException) {
            nonCheckingConsumer.accept(th);
        } else if (!(th instanceof NullPointerException) || !"subscribeActual failed".equals(th.getMessage())) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            nonCheckingConsumer.accept(th.getCause());
        }
    }
}
