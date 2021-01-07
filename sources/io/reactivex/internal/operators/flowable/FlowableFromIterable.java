package io.reactivex.internal.operators.flowable;

import io.reactivex.g;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;

public final class FlowableFromIterable<T> extends g<T> {
    final Iterable<? extends T> c;

    static abstract class BaseRangeSubscription<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        Iterator<? extends T> it;
        boolean once;

        BaseRangeSubscription(Iterator<? extends T> it2) {
            this.it = it2;
        }

        /* access modifiers changed from: package-private */
        public abstract void a();

        /* access modifiers changed from: package-private */
        public abstract void b(long j);

        @Override // defpackage.vpf
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // io.reactivex.internal.fuseable.j
        public final void clear() {
            this.it = null;
        }

        @Override // io.reactivex.internal.fuseable.f
        public final int g(int i) {
            return i & 1;
        }

        @Override // io.reactivex.internal.fuseable.j
        public final boolean isEmpty() {
            Iterator<? extends T> it2 = this.it;
            return it2 == null || !it2.hasNext();
        }

        @Override // defpackage.vpf
        public final void n(long j) {
            if (SubscriptionHelper.l(j) && yif.a(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    a();
                } else {
                    b(j);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public final T poll() {
            Iterator<? extends T> it2 = this.it;
            if (it2 == null) {
                return null;
            }
            if (!this.once) {
                this.once = true;
            } else if (!it2.hasNext()) {
                return null;
            }
            T t = (T) this.it.next();
            a.c(t, "Iterator.next() returned a null value");
            return t;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class IteratorConditionalSubscription<T> extends BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final io.reactivex.internal.fuseable.a<? super T> downstream;

        IteratorConditionalSubscription(io.reactivex.internal.fuseable.a<? super T> aVar, Iterator<? extends T> it) {
            super(it);
            this.downstream = aVar;
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public void a() {
            Iterator<? extends T> it = this.it;
            io.reactivex.internal.fuseable.a<? super T> aVar = this.downstream;
            while (!this.cancelled) {
                try {
                    Object obj = (Object) it.next();
                    if (!this.cancelled) {
                        if (obj == 0) {
                            aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        aVar.e(obj);
                        if (!this.cancelled) {
                            try {
                                if (!it.hasNext()) {
                                    if (!this.cancelled) {
                                        aVar.onComplete();
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th) {
                                yif.V(th);
                                aVar.onError(th);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    yif.V(th2);
                    aVar.onError(th2);
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public void b(long j) {
            Iterator<? extends T> it = this.it;
            io.reactivex.internal.fuseable.a<? super T> aVar = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            j = addAndGet(-j2);
                        }
                    } else if (!this.cancelled) {
                        try {
                            Object obj = (Object) it.next();
                            if (!this.cancelled) {
                                if (obj == 0) {
                                    aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    return;
                                }
                                boolean e = aVar.e(obj);
                                if (!this.cancelled) {
                                    try {
                                        if (!it.hasNext()) {
                                            if (!this.cancelled) {
                                                aVar.onComplete();
                                                return;
                                            }
                                            return;
                                        } else if (e) {
                                            j2++;
                                        }
                                    } catch (Throwable th) {
                                        yif.V(th);
                                        aVar.onError(th);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            yif.V(th2);
                            aVar.onError(th2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } while (j != 0);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class IteratorSubscription<T> extends BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final upf<? super T> downstream;

        IteratorSubscription(upf<? super T> upf, Iterator<? extends T> it) {
            super(it);
            this.downstream = upf;
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public void a() {
            Iterator<? extends T> it = this.it;
            upf<? super T> upf = this.downstream;
            while (!this.cancelled) {
                try {
                    Object obj = (Object) it.next();
                    if (!this.cancelled) {
                        if (obj == 0) {
                            upf.onError(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        upf.onNext(obj);
                        if (!this.cancelled) {
                            try {
                                if (!it.hasNext()) {
                                    if (!this.cancelled) {
                                        upf.onComplete();
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th) {
                                yif.V(th);
                                upf.onError(th);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    yif.V(th2);
                    upf.onError(th2);
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public void b(long j) {
            Iterator<? extends T> it = this.it;
            upf<? super T> upf = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            j = addAndGet(-j2);
                        }
                    } else if (!this.cancelled) {
                        try {
                            Object obj = (Object) it.next();
                            if (!this.cancelled) {
                                if (obj == 0) {
                                    upf.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    return;
                                }
                                upf.onNext(obj);
                                if (!this.cancelled) {
                                    try {
                                        if (it.hasNext()) {
                                            j2++;
                                        } else if (!this.cancelled) {
                                            upf.onComplete();
                                            return;
                                        } else {
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        yif.V(th);
                                        upf.onError(th);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            yif.V(th2);
                            upf.onError(th2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } while (j != 0);
        }
    }

    public FlowableFromIterable(Iterable<? extends T> iterable) {
        this.c = iterable;
    }

    public static <T> void subscribe(upf<? super T> upf, Iterator<? extends T> it) {
        EmptySubscription emptySubscription = EmptySubscription.INSTANCE;
        try {
            if (!it.hasNext()) {
                upf.onSubscribe(emptySubscription);
                upf.onComplete();
            } else if (upf instanceof io.reactivex.internal.fuseable.a) {
                upf.onSubscribe(new IteratorConditionalSubscription((io.reactivex.internal.fuseable.a) upf, it));
            } else {
                upf.onSubscribe(new IteratorSubscription(upf, it));
            }
        } catch (Throwable th) {
            yif.V(th);
            upf.onSubscribe(emptySubscription);
            upf.onError(th);
        }
    }

    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        try {
            subscribe(upf, this.c.iterator());
        } catch (Throwable th) {
            yif.V(th);
            upf.onSubscribe(EmptySubscription.INSTANCE);
            upf.onError(th);
        }
    }
}
