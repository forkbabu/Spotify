package defpackage;

import io.reactivex.s;

/* renamed from: yhf  reason: default package */
public final class yhf implements fjf<s<Boolean>> {
    private final wlf<thf> a;

    public yhf(wlf<thf> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().f();
    }
}
