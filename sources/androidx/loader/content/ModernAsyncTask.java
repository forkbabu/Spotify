package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

abstract class ModernAsyncTask<Params, Progress, Result> {
    private static final ThreadFactory o;
    private static final BlockingQueue<Runnable> p;
    public static final Executor q;
    private static e r;
    private final f<Params, Result> a;
    private final FutureTask<Result> b;
    private volatile Status c = Status.PENDING;
    final AtomicBoolean f = new AtomicBoolean();
    final AtomicBoolean n = new AtomicBoolean();

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    static class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder V0 = je.V0("ModernAsyncTask #");
            V0.append(this.a.getAndIncrement());
            return new Thread(runnable, V0.toString());
        }
    }

    class b extends f<Params, Result> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() {
            ModernAsyncTask.this.n.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) ModernAsyncTask.this.b(this.a);
                Binder.flushPendingCommands();
                ModernAsyncTask.this.g(result);
                return result;
            } catch (Throwable th) {
                ModernAsyncTask.this.g(result);
                throw th;
            }
        }
    }

    class c extends FutureTask<Result> {
        c(Callable callable) {
            super(callable);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: androidx.loader.content.ModernAsyncTask */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: protected */
        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                Object obj = get();
                ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
                if (!modernAsyncTask.n.get()) {
                    modernAsyncTask.g(obj);
                }
            } catch (InterruptedException unused) {
            } catch (ExecutionException e) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
            } catch (CancellationException unused2) {
                ModernAsyncTask modernAsyncTask2 = ModernAsyncTask.this;
                if (!modernAsyncTask2.n.get()) {
                    modernAsyncTask2.g(null);
                }
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* access modifiers changed from: private */
    public static class d<Data> {
        final ModernAsyncTask a;
        final Data[] b;

        d(ModernAsyncTask modernAsyncTask, Data... dataArr) {
            this.a = modernAsyncTask;
            this.b = dataArr;
        }
    }

    /* access modifiers changed from: private */
    public static class e extends Handler {
        e() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            d dVar = (d) message.obj;
            int i = message.what;
            if (i == 1) {
                dVar.a.d(dVar.b[0]);
            } else if (i == 2) {
                dVar.a.getClass();
            }
        }
    }

    private static abstract class f<Params, Result> implements Callable<Result> {
        Params[] a;

        f() {
        }
    }

    static {
        a aVar = new a();
        o = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        p = linkedBlockingQueue;
        q = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
    }

    ModernAsyncTask() {
        b bVar = new b();
        this.a = bVar;
        this.b = new c(bVar);
    }

    public final boolean a(boolean z) {
        this.f.set(true);
        return this.b.cancel(z);
    }

    /* access modifiers changed from: protected */
    public abstract Result b(Params... paramsArr);

    public final ModernAsyncTask<Params, Progress, Result> c(Executor executor, Params... paramsArr) {
        if (this.c != Status.PENDING) {
            int ordinal = this.c.ordinal();
            if (ordinal == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (ordinal != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        } else {
            this.c = Status.RUNNING;
            this.a.a = null;
            executor.execute(this.b);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public void d(Result result) {
        if (this.f.get()) {
            e(result);
        } else {
            f(result);
        }
        this.c = Status.FINISHED;
    }

    /* access modifiers changed from: protected */
    public void e(Result result) {
    }

    /* access modifiers changed from: protected */
    public void f(Result result) {
    }

    /* access modifiers changed from: package-private */
    public Result g(Result result) {
        e eVar;
        synchronized (ModernAsyncTask.class) {
            if (r == null) {
                r = new e();
            }
            eVar = r;
        }
        eVar.obtainMessage(1, new d(this, result)).sendToTarget();
        return result;
    }
}
