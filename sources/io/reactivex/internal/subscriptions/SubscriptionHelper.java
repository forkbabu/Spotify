package io.reactivex.internal.subscriptions;

import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public enum SubscriptionHelper implements vpf {
    CANCELLED;

    public static boolean d(AtomicReference<vpf> atomicReference) {
        vpf andSet;
        vpf vpf = atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (vpf == subscriptionHelper || (andSet = atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static void g(AtomicReference<vpf> atomicReference, AtomicLong atomicLong, long j) {
        vpf vpf = atomicReference.get();
        if (vpf != null) {
            vpf.n(j);
        } else if (l(j)) {
            yif.a(atomicLong, j);
            vpf vpf2 = atomicReference.get();
            if (vpf2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    vpf2.n(andSet);
                }
            }
        }
    }

    public static boolean h(AtomicReference<vpf> atomicReference, AtomicLong atomicLong, vpf vpf) {
        if (!k(atomicReference, vpf)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0);
        if (andSet == 0) {
            return true;
        }
        vpf.n(andSet);
        return true;
    }

    public static void i(long j) {
        a.g(new ProtocolViolationException(je.t0("More produced than requested: ", j)));
    }

    public static boolean k(AtomicReference<vpf> atomicReference, vpf vpf) {
        if (vpf == null) {
            throw new NullPointerException("s is null");
        } else if (atomicReference.compareAndSet(null, vpf)) {
            return true;
        } else {
            vpf.cancel();
            if (atomicReference.get() == CANCELLED) {
                return false;
            }
            a.g(new ProtocolViolationException("Subscription already set!"));
            return false;
        }
    }

    public static boolean l(long j) {
        if (j > 0) {
            return true;
        }
        a.g(new IllegalArgumentException(je.t0("n > 0 required but it was ", j)));
        return false;
    }

    public static boolean m(vpf vpf, vpf vpf2) {
        if (vpf2 == null) {
            a.g(new NullPointerException("next is null"));
            return false;
        } else if (vpf == null) {
            return true;
        } else {
            vpf2.cancel();
            a.g(new ProtocolViolationException("Subscription already set!"));
            return false;
        }
    }

    @Override // defpackage.vpf
    public void cancel() {
    }

    @Override // defpackage.vpf
    public void n(long j) {
    }
}
