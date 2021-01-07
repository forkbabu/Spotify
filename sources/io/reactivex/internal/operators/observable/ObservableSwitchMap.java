package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.e;
import io.reactivex.internal.fuseable.j;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.a;
import io.reactivex.v;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableSwitchMap<T, R> extends a<T, R> {
    final l<? super T, ? extends v<? extends R>> b;
    final int c;
    final boolean f;

    /* access modifiers changed from: package-private */
    public static final class SwitchMapInnerObserver<T, R> extends AtomicReference<b> implements x<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        final int bufferSize;
        volatile boolean done;
        final long index;
        final SwitchMapObserver<T, R> parent;
        volatile j<R> queue;

        SwitchMapInnerObserver(SwitchMapObserver<T, R> switchMapObserver, long j, int i) {
            this.parent = switchMapObserver;
            this.index = j;
            this.bufferSize = i;
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            if (this.index == this.parent.unique) {
                this.done = true;
                this.parent.b();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            SwitchMapObserver<T, R> switchMapObserver = this.parent;
            switchMapObserver.getClass();
            if (this.index != switchMapObserver.unique || !ExceptionHelper.a(switchMapObserver.errors, th)) {
                a.g(th);
                return;
            }
            if (!switchMapObserver.delayErrors) {
                switchMapObserver.upstream.dispose();
                switchMapObserver.done = true;
            }
            this.done = true;
            switchMapObserver.b();
        }

        @Override // io.reactivex.x
        public void onNext(R r) {
            if (this.index == this.parent.unique) {
                if (r != null) {
                    this.queue.offer(r);
                }
                this.parent.b();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.l(this, bVar)) {
                if (bVar instanceof e) {
                    e eVar = (e) bVar;
                    int g = eVar.g(7);
                    if (g == 1) {
                        this.queue = eVar;
                        this.done = true;
                        this.parent.b();
                        return;
                    } else if (g == 2) {
                        this.queue = eVar;
                        return;
                    }
                }
                this.queue = new io.reactivex.internal.queue.a(this.bufferSize);
            }
        }
    }

    static final class SwitchMapObserver<T, R> extends AtomicInteger implements x<T>, b {
        static final SwitchMapInnerObserver<Object, Object> a;
        private static final long serialVersionUID = -3491074160481096299L;
        final AtomicReference<SwitchMapInnerObserver<T, R>> active = new AtomicReference<>();
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final x<? super R> downstream;
        final AtomicThrowable errors;
        final l<? super T, ? extends v<? extends R>> mapper;
        volatile long unique;
        b upstream;

        static {
            SwitchMapInnerObserver<Object, Object> switchMapInnerObserver = new SwitchMapInnerObserver<>(null, -1, 1);
            a = switchMapInnerObserver;
            DisposableHelper.g(switchMapInnerObserver);
        }

        SwitchMapObserver(x<? super R> xVar, l<? super T, ? extends v<? extends R>> lVar, int i, boolean z) {
            this.downstream = xVar;
            this.mapper = lVar;
            this.bufferSize = i;
            this.delayErrors = z;
            this.errors = new AtomicThrowable();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver<T, R>> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        public void a() {
            SwitchMapInnerObserver<Object, Object> switchMapInnerObserver;
            SwitchMapInnerObserver<T, R> switchMapInnerObserver2 = this.active.get();
            SwitchMapInnerObserver<Object, Object> switchMapInnerObserver3 = a;
            if (switchMapInnerObserver2 != switchMapInnerObserver3 && (switchMapInnerObserver = (SwitchMapInnerObserver) this.active.getAndSet(switchMapInnerObserver3)) != switchMapInnerObserver3 && switchMapInnerObserver != null) {
                DisposableHelper.g(switchMapInnerObserver);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x000f A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b() {
            /*
            // Method dump skipped, instructions count: 241
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapObserver.b():void");
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.cancelled;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.dispose();
                a();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                b();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (this.done || !ExceptionHelper.a(this.errors, th)) {
                a.g(th);
                return;
            }
            if (!this.delayErrors) {
                a();
            }
            this.done = true;
            b();
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            SwitchMapInnerObserver<T, R> switchMapInnerObserver;
            long j = this.unique + 1;
            this.unique = j;
            SwitchMapInnerObserver<T, R> switchMapInnerObserver2 = this.active.get();
            if (switchMapInnerObserver2 != null) {
                DisposableHelper.g(switchMapInnerObserver2);
            }
            try {
                Object apply = this.mapper.apply(t);
                io.reactivex.internal.functions.a.c(apply, "The ObservableSource returned is null");
                v vVar = (v) apply;
                SwitchMapInnerObserver<T, R> switchMapInnerObserver3 = new SwitchMapInnerObserver<>(this, j, this.bufferSize);
                do {
                    switchMapInnerObserver = this.active.get();
                    if (switchMapInnerObserver == a) {
                        return;
                    }
                } while (!this.active.compareAndSet(switchMapInnerObserver, switchMapInnerObserver3));
                vVar.subscribe(switchMapInnerObserver3);
            } catch (Throwable th) {
                yif.V(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableSwitchMap(v<T> vVar, l<? super T, ? extends v<? extends R>> lVar, int i, boolean z) {
        super(vVar);
        this.b = lVar;
        this.c = i;
        this.f = z;
    }

    @Override // io.reactivex.s
    public void H0(x<? super R> xVar) {
        if (!a0.c(this.a, xVar, this.b)) {
            this.a.subscribe(new SwitchMapObserver(xVar, this.b, this.c, this.f));
        }
    }
}
