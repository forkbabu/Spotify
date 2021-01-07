package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public class SubscriptionArbiter extends AtomicInteger implements vpf {
    private static final long serialVersionUID = -2189523197179400958L;
    vpf actual;
    final boolean cancelOnReplace;
    volatile boolean cancelled;
    final AtomicLong missedProduced = new AtomicLong();
    final AtomicLong missedRequested = new AtomicLong();
    final AtomicReference<vpf> missedSubscription = new AtomicReference<>();
    long requested;
    protected boolean unbounded;

    public SubscriptionArbiter(boolean z) {
        this.cancelOnReplace = z;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (getAndIncrement() == 0) {
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        int i = 1;
        vpf vpf = null;
        long j = 0;
        do {
            vpf vpf2 = this.missedSubscription.get();
            if (vpf2 != null) {
                vpf2 = this.missedSubscription.getAndSet(null);
            }
            long j2 = this.missedRequested.get();
            if (j2 != 0) {
                j2 = this.missedRequested.getAndSet(0);
            }
            long j3 = this.missedProduced.get();
            if (j3 != 0) {
                j3 = this.missedProduced.getAndSet(0);
            }
            vpf vpf3 = this.actual;
            if (this.cancelled) {
                if (vpf3 != null) {
                    vpf3.cancel();
                    this.actual = null;
                }
                if (vpf2 != null) {
                    vpf2.cancel();
                }
            } else {
                long j4 = this.requested;
                if (j4 != Long.MAX_VALUE) {
                    j4 = yif.c(j4, j2);
                    if (j4 != Long.MAX_VALUE) {
                        j4 -= j3;
                        if (j4 < 0) {
                            SubscriptionHelper.i(j4);
                            j4 = 0;
                        }
                    }
                    this.requested = j4;
                }
                if (vpf2 != null) {
                    if (vpf3 != null && this.cancelOnReplace) {
                        vpf3.cancel();
                    }
                    this.actual = vpf2;
                    if (j4 != 0) {
                        j = yif.c(j, j4);
                        vpf = vpf2;
                    }
                } else if (!(vpf3 == null || j2 == 0)) {
                    j = yif.c(j, j2);
                    vpf = vpf3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            vpf.n(j);
        }
    }

    @Override // defpackage.vpf
    public void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            b();
        }
    }

    public final boolean d() {
        return this.cancelled;
    }

    public final void f(long j) {
        if (!this.unbounded) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                yif.a(this.missedProduced, j);
                b();
                return;
            }
            long j2 = this.requested;
            if (j2 != Long.MAX_VALUE) {
                long j3 = j2 - j;
                if (j3 < 0) {
                    SubscriptionHelper.i(j3);
                    j3 = 0;
                }
                this.requested = j3;
            }
            if (decrementAndGet() != 0) {
                c();
            }
        }
    }

    public final void g(vpf vpf) {
        if (this.cancelled) {
            vpf.cancel();
        } else if (vpf == null) {
            throw new NullPointerException("s is null");
        } else if (get() != 0 || !compareAndSet(0, 1)) {
            vpf andSet = this.missedSubscription.getAndSet(vpf);
            if (andSet != null && this.cancelOnReplace) {
                andSet.cancel();
            }
            b();
        } else {
            vpf vpf2 = this.actual;
            if (vpf2 != null && this.cancelOnReplace) {
                vpf2.cancel();
            }
            this.actual = vpf;
            long j = this.requested;
            if (decrementAndGet() != 0) {
                c();
            }
            if (j != 0) {
                vpf.n(j);
            }
        }
    }

    @Override // defpackage.vpf
    public final void n(long j) {
        if (SubscriptionHelper.l(j) && !this.unbounded) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                yif.a(this.missedRequested, j);
                b();
                return;
            }
            long j2 = this.requested;
            if (j2 != Long.MAX_VALUE) {
                long c = yif.c(j2, j);
                this.requested = c;
                if (c == Long.MAX_VALUE) {
                    this.unbounded = true;
                }
            }
            vpf vpf = this.actual;
            if (decrementAndGet() != 0) {
                c();
            }
            if (vpf != null) {
                vpf.n(j);
            }
        }
    }
}
