package defpackage;

/* renamed from: kj1  reason: default package */
public final class kj1 implements fjf<jj1> {
    private final wlf<ij1> a;
    private final wlf<ii1> b;

    public kj1(wlf<ij1> wlf, wlf<ii1> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jj1(this.a.get(), this.b.get());
    }
}
