package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.k;
import okhttp3.e0;
import retrofit2.v;

/* renamed from: oe4  reason: default package */
public class oe4 {
    private final mf4 a;
    private final se4 b;
    private final o1e<b91> c;

    oe4(se4 se4, o1e<b91> o1e, cf4 cf4, k<v<e0>, b91> kVar, wlf<h81> wlf) {
        this.a = new mf4(cf4, kVar, wlf, true);
        se4.getClass();
        this.b = se4;
        o1e.getClass();
        this.c = o1e;
    }

    public g<b91> a(ne4 ne4) {
        return new io.reactivex.internal.operators.observable.v(this.a.a(ne4).T(rc4.a).O(this.b)).q(this.c).Y0(BackpressureStrategy.LATEST);
    }
}
