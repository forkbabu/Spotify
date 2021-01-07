package defpackage;

/* renamed from: kd3  reason: default package */
public final class kd3 implements fjf<jd3> {
    private final wlf<od3> a;
    private final wlf<nd3> b;

    public kd3(wlf<od3> wlf, wlf<nd3> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jd3(this.a.get(), this.b.get());
    }
}
