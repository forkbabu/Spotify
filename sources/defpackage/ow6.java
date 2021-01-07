package defpackage;

/* renamed from: ow6  reason: default package */
public final class ow6 implements fjf<nw6> {
    private final wlf<wt6> a;
    private final wlf<wec> b;

    public ow6(wlf<wt6> wlf, wlf<wec> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nw6(this.a.get(), this.b.get());
    }
}
