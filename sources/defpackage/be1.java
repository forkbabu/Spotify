package defpackage;

/* renamed from: be1  reason: default package */
public final class be1 implements fjf<ae1> {
    private final wlf<di1> a;
    private final wlf<yd1> b;

    public be1(wlf<di1> wlf, wlf<yd1> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ae1(this.a, this.b.get());
    }
}
