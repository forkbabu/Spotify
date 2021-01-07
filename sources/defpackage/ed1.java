package defpackage;

/* renamed from: ed1  reason: default package */
public final class ed1 implements fjf<dd1> {
    private final wlf<fh1> a;
    private final wlf<vc1> b;
    private final wlf<ee1> c;

    public ed1(wlf<fh1> wlf, wlf<vc1> wlf2, wlf<ee1> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dd1(ejf.a(this.a), this.b.get(), this.c.get());
    }
}
