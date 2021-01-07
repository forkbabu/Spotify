package defpackage;

import io.reactivex.y;

/* renamed from: rhf  reason: default package */
public final class rhf<TRequest, TResponse> implements fjf<qhf<TRequest, TResponse>> {
    private final wlf<mhf<TRequest, TResponse>> a;
    private final wlf<y> b;

    public rhf(wlf<mhf<TRequest, TResponse>> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qhf(this.a, this.b);
    }
}
