package io.reactivex.android;

import android.os.Looper;
import io.reactivex.disposables.b;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class a implements b {
    private final AtomicBoolean a = new AtomicBoolean();

    /* renamed from: io.reactivex.android.a$a  reason: collision with other inner class name */
    class RunnableC0608a implements Runnable {
        RunnableC0608a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    @Override // io.reactivex.disposables.b
    public final boolean d() {
        return this.a.get();
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        if (!this.a.compareAndSet(false, true)) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a();
        } else {
            io.reactivex.android.schedulers.a.b().b(new RunnableC0608a());
        }
    }
}
