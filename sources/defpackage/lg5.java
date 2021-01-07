package defpackage;

/* renamed from: lg5  reason: default package */
public final class lg5 implements fjf<kg5> {
    private final wlf<ig5> a;

    public lg5(wlf<ig5> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kg5(this.a.get());
    }
}
