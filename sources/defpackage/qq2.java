package defpackage;

import io.reactivex.g;
import io.reactivex.s;

/* renamed from: qq2  reason: default package */
public final class qq2 implements fjf<s<Integer>> {
    private final wlf<g<Integer>> a;

    public qq2(wlf<g<Integer>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        g<Integer> gVar = this.a.get();
        return je.Z(gVar, gVar);
    }
}
