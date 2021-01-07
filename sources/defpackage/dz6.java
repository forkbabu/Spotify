package defpackage;

/* renamed from: dz6  reason: default package */
public final class dz6 implements fjf<cz6> {
    private final wlf<ez6> a;

    public dz6(wlf<ez6> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cz6(this.a.get());
    }
}
