package defpackage;

/* renamed from: as3  reason: default package */
public final class as3 implements fjf<zr3> {
    private final wlf<rs3> a;
    private final wlf<ql3> b;

    public as3(wlf<rs3> wlf, wlf<ql3> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zr3(this.a.get(), this.b.get());
    }
}
