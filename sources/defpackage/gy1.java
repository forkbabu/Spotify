package defpackage;

import defpackage.qx1;
import defpackage.rx1;
import java.util.concurrent.Callable;

/* renamed from: gy1  reason: default package */
final class gy1<V> implements Callable<rx1> {
    final /* synthetic */ qx1.k a;

    gy1(qx1.k kVar) {
        this.a = kVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public rx1 call() {
        return new rx1.e(this.a.a());
    }
}
