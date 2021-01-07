package defpackage;

/* renamed from: uy3  reason: default package */
public final class uy3 implements fjf<ty3> {
    private final wlf<ey3> a;
    private final wlf<q9a> b;

    public uy3(wlf<ey3> wlf, wlf<q9a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ty3(this.a.get(), this.b);
    }
}
