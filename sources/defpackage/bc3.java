package defpackage;

/* renamed from: bc3  reason: default package */
public final class bc3 implements fjf<jwd> {
    private final wlf<jc1> a;
    private final wlf<hwd> b;

    public bc3(wlf<jc1> wlf, wlf<hwd> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        jc1 jc1 = this.a.get();
        jc1.getClass();
        return new jwd(new yb3(jc1), this.b.get());
    }
}
