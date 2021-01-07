package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;

public final class b<T> extends z<T> {
    final d0<? extends T> a;
    final long b;
    final TimeUnit c;
    final y f;
    final boolean n;

    final class a implements b0<T> {
        private final SequentialDisposable a;
        final b0<? super T> b;

        /* renamed from: io.reactivex.internal.operators.single.b$a$a  reason: collision with other inner class name */
        final class RunnableC0618a implements Runnable {
            private final Throwable a;

            RunnableC0618a(Throwable th) {
                this.a = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onError(this.a);
            }
        }

        /* JADX WARN: Field signature parse error: a */
        /* renamed from: io.reactivex.internal.operators.single.b$a$b  reason: collision with other inner class name */
        final class RunnableC0619b implements Runnable {
            private final Object a;

            /* JADX WARN: Failed to parse method signature: (TT)V */
            RunnableC0619b(Object obj) {
                this.a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onSuccess((Object) this.a);
            }
        }

        a(SequentialDisposable sequentialDisposable, b0<? super T> b0Var) {
            this.a = sequentialDisposable;
            this.b = b0Var;
        }

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            SequentialDisposable sequentialDisposable = this.a;
            b bVar = b.this;
            DisposableHelper.i(sequentialDisposable, bVar.f.c(new RunnableC0618a(th), bVar.n ? bVar.b : 0, bVar.c));
        }

        @Override // io.reactivex.b0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.i(this.a, bVar);
        }

        @Override // io.reactivex.b0
        public void onSuccess(T t) {
            SequentialDisposable sequentialDisposable = this.a;
            b bVar = b.this;
            DisposableHelper.i(sequentialDisposable, bVar.f.c(new RunnableC0619b(t), bVar.b, bVar.c));
        }
    }

    public b(d0<? extends T> d0Var, long j, TimeUnit timeUnit, y yVar, boolean z) {
        this.a = d0Var;
        this.b = j;
        this.c = timeUnit;
        this.f = yVar;
        this.n = z;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        b0Var.onSubscribe(sequentialDisposable);
        this.a.subscribe(new a(sequentialDisposable, b0Var));
    }
}
