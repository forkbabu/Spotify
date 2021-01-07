package io.reactivex.internal.operators.completable;

import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableAndThenCompletable extends io.reactivex.a {
    final e a;
    final e b;

    static final class SourceObserver extends AtomicReference<b> implements c, b {
        private static final long serialVersionUID = -4101678820158072998L;
        final c actualObserver;
        final e next;

        SourceObserver(c cVar, e eVar) {
            this.actualObserver = cVar;
            this.next = eVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return DisposableHelper.h((b) get());
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this);
        }

        @Override // io.reactivex.c
        public void onComplete() {
            this.next.subscribe(new a(this, this.actualObserver));
        }

        @Override // io.reactivex.c
        public void onError(Throwable th) {
            this.actualObserver.onError(th);
        }

        @Override // io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.l(this, bVar)) {
                this.actualObserver.onSubscribe(this);
            }
        }
    }

    static final class a implements c {
        final AtomicReference<b> a;
        final c b;

        a(AtomicReference<b> atomicReference, c cVar) {
            this.a = atomicReference;
            this.b = cVar;
        }

        @Override // io.reactivex.c
        public void onComplete() {
            this.b.onComplete();
        }

        @Override // io.reactivex.c
        public void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // io.reactivex.c
        public void onSubscribe(b bVar) {
            DisposableHelper.i(this.a, bVar);
        }
    }

    public CompletableAndThenCompletable(e eVar, e eVar2) {
        this.a = eVar;
        this.b = eVar2;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(c cVar) {
        this.a.subscribe(new SourceObserver(cVar, this.b));
    }
}
