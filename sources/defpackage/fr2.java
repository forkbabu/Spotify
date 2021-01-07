package defpackage;

/* renamed from: fr2  reason: default package */
public final class fr2 implements fjf<er2> {
    private final wlf<ere> a;

    public fr2(wlf<ere> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new er2(this.a.get());
    }
}
