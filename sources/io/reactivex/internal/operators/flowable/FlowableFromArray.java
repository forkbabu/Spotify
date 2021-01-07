package io.reactivex.internal.operators.flowable;

import io.reactivex.g;
import io.reactivex.internal.fuseable.a;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public final class FlowableFromArray<T> extends g<T> {
    final T[] c;

    static final class ArrayConditionalSubscription<T> extends BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final a<? super T> downstream;

        ArrayConditionalSubscription(a<? super T> aVar, T[] tArr) {
            super(tArr);
            this.downstream = aVar;
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public void a() {
            T[] tArr = this.array;
            int length = tArr.length;
            a<? super T> aVar = this.downstream;
            for (int i = this.index; i != length; i++) {
                if (!this.cancelled) {
                    T t = tArr[i];
                    if (t == null) {
                        aVar.onError(new NullPointerException(je.q0("The element at index ", i, " is null")));
                        return;
                    } else {
                        aVar.e(t);
                    }
                } else {
                    return;
                }
            }
            if (!this.cancelled) {
                aVar.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public void b(long j) {
            T[] tArr = this.array;
            int length = tArr.length;
            int i = this.index;
            a<? super T> aVar = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == length) {
                        if (i != length) {
                            j = get();
                            if (j2 == j) {
                                this.index = i;
                                j = addAndGet(-j2);
                            }
                        } else if (!this.cancelled) {
                            aVar.onComplete();
                            return;
                        } else {
                            return;
                        }
                    } else if (!this.cancelled) {
                        T t = tArr[i];
                        if (t == null) {
                            aVar.onError(new NullPointerException(je.q0("The element at index ", i, " is null")));
                            return;
                        }
                        if (aVar.e(t)) {
                            j2++;
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            } while (j != 0);
        }
    }

    static final class ArraySubscription<T> extends BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final upf<? super T> downstream;

        ArraySubscription(upf<? super T> upf, T[] tArr) {
            super(tArr);
            this.downstream = upf;
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public void a() {
            T[] tArr = this.array;
            int length = tArr.length;
            upf<? super T> upf = this.downstream;
            for (int i = this.index; i != length; i++) {
                if (!this.cancelled) {
                    T t = tArr[i];
                    if (t == null) {
                        upf.onError(new NullPointerException(je.q0("The element at index ", i, " is null")));
                        return;
                    } else {
                        upf.onNext(t);
                    }
                } else {
                    return;
                }
            }
            if (!this.cancelled) {
                upf.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public void b(long j) {
            T[] tArr = this.array;
            int length = tArr.length;
            int i = this.index;
            upf<? super T> upf = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == length) {
                        if (i != length) {
                            j = get();
                            if (j2 == j) {
                                this.index = i;
                                j = addAndGet(-j2);
                            }
                        } else if (!this.cancelled) {
                            upf.onComplete();
                            return;
                        } else {
                            return;
                        }
                    } else if (!this.cancelled) {
                        T t = tArr[i];
                        if (t == null) {
                            upf.onError(new NullPointerException(je.q0("The element at index ", i, " is null")));
                            return;
                        }
                        upf.onNext(t);
                        j2++;
                        i++;
                    } else {
                        return;
                    }
                }
            } while (j != 0);
        }
    }

    static abstract class BaseArraySubscription<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        final T[] array;
        volatile boolean cancelled;
        int index;

        BaseArraySubscription(T[] tArr) {
            this.array = tArr;
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
            this.index = this.array.length;
        }

        @Override // io.reactivex.internal.fuseable.f
        public final int g(int i) {
            return i & 1;
        }

        @Override // io.reactivex.internal.fuseable.j
        public final boolean isEmpty() {
            return this.index == this.array.length;
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
            int i = this.index;
            T[] tArr = this.array;
            if (i == tArr.length) {
                return null;
            }
            this.index = i + 1;
            T t = tArr[i];
            io.reactivex.internal.functions.a.c(t, "array element is null");
            return t;
        }
    }

    public FlowableFromArray(T[] tArr) {
        this.c = tArr;
    }

    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        if (upf instanceof a) {
            upf.onSubscribe(new ArrayConditionalSubscription((a) upf, this.c));
        } else {
            upf.onSubscribe(new ArraySubscription(upf, this.c));
        }
    }
}
