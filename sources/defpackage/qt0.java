package defpackage;

/* renamed from: qt0  reason: default package */
public final class qt0 implements fjf<pt0> {
    private final wlf<rt0> a;

    public qt0(wlf<rt0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pt0(this.a.get());
    }
}
