package io.reactivex.internal.operators.completable;

import io.reactivex.a;
import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableResumeNext extends a {
    final e a;
    final l<? super Throwable, ? extends e> b;

    static final class ResumeNextObserver extends AtomicReference<b> implements c, b {
        private static final long serialVersionUID = 5018523762564524046L;
        final c downstream;
        final l<? super Throwable, ? extends e> errorMapper;
        boolean once;

        ResumeNextObserver(c cVar, l<? super Throwable, ? extends e> lVar) {
            this.downstream = cVar;
            this.errorMapper = lVar;
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
            this.downstream.onComplete();
        }

        @Override // io.reactivex.c
        public void onError(Throwable th) {
            if (this.once) {
                this.downstream.onError(th);
                return;
            }
            this.once = true;
            try {
                Object apply = this.errorMapper.apply(th);
                io.reactivex.internal.functions.a.c(apply, "The errorMapper returned a null CompletableSource");
                ((e) apply).subscribe(this);
            } catch (Throwable th2) {
                yif.V(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.c
        public void onSubscribe(b bVar) {
            DisposableHelper.i(this, bVar);
        }
    }

    public CompletableResumeNext(e eVar, l<? super Throwable, ? extends e> lVar) {
        this.a = eVar;
        this.b = lVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(c cVar) {
        ResumeNextObserver resumeNextObserver = new ResumeNextObserver(cVar, this.b);
        cVar.onSubscribe(resumeNextObserver);
        this.a.subscribe(resumeNextObserver);
    }
}
