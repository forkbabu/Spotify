package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.subjects.c;

/* renamed from: s9f  reason: default package */
public final class s9f implements fjf<g<k9f>> {
    private final wlf<c<k9f>> a;

    public s9f(wlf<c<k9f>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().Y0(BackpressureStrategy.BUFFER);
    }
}
