package io.reactivex.android.schedulers;

import android.os.Handler;
import android.os.Message;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final class b extends y {
    private final Handler b;
    private final boolean c;

    private static final class a extends y.c {
        private final Handler a;
        private final boolean b;
        private volatile boolean c;

        a(Handler handler, boolean z) {
            this.a = handler;
            this.b = z;
        }

        @Override // io.reactivex.y.c
        public io.reactivex.disposables.b c(Runnable runnable, long j, TimeUnit timeUnit) {
            EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
            if (runnable == null) {
                throw new NullPointerException("run == null");
            } else if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            } else if (this.c) {
                return emptyDisposable;
            } else {
                Handler handler = this.a;
                RunnableC0610b bVar = new RunnableC0610b(handler, runnable);
                Message obtain = Message.obtain(handler, bVar);
                obtain.obj = this;
                if (this.b) {
                    obtain.setAsynchronous(true);
                }
                this.a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                if (!this.c) {
                    return bVar;
                }
                this.a.removeCallbacks(bVar);
                return emptyDisposable;
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.c;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.c = true;
            this.a.removeCallbacksAndMessages(this);
        }
    }

    /* renamed from: io.reactivex.android.schedulers.b$b  reason: collision with other inner class name */
    private static final class RunnableC0610b implements Runnable, io.reactivex.disposables.b {
        private final Handler a;
        private final Runnable b;
        private volatile boolean c;

        RunnableC0610b(Handler handler, Runnable runnable) {
            this.a = handler;
            this.b = runnable;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.c;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.a.removeCallbacks(this);
            this.c = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.b.run();
            } catch (Throwable th) {
                io.reactivex.plugins.a.g(th);
            }
        }
    }

    b(Handler handler, boolean z) {
        this.b = handler;
        this.c = z;
    }

    @Override // io.reactivex.y
    public y.c a() {
        return new a(this.b, this.c);
    }

    @Override // io.reactivex.y
    public io.reactivex.disposables.b c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            Handler handler = this.b;
            RunnableC0610b bVar = new RunnableC0610b(handler, runnable);
            Message obtain = Message.obtain(handler, bVar);
            if (this.c) {
                obtain.setAsynchronous(true);
            }
            this.b.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            return bVar;
        } else {
            throw new NullPointerException("unit == null");
        }
    }
}
