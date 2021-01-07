package defpackage;

/* renamed from: ll3  reason: default package */
public final class ll3 implements fjf<kl3> {
    private final wlf<vl3> a;

    public ll3(wlf<vl3> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kl3(this.a.get());
    }
}
