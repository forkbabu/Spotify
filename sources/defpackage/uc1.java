package defpackage;

/* renamed from: uc1  reason: default package */
public final class uc1 implements fjf<tc1> {
    private final wlf<vg1> a;

    public uc1(wlf<vg1> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tc1(ejf.a(this.a));
    }
}
