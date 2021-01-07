package defpackage;

/* renamed from: md1  reason: default package */
public final class md1 implements fjf<ld1> {
    private final wlf<nh1> a;

    public md1(wlf<nh1> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ld1(ejf.a(this.a));
    }
}
