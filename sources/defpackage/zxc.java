package defpackage;

/* renamed from: zxc  reason: default package */
public final class zxc implements fjf<yxc> {
    private final wlf<wxc> a;
    private final wlf<ayc> b;

    public zxc(wlf<wxc> wlf, wlf<ayc> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yxc(this.a.get(), this.b.get());
    }
}
