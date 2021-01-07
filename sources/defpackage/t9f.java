package defpackage;

import io.reactivex.subjects.c;
import io.reactivex.x;

/* renamed from: t9f  reason: default package */
public final class t9f implements fjf<x<k9f>> {
    private final wlf<c<k9f>> a;

    public t9f(wlf<c<k9f>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        c<k9f> cVar = this.a.get();
        if (cVar != null) {
            return cVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
