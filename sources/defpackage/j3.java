package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: j3  reason: default package */
public class j3 {
    private final Object a = new Object();
    private HandlerThread b;
    private Handler c;
    private int d = 0;
    private Handler.Callback e = new a();

    /* renamed from: j3$a */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                j3.this.a();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                j3.this.b((Runnable) message.obj);
                return true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j3$b */
    public class b implements Runnable {
        final /* synthetic */ Callable a;
        final /* synthetic */ Handler b;
        final /* synthetic */ d c;

        /* renamed from: j3$b$a */
        class a implements Runnable {
            final /* synthetic */ Object a;

            a(Object obj) {
                this.a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c.a(this.a);
            }
        }

        b(j3 j3Var, Callable callable, Handler handler, d dVar) {
            this.a = callable;
            this.b = handler;
            this.c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.a.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.b.post(new a(obj));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j3$c */
    public class c implements Runnable {
        final /* synthetic */ AtomicReference a;
        final /* synthetic */ Callable b;
        final /* synthetic */ ReentrantLock c;
        final /* synthetic */ AtomicBoolean f;
        final /* synthetic */ Condition n;

        c(j3 j3Var, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.a = atomicReference;
            this.b = callable;
            this.c = reentrantLock;
            this.f = atomicBoolean;
            this.n = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.a.set(this.b.call());
            } catch (Exception unused) {
            }
            this.c.lock();
            try {
                this.f.set(false);
                this.n.signal();
            } finally {
                this.c.unlock();
            }
        }
    }

    /* renamed from: j3$d */
    public interface d<T> {
        void a(T t);
    }

    public j3(String str, int i, int i2) {
    }

    private void c(Runnable runnable) {
        synchronized (this.a) {
            if (this.b == null) {
                HandlerThread handlerThread = new HandlerThread("fonts", 10);
                this.b = handlerThread;
                handlerThread.start();
                this.c = new Handler(this.b.getLooper(), this.e);
                this.d++;
            }
            this.c.removeMessages(0);
            Handler handler = this.c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        synchronized (this.a) {
            if (!this.c.hasMessages(1)) {
                this.b.quit();
                this.b = null;
                this.c = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Runnable runnable) {
        runnable.run();
        synchronized (this.a) {
            this.c.removeMessages(0);
            Handler handler = this.c;
            handler.sendMessageDelayed(handler.obtainMessage(0), (long) 10000);
        }
    }

    public <T> void d(Callable<T> callable, d<T> dVar) {
        c(new b(this, callable, new Handler(), dVar));
    }

    public <T> T e(Callable<T> callable, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        c(new c(this, atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    T t = (T) atomicReference.get();
                    reentrantLock.unlock();
                    return t;
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }
}
