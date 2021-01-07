package defpackage;

/* renamed from: pi1  reason: default package */
public final class pi1 implements fjf<oi1> {
    private final wlf<mi1> a;

    public pi1(wlf<mi1> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new oi1(this.a.get());
    }
}
