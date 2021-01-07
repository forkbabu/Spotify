package io.reactivex.internal.operators.observable;

import io.reactivex.b0;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.d;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.x;
import io.reactivex.z;
import java.util.NoSuchElementException;

public final class n<T> extends z<T> implements d<T> {
    final v<T> a;
    final long b;
    final T c;

    static final class a<T> implements x<T>, b {
        final b0<? super T> a;
        final long b;
        final T c;
        b f;
        long n;
        boolean o;

        a(b0<? super T> b0Var, long j, T t) {
            this.a = b0Var;
            this.b = j;
            this.c = t;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.f.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f.dispose();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            if (!this.o) {
                this.o = true;
                T t = this.c;
                if (t != null) {
                    this.a.onSuccess(t);
                } else {
                    this.a.onError(new NoSuchElementException());
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (this.o) {
                io.reactivex.plugins.a.g(th);
                return;
            }
            this.o = true;
            this.a.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            if (!this.o) {
                long j = this.n;
                if (j == this.b) {
                    this.o = true;
                    this.f.dispose();
                    this.a.onSuccess(t);
                    return;
                }
                this.n = j + 1;
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.f, bVar)) {
                this.f = bVar;
                this.a.onSubscribe(this);
            }
        }
    }

    public n(v<T> vVar, long j, T t) {
        this.a = vVar;
        this.b = j;
        this.c = t;
    }

    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        this.a.subscribe(new a(b0Var, this.b, this.c));
    }

    @Override // io.reactivex.internal.fuseable.d
    public s<T> a() {
        return new l(this.a, this.b, this.c, true);
    }
}
