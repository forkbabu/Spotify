package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: hj0  reason: default package */
public final class hj0<A> {
    private final wi0<A> a;

    private hj0(gj0<A> gj0, wi0<A> wi0) {
        this.a = new dj0(new AtomicReference(), gj0, wi0);
    }

    public static <A> hj0<A> a(wi0<A> wi0) {
        return new hj0<>(fj0.a, wi0);
    }

    @SafeVarargs
    public static <A> hj0<A> b(hj0<A>... hj0Arr) {
        return new hj0<>(Arrays.asList(hj0Arr));
    }

    public static <A> hj0<A> c(gj0<A> gj0, wi0<A> wi0) {
        return new hj0<>(gj0, wi0);
    }

    public static <A, B> hj0<A> d(xi0<A, B> xi0, hj0<B> hj0) {
        return new hj0<>(new cj0(hj0, xi0));
    }

    public synchronized void e(A a2) {
        this.a.a(a2);
    }

    private hj0(wi0<A> wi0) {
        this.a = wi0;
    }

    public hj0(Collection<hj0<A>> collection) {
        this.a = new dj0(new AtomicReference(), fj0.a, new ej0(new ArrayList(collection)));
    }
}
