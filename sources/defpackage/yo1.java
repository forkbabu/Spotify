package defpackage;

/* renamed from: yo1  reason: default package */
public final class yo1 implements fjf<xo1> {
    private final wlf<bp1> a;

    public yo1(wlf<bp1> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xo1(this.a.get());
    }
}
