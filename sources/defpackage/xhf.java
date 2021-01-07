package defpackage;

import io.reactivex.s;

/* renamed from: xhf  reason: default package */
public final class xhf implements fjf<s<Boolean>> {
    private final wlf<thf> a;

    public xhf(wlf<thf> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().b();
    }
}
