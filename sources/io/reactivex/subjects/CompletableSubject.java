package io.reactivex.subjects;

import io.reactivex.a;
import io.reactivex.c;
import io.reactivex.disposables.b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableSubject extends a implements c {
    static final CompletableDisposable[] f = new CompletableDisposable[0];
    static final CompletableDisposable[] n = new CompletableDisposable[0];
    final AtomicReference<CompletableDisposable[]> a = new AtomicReference<>(f);
    final AtomicBoolean b = new AtomicBoolean();
    Throwable c;

    /* access modifiers changed from: package-private */
    public static final class CompletableDisposable extends AtomicReference<CompletableSubject> implements b {
        private static final long serialVersionUID = -7650903191002190468L;
        final c downstream;

        CompletableDisposable(c cVar, CompletableSubject completableSubject) {
            this.downstream = cVar;
            lazySet(completableSubject);
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return get() == null;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            CompletableSubject completableSubject = (CompletableSubject) getAndSet(null);
            if (completableSubject != null) {
                completableSubject.S(this);
            }
        }
    }

    CompletableSubject() {
    }

    public static CompletableSubject R() {
        return new CompletableSubject();
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(c cVar) {
        boolean z;
        CompletableDisposable completableDisposable = new CompletableDisposable(cVar, this);
        cVar.onSubscribe(completableDisposable);
        while (true) {
            CompletableDisposable[] completableDisposableArr = this.a.get();
            z = false;
            if (completableDisposableArr != n) {
                int length = completableDisposableArr.length;
                CompletableDisposable[] completableDisposableArr2 = new CompletableDisposable[(length + 1)];
                System.arraycopy(completableDisposableArr, 0, completableDisposableArr2, 0, length);
                completableDisposableArr2[length] = completableDisposable;
                if (this.a.compareAndSet(completableDisposableArr, completableDisposableArr2)) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z) {
            Throwable th = this.c;
            if (th != null) {
                cVar.onError(th);
            } else {
                cVar.onComplete();
            }
        } else if (completableDisposable.d()) {
            S(completableDisposable);
        }
    }

    /* access modifiers changed from: package-private */
    public void S(CompletableDisposable completableDisposable) {
        CompletableDisposable[] completableDisposableArr;
        CompletableDisposable[] completableDisposableArr2;
        do {
            completableDisposableArr = this.a.get();
            int length = completableDisposableArr.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (completableDisposableArr[i] == completableDisposable) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        completableDisposableArr2 = f;
                    } else {
                        CompletableDisposable[] completableDisposableArr3 = new CompletableDisposable[(length - 1)];
                        System.arraycopy(completableDisposableArr, 0, completableDisposableArr3, 0, i);
                        System.arraycopy(completableDisposableArr, i + 1, completableDisposableArr3, i, (length - i) - 1);
                        completableDisposableArr2 = completableDisposableArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.a.compareAndSet(completableDisposableArr, completableDisposableArr2));
    }

    @Override // io.reactivex.c
    public void onComplete() {
        if (this.b.compareAndSet(false, true)) {
            for (CompletableDisposable completableDisposable : this.a.getAndSet(n)) {
                completableDisposable.downstream.onComplete();
            }
        }
    }

    @Override // io.reactivex.c
    public void onError(Throwable th) {
        if (th != null) {
            if (this.b.compareAndSet(false, true)) {
                this.c = th;
                for (CompletableDisposable completableDisposable : this.a.getAndSet(n)) {
                    completableDisposable.downstream.onError(th);
                }
                return;
            }
            io.reactivex.plugins.a.g(th);
            return;
        }
        throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
    }

    @Override // io.reactivex.c
    public void onSubscribe(b bVar) {
        if (this.a.get() == n) {
            bVar.dispose();
        }
    }
}
