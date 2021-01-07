package defpackage;

/* renamed from: li1  reason: default package */
public final class li1 implements fjf<ki1> {
    private final wlf<mi1> a;

    public li1(wlf<mi1> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ki1(this.a.get());
    }
}
