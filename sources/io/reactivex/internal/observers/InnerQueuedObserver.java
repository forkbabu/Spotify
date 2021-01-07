package io.reactivex.internal.observers;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.e;
import io.reactivex.internal.fuseable.j;
import io.reactivex.internal.util.c;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicReference;

public final class InnerQueuedObserver<T> extends AtomicReference<b> implements x<T>, b {
    private static final long serialVersionUID = -5417183359794346637L;
    volatile boolean done;
    int fusionMode;
    final f<T> parent;
    final int prefetch;
    j<T> queue;

    public InnerQueuedObserver(f<T> fVar, int i) {
        this.parent = fVar;
        this.prefetch = i;
    }

    public boolean a() {
        return this.done;
    }

    public j<T> b() {
        return this.queue;
    }

    public void c() {
        this.done = true;
    }

    @Override // io.reactivex.disposables.b
    public boolean d() {
        return DisposableHelper.h((b) get());
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        DisposableHelper.g(this);
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onComplete() {
        this.parent.c(this);
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onError(Throwable th) {
        this.parent.b(this, th);
    }

    @Override // io.reactivex.x
    public void onNext(T t) {
        if (this.fusionMode == 0) {
            this.parent.e(this, t);
        } else {
            this.parent.a();
        }
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onSubscribe(b bVar) {
        if (DisposableHelper.l(this, bVar)) {
            if (bVar instanceof e) {
                e eVar = (e) bVar;
                int g = eVar.g(3);
                if (g == 1) {
                    this.fusionMode = g;
                    this.queue = eVar;
                    this.done = true;
                    this.parent.c(this);
                    return;
                } else if (g == 2) {
                    this.fusionMode = g;
                    this.queue = eVar;
                    return;
                }
            }
            this.queue = c.b(-this.prefetch);
        }
    }
}
