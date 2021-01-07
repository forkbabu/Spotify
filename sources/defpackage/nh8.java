package defpackage;

/* renamed from: nh8  reason: default package */
public final class nh8 implements fjf<mh8> {
    private final wlf<ere> a;

    public nh8(wlf<ere> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mh8(this.a.get());
    }
}
