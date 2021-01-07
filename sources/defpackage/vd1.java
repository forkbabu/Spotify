package defpackage;

/* renamed from: vd1  reason: default package */
public final class vd1 implements fjf<ud1> {
    private final wlf<xh1> a;

    public vd1(wlf<xh1> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ud1(ejf.a(this.a));
    }
}
