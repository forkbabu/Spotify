package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.j;
import com.google.common.util.concurrent.ListenableFuture;
import io.reactivex.b0;
import io.reactivex.disposables.b;
import io.reactivex.z;
import java.util.concurrent.Executor;

public abstract class RxWorker extends ListenableWorker {
    static final Executor o = new j();
    private a<ListenableWorker.a> n;

    static class a<T> implements b0<T>, Runnable {
        final androidx.work.impl.utils.futures.a<T> a;
        private b b;

        a() {
            androidx.work.impl.utils.futures.a<T> y = androidx.work.impl.utils.futures.a.y();
            this.a = y;
            y.addListener(this, RxWorker.o);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            b bVar = this.b;
            if (bVar != null) {
                bVar.dispose();
            }
        }

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            this.a.z(th);
        }

        @Override // io.reactivex.b0
        public void onSubscribe(b bVar) {
            this.b = bVar;
        }

        @Override // io.reactivex.b0
        public void onSuccess(T t) {
            this.a.t(t);
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar;
            if (this.a.isCancelled() && (bVar = this.b) != null) {
                bVar.dispose();
            }
        }
    }

    public RxWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.ListenableWorker
    public void k() {
        a<ListenableWorker.a> aVar = this.n;
        if (aVar != null) {
            aVar.a();
            this.n = null;
        }
    }

    @Override // androidx.work.ListenableWorker
    public ListenableFuture<ListenableWorker.a> n() {
        this.n = new a<>();
        p().H(io.reactivex.schedulers.a.b(c())).B(io.reactivex.schedulers.a.b(((oa) g()).b())).subscribe(this.n);
        return this.n.a;
    }

    public abstract z<ListenableWorker.a> p();
}
