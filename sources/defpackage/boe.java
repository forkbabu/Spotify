package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.subjects.c;

/* renamed from: boe  reason: default package */
public final class boe implements fjf<g<ooe>> {
    private final wlf<c<ooe>> a;

    public boe(wlf<c<ooe>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().Y0(BackpressureStrategy.BUFFER);
    }
}
