package defpackage;

/* renamed from: y9e  reason: default package */
public final class y9e implements fjf<x9e> {
    private final wlf<String> a;

    public y9e(wlf<String> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new x9e(this.a.get());
    }
}
