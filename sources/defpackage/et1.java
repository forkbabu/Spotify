package defpackage;

/* renamed from: et1  reason: default package */
public final class et1 implements fjf<dt1> {
    private final wlf<bt1> a;

    public et1(wlf<bt1> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dt1(this.a.get());
    }
}
