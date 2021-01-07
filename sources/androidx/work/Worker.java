package androidx.work;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;

public abstract class Worker extends ListenableWorker {
    androidx.work.impl.utils.futures.a<ListenableWorker.a> n;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.n.t(Worker.this.p());
            } catch (Throwable th) {
                Worker.this.n.z(th);
            }
        }
    }

    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture<ListenableWorker.a> n() {
        this.n = androidx.work.impl.utils.futures.a.y();
        c().execute(new a());
        return this.n;
    }

    public abstract ListenableWorker.a p();
}
