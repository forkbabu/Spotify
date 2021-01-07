package com.facebook.internal;

import com.facebook.k;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

public class x<T> {
    private T a;
    private CountDownLatch b = new CountDownLatch(1);

    class a implements Callable<Void> {
        final /* synthetic */ Callable a;

        a(Callable callable) {
            this.a = callable;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX INFO: finally extract failed */
        @Override // java.util.concurrent.Callable
        public Void call() {
            try {
                x.this.a = this.a.call();
                x.this.b.countDown();
                return null;
            } catch (Throwable th) {
                x.this.b.countDown();
                throw th;
            }
        }
    }

    public x(Callable<T> callable) {
        k.l().execute(new FutureTask(new a(callable)));
    }

    public T c() {
        CountDownLatch countDownLatch = this.b;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
        return this.a;
    }
}
