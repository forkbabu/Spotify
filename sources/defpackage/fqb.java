package defpackage;

import com.google.common.base.Optional;
import io.reactivex.g;

/* renamed from: fqb  reason: default package */
public final class fqb implements fjf<eqb> {
    private final wlf<g<Optional<Long>>> a;

    public fqb(wlf<g<Optional<Long>>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new eqb(this.a.get());
    }
}
