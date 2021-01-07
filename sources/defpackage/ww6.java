package defpackage;

/* renamed from: ww6  reason: default package */
public final class ww6 implements fjf<vw6> {
    private final wlf<wt6> a;
    private final wlf<ed3> b;

    public ww6(wlf<wt6> wlf, wlf<ed3> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vw6(this.a.get(), this.b.get());
    }
}
