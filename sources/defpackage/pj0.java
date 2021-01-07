package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: pj0  reason: default package */
public final class pj0<A> {
    private final qj0<A> a;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: qj0<? extends A> */
    /* JADX WARN: Multi-variable type inference failed */
    private pj0(qj0<? extends A> qj0) {
        this.a = qj0;
    }

    public static <A, B> pj0<B> b(xi0<A, B> xi0, pj0<A> pj0) {
        return new pj0<>(new nj0(pj0, xi0));
    }

    public static <A> pj0<A> c(qj0<? extends A> qj0) {
        return new pj0<>(qj0);
    }

    public oj0 a(wi0<A> wi0) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        return new kj0(atomicBoolean, this.a.a(new lj0(atomicBoolean, wi0)));
    }

    public pj0(pj0<? extends A>... pj0Arr) {
        List<pj0> asList = Arrays.asList(pj0Arr);
        ArrayList arrayList = new ArrayList();
        synchronized (asList) {
            for (pj0 pj0 : asList) {
                arrayList.add(pj0);
            }
        }
        this.a = new jj0(arrayList);
    }
}
