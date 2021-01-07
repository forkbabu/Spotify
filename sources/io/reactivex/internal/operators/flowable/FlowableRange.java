package io.reactivex.internal.operators.flowable;

import io.reactivex.g;
import io.reactivex.internal.fuseable.a;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public final class FlowableRange extends g<Integer> {
    final int c;
    final int f;

    static abstract class BaseRangeSubscription extends BasicQueueSubscription<Integer> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        final int end;
        int index;

        BaseRangeSubscription(int i, int i2) {
            this.index = i;
            this.end = i2;
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
            this.index = this.end;
        }

        @Override // io.reactivex.internal.fuseable.f
        public final int g(int i) {
            return i & 1;
        }

        @Override // io.reactivex.internal.fuseable.j
        public final boolean isEmpty() {
            return this.index == this.end;
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
        public Object poll() {
            int i = this.index;
            if (i == this.end) {
                return null;
            }
            this.index = i + 1;
            return Integer.valueOf(i);
        }
    }

    static final class RangeConditionalSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final a<? super Integer> downstream;

        RangeConditionalSubscription(a<? super Integer> aVar, int i, int i2) {
            super(i, i2);
            this.downstream = aVar;
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        public void a() {
            int i = this.end;
            a<? super Integer> aVar = this.downstream;
            for (int i2 = this.index; i2 != i; i2++) {
                if (!this.cancelled) {
                    aVar.e(Integer.valueOf(i2));
                } else {
                    return;
                }
            }
            if (!this.cancelled) {
                aVar.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        public void b(long j) {
            int i = this.end;
            int i2 = this.index;
            a<? super Integer> aVar = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i2 == i) {
                        if (i2 != i) {
                            j = get();
                            if (j2 == j) {
                                this.index = i2;
                                j = addAndGet(-j2);
                            }
                        } else if (!this.cancelled) {
                            aVar.onComplete();
                            return;
                        } else {
                            return;
                        }
                    } else if (!this.cancelled) {
                        if (aVar.e(Integer.valueOf(i2))) {
                            j2++;
                        }
                        i2++;
                    } else {
                        return;
                    }
                }
            } while (j != 0);
        }
    }

    static final class RangeSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final upf<? super Integer> downstream;

        RangeSubscription(upf<? super Integer> upf, int i, int i2) {
            super(i, i2);
            this.downstream = upf;
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        public void a() {
            int i = this.end;
            upf<? super Integer> upf = this.downstream;
            for (int i2 = this.index; i2 != i; i2++) {
                if (!this.cancelled) {
                    upf.onNext(Integer.valueOf(i2));
                } else {
                    return;
                }
            }
            if (!this.cancelled) {
                upf.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        public void b(long j) {
            int i = this.end;
            int i2 = this.index;
            upf<? super Integer> upf = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i2 == i) {
                        if (i2 != i) {
                            j = get();
                            if (j2 == j) {
                                this.index = i2;
                                j = addAndGet(-j2);
                            }
                        } else if (!this.cancelled) {
                            upf.onComplete();
                            return;
                        } else {
                            return;
                        }
                    } else if (!this.cancelled) {
                        upf.onNext(Integer.valueOf(i2));
                        j2++;
                        i2++;
                    } else {
                        return;
                    }
                }
            } while (j != 0);
        }
    }

    public FlowableRange(int i, int i2) {
        this.c = i;
        this.f = i + i2;
    }

    @Override // io.reactivex.g
    public void d0(upf<? super Integer> upf) {
        if (upf instanceof a) {
            upf.onSubscribe(new RangeConditionalSubscription((a) upf, this.c, this.f));
        } else {
            upf.onSubscribe(new RangeSubscription(upf, this.c, this.f));
        }
    }
}
