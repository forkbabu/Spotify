package defpackage;

import io.reactivex.a;
import io.reactivex.e;
import io.reactivex.g;
import io.reactivex.internal.operators.flowable.FlowableRetryWhen;
import java.util.concurrent.TimeUnit;

/* renamed from: g1e  reason: default package */
public class g1e {
    private final i1e a;

    public g1e(int i, int i2, long j) {
        this.a = new i1e(i2, j);
    }

    public e a(a aVar) {
        a H = aVar.H((long) 30, TimeUnit.SECONDS);
        i1e i1e = this.a;
        g M = H.M();
        if (i1e != null) {
            return new io.reactivex.internal.operators.completable.g(new FlowableRetryWhen(M, i1e));
        }
        throw new NullPointerException("handler is null");
    }
}
