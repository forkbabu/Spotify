package defpackage;

/* renamed from: dc3  reason: default package */
public final class dc3 implements fjf<lwd> {
    private final wlf<jc1> a;
    private final wlf<hwd> b;

    public dc3(wlf<jc1> wlf, wlf<hwd> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        jc1 jc1 = this.a.get();
        jc1.getClass();
        return new lwd(new yb3(jc1), this.b.get());
    }
}
