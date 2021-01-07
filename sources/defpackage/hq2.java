package defpackage;

/* renamed from: hq2  reason: default package */
public final class hq2 implements fjf<gq2> {
    private final wlf<ko2> a;
    private final wlf<wzb> b;

    public hq2(wlf<ko2> wlf, wlf<wzb> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gq2(this.a.get(), this.b.get());
    }
}
