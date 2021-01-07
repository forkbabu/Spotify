package defpackage;

import io.reactivex.g;

/* renamed from: f5c  reason: default package */
public final class f5c implements fjf<e5c> {
    private final wlf<g<Boolean>> a;

    public f5c(wlf<g<Boolean>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e5c(this.a.get());
    }
}
