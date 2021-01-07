package defpackage;

import com.google.common.base.Optional;
import io.reactivex.g;

/* renamed from: rnc  reason: default package */
public final class rnc implements fjf<qnc> {
    private final wlf<cqe> a;
    private final wlf<knc> b;
    private final wlf<g<Boolean>> c;
    private final wlf<g<Optional<String>>> d;

    public rnc(wlf<cqe> wlf, wlf<knc> wlf2, wlf<g<Boolean>> wlf3, wlf<g<Optional<String>>> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qnc(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
