package defpackage;

/* renamed from: kf5  reason: default package */
public final class kf5 implements fjf<jf5> {
    private final wlf<gf5> a;

    public kf5(wlf<gf5> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jf5(this.a.get());
    }
}
