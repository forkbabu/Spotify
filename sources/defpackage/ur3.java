package defpackage;

/* renamed from: ur3  reason: default package */
public final class ur3 implements fjf<tr3> {
    private final wlf<vr3> a;
    private final wlf<zr3> b;

    public ur3(wlf<vr3> wlf, wlf<zr3> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tr3(this.a.get(), this.b.get());
    }
}
