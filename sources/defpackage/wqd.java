package defpackage;

import io.reactivex.functions.g;

/* renamed from: wqd  reason: default package */
public final class wqd implements fjf<vqd> {
    private final wlf<g<uqd>> a;

    public wqd(wlf<g<uqd>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vqd(this.a.get());
    }
}
