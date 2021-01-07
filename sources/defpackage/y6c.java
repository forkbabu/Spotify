package defpackage;

import com.google.common.base.Optional;
import io.reactivex.g;

/* renamed from: y6c  reason: default package */
public final class y6c implements fjf<x6c> {
    private final wlf<uec> a;
    private final wlf<g<Optional<Long>>> b;

    public y6c(wlf<uec> wlf, wlf<g<Optional<Long>>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new x6c(this.a.get(), this.b.get());
    }
}
