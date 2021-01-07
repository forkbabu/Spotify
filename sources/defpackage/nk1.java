package defpackage;

/* renamed from: nk1  reason: default package */
public final class nk1 implements fjf<mk1> {
    private final wlf<fwc> a;

    public nk1(wlf<fwc> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mk1(this.a.get());
    }
}
