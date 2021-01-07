package defpackage;

/* renamed from: sp2  reason: default package */
public final class sp2 implements fjf<rp2> {
    private final wlf<ko2> a;
    private final wlf<iwb> b;
    private final wlf<axb> c;

    public sp2(wlf<ko2> wlf, wlf<iwb> wlf2, wlf<axb> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rp2(this.a.get(), this.b.get(), this.c.get());
    }
}
