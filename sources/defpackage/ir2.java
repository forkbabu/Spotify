package defpackage;

/* renamed from: ir2  reason: default package */
public final class ir2 implements fjf<hr2> {
    private final wlf<kr2> a;
    private final wlf<qr2> b;
    private final wlf<nr2> c;

    public ir2(wlf<kr2> wlf, wlf<qr2> wlf2, wlf<nr2> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hr2(this.a.get(), this.b.get(), this.c.get());
    }
}
