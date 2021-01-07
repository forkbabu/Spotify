package defpackage;

/* renamed from: aw3  reason: default package */
public final class aw3 implements fjf<zv3> {
    private final wlf<vv3> a;
    private final wlf<rf3> b;

    public aw3(wlf<vv3> wlf, wlf<rf3> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zv3(this.a.get(), this.b.get());
    }
}
